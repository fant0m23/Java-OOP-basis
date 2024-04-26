import java.util.List;

public class UserView<T extends User> implements IUserView<T> {

    @Override
    public void sendOnConsole(List<T> users) {
        for (T u : users) {
            System.out.println(u);
        }
    }
}
