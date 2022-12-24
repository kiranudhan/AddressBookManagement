package addressbook.com;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
	
	public static void main(String[] args) {
		AddressBook addressbook=new AddressBook();
		while(true) {
		System.out.println("Welcome to addressBook");
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter option you want :: ");
		 System.out.println("1.Add contact 2.Edit Contact 3.Delete contact 4.ShowContact 5.ShowAllAddressBook 5.Quit...." );
         int option=sc.nextInt();
         switch(option) {
                case 1:addressbook.addContact();
                         break;
                case 2:addressbook.editContact();
                           break;
                case 3:addressbook.deleteContact();
                           break;
                case 4:addressbook.display();
                           break;
                case 5:addressbook.display_addressbook();
                           break;
                case 6:System.exit(0);
                           break;
                default:
                	 System.out.println("Enter correct choice");
         
         }
	  }
	}
}
