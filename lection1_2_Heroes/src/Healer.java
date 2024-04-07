
public class Healer extends BaseHero {
    private int medicament;
    private int maxMedicament;

    public Healer(String name, int hp, int medicament) {

        super(String.format("Hero_healer %d", ++Healer.number),
                Healer.r.nextInt(80, 150));
        this.medicament = medicament;
    }

    public Healer() {
        this("DefaultName", 100, 30);
    }

    public void healing(BaseHero hero) {
        hero.hp += (int) (this.medicament * 1.5);
        this.medicament -= hero.hp/4;
    }
}
