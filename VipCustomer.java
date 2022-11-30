public class VipCustomer {
    private String name;
    private int creditLimit;
    private String emailAddress;

    public VipCustomer(){
        this("fary", 900000000, "yourEmail.gmail");
    }

    public VipCustomer(int creditLimit, String emailAddress){
    this("Kevin", creditLimit, emailAddress);
    this.creditLimit = creditLimit;
    this.emailAddress = emailAddress;
    }
    public VipCustomer(String name, int creditLimit, String emailAddress){
        this.name = name;
        this. creditLimit = creditLimit;
        this. emailAddress = emailAddress;
    }
    

    public String getVipInfo(){
        return "name is " + name + " credit limit is $" + creditLimit + " and the customer's email address is " + emailAddress;
    }

    public VipCustomer(int creditLimit) {
        this("peter", creditLimit, "dasa@gmail.com");
        this.creditLimit = creditLimit;
    }
}

