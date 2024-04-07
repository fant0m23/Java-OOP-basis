
public interface VendingMachine {

    void initProduct(Product product);

    Product getProduct(String name);

    void showAllProducts();
}
