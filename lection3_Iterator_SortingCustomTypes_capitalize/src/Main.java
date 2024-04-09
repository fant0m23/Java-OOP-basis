import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        Worker w1 = new Worker("bob DILaN", 83, 57367);
        Worker w2 = new Worker("zenia meDiNa raMos", 46, 98732);
        Worker w3 = new Worker("jaCkIE", 70, 3267);

        List<Worker> workerList = new ArrayList<>(Arrays.asList(w1, w2, w3));
        for (Worker w : workerList) {
            System.out.println(w);
        }
        System.out.println("---------------------------------------------------");

        Iterator<String> workerIterator = w2;
        while (workerIterator.hasNext()) {
            System.out.print(w2.next());
        }
        System.out.println();
        System.out.println("---------------------------------------------------");

        // сортировка с использованием переопределения метода интерфейса Comparable
        System.out.println("\t\t\t интерфейс Comparable метод compareTo() переопределенный по возрасту");
        Collections.sort(workerList);
        for (Worker w : workerList) {
            System.out.println(w);
        }
        System.out.println("---------------------------------------------------");

        // сортировка с использованием в качестве компаратора лямбда-выражения
        System.out.println("\t\t\t лямбда-выражение по зарплате");
        workerList.sort((x, y) -> Integer.compare(x.getSalary(), y.getSalary()));
        for (Worker w : workerList) {
            System.out.println(w);
        }
        System.out.println("---------------------------------------------------");

        // сортировка с использованием написанного самостоятельно компаратора
        System.out.println("\t\t\t самодельный компаратор в АНОНИМНОМ КЛАССЕ по возрасту");
        workerList.sort(new AgeComparator());
        for (Worker w : workerList) {
            System.out.println(w);
        }


    }
}