public class BottleOfWater extends Product{
    private double volume;

    public BottleOfWater(String name, int price , double volume) {
        super(name, price);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return super.toString() + " (объем " + this.volume + " литра)";
    }
}
