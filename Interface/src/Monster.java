import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        List<String> monsterList = new ArrayList<>();
        monsterList.add(0, this.name);
        monsterList.add(1, ""+this.hitPoints);
        monsterList.add(2, ""+this.strength);
        return monsterList;
    }

    @Override
    public void read(List<String> lists) {
    if(lists != null && lists.size() > 0){
        this.name = lists.get(0);
        this.hitPoints = Integer.parseInt(lists.get(1));
        this.strength = Integer.parseInt(lists.get(2));

    }
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }
}
