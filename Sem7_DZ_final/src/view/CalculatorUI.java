package view;

import java.util.*;
import static view.Text.*;

public class CalculatorUI implements InputUI {
    private Scanner scan = new Scanner(System.in);

    public String getUserStr() {
        return scan.nextLine();
    }

    public char getOperator() {
        Set<Character> operators = new HashSet<>(Arrays.asList('+', '-', '*', '/'));
        char res = ' ';
        while (!operators.contains(res)) {
            textOnConsole(OPERATOR);
            res = scan.next().charAt(0);
        }
        return res;
    }

    public char getAction() {
        Set<Character> operators = new HashSet<>(Arrays.asList('c', 'n', 'q'));
        char res = ' ';
        while (!operators.contains(res)) {
            textOnConsole(ACTION);
            res = scan.next().charAt(0);
        }
        return res;
    }

    public void closeScanner() {
        scan.close();
    }

    public void textOnConsole(Text key) {
        Map<Text, String> textMap = Map.of(
                HELLO, "Добро пожаловать в калькулятор комплексных чисел!\n",
                HEAD, "============ Ввод комплексного числа ============\n",
                REAL, "Введите действительную часть числа >>> ",
                IMAGINARY, "Введите мнимую часть числа >>> ",
                OPERATOR, "Выберите арифметическое действие (+,-,*,/) >>> ",
                ACTION, "Нажмите клавишу 'c', чтобы далее производить арифметические операции" +
                        " с полученным результатом \nНажмите клавишу 'n', чтобы задать новое начальное комплексное" +
                        " число \nНажмите клавишу 'q' для выхода из программы \nВыберите действие >>> ");
        System.out.print(textMap.get(key));
    }
}
