import java.util.ArrayList;

public class MobilePhone {
    String myNumber;
    ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact){
        for(int i = 0; i < myContacts.size(); i++){
            if(contact.getName().equals(myContacts.get(i).getName())){
                System.out.println("Contact name already exist...");
                return false;
            }
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        if(myContacts.contains(oldContact)){

                    myContacts.set(myContacts.indexOf(oldContact), newContact);
            System.out.println("successfully updated...");
                    return true;
        }
        System.out.println("failed to update....");
        return false;
    }

    public boolean removeContact(Contact contact){
        if(myContacts.contains(contact)){
            myContacts.remove(contact);
            System.out.println("successfully deleted...");
            return true;
        }
        else
            System.out.println("failed to remove...");
            return false;
    }


    public int findContact(Contact contact){
        if(myContacts.indexOf(contact) < 0){
            System.out.println("No contact found...");
            return -1;

        }
        else {
            System.out.println("The contact you are looking for is index " + myContacts.indexOf(contact) + " in the myContact list.");
            return myContacts.indexOf(contact);
        }
    }

    public int findContact(String name){

       for(int i=0; i < myContacts.size(); i++){
           if(myContacts.get(i).getName() == name){
               System.out.println("The contact you are looking for is index " +
                       i + " in the myContact list.");
            return i;
           }

       }
        System.out.println("no such a result");
       return -1;
    }

//    public Contact queryContact(String name){
//
//    }

    public void printContacts() {
        System.out.println("Contact List:\n");
        for (int i = 0; i < myContacts.size(); i++) {

            System.out.println( (i+ 1) + ". " + myContacts.get(i).getName() + " -> "
                    + myContacts.get(i).getPhoneNumber() +"\n");
        }
    }




}
