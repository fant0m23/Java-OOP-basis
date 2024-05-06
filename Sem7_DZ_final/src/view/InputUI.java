package view;

import models.ComplexNumber;

import java.util.Scanner;

public class InputUI implements IInputUI{
    private Scanner scan = new Scanner(System.in);

    public ComplexNumber getComplexNumber() {
        double a, i;
        System.out.print("Введите действительную часть числа >>> ");
        a = scan.nextDouble();
        System.out.print("Введите мнимую часть числа >>> ");
        i = scan.nextDouble();
        return new ComplexNumber(a, i);
    }

    public double getDouble(){
        return scan.nextDouble();
    }

    public char getOperator(){
        System.out.print("Выберите арифметическое действие (+,-,*,/) >>> ");
        return scan.next().charAt(0);
    }

    public void closeScanner(){
        scan.close();
    }
}
