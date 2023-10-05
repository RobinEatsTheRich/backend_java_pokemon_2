import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon{
    private static final String type = "grass";
    private static final List<String> attacks = Arrays.asList("LeafStorm","SolarBeam","LeechSeed","LeaveBlade");


    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public List<String> getAttacks() {
        return attacks;
    }

    void standardGrassAttack(Pokemon name, Pokemon enemy, String move, int dmg){
        System.out.println(name.getName()+" used "+move+" on "+enemy.getName()+"!");
        switch (enemy.getType()){
            case"electric":
                System.out.println("It dealt "+dmg*2+" damage!");
                System.out.println("It's super effective!");
                enemy.setHp(enemy.getHp()-dmg*2);
                break;
            case"fire":
                System.out.println("It dealt "+dmg+" damage!");
                enemy.setHp(enemy.getHp()-dmg);
                break;
            case"water":
                System.out.println("It dealt "+dmg/2+" damage!");
                System.out.println("It's not very effective.");
                enemy.setHp(enemy.getHp()-dmg/2);
                break;
            case"grass":
                System.out.println("It dealt "+dmg/4+" damage!");
                enemy.setHp(enemy.getHp()-dmg/4);
                System.out.println("It has very little effect...");
                break;
        }
        System.out.println(enemy.getName()+" has "+enemy.getHp()+"hp left!");
    }


    public void leafStorm(Pokemon name, Pokemon enemy){
        standardGrassAttack(name,enemy,"Leaf Storm",130);
    };

    public void solarBeam(Pokemon name, Pokemon enemy){
        standardGrassAttack(name,enemy,"Solar Beam",120);
    };
    public void leechSeed(Pokemon name, Pokemon enemy){
        int dmg = 30;
        System.out.println(name.getName()+" used Leech Seed on "+enemy.getName()+"!");
        switch (enemy.getType()){
            case"electric":
                System.out.println("It dealt "+dmg*2+" damage!");
                System.out.println("It's super effective!");
                System.out.println(name.getName()+" regained "+dmg*2+"hp!");
                enemy.setHp(enemy.getHp()-dmg*2);
                break;
            case"fire":
                System.out.println("It dealt "+dmg+" damage!");
                System.out.println(name.getName()+" regained "+dmg+"hp!");
                enemy.setHp(enemy.getHp()-dmg);
                break;
            case"water":
                System.out.println("It dealt "+dmg/2+" damage!");
                System.out.println("It's not very effective.");
                System.out.println(name.getName()+" regained "+dmg/2+"hp!");
                enemy.setHp(enemy.getHp()-dmg/2);
                break;
            case"grass":
                System.out.println("It dealt "+dmg/4+" damage!");
                System.out.println("It has very little effect...");
                System.out.println(name.getName()+" regained "+dmg/4+"hp!");
                enemy.setHp(enemy.getHp()-dmg/4);
                break;
        }
        System.out.println(enemy.getName()+" has "+enemy.getHp()+"hp left!");
    };

    public void leaveBlade(Pokemon name, Pokemon enemy){
        standardGrassAttack(name,enemy,"Leaf Blade",90);
    };
}
