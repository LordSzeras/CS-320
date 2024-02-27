import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@AfterEach
	public void afterEach() {
		ContactService.contactList.removeAllElements();
		Contact.setUniqueID();
	}

	@Test
	void addContactTest() throws Exception{
		
		//test variables
		String uniqueID = "0";
		String firstName = "Nicholas";
		String lastName = "Huffines";
		String phoneNumber = "1234567890";
		String address = "123 Test Address";
		Boolean contactWasAdded = true; 
		
		ContactService.addContact(firstName, lastName, phoneNumber, address);
		
		for (int i = 0; i < ContactService.contactList.size(); i++) {
			
			if(!(ContactService.contactList.elementAt(i).getContactID().equals(uniqueID))) {
				contactWasAdded = false;
			}
			
			if(ContactService.contactList.elementAt(i).getFirstName() != firstName) {
				contactWasAdded = false;
			}
			
			if(ContactService.contactList.elementAt(i).getLastName() != lastName) {
				contactWasAdded = false;
			}
			
			if(ContactService.contactList.elementAt(i).getPhone() != phoneNumber) {
				contactWasAdded = false;
			}
			
			if(ContactService.contactList.elementAt(i).getAddress() != address) {
				contactWasAdded = false;
			}
		}
		
		assertEquals(true, contactWasAdded);
	}
	
	@Test
	void deleteContactTest() throws Exception {
		
		//test variables
		String uniqueID = "0";
		String firstName = "Nicholas";
		String lastName = "Huffines";
		String phoneNumber = "1234567890";
		String address = "123 Test Address";
		Boolean contactWasDeleted = true;
		
		ContactService.addContact(firstName, lastName, phoneNumber, address);
		ContactService.addContact("Morgan", "Huffines", "0987654321", "321 Test Address");
		ContactService.deleteContact(uniqueID);
		
		for (int i = 0; i < ContactService.contactList.size(); i++) {
			if((ContactService.contactList.elementAt(i).getContactID().equals(uniqueID))) {
				contactWasDeleted = false;
			}
		}
		
		assertEquals(true, contactWasDeleted);
	}
	
	@Test
	void updateFirstNameTest () throws Exception {
		
		String uniqueID = "0";
		String firstName = "Nicholas";
		String lastName = "Huffines";
		String phoneNumber = "1234567890";
		String address = "123 Test Address";
		String newFirstName = "Morgan";
		Boolean firstNameWasUpdated = true;
		
		ContactService.addContact(firstName, lastName, phoneNumber, address);
		ContactService.updateContactFirstName(uniqueID, newFirstName);
		
		for (int i = 0; i < ContactService.contactList.size(); i++) {
			if(!(ContactService.contactList.elementAt(i).getFirstName().equals(newFirstName))) {
				firstNameWasUpdated = false;
			}
		}
		
		assertEquals(true, firstNameWasUpdated);
	}
	
	@Test
	void updateLastNameTest () throws Exception {
		
		String uniqueID = "0";
		String firstName = "Nicholas";
		String lastName = "Huffines";
		String phoneNumber = "1234567890";
		String address = "123 Test Address";
		String newLastName = "Marak";
		Boolean lastNameWasUpdated = true;
		
		ContactService.addContact(firstName, lastName, phoneNumber, address);
		ContactService.updateContactLastName(uniqueID, newLastName);
		
		for (int i = 0; i < ContactService.contactList.size(); i++) {
			if(!(ContactService.contactList.elementAt(i).getLastName().equals(newLastName))) {
				lastNameWasUpdated = false;
			}
		}
		
		assertEquals(true, lastNameWasUpdated);
	}
	
	@Test
	void updatePhoneTest () throws Exception {
		
		String uniqueID = "0";
		String firstName = "Nicholas";
		String lastName = "Huffines";
		String phoneNumber = "1234567890";
		String address = "123 Test Address";
		String newPhone = "6789012345";
		Boolean phoneWasUpdated = true;
		
		ContactService.addContact(firstName, lastName, phoneNumber, address);
		ContactService.updateContactPhoneNumber(uniqueID, newPhone);
		
		for (int i = 0; i < ContactService.contactList.size(); i++) {
			if(!(ContactService.contactList.elementAt(i).getPhone().equals(newPhone))) {
				phoneWasUpdated = false;
			}
		}
		
		assertEquals(true, phoneWasUpdated);
	}
	
	@Test
	void updateAddressTest () throws Exception {
		
		String uniqueID = "0";
		String firstName = "Nicholas";
		String lastName = "Huffines";
		String phoneNumber = "1234567890";
		String address = "123 Test Address";
		String newAddress = "321 Test Address";
		Boolean addressWasUpdated = true;
		
		ContactService.addContact(firstName, lastName, phoneNumber, address);
		ContactService.updateContactAddress(uniqueID, newAddress);
		
		for (int i = 0; i < ContactService.contactList.size(); i++) {
			if(!(ContactService.contactList.elementAt(i).getAddress().equals(newAddress))) {
				addressWasUpdated = false;
			}
		}
		
		assertEquals(true, addressWasUpdated);
	}

}
