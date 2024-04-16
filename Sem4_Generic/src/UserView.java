import java.util.List;

public interface UserView<U extends User> {
    void sendOnConsole(List<U> userList);
}
