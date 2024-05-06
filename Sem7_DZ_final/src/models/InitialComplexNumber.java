package models;

public class InitialComplexNumber implements IComplexNumber{

    protected static int counter = 0;
    protected int id;
    protected double realPart;
    protected double imaginaryPart;

    public InitialComplexNumber() {
        this.realPart = 0;
        this.imaginaryPart = 0;
        this.id = counter++;
    }

    public int getId() {
        return id;
    }

    @Override
    public double getRealPart() {
        return realPart;
    }

    @Override
    public double getImaginaryPart() {
        return imaginaryPart;
    }

    @Override
    public String toString() {
        return String.format("Z%d = %s %c %si", id, fmt(realPart), sign(), fmt(Math.abs(imaginaryPart)));
    }

    // вспомогательные методы для toString() :
    private String fmt(double d) {
        if (d == (long) d)
            return String.format("%d", (long) d);
        else
            return String.format("%s", d);
    }

    private Character sign() {
        if (imaginaryPart < 0) return '-';
        else return '+';
    }
}
