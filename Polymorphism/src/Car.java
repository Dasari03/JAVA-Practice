public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public void startEngine(){
        System.out.println(this.name+"'s" + " engine starts...");
    }

    public void accelerate(){
        System.out.println(this.name + " is accelerating...");
    }

    public void brake(){
        System.out.println(this.name + " is braking...");
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }


}

class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void accelerate() {
        super.accelerate();
    }

    @Override
    public void brake() {
        super.brake();
    }
}
