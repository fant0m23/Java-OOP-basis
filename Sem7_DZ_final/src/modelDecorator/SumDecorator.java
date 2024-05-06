package modelDecorator;

import models.IComplexNumber;

public class SumDecorator extends ComplexNumberDecorator {

    public SumDecorator(IComplexNumber startComplexNumber, IComplexNumber changerComplexNumber) {
        super(startComplexNumber, changerComplexNumber);
    }

    private double sumReal() {
        return startComplexNumber.getRealPart() + changerComplexNumber.getRealPart();
    }

    private double sumImaginary() {
        return startComplexNumber.getImaginaryPart() + changerComplexNumber.getImaginaryPart();
    }

    @Override
    public double getRealPart() {
        return sumReal();
    }

    @Override
    public double getImaginaryPart() {
        return sumImaginary();
    }

    @Override
    public int getId() {
        return 0;
    }


    @Override
    public String toString() {
        return String.format("Z%d = %s %c %si", changerComplexNumber.getId(),
                fmt(sumReal()), sign(), fmt(Math.abs(sumImaginary())));
    }

    // вспомогательные методы для toString() :
    private String fmt(double d) {
        if (d == (long) d)
            return String.format("%d", (long) d);
        else
            return String.format("%s", d);
    }

    private Character sign() {
        if (sumImaginary() < 0) return '-';
        else return '+';
    }
}

