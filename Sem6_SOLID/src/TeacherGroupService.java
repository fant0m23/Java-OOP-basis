import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeacherGroupService {
    private TeacherGroup teachers;

    public TeacherGroupService(TeacherGroup teachers) {
        this.teachers = teachers;
    }

    public TeacherGroup getStudentGroup() {
        return teachers;
    }

    public List<Teacher> getSortedTeacherGroup(){
        List<Teacher> teachersList = new ArrayList<>(teachers.getTeachers());
        Collections.sort(teachersList);
        return teachersList;
    }

    public List<Teacher> getSortedTeacherGroupByFIO(){
        List<Teacher> teachersList = new ArrayList<>(teachers.getTeachers());
        teachersList.sort(new UserComparator());
        return teachersList;
    }

}
