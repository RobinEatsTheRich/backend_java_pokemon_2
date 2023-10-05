import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon{
    private static final String type = "water";
    private static final List<String> attacks = Arrays.asList("Surf","HydroPump","HydroCannon","RainDance");


    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public List<String> getAttacks() {
        return attacks;
    }

    void standardWaterAttack(Pokemon name, Pokemon enemy, String move, int dmg){
        System.out.println(name.getName()+" used "+move+" on "+enemy.getName()+"!");
        switch (enemy.getType()){
            case"fire":
                System.out.println("It dealt "+dmg*2+" damage!");
                System.out.println("It's super effective!");
                enemy.setHp(enemy.getHp()-dmg*2);
                break;
            case"electric":
                System.out.println("It dealt "+dmg+" damage!");
                enemy.setHp(enemy.getHp()-dmg);
                break;
            case"grass":
                System.out.println("It dealt "+dmg/2+" damage!");
                System.out.println("It's not very effective.");
                enemy.setHp(enemy.getHp()-dmg/2);
                break;
            case"water":
                System.out.println("It dealt "+dmg/4+" damage!");
                enemy.setHp(enemy.getHp()-dmg/4);
                System.out.println("It has very little effect...");
                break;
        }
        System.out.println(enemy.getName()+" has "+enemy.getHp()+"hp left!");
    }


    public void surf(Pokemon name, Pokemon enemy){
        standardWaterAttack(name,enemy,"Surf",90);
    };

    public void hydroPump(Pokemon name, Pokemon enemy){
        standardWaterAttack(name,enemy,"Hydro Pump",110);
    };
    public void hydroCanon(Pokemon name, Pokemon enemy){
        standardWaterAttack(name,enemy,"Hydro Cannon",150);
    };
    public void rainDance(Pokemon name, Pokemon enemy){
        System.out.println(name.getName()+" used Rain Dance!");
        System.out.println(name.getName()+" healed for 50 points!");
        name.setHp(name.getHp()+50);
        System.out.println(name.getName()+" now has "+name.getHp()+"hp!");
        if (enemy.getType().equals("grass")){
            System.out.println(enemy.getName()+" also healed for 50 points!");
            enemy.setHp(enemy.getHp()+50);
            System.out.println(enemy.getName()+" now has "+enemy.getHp()+"hp!");
        }
    };
}
