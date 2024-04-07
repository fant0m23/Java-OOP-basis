
public class God extends Hero implements Healer, Warrior {

    @Override
    public void attack(Hero target) {
        
    }

    @Override
    public int getHp() {
        return super.hp;
    }

    @Override
    public void healing(Hero target) {
        target.hp += 20;
    }
}

