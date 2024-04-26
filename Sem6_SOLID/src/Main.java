/*
    Продемонстрировать применение принципов SOLID.
    В проекте прокомментировать участки кода, которые рефакторим, какой принцип применяем и почему.
 */

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(3, "Пьер", "Кириллович", "Безухов");
        Student s2 = new Student(1, "Наталья", "Андреевна", "Гончарова");
        Student s3 = new Student(2, "Андрей", "Николаевич", "Болконский");
        Teacher t1 = new Teacher("Иван", "Порфирьевич", "Бородин", "музыка");
        Teacher t2 = new Teacher("Лев", "Николаевич", "Толстой", "литература");

        UserGroupChanger<IGroup, User> changer = new UserGroupChanger<>();

        IGroup studentGroup = new StudentGroup();
        changer.add(studentGroup, s1);
        changer.add(studentGroup, s2);
        changer.add(studentGroup, s3);
        changer.remove(studentGroup, s2);
        changer.add(studentGroup, s2);
        IGroup teacherGroup = new TeacherGroup();
        changer.add(teacherGroup, t1);
        changer.add(teacherGroup, t2);

        IUserView<User> viewer = new UserView<>();
        viewer.sendOnConsole(studentGroup.getUsers());
        viewer.sendOnConsole(teacherGroup.getUsers());

        UserGroupSorter<IGroup, User> sorter = new UserGroupSorter<>();

        System.out.println("\t Метод sort (реализация Comparable, compareTo по studentID и строки schoolSubject):");
        viewer.sendOnConsole(sorter.getSortedUserGroup(studentGroup));
        viewer.sendOnConsole(sorter.getSortedUserGroup(teacherGroup));

        System.out.println("\t Метод sort использует UserComparator (по ФИО через базовый compareTo для строк):");
        viewer.sendOnConsole(sorter.getSortedUserGroupByFIO(studentGroup));
        viewer.sendOnConsole(sorter.getSortedUserGroupByFIO(teacherGroup));
    }
}


