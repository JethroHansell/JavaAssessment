package assessment;

import static org.junit.Assert.*;

import org.junit.Test;

public class MarinaTest {

	// these tests were carried out to check the getters and setters for the Marina object class
	
	Marina marina = new Marina("Monaco Yacht Club", "Quai Louis II, 98000 Monaco", 150);

	@Test
	public void testMarinaGetName() {
		assertEquals("Monaco Yacht Club", marina.getName());
	}
	@Test
	public void testMarinaSetName() {
		marina.setName("Venice Marinas");
		assertEquals("Venice Marinas", marina.getName());
	}
	 
	@Test
	public void testMarinaGetAddress() {
		assertEquals("Quai Louis II, 98000 Monaco", marina.getAddress());
	}
	@Test
	public void testMarinaSetAddress() {
		marina.setAddress("237 Sports Marina Rd, Venice, LA 70091, USA");
		assertEquals("237 Sports Marina Rd, Venice, LA 70091, USA", marina.getAddress());
	}
	
	@Test
	public void testMarinaGetCapacity() {
		assertEquals(150, marina.getCapacity());
	}
	@Test
	public void testMarinaSetCapacity() {
		marina.setCapacity(300);
		assertEquals(300, marina.getCapacity());
	}
	
}
