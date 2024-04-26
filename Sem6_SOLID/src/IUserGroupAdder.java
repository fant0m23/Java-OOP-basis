public interface IUserGroupAdder<G extends IGroup<T>, T extends User> {
    void add(G group, T user);
}
