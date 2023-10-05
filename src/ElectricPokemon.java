import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon{

    private static final String type = "electric";
    private static final List<String> attacks = Arrays.asList("ThunderPunch","ElectroBall","Thunder", "VoltTackle");


    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public List<String> getAttacks() {
        return attacks;
    }

    void standardElectricAttack(Pokemon name, Pokemon enemy, String move, int dmg){
        System.out.println(name.getName()+" used "+move+" on "+enemy.getName()+"!");
        switch (enemy.getType()){
            case"water":
                System.out.println("It dealt "+dmg*2+" damage!");
                System.out.println("It's super effective!");
                enemy.setHp(enemy.getHp()-dmg*2);
                break;
            case"grass":
                System.out.println("It dealt "+dmg+" damage!");
                enemy.setHp(enemy.getHp()-dmg);
                break;
            case"fire":
                System.out.println("It dealt "+dmg/2+" damage!");
                System.out.println("It's not very effective.");
                enemy.setHp(enemy.getHp()-dmg/2);
                break;
            case"electric":
                System.out.println("It dealt "+dmg/4+" damage!");
                enemy.setHp(enemy.getHp()-dmg/4);
                System.out.println("It has very little effect...");
                break;
            }
        System.out.println(enemy.getName()+" has "+enemy.getHp()+"hp left!");
    }


    public void thunderPunch(Pokemon name, Pokemon enemy){
        standardElectricAttack(name,enemy,"Thunderpunch",75);
    };

    public void electroBall(Pokemon name, Pokemon enemy){
        standardElectricAttack(name,enemy,"Electro Ball",60);
    };
    public void thunder(Pokemon name, Pokemon enemy){
        int dmg = 110;
        System.out.println(name.getName()+" used Thunder on "+enemy.getName()+"!");
        switch (enemy.getType()){
            case"water":
                System.out.println("It dealt "+dmg*2+" damage!");
                System.out.println("It's super effective!");
                enemy.setHp(enemy.getHp()-dmg*2);
                break;
            case"grass":
                System.out.println("It dealt "+dmg+" damage!");
                enemy.setHp(enemy.getHp()-dmg);
                break;
            case"fire":
                System.out.println("It dealt "+dmg/2+" damage!");
                System.out.println("It's not very effective.");
                enemy.setHp(enemy.getHp()-dmg/2);
                break;
            case"electric":
                System.out.println("It heals "+enemy+" for "+dmg/4+" points!");
                enemy.setHp(enemy.getHp()+dmg/4);
                break;
        }
        System.out.println(enemy.getName()+" has "+enemy.getHp()+"hp left!");
    };
    public void voltTackle(Pokemon name, Pokemon enemy){
        standardElectricAttack(name,enemy,"volt Tackle",120);
    };


}
