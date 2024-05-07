/*
    Создать проект калькулятора комплексных чисел (достаточно сделать сложение, умножение и деление).
    Применить при создании программы архитектурные паттерны, добавить логирование калькулятора.
    Соблюдать принципы SOLID, паттерны проектирования.
 */

import controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.start();
    }
}