import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branches> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String nameBranch) {
        for (int i = 0; i < this.branches.size(); i++) {
            if (this.branches.get(i).getName().equals(nameBranch)) {
                System.out.println("Identical branch name already exists...");
                return false;
            }
        }
        this.branches.add(new Branches(nameBranch));
        System.out.println("Successfully added new branch name...");
        return true;
    }

    public boolean addCustomer(String nameBranch, String nameCustomer, double transaction) {
        for (int i = 0; i < this.branches.size(); i++) {
            if (this.branches.get(i).getName().equals(nameBranch)) {

                this.branches.get(i).newCustomer(nameCustomer, transaction);

//                ArrayList<Customer> customers = this.branches.get(i).getCustomers();
//               for(int j=0; j < customers.size(); j++){
//                   if(customers.get(j).getName().equals(nameCustomer)){
//                       System.out.println("Same named customer already exists...");
//                       return false;
//                    }
//
//                }
            }
        }


        return true;
    }

    public boolean addCustomerTransaction(String nameBranch, String nameCustomer, double transaction) {
        for (int i = 0; i < this.branches.size(); i++) {
            if (this.branches.get(i).getName().equals(nameBranch)) {

                ArrayList<Customer> customers = this.branches.get(i).getCustomers();
                for (int j = 0; j < customers.size(); j++) {
                    if (customers.get(j).getName().equals(nameCustomer)) {
                        customers.get(j).addTransaction(transaction);
                        System.out.println("Successfully added customer's transaction...");
                        return true;
                    }

                }
            }
        }


        return false;

    }

    public Branches findBranch(String nameBranch){
        for(int i = 0; i < this.branches.size(); i++){
            if(this.branches.get(i).getName().equals(nameBranch)){
                System.out.println("Matching branch is found...");
                return this.branches.get(i);
            }

        }
        System.out.println("There is no matching branch...");
        return null;
    }

    public boolean listCustomers(String nameBranch, boolean printTransactions){
        if(printTransactions && findBranch(nameBranch) != null){
           Branches branch =  findBranch(nameBranch);
           for(int i = 0; i < branch.getCustomers().size(); i++){
               System.out.println("Customer: " +  branch.getCustomers().get(i).getName() +"[" + (i +1) + "]" + "\n");
               System.out.println("Transactions");
               for(int j = 0; j < branch.getCustomers().get(i).getTransactions().size(); j ++ ){
                   System.out.println("[" + (j+1) + "] Amount : " + branch.getCustomers().get(i).getTransactions().get(j));
               }
               System.out.println("\n");





           }
           return true;
        }
        return false;
    }



}