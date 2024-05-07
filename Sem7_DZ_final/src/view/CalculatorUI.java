package view;


import java.util.*;

public class CalculatorUI implements InputUI {
    private Scanner scan = new Scanner(System.in);

    public String getUserStr() {
        return scan.nextLine();
    }

    public char getOperator() {
        Set<Character> operators = new HashSet<>(Arrays.asList('+', '-', '*', '/'));
        char res = ' ';
        while (!operators.contains(res)) {
            textOnConsole("requestOperation");
            res = scan.next().charAt(0);
        }
        return res;
    }

    public char getAction() {
        Set<Character> operators = new HashSet<>(Arrays.asList('c', 'n', 'q'));
        char res = ' ';
        while (!operators.contains(res)) {
            textOnConsole("requestAction");
            res = scan.next().charAt(0);
        }
        return res;
    }

    public void closeScanner() {
        scan.close();
    }

    public void textOnConsole(String key) {
        Map<String, String> textMap = Map.of(
                "hello", "Добро пожаловать в калькулятор комплексных чисел!\n",
                "info", "============ Ввод комплексного числа ============\n",
                "requestRealPart", "Введите действительную часть числа >>> ",
                "requestImaginaryPart", "Введите мнимую часть числа >>> ",
                "requestOperation", "Выберите арифметическое действие (+,-,*,/) >>> ",
                "requestAction", "Нажмите клавишу 'c', чтобы далее производить арифметические операции" +
                        " с полученным результатом \nНажмите клавишу 'n', чтобы задать новое начальное комплексное" +
                        " число \nНажмите клавишу 'q' для выхода из программы \nВыберите действие >>> ");
        System.out.print(textMap.get(key));
    }
}
