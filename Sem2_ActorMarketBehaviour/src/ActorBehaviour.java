public interface ActorBehaviour {
    void setMakeOrder(boolean isMakeOrder);

    void setTakeOrder(boolean isTakeOrder);

    boolean isMakeOrder();

    boolean isTakeOrder();
}
