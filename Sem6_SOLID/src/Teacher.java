import java.util.Locale;

public class Teacher extends User implements Comparable<Teacher>{
    private String schoolSubject;

    public Teacher(String firstName, String secondName, String lastName, String schoolSubject) {
        super(firstName, secondName, lastName);
        this.schoolSubject = schoolSubject;
    }

    public String getSchoolSubject() {
        return schoolSubject;
    }

    @Override
    public String toString() {
        return "Teacher: "+ super.getFullName() + " (предмет обучения - \"" + schoolSubject.toUpperCase() + "\")";
    }

    @Override
    public int compareTo(Teacher o) {
        return this.schoolSubject.compareTo(o.getSchoolSubject());
    }
}
