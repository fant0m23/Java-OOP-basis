package models;

public class ComplexNumber extends InitialComplexNumber {

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = super.getRealPart() + realPart;
        this.imaginaryPart = super.getImaginaryPart() + imaginaryPart;
    }
}
