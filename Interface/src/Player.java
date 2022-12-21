import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{

    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }


    @Override
    public List<String> write() {
     List<String> playerList = new ArrayList<>();
     playerList.add(0,this.name);
     playerList.add(1,this.weapon);
     playerList.add(2,"" +this.hitPoints);
     playerList.add(3,"" +this.strength);
     return  playerList;
    }

    @Override
    public void read(List<String> lists) {
       if(lists != null && lists.size() > 0  ){

               this.name = lists.get(0);
               this.weapon = lists.get(1);
               this.hitPoints = Integer.parseInt(lists.get(2));
               this.strength = Integer.parseInt(lists.get(3));

       }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }
}
