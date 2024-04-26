import java.util.ArrayList;
import java.util.List;

public class TeacherGroup extends Group implements IGroup{
    private List<Teacher> teachers;

    public TeacherGroup() {
        super();
    }

    public TeacherGroup(List<User> users) {
        super(users);
    }

    public List<Teacher> getTeachers() {
        return this.teachers;
    }
}
