import java.util.ArrayList;

public class CombinedInfo extends BusinessContactInfo {
    ArrayList<PersonalContactInfo> listofInfoes = new ArrayList<>();
    public CombinedInfo(String firstName, String emailAddress, String phoneNumber) {
        super(firstName, emailAddress, phoneNumber);
    }
    void addAnInstance(PersonalContactInfo x) {
        listofInfoes.add(x);
    }
    @Override
    void displayInfo(){
      for(PersonalContactInfo x: listofInfoes){
          x.displayInfo();
      }
    }
}
