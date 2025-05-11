// 8 Simple Contact Management Create a class Contact with fields: name, phoneNumber, emailAddress. Create 3 Contact objects. Print the contact details only if the emailAddress is not empty (use if condition).
package easyToMedium.medium;

public class Contact {
    public String name;
    public String phoneNumber;
    public String emailAddress;

    Contact(String name, String number, String email){
        this.name = name;
        this.phoneNumber = number;
        this.emailAddress = email;
    }

    void displayContactInfo(){
        if(this.emailAddress.equals(" ")){
            System.out.println("\nPlease enter the email address\n");
        }else{
            System.out.println("\nName:"  + this.name + "\nPhone number: " + this.phoneNumber + "\nEmail address: " + this.emailAddress + "\n");
        }

    }

    public static void main(String[] args){
        Contact c1 = new Contact("Samridhdi", "9812345678", "sam3@gmail.com");
        c1.displayContactInfo();

        Contact c2 = new Contact("Soniska", "988765432", " ");
        c2.displayContactInfo();

        Contact c3 = new Contact("Sonir", "986754322", "sonir8@gmail.com");
        c3.displayContactInfo();

    }
}