
import java.util.List;

public class UserGroupChanger<G extends IGroup, T extends User> implements IUserGroupAdder<G,T>,
        IUserGroupRemover<G,T> {
    @Override
    public void add(G group, T user) {
        List<User> list = group.getUsers();
        list.add(user);
    }

    @Override
    public void remove(G group, T user) {
        List<User> list = group.getUsers();
        list.remove(user);
    }
}
