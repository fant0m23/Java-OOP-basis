package modelDecorator;

import models.IComplexNumber;

public class DivisorDecorator extends ComplexNumberDecorator {

    public DivisorDecorator(IComplexNumber startComplexNumber, IComplexNumber changerComplexNumber) {
        super(startComplexNumber, changerComplexNumber);
    }

    private double getDenominator() {
        return Math.pow(changerComplexNumber.getRealPart(), 2) +
                Math.pow(changerComplexNumber.getImaginaryPart(), 2);
    }

    private double resultReal() {
        return ((startComplexNumber.getRealPart() * changerComplexNumber.getRealPart()) +
                (startComplexNumber.getImaginaryPart() * changerComplexNumber.getImaginaryPart())) /
                getDenominator();
    }

    private double resultImaginary() {
        return ((startComplexNumber.getImaginaryPart() * changerComplexNumber.getRealPart()) +
                (startComplexNumber.getRealPart() * changerComplexNumber.getImaginaryPart() * (-1)))/
                getDenominator();
    }


    @Override
    public double getRealPart() {
        return resultReal();
    }

    @Override
    public double getImaginaryPart() {
        return resultImaginary();
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Z%d = %s %c %si", changerComplexNumber.getId(),
                fmt(resultReal()), sign(), fmt(Math.abs(resultImaginary())));
    }

    // вспомогательные методы для toString() :
    private String fmt(double d) {
        if (d == (long) d)
            return String.format("%d", (long) d);
        else
            return String.format("%s", d);
    }

    private Character sign() {
        if (resultImaginary() < 0) return '-';
        else return '+';
    }
}
