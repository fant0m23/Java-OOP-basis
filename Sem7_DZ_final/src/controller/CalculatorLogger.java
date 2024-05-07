package controller;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class CalculatorLogger implements ILogger{

    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_RESET = "\u001B[0m";

    private static StringBuilder logFile = new StringBuilder();
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss ");

    @Override
    public void info(String key, String arg) {
        Map<String,String> textMap = Map.of(
                "enteredNumber", "# LOGGER: Введено комплексное число ",
                "enteredOperator", "# LOGGER: Введен арифметический оператор ",
                "calculated","# LOGGER: Получен результат\t\t",
                "quit", "# LOGGER: Завершение работы",
                "start", "Запуск программы");
        String record = textMap.get(key) + arg + "\n\t\t  " + dtf.format(LocalDateTime.now());
        logFile.append(record).append("\n");
        System.out.println(ANSI_RED + record + ANSI_RESET);
    }

    @Override
    public void saveToFile() {
        try (FileWriter fileWriter = new FileWriter("logCalculator.txt", false)) {
                fileWriter.write(logFile.toString());
        } catch (IOException e) {
            System.err.println("Ошибка записи в log-файл!");
        }
    }
}
