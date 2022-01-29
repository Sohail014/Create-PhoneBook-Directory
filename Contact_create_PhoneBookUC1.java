import java.util.LinkedList;


public class Contact_create_PhoneBookUC1 {

    // linked list created

    private LinkedList<Details> memberContacts = new LinkedList<>();

    // method to add member details in Linkedlist

    public void addMemberContactDetails(String firstName, String lastName, String address, String phoneNumber, String landlineNumber, String email) {
        Details member = new Details(firstName, lastName,address, phoneNumber, landlineNumber, email);
        memberContacts.add(member);
        System.out.println("Contact Edit");
        display(member);
    }
    // method  to display details of member book entries

    public void display(Details member) {
        System.out.println("first name is :" + member.firstName);
        System.out.println(" last name is :" + member.lastName);

        System.out.println(" address is :" + member.address);

        System.out.println(" phone number is :" + member.phoneNumber);

        System.out.println(" landline number is :" + member.landLineNumber);

        System.out.println(" email address is :" + member.email);


    }

    // main function
    public static void main(String[] args) {

        Contact_create_PhoneBookUC1 entry1 = new Contact_create_PhoneBookUC1();
        // entries of new member
        entry1.addMemberContactDetails("Mohd", "Sohail","ZakirNagar", "8449665776", "0256788776",  "sohailss2010@gmail.com");
        // printing out details of member added


    }
}
