public class DeluxeBurger extends Hamburger{
    public DeluxeBurger(String name, String meat, double price, String breadRollType) {
        super(name, meat, price, breadRollType);
    }

    public DeluxeBurger(){
        this("deluxe hamburger", "sausage & bacon", 19.10, "white roll" );
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        //super.addHamburgerAddition1(addition1Name, addition1Price);
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        //super.addHamburgerAddition2(addition2Name, addition2Price);
        System.out.println("Cannot not add additional items to a deluxe burger");

    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        //super.addHamburgerAddition3(addition3Name, addition3Price);
        System.out.println("Cannot not add additional items to a deluxe burger");

    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        //super.addHamburgerAddition4(addition4Name, addition4Price);
        System.out.println("Cannot not add additional items to a deluxe burger");

    }
}
