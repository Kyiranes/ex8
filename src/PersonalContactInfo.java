public class PersonalContactInfo {
    public PersonalContactInfo(String firstName, String emailAddress) {
        this.firstName = firstName;
        this.emailAddress = emailAddress;
    }

    public PersonalContactInfo() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public PersonalContactInfo(String firstName) {
        this.firstName = firstName;
    }

    String firstName;
    String emailAddress;


    void displayInfo() {
        System.out.println(this.firstName);
        System.out.println(this.emailAddress);
    }
}