package controller;

public interface ILogger {
    void info(String key, String arg);
    void saveToFile();
}
