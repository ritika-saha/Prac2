import java.util.Scanner;
import java.util.ArrayList;

//first and last names, address,city, state, zip, phone number and email...
class Address{
    //uc1 branch createAddress
    ArrayList<String> firstName = new ArrayList<>();
    ArrayList<String> lastName = new ArrayList<>(); 
    ArrayList<String> address = new ArrayList<>();
    ArrayList<String> city = new ArrayList<>();
    ArrayList<String> state = new ArrayList<>();
    ArrayList<String> zip = new ArrayList<>();
    ArrayList<String> phone = new ArrayList<>();
    ArrayList<String> email = new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    //uc-2 branch addAddress
    void addNewAddress(){
        System.out.println("Enter First name");
        String s=sc.nextLine();
        firstName.add(s);
        System.out.println("Enter Last name");
        s=sc.nextLine();
        lastName.add(s);
        System.out.println("Enter address");
        s=sc.nextLine();
        address.add(s);
        System.out.println("Enter city");
        s=sc.nextLine();
        city.add(s);
        System.out.println("Enter state");
        s=sc.nextLine();
        state.add(s);
        System.out.println("Enter zip");
        s=sc.nextLine();
        zip.add(s);
        System.out.println("Enter Phone number");
        s=sc.nextLine();
        phone.add(s);
        System.out.println("Enter email");
        s=sc.nextLine();
        email.add(s);
System.out.println(firstName.get(0)+" "+phone.get(0));
    }
}

public class AddressBook {
    public static void main(String[] args){
        System.out.println("----------------Welcome to Address Book Program--------------");

        Address ob=new Address();
        ob.addNewAddress();

    }
}
