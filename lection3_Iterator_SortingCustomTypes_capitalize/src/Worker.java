import java.util.Iterator;

public class Worker implements Iterator<String>,  // это применяется для перебора и работы с полями экземпляра
        Comparable<Worker> {                      // для определения логики сравнивания при упорядочивании и сортировке
    private String name;
    private int age;
    private int salary;

    public Worker(String name, int age, int salary) {
        this.name = capitalize(name);
        this.age = age;
        this.salary = salary;
    }

    public String capitalize(String inputStr) {
        String[] mass = inputStr.split(" ");
        String result = "";
        for (String word : mass) {
            char firstChar = word.charAt(0);
            char bigFirstChar = Character.toUpperCase(firstChar);
            result += bigFirstChar + word.substring(1).toLowerCase() + " ";
        }
        return result.strip();
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s - %d лет (зарплата %d рублей)", name, age, salary);
    }

    // реализация интерфейса Iterator
    private int index;

    @Override
    public boolean hasNext() {
        return index++ < 3;
    }

    @Override
    public String next() {
        return switch (this.index) {
            case 1 -> String.format("%s - ", name);
            case 2 -> String.format("%d лет ", age);
            default -> String.format("(зарплата %d рублей)", salary);
        };
    }

    // реализация интерфейса Comparable через переопределение его единственного метода
    @Override
    public int compareTo(Worker o) {
        return Integer.compare(this.age, o.age);
    }
    // другая возможная логика сравнивания: {
    //    if (this.age > o.age)
    //            return 1;
    //        else if (this.age < o.age)
    //            return -1;
    //        else
    //                return 0;
    // }

}
