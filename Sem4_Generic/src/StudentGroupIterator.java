import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private List<Student> students;
    private int counter;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.students = studentGroup.getStudents();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return this.counter < this.students.size();
    }

    @Override
    public Student next() {
        if (hasNext()){
            return this.students.get(this.counter++);
        }
        return null;
    }

    @Override
    public void remove() {
        if(hasNext()){
            this.students.remove(this.counter++);
        }
    }
}
