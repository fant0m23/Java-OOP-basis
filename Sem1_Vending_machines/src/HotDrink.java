public class HotDrink extends BottleOfWater {
    private int temperature;

    public HotDrink(String name, int price, double volume, int temperature) {
        super(name, price, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return super.toString() +
                " (температура " + temperature +
                " градусов)";
    }
}
