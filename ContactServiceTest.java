package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Contact.Contact;
import Contact.ContactService;

public class ContactServiceTest {
	
	//using this JUnitTest to check for ContactService.java issues

	//checking the add new contact feature
	@Test
	 public void testAddNew() {
		ContactService cs = new ContactService();
		
		Contact c1 = new Contact("000", "Kelly", "Illescas", "6031234567", "4 Ellison Drive");
		
		assertEquals(true, cs.add(c1));
	}
	
	//checking the delete contact feature
	@Test
	public void testDelete() {
		ContactService cs = new ContactService();
		
		Contact c1 = new Contact("000", "Kelly", "Illescas", "6031234567", "4 Ellison Drive");
		Contact c2 = new Contact("001", "Gus", "Illescas", "1230986546", "2626 Bennington Road");
		Contact c3 = new Contact("002", "Isabela", "Illescas", "7145673498", "72 Sorrel Court");
		
		cs.add(c1);
		cs.add(c2);
		cs.add(c3);
		
		assertEquals(true, cs.remove("000"));
		assertEquals(false, cs.remove("000"));
		assertEquals(false, cs.remove("005"));
	}
	
	//checking the update contact feature
	@Test
	public void testUpdate() {
		ContactService cs = new ContactService();
		
		Contact c1 = new Contact("000", "Kelly", "Illescas", "6031234567", "4 Ellison Drive");
		Contact c2 = new Contact("001", "Gus", "Illescas", "1230986546", "2626 Bennington Road");
		Contact c3 = new Contact("002", "Isabela", "Illescas", "7145673498", "72 Sorrel Court");
		
		cs.add(c1);
		cs.add(c2);
		cs.add(c3);
		
		assertEquals(true, cs.update("000", "Lexi", "", "", ""));
		assertEquals(true, cs.update("001", "", "", "6783018210", ""));
		assertEquals(false, cs.update("005", "Emmi", "Illescas", "0145343943", "2707 Dawn Ridge Trail"));
		
	}
	

}
