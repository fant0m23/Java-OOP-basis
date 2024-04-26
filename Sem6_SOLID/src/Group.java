import java.util.ArrayList;
import java.util.List;

public abstract class Group implements IGroup{
    protected List<User> users;

    public Group() {
        this.users = new ArrayList<>();
    }

    public Group(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return this.users;
    }
}
