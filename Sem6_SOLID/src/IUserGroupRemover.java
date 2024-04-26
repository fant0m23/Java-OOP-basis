public interface IUserGroupRemover <G extends IGroup, T extends User> {
    void remove(G group, T user);
}
