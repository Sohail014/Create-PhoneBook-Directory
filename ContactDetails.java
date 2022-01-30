public class ContactDetails {

    public String getLandlineNumber() {
        return landlineNumber;
    }

    public ContactDetails() {
    }

    public void setLandlineNumber(String landlineNumber) {
        this.landlineNumber = landlineNumber;
    }

    public String getPhoneNUmber() {
        return phoneNUmber;
    }

    public void setPhoneNUmber(String phoneNUmber) {
        this.phoneNUmber = phoneNUmber;
    }

    public ContactDetails(String landlineNumber, String phoneNUmber) {
        this.landlineNumber = landlineNumber;
        this.phoneNUmber = phoneNUmber;
    }

    String landlineNumber;
    String phoneNUmber;
}


