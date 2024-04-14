import java.util.Iterator;

public class StudyGroup {
    private int number;
    private String specialization;

    public StudyGroup(int number, String specialization) {
        this.number = number;
        this.specialization = specialization;
    }

    public int getNumber() {
        return number;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public String toString() {
        return this.specialization + "-" + this.number;
    }



}
