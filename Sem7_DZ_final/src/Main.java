/*
    Создать проект калькулятора комплексных чисел (достаточно сделать сложение, умножение и деление).
    Применить при создании программы архитектурные паттерны, добавить логирование калькулятора.
    Соблюдать принципы SOLID, паттерны проектирования.
 */

import modelDecorator.*;
import models.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        IComplexNumber res = new FirstComplexNumberDecorator(
                new InitialComplexNumber(), new ComplexNumber(2, 5));
        System.out.println(res);

        IComplexNumber user2 = new ComplexNumber(3, 3);
        res = new SumDecorator(res, user2);
        System.out.println(res);

        res = new SumDecorator(res, new ComplexNumber(-1.5, 4));
        System.out.println(res);

        res = new DifferenceDecorator(res, new ComplexNumber(8, -1));
        System.out.println(res);

        res = new MultiplicationDecorator(res, new ComplexNumber(-2, -2));
        System.out.println(res);

        res = new DivisorDecorator(res, new ComplexNumber(3, -4));
        System.out.println(res);

//        Controller controller = new Controller();
//        controller.gettingInputData();
//        controller.getResult();
    }
}