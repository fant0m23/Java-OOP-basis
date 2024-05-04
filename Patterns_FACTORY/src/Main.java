
/*
    Порождающие паттерны:
                            "FACTORY"
 */


import developerFactores.CsharpDeveloperFactory;
import developerFactores.IDeveloperFactory;
import developerFactores.JavaDeveloperFactory;
import developerFactores.PHPDeveloperFactory;
import developers.IDeveloper;

public class Main {
    public static void main(String[] args) {
        IDeveloperFactory factory = createFactory("php");
        IDeveloper developer = factory.createDeveloper();
        developer.writesCode();

    }

    public static IDeveloperFactory createFactory(String msg) {
        if (msg.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (msg.equalsIgnoreCase("Csharp")) {
            return new CsharpDeveloperFactory();
        } else if (msg.equalsIgnoreCase("php")) {
            return new PHPDeveloperFactory();
        } else throw new RuntimeException("Таких разработчиков у нас нет))");
    }

}