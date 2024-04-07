
public class Paladin extends Hero implements Warrior  {

    public Paladin(String name, int hp) {
        super(name, hp);
    }

    public Paladin() {
    }

    @Override
    public void attack(Hero target) {
        
    }

    @Override
    public int getHp() {
        return super.hp;
    }
}
