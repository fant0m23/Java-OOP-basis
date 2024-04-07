
public class Priest extends Hero implements Healer {

    @Override
    public void healing(Hero target) {
        target.hp += 20;
    }
}
