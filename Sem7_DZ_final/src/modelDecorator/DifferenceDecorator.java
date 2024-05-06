package modelDecorator;

import models.IComplexNumber;

public class DifferenceDecorator extends ComplexNumberDecorator{

    public DifferenceDecorator(IComplexNumber startComplexNumber, IComplexNumber changerComplexNumber) {
        super(startComplexNumber, changerComplexNumber);
    }

    @Override
    public double getRealPart() {
        return difReal();
    }

    @Override
    public double getImaginaryPart() {
        return difImaginary();
    }

    @Override
    public int getId() {
        return 0;
    }

    private double difReal() {
        return startComplexNumber.getRealPart() - changerComplexNumber.getRealPart();
    }

    private double difImaginary() {
        return startComplexNumber.getImaginaryPart() - changerComplexNumber.getImaginaryPart();
    }

    @Override
    public String toString() {
        return String.format("Z%d = %s %c %si", changerComplexNumber.getId(),
                fmt(difReal()), sign(), fmt(Math.abs(difImaginary())));
    }

    // вспомогательные методы для toString() :
    private String fmt(double d) {
        if (d == (long) d)
            return String.format("%d", (long) d);
        else
            return String.format("%s", d);
    }

    private Character sign() {
        if (difImaginary() < 0) return '-';
        else return '+';
    }

}
