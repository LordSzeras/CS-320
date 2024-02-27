import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {

	//All first name testing
	@Test
	void setFirstNameLessThanTenCharacters() throws Exception {
		var testContact = new Contact();
		testContact.setFirstName("Nicholas");
		assertEquals("Nicholas", testContact.getFirstName());
	}
	
	@Test
	void setFirstNameEqualTenCharacters() throws Exception {
		var testContact = new Contact();
		testContact.setFirstName("Alexandria");
		assertEquals("Alexandria", testContact.getFirstName());
	}
	
	@Test
	void setFirstNameGreaterThanTenCharacters() throws Exception {
		var testContact = new Contact();
		assertThrows(Exception.class, () -> {
			testContact.setFirstName("ReallyBigName");
		});
	}
	
	@Test
	void setFirstNameNull() throws Exception {
		var testContact = new Contact();
		assertThrows(Exception.class, () -> {
			testContact.setFirstName(null);
		});
	}
	
	@Test
	void setFirstNameBlank() throws Exception {
		var testContact = new Contact();
		assertThrows(Exception.class, () -> {
			testContact.setFirstName("   ");
		});
	}
	
	//all last name testing
	@Test
	void setLastNameLessThanTenCharacters() throws Exception {
		var testContact = new Contact();
		testContact.setLastName("Huffines");
		assertEquals("Huffines", testContact.getLastName());
	}
	
	@Test
	void setLastNameEqualTenCharacters() throws Exception {
		var testContact = new Contact();
		testContact.setLastName("Hoffheintz");
		assertEquals("Hoffheintz", testContact.getLastName());
	}
	
	@Test
	void setLastNameGreaterThanTenCharacters() throws Exception {
		var testContact = new Contact();
		assertThrows(Exception.class, () -> {
			testContact.setLastName("ReallyBigName");
		});
	}
	
	@Test
	void setLastNameNull() throws Exception {
		var testContact = new Contact();
		assertThrows(Exception.class, () -> {
			testContact.setLastName("");
		});
	}
	
	@Test
	void setLastNameBlank() throws Exception {
		var testContact = new Contact();
		assertThrows(Exception.class, () -> {
			testContact.setLastName("   ");
		});
	}
	
	//phone number testing
	@Test
	void setPhoneNumberLessThanTenDigits() throws Exception {
		var testContact = new Contact();
		assertThrows(Exception.class, () -> {
			testContact.setPhone("123456789");
		});
	}
	
	@Test
	void setPhoneNumberGreaterThanTenDigits() throws Exception {
		var testContact = new Contact();
		assertThrows(Exception.class, () -> {
			testContact.setPhone("12345678901");
		});
	}
	
	@Test
	void setPhoneNumberEqualTenDigits() throws Exception {
		var testContact = new Contact();
		testContact.setPhone("1234567890");
		assertEquals("1234567890", testContact.getPhone());
	}
	
	@Test
	void setPhoneNumberNull() throws Exception {
		var testContact = new Contact();
		assertThrows(Exception.class, () -> {
			testContact.setPhone("null");
		});
	}
	
	@Test
	void setPhoneNumberBlank() throws Exception {
		var testContact = new Contact();
		assertThrows(Exception.class, () -> {
			testContact.setPhone("          ");
		});
	}
	
	//address testing
	@Test
	void setAddressLessThanThirtyCharacters() throws Exception {
		var testContact = new Contact();
		testContact.setAddress("123 Test Address");
		assertEquals("123 Test Address", testContact.getAddress());
	}
	
	@Test
	void setAddressEqualThirtyCharacters() throws Exception {
		var testContact = new Contact();
		testContact.setAddress("123 Test Address 123 Test Addr");
		assertEquals("123 Test Address 123 Test Addr", testContact.getAddress());
	}
	
	@Test
	void setAddressGreaterThanThirtyCharacters() throws Exception {
		var testContact = new Contact();
		assertThrows(Exception.class, () -> {
			testContact.setPhone("54321 Really Big Address that should never exist");
		});
	}
	
	@Test
	void setAddressNull() throws Exception {
		var testContact = new Contact();
		assertThrows(Exception.class, () -> {
			testContact.setAddress(null);
		});
	}
	
	@Test
	void setAddressBlank() throws Exception {
		var testContact = new Contact();
		assertThrows(Exception.class, () -> {
			testContact.setAddress("          ");
		});
	}
	
	//constructortesting
	

}
