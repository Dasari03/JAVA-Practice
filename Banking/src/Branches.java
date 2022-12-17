import java.util.ArrayList;

public class Branches {

    private String name;
    private ArrayList<Customer> customers;

    public Branches(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double initial){
        for(int i = 0; i < this.customers.size(); i++){
            if(this.customers.get(i).getName().equals(name)){
                System.out.println("The customer already exists...");
                return false;
            }
        }
        this.customers.add(new Customer(name, initial));
        return true;
    }


    public boolean addCustomerTransaction(String name, double transaction){
        if(findCustomer(name) != null ) {
            for (int i = 0; i < this.customers.size(); i++) {
                if (this.customers.get(i).getName().equals(name)) {
                    this.customers.get(i).addTransaction(transaction);
                    System.out.println("Successfully added customer's transaction...");

                    return true;
                }
            }
        }

        System.out.println("The customer does not exists...");
        return false;
    }

    public Customer findCustomer(String name){
        for(int i = 0; i < this.customers.size(); i++){
            if(this.customers.get(i).equals(name)){
               Customer customer = this.customers.get(i);
                return customer;
            }

        }
        return null;
    }

}
