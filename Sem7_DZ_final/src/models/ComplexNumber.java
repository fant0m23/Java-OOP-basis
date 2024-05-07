package models;

public class ComplexNumber extends InitialComplexNumber {

    public ComplexNumber(double realPart, double imaginaryPart) {
        super.realPart = super.getRealPart() + realPart;
        super.imaginaryPart = super.getImaginaryPart() + imaginaryPart;
        super.id = ++counter;
    }
}
