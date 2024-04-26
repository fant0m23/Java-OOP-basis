import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup extends Group<Student> implements Iterable<Student> {

    public List<Student> getStudents() {
        return super.getUsers();
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
}
