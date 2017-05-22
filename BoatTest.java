package assessment;

import static org.junit.Assert.*;

import org.junit.Test;

//these tests were carried out to check the getters and setters for the Boat object class

public class BoatTest {

	Boat boat = new Boat("Santa Maria", "Portugal", 0.8, 20);

	@Test
	public void testBoatGetName() {
		assertEquals("Santa Maria", boat.getName());
	}
	@Test
	public void testBoatSetName() {
		boat.setName("Marys Dream");
		assertEquals("Marys Dream", boat.getName());
	}
	
	@Test
	public void testBoatGetCountry() {
		assertEquals("Portugal", boat.getCountry());
	}
	@Test 
	public void testBoatSetCountry() {
		boat.setCountry("USA");
		assertEquals("USA", boat.getCountry());
	}
	
	@Test
	public void testBoatGetSize() {
		assertEquals(0.8, boat.getSize(), 0);
	}
	@Test
	public void testBoatSetSize() {
		boat.setSize(2.3);
		assertEquals(2.3, boat.getSize(), 0);
	}
	
	@Test
	public void testBoatGetSpeed() {
		assertEquals(20, boat.getSpeed());
	}
	@Test
	public void testAccelerate() {
		boat.accelerate();
		assertEquals(25, boat.getSpeed());
	}
	@Test
	public void testDeccelerate() {
		boat.deccelerate();
		assertEquals(15, boat.getSpeed());
	}
}
