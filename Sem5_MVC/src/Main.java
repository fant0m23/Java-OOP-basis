
import Controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("Иванов", "И.","И.");
        controller.createStudent("Попов", "Д.","С.");
        controller.createTeacher("Котов", "А.","Р.");
        controller.createStudent("Петров", "А.","В.");
        controller.createTeacher("Смирнов", "П.","К.");
        controller.getAllStudents();
        controller.getAllTeachers();
        controller.createStudyGroupWithTeacher("Пушкин", "А.","С.");
        controller.getStudyGroup();
        controller.getAllTeachers();
        controller.createStudyGroupWithTeacher(1);
        controller.addStudentToStudyGroup(2);
        controller.addStudentToStudyGroup(3);
        controller.addStudentToStudyGroup("Титов", "В.", "Д");
        controller.getStudyGroup();
    }
}