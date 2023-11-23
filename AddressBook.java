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

   // uc-3 editAddress
void editAddress() {
    System.out.println("Enter the name of the person whose data you want to edit");
    String n = sc.nextLine();
    System.out.println("Enter the field you want to change");
    String field = sc.nextLine();
    int ind = 0;
    for (int i = 0; i < firstName.size(); i++) {
        if (firstName.get(i).equals(n)) {  // Use equals for string comparison
            ind = i;
            break;
        }
    }
    if (field.equals("firstName")) {  // Use equals for string comparison
        System.out.println("Enter new first Name");
        String nn = sc.nextLine();
        firstName.set(ind, nn);
    } else if (field.equals("lastName")) {
        System.out.println("Enter new Last name");
        String nn = sc.nextLine();
        lastName.set(ind, nn);
    } else if (field.equals("address")) {
        System.out.println("Enter new address");
        String nn = sc.nextLine();
        address.set(ind, nn);
    } else if (field.equals("city")) {
        System.out.println("Enter new city");
        String nn = sc.nextLine();
        city.set(ind, nn);
    } else if (field.equals("state")) {
        System.out.println("Enter new State");
        String nn = sc.nextLine();
        state.set(ind, nn);
    } else if (field.equals("zip")) {
        System.out.println("Enter new zip");
        String nn = sc.nextLine();
        zip.set(ind, nn);
    } else if (field.equals("phone")) {
        System.out.println("Enter new phone number");
        String nn = sc.nextLine();
        phone.set(ind, nn);
    } else if (field.equals("email")) {
        System.out.println("Enter new email");
        String nn = sc.nextLine();
        email.set(ind, nn);
    }
}


    void display(){
        System.out.println("Name\taddress\tcity\tstate\tzip\tphone\temail");
        System.out.println("----------------------------------------------------------------------------------------------");
        for(int i=0;i<firstName.size();i++){
            System.out.println(firstName.get(i)+" "+lastName.get(i)+"\t"+address.get(i)+"\t"+city.get(i)+"\t"+state.get(i)+"\t"+zip.get(i)+"\t"+phone.get(i)+"\t"+email.get(i));

        }
    }

    
}

public class AddressBook {
    public static void main(String[] args){
        System.out.println("----------------Welcome to Address Book Program--------------");

        Address ob=new Address();
        ob.addNewAddress();
        ob.display();
        System.out.println("do you want to edit? yes/no");
        Scanner scan=new Scanner(System.in);
        String ss=scan.nextLine();
        if(ss.equals("yes")){
            ob.editAddress();
            ob.display();
        }

    }
}