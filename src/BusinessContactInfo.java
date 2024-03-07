class BusinessContactInfo extends PersonalContactInfo{
    public BusinessContactInfo() {

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public BusinessContactInfo(String phoneNumber) {
        super();
        this.phoneNumber = phoneNumber;
    }

    public BusinessContactInfo(String firstName, String emailAddress, String phoneNumber) {
        super(firstName, emailAddress);
        this.phoneNumber = phoneNumber;
    }

    String phoneNumber;
    void displayInfo() {
        System.out.println(this.firstName);
        System.out.println(this.emailAddress);
        System.out.println(this.phoneNumber);
    }
}
