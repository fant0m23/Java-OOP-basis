import java.util.ArrayList;
import java.util.List;

public class TeacherGroup {
    private List<Teacher> teachers;

    public TeacherGroup() {
        this.teachers = new ArrayList<>();
    }

    public TeacherGroup(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public void addTeacher(Teacher teacher){
        this.teachers.add(teacher);
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }
}
