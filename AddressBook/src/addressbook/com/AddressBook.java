package addressbook.com;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	   public ArrayList<Contact> contact=new ArrayList<Contact>();
	   Scanner sc=new Scanner(System.in);
	   
       public void addContact() {
    	   System.out.println("How many persons data do you want to enter : :");
   	       int num=sc.nextInt();
   	       sc.nextLine();
   	       for(int i=1;i<=num;i++) {
   	       System.out.println("Contact details of person :: "+i);	   
    	   System.out.println("Enter Firstname :: ");
		    String firstname=sc.nextLine();
		    if(duplicateCheck(firstname)==false) {
		    System.out.println("Enter Lastname :: ");          
			String lastname=sc.nextLine();
			System.out.println("Enter Address:: ");
		    String address=sc.nextLine();
		    System.out.println("Enter City :: ");
		    String city=sc.nextLine();
		    System.out.println("Enter State :: ");
		    String state=sc.nextLine();
		    System.out.println("Enter Zip :: ");
		    long z=sc.nextLong();
		    System.out.println("Enter Mobile Number ::");
		    long no=sc.nextLong();	    
		    sc.nextLine();
		    Contact details=new Contact(firstname,lastname,address,city,state,z,no);
		    contact.add(details);
		    }
   	       }
	   }

	public void editContact() {
		System.out.println("Enter first name of person ::");
		String name=sc.nextLine();
		for(Contact person:contact) {
			if(name.equalsIgnoreCase(person.getFirstname())) {
				System.out.println("Choose field you want to add:");
				System.out.println("1.First Name 2.Last Name 3.Phone Number 4.City\t5.Zip\t6. State 7.Address");
				int choice=sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Re-Correct your firstname");
					person.setFirstname(sc.next());
					break;
				case 2:
					System.out.println("Re-correct your Lastname");
					person.setLastname(sc.next());
					break;
				case 3:
					System.out.println("Re-Correct your Phone Number");
					person.setMobileno(sc.nextLong());
					break;
				case 4:
					System.out.println("Re-Correct your City");
					person.setCity(sc.next());
					break;
				case 5:
					System.out.println("Re-Correct your Zip");
					person.setZip(sc.nextLong());
					break;
				case 6:
					System.out.println("Re-Correct your State");
					person.setState(sc.next());
					break;
				case 7:
					System.out.println("Re-Correct your Address");
					person.setAddress(sc.next());
					break;
			    default:
			    	System.out.println("Enter valid number");
				}
			}
		}
		
	}

	public void deleteContact() {
		     boolean flag=false; 
		     System.out.println("Enter a name :: ");
		     String name=sc.nextLine();
	         for(int i=0;i<contact.size();i++) {
	        	 Contact person=contact.get(i);
	        	 if(name.equalsIgnoreCase(person.getFirstname())) {
	        		 System.out.println("Entered name found in the contact");
	        		   flag=true;      
	        		 contact.remove(person);
	        	 }
	         }
	         
	         if(flag==false){
	        		 System.out.println("Entered name not found");
	         }
	         
		}

	
	
	//to show one contact
	public void display() {
		boolean flag=false;
		System.out.println("Enter the firstname of person :: ");
		String name=sc.next();
		for(int i=0;i<contact.size();i++) {
			Contact person=contact.get(i);
			if(person.getFirstname().equals(name)) {
				flag=true;
				System.out.println("First Name ::"+person.getFirstname());
				System.out.println("Last Name :: "+person.getLastname());
				System.out.println("Address :: "+person.getAddress());
				System.out.println("City :: "+person.getCity());
				System.out.println("State :: "+person.getState());
				System.out.println("Zip :: "+person.getZip());
				System.out.println("Phone number :: "+person.getMobileno());
			}
		}
		if(flag == false) {
			System.out.println("Contact doesn't exist...");
		}
	}
	
	//display all contact 
	public void display_addressbook() {
		if(contact.size() == 0) {
			System.out.println("Address book is empty");
		}else {
			System.out.println("Address book contains following contact ::");
			for(int i=0;i<contact.size();i++) {
				    Contact person=contact.get(i);
			      System.out.println("Contact detail of person "+i);
					System.out.println("First Name ::"+person.getFirstname());
					System.out.println("Last Name :: "+person.getLastname());
					System.out.println("Address :: "+person.getAddress());
					System.out.println("City :: "+person.getCity());
					System.out.println("State :: "+person.getState());
					System.out.println("Zip :: "+person.getZip());
					System.out.println("Phone number :: "+person.getMobileno());
				}
		}
	}
		
	//method to check duplicate
	public boolean duplicateCheck(String name) {
			for(int i=0;i<contact.size();i++) {
				Contact person=contact.get(i);
				if(person.getFirstname().equals(name)) {
					System.out.println("Contact already exists !! Please enter other name");
					return true;
				}
			}
			return false;
		}
		
	
       
       
}
