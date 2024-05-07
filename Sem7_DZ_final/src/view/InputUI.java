package view;

public interface InputUI {
    void textOnConsole(String key);
    char getOperator();
    char getAction();
    void closeScanner();
    String getUserStr();
}
