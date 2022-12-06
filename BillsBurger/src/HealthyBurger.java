public class HealthyBurger extends Hamburger{

    public HealthyBurger(String name, String meat, double price, String breadRollType) {
        super(name, meat, price, breadRollType);
    }

    public HealthyBurger(String meat, double price){
        this("Healthy Burger", meat, price, "Brown rye roll");
    }

    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price){
        price += healthyExtra1Price;
    }

    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price){
        price += healthyExtra2Price;

    }

    @Override
    public double itemizeHamburger() {
        return price;
    }
}