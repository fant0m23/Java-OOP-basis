package controller;

import models.ComplexNumber;
import view.IInputUI;
import view.InputUI;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class Controller {
    private final IInputUI inputUI = new InputUI();
    private static Logger logger;

    static {
        System.setProperty("java.util.logging.SimpleFormatter.format",
                "%1$tF %1$tR %5$s %n");
        logger = Logger.getLogger(Controller.class.getName());
    }

    public void gettingInputData() throws InterruptedException {
        double a, i;
        System.out.println("Ввод комплексного числа Z1:");
        System.out.print("Введите действительную часть числа >>> ");
        a = inputUI.getDouble();
        System.out.print("Введите мнимую часть числа >>> ");
        i = inputUI.getDouble();
        ComplexNumber z1 = new ComplexNumber(a, i);
        logger.info("Введено комплексное число " + z1);
        // для корректного вывода в консоль сообщений logger'а пришлось поставить маленькие задержки
        TimeUnit.MILLISECONDS.sleep(50);
        System.out.println("Ввод комплексного числа Z2:");
        System.out.print("Введите действительную часть числа >>> ");
        a = inputUI.getDouble();
        System.out.print("Введите мнимую часть числа >>> ");
        i = inputUI.getDouble();
        ComplexNumber z2 = new ComplexNumber(a, i);
        logger.info("Введено комплексное число " + z2);
        TimeUnit.MILLISECONDS.sleep(50);
        char op = inputUI.getOperator();
        switch (op) {
            case '+':
                logger.info("Выбрана операция сложения");
                break;
            case '-':
                logger.info("Выбрана операция вычитания");
                break;
            case '*':
                logger.info("Выбрана операция умножения");
                break;
            case '/':
                logger.info("Выбрана операция деления");
                break;
        }
        inputUI.closeScanner();
    }

    public void getResult() {
    }
}
