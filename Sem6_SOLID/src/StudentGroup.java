import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup extends Group implements Iterable<Student> , IGroup{

    private List<Student> students;

    public StudentGroup() {
        super();
    }

    public StudentGroup(List<User> students) {
        super(students);
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

}
