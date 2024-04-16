public class Student extends User implements Comparable<Student>{
    private int studentId;

    public Student(int studentId, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.studentId = studentId;

    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student: "+ super.getFullName() + " (ID=" + studentId + ')';
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.studentId, o.getStudentId());
    }
}
