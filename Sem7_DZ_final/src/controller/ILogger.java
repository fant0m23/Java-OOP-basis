package controller;

public interface ILogger {
    void info(Msg key, String arg);
    void saveToFile();
}
