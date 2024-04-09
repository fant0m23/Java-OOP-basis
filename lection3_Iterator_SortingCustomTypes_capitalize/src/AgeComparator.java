import java.util.Comparator;

public class AgeComparator implements Comparator<Worker> {

    @Override
    public int compare(Worker o1, Worker o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }

}