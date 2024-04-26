import java.util.List;

public interface IGroup<T extends User> {
    List<T> getUsers();
}
