package Data;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup {

    private Teacher teacher;
    private List<Student> studentList = new ArrayList<>();

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setTeacher(Teacher t){
        this.teacher = t;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(Student s){
        this.studentList.add(s);
    }

    @Override
    public String toString() {
        return String.format("Учебная группа.\n\tПреподаватель: %s\n\tУчащиеся: %s",
                 teacher, studentList);
    }
}
