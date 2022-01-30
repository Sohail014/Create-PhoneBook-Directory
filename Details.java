public class Details {
    String firstName;
    String lastName;
    String address;
    String phoneNumber;
    String landLineNumber;
    String email;

    public Details() {
    }

    public Details(String firstName, String lastName, String address, String phoneNumber, String landLineNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.landLineNumber = landLineNumber;
        this.email = email;
    }



    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public void setAddress(String newAddress) {
        this.address = newAddress;
    }





    public void setPhoneNumber(String newPhoneNumber) {
        this.phoneNumber = newPhoneNumber;
    }


    public void setLandLineNumber(String newlandlineNumber) {
        this.landLineNumber = newlandlineNumber;
    }



    public void setEmail(String newEmailAddress) {
        this.email = newEmailAddress;
    }
}
