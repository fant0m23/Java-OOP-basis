import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour {

    private List<Actor> actorList = new ArrayList<>();

    @Override
    public void acceptToMarket(Actor actor) {
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor a : actors) {
            System.out.println(a.getName() + " вышел из магазина");
            actorList.remove(a);
        }
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }

    @Override
    public void takeInQueue(Actor actor) {
        this.actorList.add(actor);
    }

    @Override
    public void takeOrders() {
        for (Actor a : actorList) {
            if (!a.isMakeOrder) {
                System.out.println(a.getName() + " оформил заказ");
                a.setMakeOrder(true);
            }
        }
    }

    @Override
    public void giveOrders() {
        for (Actor a : actorList) {
            if (a.isMakeOrder) {
                System.out.println(a.getName() + " получил свой заказ");
                a.setTakeOrder(true);
            }
        }
    }

    @Override
    public void releaseFromQueue() {  // создает список людей, получивших свой заказ
        List<Actor> releasedActors = new ArrayList<>();
        for (Actor a : actorList) {
            if (a.isTakeOrder) {
                releasedActors.add(a);
                System.out.println(a.getName() + " покинул очередь");
            }
        }
        releaseFromMarket(releasedActors);
    }
}
