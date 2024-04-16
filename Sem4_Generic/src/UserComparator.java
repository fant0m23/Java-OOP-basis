import java.util.Comparator;

public class UserComparator<U extends User> implements Comparator<U> {

    @Override
    public int compare(U o1, U o2) {
        int resultOfComparing = o1.getLastName().compareTo(o2.getLastName());
        if (resultOfComparing == 0){
            resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
            if (resultOfComparing == 0){
                return o1.getSecondName().compareTo(o2.getSecondName());
            }
            else return resultOfComparing;
        }
        else return resultOfComparing;
    }
}
