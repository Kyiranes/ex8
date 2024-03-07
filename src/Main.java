import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name and your email address: ");
        String name = input.nextLine();
        String emailAddress = input.nextLine();
        PersonalContactInfo info = new PersonalContactInfo(name, emailAddress);
        System.out.println("Enter your phone number: ");
        String phoneNumber = input.nextLine();
        PersonalContactInfo info2 = new BusinessContactInfo(name, emailAddress, phoneNumber);
        CombinedInfo combinedInfo = new CombinedInfo(name, emailAddress, phoneNumber);
        combinedInfo.addAnInstance(info);
        combinedInfo.addAnInstance(info2);
        combinedInfo.displayInfo();
    }
}