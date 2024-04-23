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

    public User(String firstName, String secondName, String lastName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    public String getFullName(){
        return String.format("%s %s %s", firstName,secondName,lastName);
    }

    @Override
    public String toString() {
        return getFullName();
    }
}
