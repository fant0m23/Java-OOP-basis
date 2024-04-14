import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>{
    private List<Student> students;

    public StudentGroup() {
        this.students = new ArrayList<>();
    }

    public StudentGroup(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);  // передаем this, потому что
        // конструктор StudentGroupIterator принимает объект этого же класса (объект типа StudentGroup)
    }
}
