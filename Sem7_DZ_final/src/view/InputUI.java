package view;

public interface InputUI {
    void textOnConsole(Text key);
    char getOperator();
    char getAction();
    void closeScanner();
    String getUserStr();
}
