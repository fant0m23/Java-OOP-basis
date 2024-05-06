package controller;

import Data.*;
import Service.DataService;
import Service.StudyGroupService;
import view.StudentView;
import view.StudyGroupView;
import view.TeacherView;

import java.util.List;

public class Controller {
    private final DataService service = new DataService();
    private final StudyGroupService studyGroupService = new StudyGroupService();
    private final StudentView studentView = new StudentView();
    private final TeacherView teacherView = new TeacherView();
    private final StudyGroupView studyGroupView = new StudyGroupView();

    public void createStudent(String secondName, String firstName, String lastName) {
        service.create(secondName, firstName, lastName, Type.STUDENT);
    }

    public void createTeacher(String secondName, String firstName, String lastName) {
        service.create(secondName, firstName, lastName, Type.TEACHER);
    }

    public void getAllStudents() {
        List<Student> userList = service.getAllStudents();
        for (Student user : userList) {
            studentView.printOnConsole(user);
        }
    }

    public void getAllTeachers() {
        List<Teacher> userList = service.getAllTeachers();
        for (User user : userList) {
            teacherView.printOnConsole((Teacher) user);
        }
    }

    public void getStudyGroup() {
        studyGroupView.printOnConsole(studyGroupService.getStudyGroup());
    }

    public void addStudentToStudyGroup(String secondName, String firstName, String lastName) {
        createStudent(secondName, firstName, lastName);
        studyGroupService.addStudentToStudentGroup(service.getAllStudents().getLast());
    }

    public void addStudentToStudyGroup(int id) {
        for (Student s : service.getAllStudents()) {
            if (s.getStudentId() == id){
                studyGroupService.addStudentToStudentGroup(s);
            }
        }
    }

    public void createStudyGroupWithTeacher(String secondName, String firstName, String lastName) {
        createTeacher(secondName, firstName, lastName);
        studyGroupService.createStudyGroup(service.getAllTeachers().getLast(), studyGroupService.getStudentGroup());
    }

    public void createStudyGroupWithTeacher(int id) {
        for (Teacher t : service.getAllTeachers()) {
            if (t.getTeacherId() == id){
                studyGroupService.createStudyGroup(t, studyGroupService.getStudentGroup());
            }
        }
    }
}