package controller;

import modelDecorator.*;
import models.ComplexNumber;
import models.IComplexNumber;
import models.InitialComplexNumber;
import view.InputUI;
import view.CalculatorUI;

import static controller.Msg.*;
import static view.Text.*;


public class Controller {

    private IComplexNumber complexNumber;
    private final InputUI calculatorUI = new CalculatorUI();
    private ILogger logger = new CalculatorLogger();

    public void start() {
        logger.info(START, "...");
        calculatorUI.textOnConsole(HELLO);
        boolean flag = true;
        char userChoice;
        ComplexNumber userNumber;
        while (flag) {
            userNumber = getComplexNumber();
            complexNumber = new FirstComplexNumberDecorator(new InitialComplexNumber(), userNumber);
            logger.info(ENTERED_NUM, complexNumber.toString());
            while (flag) {
                userChoice = calculatorUI.getOperator();
                logger.info(ENTERED_OP, String.valueOf(userChoice));
                userNumber = getComplexNumber();
                logger.info(ENTERED_NUM, userNumber.toString());
                switch (userChoice) {
                    case '+':
                        complexNumber = new SumDecorator(complexNumber, userNumber);
                        break;
                    case '-':
                        complexNumber = new DifferenceDecorator(complexNumber, userNumber);
                        break;
                    case '*':
                        complexNumber = new MultiplicationDecorator(complexNumber, userNumber);
                        break;
                    case '/':
                        complexNumber = new DivisorDecorator(complexNumber, userNumber);
                        break;
                }
                logger.info(CALCULATED, complexNumber.toString());
                userChoice = calculatorUI.getAction();
                if (userChoice == 'q') flag = false;
                else if (userChoice == 'c') continue;
                else if (userChoice == 'n') break;
                }
            }
        logger.info(QUIT,"...");
        logger.saveToFile();
        calculatorUI.closeScanner();
    }

    public ComplexNumber getComplexNumber() {
        double real = 0, image = 0;
        String userInput;
        boolean flag = true;
        calculatorUI.textOnConsole(HEAD);
        while (flag) {
            calculatorUI.textOnConsole(REAL);
            userInput = calculatorUI.getUserStr();
            if (isDouble(userInput)) {
                real = Double.parseDouble(userInput);
                flag = false;
            }
        }
        flag = true;
        while (flag) {
            calculatorUI.textOnConsole(IMAGINARY);
            userInput = calculatorUI.getUserStr();
            if (isDouble(userInput)) {
                image = Double.parseDouble(userInput);
                flag = false;
            }
        }
        return new ComplexNumber(real, image);
    }

    private static boolean isDouble(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
