public interface IUserGroupAdder<G extends IGroup, T extends User> {
    void add(G group, T user);
}
