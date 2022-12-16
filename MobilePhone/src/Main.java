public class Main {
    public static void main(String[] args) {


        MobilePhone mobilePhone = new MobilePhone("213-333-3333");

        mobilePhone.addNewContact(new Contact("kevin", "213-111-1111"));
        mobilePhone.addNewContact(new Contact("fary", "917-111-1111"));
        Contact contact1 = new Contact("min", "111-111-1111");
        Contact contact2 = new Contact("kim", "222-222-2222");
        Contact contact3 = new Contact("Bryan", "9999999999");

        mobilePhone.addNewContact(contact1);
        mobilePhone.addNewContact(contact2);

        mobilePhone.printContacts();

        mobilePhone.findContact(contact1);
        mobilePhone.findContact("kevin");
//        mobilePhone.removeContact(contact2);
//        mobilePhone.printContacts();

        mobilePhone.updateContact(contact1, contact3);
        mobilePhone.printContacts();


    }
}