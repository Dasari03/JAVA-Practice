


public class Hamburger {

    public double price;
    public String name;
    protected String meat;
    protected String breadRollType;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.price = price;
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        price += addition1Price;
    }

    public void addHamburgerAddition2(String addition2Name, double addition2Price){
        price += addition2Price;

    }

    public void addHamburgerAddition3(String addition3Name, double addition3Price){
        price += addition3Price;

    }

    public void addHamburgerAddition4(String addition4Name, double addition4Price){
        price += addition4Price;

    }

    public double itemizeHamburger(){
        return price;
    }



}







