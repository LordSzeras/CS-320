import java.util.Vector;

public class ContactService {

	//Data Structure
	public static Vector <Contact> contactList = new Vector <Contact>(0, 1);
	
	//Function to create and add a new contact to the list
	public static void addContact(String firstName, String lastName, String phoneNumber, String address) throws Exception{
		
		//create a new contact
		Contact newContact = new Contact(firstName, lastName, phoneNumber, address);
		
		//add new contact to list
		contactList.addElement(newContact);		
	} 
	
	//function to delete a contact
	public static void deleteContact(String uniqueID) throws Exception{
		
		Boolean contactExisted = false;
		
		//loop to iterate through contacts in list
		for(int i = 0; i < contactList.size(); i++) {
			
			//check to see if current contact ID is what we are looking for
			//and if it is, remove it
			if(contactList.elementAt(i).getContactID().equals(uniqueID)) {
				contactList.remove(i);
				contactExisted = true;
			}
						
		}
		
		if (!contactExisted) {
			throw new Exception("Contact did not exist.");
		}
	}
	
	//function to update a contact's first name
	public static void updateContactFirstName(String uniqueID, String newFirstName) throws Exception {
		
		//loop to iterate through contacts in list
		for(int i = 0; i < contactList.capacity(); i++) {
					
			//check to see if current contact ID is what we are looking for
			//and if it is, update the first name
			if(contactList.elementAt(i).getContactID().equals(uniqueID)) {
				contactList.elementAt(i).setFirstName(newFirstName);
			}
								
		}
	}
	
	//function to update a contact's last name
	public static void updateContactLastName(String uniqueID, String newLastName) throws Exception{
		
		//loop to iterate through contacts in list
		for(int i = 0; i < contactList.capacity(); i++) {
							
			//check to see if current contact ID is what we are looking for
			//and if it is, update the last name
			if(contactList.elementAt(i).getContactID().equals(uniqueID)) {
				contactList.elementAt(i).setLastName(newLastName);
			}
										
		}
	}
	
	//function to update a contact's phone number
	public static void updateContactPhoneNumber(String uniqueID, String newPhoneNumber) throws Exception{
		
		//loop to iterate through contacts in list
		for(int i = 0; i < contactList.size(); i++) {
							
			//check to see if current contact ID is what we are looking for
			//and if it is, update the phone number
			if(contactList.elementAt(i).getContactID().equals(uniqueID)) {
				contactList.elementAt(i).setPhone(newPhoneNumber);
			}
										
		}
	}
	
	//function to update a contact's address
	public static void updateContactAddress(String uniqueID, String newAddress) throws Exception{
		
		//loop to iterate through contacts in list
		for(int i = 0; i < contactList.size(); i++) {
									
			//check to see if current contact ID is what we are looking for
			//and if it is, update the address
			if(contactList.elementAt(i).getContactID().equals(uniqueID)) {
				contactList.elementAt(i).setAddress(newAddress);
			}
												
		}
	}
	
	
}
