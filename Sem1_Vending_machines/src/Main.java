


public class Main {
    public static void main(String[] args) {
        Product product1 = new BottleOfWater("Липецкая", 50, 1.5);
        Product product2 = new BottleOfWater("Bon Aqua", 48, 0.45);
        Product product3 = new BottleOfWater("Сенежская", 65, 1.5);
        Product product4 = new HotDrink("Кофе", 60,0.3,80);
        Product product5 = new BottleOfWater("Липецкая", 22, 0.5);
        Product product6 = new HotDrink("Кофе", 70, 0.4, 60);
        Product product7 = new HotDrink("Чай", 40,0.3,70);

        VendMachineWithWater vmWater = new VendMachineWithWater();
        VendMachineWithHotDrinks vmHotDrink = new VendMachineWithHotDrinks();

        vmWater.initProduct(product1);
        vmWater.initProduct(product2);
        vmWater.initProduct(product3);
        vmHotDrink.initProduct(product4);
        vmWater.initProduct(product5);
        vmHotDrink.initProduct(product6);
        vmHotDrink.initProduct(product7);

//        vmWater.showAllProducts();
//        System.out.println("----------------");
//        System.out.println(vmWater.getProduct("Липецкая", 0.5));
//        System.out.println("----------------");
//        vmWater.showAllProducts();
//        System.out.println("----------------");
//        System.out.println(vmWater.getProduct("Липецкая"));
//        System.out.println("----------------");
//        vmWater.showAllProducts();

        vmHotDrink.showAllProducts();
        System.out.println("----------------");
        System.out.println(vmHotDrink.getProduct("Кофе", 0.3, 80));
        System.out.println("----------------");
        vmHotDrink.showAllProducts();
    }
}