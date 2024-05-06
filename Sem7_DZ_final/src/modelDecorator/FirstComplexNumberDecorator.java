package modelDecorator;

import models.IComplexNumber;

public class FirstComplexNumberDecorator extends ComplexNumberDecorator {

    public FirstComplexNumberDecorator(IComplexNumber startComplexNumber, IComplexNumber changerComplexNumber) {
        super(startComplexNumber, changerComplexNumber);
    }

    @Override
    public double getRealPart() {
        return changerComplexNumber.getRealPart() + startComplexNumber.getRealPart();
    }

    @Override
    public double getImaginaryPart() {
        return changerComplexNumber.getImaginaryPart() + startComplexNumber.getImaginaryPart();
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Z%d = %s %c %si", changerComplexNumber.getId(),
                fmt(changerComplexNumber.getRealPart() + startComplexNumber.getRealPart()), sign(),
                fmt(Math.abs(changerComplexNumber.getImaginaryPart() + startComplexNumber.getImaginaryPart())));
    }

    // вспомогательные методы для toString() :
    private String fmt(double d) {
        if (d == (long) d)
            return String.format("%d", (long) d);
        else
            return String.format("%s", d);
    }

    private Character sign() {
        if (changerComplexNumber.getImaginaryPart() + startComplexNumber.getImaginaryPart() < 0) return '-';
        else return '+';
    }


}
