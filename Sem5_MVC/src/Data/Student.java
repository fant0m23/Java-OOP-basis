package Data;

public class Student extends User{
    private int studentId;

    public Student(int studentId, String secondName, String firstName, String lastName) {
        super(secondName, firstName, lastName);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student " + studentId + ": "+ super.toString();
    }
}
