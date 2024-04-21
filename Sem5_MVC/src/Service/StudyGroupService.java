package Service;

import Data.*;

import java.util.List;

public class StudyGroupService {
    private StudyGroup group = new StudyGroup();

    public StudyGroup createStudyGroup(Teacher t, List<Student> studentList){
        group.setTeacher(t);
        group.setStudentList(studentList);
        return group;
    }

    public StudyGroup getStudyGroup() {
        return group;
    }

    public List<Student> getStudentGroup() {
        return group.getStudentList();
    }

    public void addStudentToStudentGroup(Student s){
        group.addStudent(s);
    }
}
