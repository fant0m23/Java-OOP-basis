import java.util.List;

public interface ISorterUserGroupByComparable<G, T> {
    List<T> getSortedUserGroup(G group);
}
