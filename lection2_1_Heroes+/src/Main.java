
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        //#region team1
        List<Hero> team1 = new ArrayList<>();
        team1.add(new Druid());
        team1.add(new Shaman());
        team1.add(new Paladin());
        team1.add(new Druid());

        // team1.get(0).attack

        var h = team1.get(0);

        if (h instanceof Warrior) {
            ((Warrior) h).attack(team1.get(2));
        } else if (h instanceof Healer) {
            ((Healer) h).healing(team1.get(2));
        } else {
            //....
        }
        //#endregion

        //#region team2
        List<Warrior> team2 = new ArrayList<>();
        //team2.add(new Druid());
        team2.add(new Paladin("nAME",100));
        team2.add(new Knight("aLIster",140));

        team2.get(0).attack((Hero) team2.get(1));

        List<Healer> team3 = new ArrayList<>();
        //team2.add(new Paladin());
        team3.add(new Druid());
        team3.add(new Shaman());

        System.out.println(team2.get(1).getHp());
        team3.get(0).healing((Hero) team2.get(1));
        System.out.println("--------------------");
        System.out.println(team2.get(1).getHp());


        //#endregion


    }
}
