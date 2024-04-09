public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Kate");
        Human human2 = new Human("John");
        Human human3 = new Human("Bill");
        Human human4 = new Human("Rob");

        Market market = new Market();

        market.acceptToMarket(human1);
        market.update();
        System.out.println("-----------------------");
        market.acceptToMarket(human2);
        market.acceptToMarket(human3);
        market.acceptToMarket(human4);
        market.update();
    }
}