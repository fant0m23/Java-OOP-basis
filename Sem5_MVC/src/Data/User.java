package Data;

public class User {
    private String firstName;
    private String secondName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public User(String secondName, String firstName, String lastName) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        return String.format("%s %s %s", secondName, firstName, lastName);
    }
}