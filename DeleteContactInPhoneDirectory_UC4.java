import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class DeleteContactInPhoneDirectory_UC4 {
    // arraylist created to store contact details
    //private ArrayList<PersonDetails> contactList = new ArrayList<>();
    static Map<ContactDetails, Details> contactList = new HashMap<>();

    // method to take input of contact details n
    private static Details getInitialContactDetails() {
        System.out.println("enter contact details ----");

        Scanner scan = new Scanner(System.in);

        System.out.println("enter first name");
        String firstName = scan.nextLine();

        System.out.println("enter last name");
        String lastName = scan.nextLine();


        System.out.println("enter street address");
        String address = scan.nextLine();

        System.out.println("enter phone number");
        String mobileNumber = scan.nextLine();

        System.out.println("enter phone number");
        String landlineNo = scan.nextLine();

        System.out.println("enter email Address");
        String email = scan.nextLine();


        Details entry = new Details(firstName, lastName, address, mobileNumber, landlineNo, email);

        return entry;


    }
    // method to add details of contact in hash map
    private void addContact( Details contact ) {
        ContactDetails contactDetails=new ContactDetails( contact.phoneNumber, contact.landLineNumber);

        contactList.put(contactDetails,contact);
        System.out.println("contact added whose name is :  " + contact.firstName + " " + contact.lastName);


    }

    // method to delete details of contact in arraylist
    private void deleteContact( ) {

        ContactDetails contact=new ContactDetails();
        Details personDetails = new Details();
        System.out.println("Enter the mobile no  of a person whose contact details you want to delete");
        Scanner sc=new Scanner(System.in);
        String phnumber=sc.nextLine();
        System.out.println("And Enter the Landline number also: ");
        String lndNumber=sc.nextLine();
        contact.setPhoneNUmber(phnumber);
        contact.setLandlineNumber(lndNumber);


        personDetails=contactList.get(contact);
        if (!personDetails.firstName.isEmpty()){

            contactList.remove(contact);
            System.out.println("contact deleted whose name is :  " + personDetails.firstName);
        }
        else {
            System.out.println("person not found");
        }



    }

    // method to display all entries of arraylist
    private void displayContactDetails() {
        System.out.println("displaying contact details :");
        System.out.println(contactList);
//        for (int i = 0; i < contactList.size(); i++) {
//            System.out.println("contact no" + (i + 1));
//            PersonDetails con = contactList.get(i);
//            System.out.println("first name is :" + con.firstName);
//            System.out.println(" last name is :" + con.lastName);
//            System.out.println(" address is :" + con.address);
//            System.out.println(" phone number is :" + con.mobileNumber);
//            System.out.println(" phone number is :" + con.landlineNo);
//            System.out.println(" email address is :" + con.email);
//        }
    }


    // main function
    public static void main(String[] args) {

        DeleteContactInPhoneDirectory_UC4 entry3 = new DeleteContactInPhoneDirectory_UC4();
        entry3.addContact(entry3.getInitialContactDetails());
        entry3.displayContactDetails();
        entry3.deleteContact();
        entry3.displayContactDetails();

        System.out.println("Updated record details :");

    }
}
