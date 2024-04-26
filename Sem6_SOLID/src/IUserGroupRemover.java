public interface IUserGroupRemover <G extends IGroup<T>, T extends User> {
    void remove(G group, T user);
}
