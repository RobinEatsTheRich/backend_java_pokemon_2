import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon{

    private static final String type = "fire";
    private static final List<String> attacks = Arrays.asList("FireLash","Flamethrower","PyroBall","Inferno");


    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public List<String> getAttacks() {
        return attacks;
    }

    void standardFireAttack(Pokemon name, Pokemon enemy, String move, int dmg){
        System.out.println(name.getName()+" used "+move+" on "+enemy.getName()+"!");
        switch (enemy.getType()){
            case"grass":
                System.out.println("It dealt "+dmg*2+" damage!");
                System.out.println("It's super effective!");
                enemy.setHp(enemy.getHp()-dmg*2);
                break;
            case"water":
                System.out.println("It dealt "+dmg+" damage!");
                enemy.setHp(enemy.getHp()-dmg);
                break;
            case"electric":
                System.out.println("It dealt "+dmg/2+" damage!");
                System.out.println("It's not very effective.");
                enemy.setHp(enemy.getHp()-dmg/2);
                break;
            case"fire":
                System.out.println("It dealt "+dmg/4+" damage!");
                enemy.setHp(enemy.getHp()-dmg/4);
                System.out.println("It has very little effect...");
                break;
        }
        System.out.println(enemy.getName()+" has "+enemy.getHp()+"hp left!");
    }


    public void fireLash(Pokemon name, Pokemon enemy){
        standardFireAttack(name,enemy,"Fire Lash",80);
    };

    public void flameThrower(Pokemon name, Pokemon enemy){
        standardFireAttack(name,enemy,"Flamethrower",90);
    };
    public void inferno(Pokemon name, Pokemon enemy){
        standardFireAttack(name,enemy,"Inferno",100);
    };
    public void pyroBall(Pokemon name, Pokemon enemy){
        standardFireAttack(name,enemy,"Pyro Ball",120);
    };
}
