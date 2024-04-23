import java.util.List;

public class TeacherView implements UserView<Teacher> {
    @Override
    public void sendOnConsole(List<Teacher> students) {
        for (Teacher t : students) {
            System.out.println(t);
        }
    }
}
