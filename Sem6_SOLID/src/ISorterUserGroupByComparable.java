import java.util.List;

public interface SorterUserGroupByComparable<T extends User> {
    List<T> getSortedUserGroup();
}
