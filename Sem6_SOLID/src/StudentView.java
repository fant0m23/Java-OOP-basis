import java.util.List;

public class StudentView implements UserView<Student> {

    @Override
    public void sendOnConsole(List<Student> students) {
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
