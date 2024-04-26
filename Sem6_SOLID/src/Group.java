import java.util.ArrayList;
import java.util.List;

public abstract class Group<T extends User> implements IGroup<T>{
    private List<T> users;

    public Group() {
        this.users = new ArrayList<>();
    }

    public Group(List<T> users) {
        this.users = users;
    }

    public List<T> getUsers() {
        return this.users;
    }
}
