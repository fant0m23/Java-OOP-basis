import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(3, "Пьер", "Кириллович", "Безухов");
        Student s2 = new Student(1, "Наталья", "Андреевна", "Гончарова");
        Student s3 = new Student(2, "Андрей", "Николаевич", "Болконский");
        StudentGroup studentGroup = new StudentGroup();
        studentGroup.addStudent(s1);
        studentGroup.addStudent(s2);
        studentGroup.addStudent(s3);

        Teacher t1 = new Teacher("Иван", "Порфирьевич", "Бородин", "музыка");
        Teacher t2 = new Teacher("Лев", "Николаевич", "Толстой", "литература");
        TeacherGroup teacherGroup = new TeacherGroup();
        teacherGroup.addTeacher(t1);
        teacherGroup.addTeacher(t2);

        StudentView sView = new StudentView();
        TeacherView tView = new TeacherView();
        sView.sendOnConsole(studentGroup.getStudents());
        tView.sendOnConsole(teacherGroup.getTeachers());

        System.out.println("\t Метод sort (реализация Comparable, compareTo по studentID и строки schoolSubject):");
        StudentGroupService studentsService = new StudentGroupService(studentGroup);
        TeacherGroupService teachersService = new TeacherGroupService(teacherGroup);
        sView.sendOnConsole(studentsService.getSortedStudentGroup());
        tView.sendOnConsole(teachersService.getSortedTeacherGroup());


        System.out.println("\t Метод sort использует UserComparator (по ФИО через базовый compareTo для строк):");
        StudentGroupService studentsService2 = new StudentGroupService(studentGroup);
        TeacherGroupService teachersService2 = new TeacherGroupService(teacherGroup);
        sView.sendOnConsole(studentsService2.getSortedStudentGroupByFIO());
        tView.sendOnConsole(teachersService2.getSortedTeacherGroupByFIO());
    }
}


