import java.util.ArrayList;
import java.util.List;

public class VendMachineWithWater implements VendingMachine{
    private List<Product> products = new ArrayList<>();

    public void initProduct(Product product) {
        products.add(product);
    }

    public Product getProduct(String name) {
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                // int index = products.indexOf(p);
                return products.remove(products.indexOf(p));
            }
        }
        return null;
    }

    public Product getProduct(String name, double volume) {
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name) &&
                    ((BottleOfWater) p).getVolume() == volume) {
                // int index = products.indexOf(p);
                return products.remove(products.indexOf(p));
            }
        }
        return null;
    }

    public void showAllProducts() {
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
