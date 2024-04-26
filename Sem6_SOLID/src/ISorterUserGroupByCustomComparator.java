import java.util.List;

public interface SorterUserGroupByCustomComparator<T extends User> {
    List<T> getSortedUserGroupByFIO();
}
