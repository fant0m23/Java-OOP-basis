import java.util.List;

public interface ISorterUserGroupByCustomComparator<G, T> {
    List<T> getSortedUserGroupByFIO(G group);
}
