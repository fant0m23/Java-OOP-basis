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

//        StudentGroupIterator studentGroupIterator = new StudentGroupIterator(studentGroup);
//        while (studentGroupIterator.hasNext()) {
//            System.out.println(studentGroupIterator.next());
//        }
//        System.out.println();
        for (Student s : studentGroup) {
            System.out.println(s);
        }

        System.out.println("\t\t метод sort, использует переопределенный compareTo (по ID):");
        StudentGroupService service = new StudentGroupService(studentGroup);
        List<Student> sortedListOfStudents = service.getSortedStudentGroup();
        for (Student s : sortedListOfStudents) {
            System.out.println(s);
        }

        System.out.println("\t\t метод sort использует custom comparator (по ФИО через базовый compareTo для строк):");
        StudentGroupService service2 = new StudentGroupService(studentGroup);
        List<Student> sortedListOfStudents2 = service2.getSortedStudentGroupByFIO();
        for (Student s : sortedListOfStudents2) {
            System.out.println(s);
        }
    }
}


