package Data;

public class Teacher extends User {
    private int teacherId;

    public Teacher(int teacherId, String secondName, String firstName, String lastName) {
        super(secondName, firstName, lastName);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    @Override
    public String toString() {
        return "Teacher " + teacherId + ": " + super.toString();
    }

}
