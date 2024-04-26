import java.util.ArrayList;
import java.util.List;

public class TeacherGroup extends Group<Teacher>{

    public List<Teacher> getTeachers() {
        return super.getUsers();
    }
}
