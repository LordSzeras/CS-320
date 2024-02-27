
public class Contact {
	
	//Contact attributes
	private String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	//Contact ID starter variable, good to 1 Trillion contacts
	private static int uniqueID = 0;
	
	public static void setUniqueID() {
		uniqueID = 0;
	}
	
	//Getters and Setters
	public String getContactID (){
		return contactID;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) throws Exception {
		
		//error handling for length requirement: must be <= 10 char
		if (firstName.length() > 10) {
			throw new Exception("Name must be no more than 10 characters.");
		}
		
		//error handling for null or blank
		else if (firstName.isEmpty() || firstName.isBlank() || firstName == null) {
			throw new Exception("Must enter a name.");
		}
		
		else {
			this.firstName = firstName;
		}
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) throws Exception {

		//error handling for length requirement: must be <= 10 char
		if (lastName.length() > 10) {
			throw new Exception("Name must be no more than 10 characters.");
		}
				
		//error handling for null or blank
		else if (lastName.isEmpty() || lastName.isBlank() || lastName == null) {
			throw new Exception("Must enter a name.");
		}
				
		else {
			this.lastName = lastName;
		}
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) throws Exception{
		
		//error handling for length requirement: must = 10 char
		if (phone.length() != 10) {
			throw new Exception("Phone number must be exactly 10 digits.");
		}
						
		//error handling for null or blank
		else if (phone.isEmpty() || phone.isBlank() || phone == null) {
			throw new Exception("Must enter a number.");
		}
						
		else {
			this.phone = phone;
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) throws Exception {
		
		//error handling for length requirement: must be <= 30 characters
		if (address.length() > 30) {
			throw new Exception("Address mut be no more than 30 characters.");
		}
		
		//error handling for null or blank
		else if (address.isEmpty() || address.isBlank() || address == null) {
			throw new Exception("Must enter an address.");
		}
		
		else {
			this.address = address;
		}
		
	}
	
	//Constructor
	public Contact(String firstName, String lastName, String phone, String address) throws Exception{
		
		
		this.contactID = Integer.toString(uniqueID);
		uniqueID++;		
		
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setPhone(phone);
		this.setAddress(address);
	}
	
	public Contact(String uniqueID, String firstName, String lastName, String phone, String address) throws Exception{
		
		
		this.contactID = uniqueID;		
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setPhone(phone);
		this.setAddress(address);
	}

	public Contact() {
		
	}
	
	
	
	
}
