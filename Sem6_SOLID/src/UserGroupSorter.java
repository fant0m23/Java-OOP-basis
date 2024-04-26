import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserGroupSorter<G extends IGroup, T extends User> implements ISorterUserGroupByComparable<IGroup, User>,
        ISorterUserGroupByCustomComparator<IGroup, User> {

    @Override
    public List<User> getSortedUserGroup(IGroup group) {
        List<User> users = group.getUsers();
        Collections.sort((List) users);
        return users;
    }

    @Override
    public List<User> getSortedUserGroupByFIO(IGroup group) {
        List<User> users = new ArrayList<>(group.getUsers());
        users.sort(new UserComparator<>());
        return users;
    }
}
