package assessment;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {
	
	// these tests were carried out to check the getters and setters for the Person object class
	
	Person person = new Person("Mike", "Wozniak", "02/04/1976", "Polish", "1759346/A");

	@Test
	public void testPersonGetForename() {
		assertEquals("Mike", person.getForename());
	}
	@Test
	public void testPersonSetForename() {
		person.setForename("Bill");
		assertEquals("Bill", person.getForename());
	}
	
	@Test
	public void testPersonGetSurname() {
		assertEquals("Wozniak", person.getSurname());
	}
	@Test
	public void testPersonSetSurname() {
		person.setSurname("Knightley");
		assertEquals("Knightley", person.getSurname());
	}
	
	@Test
	public void testPersonGetDob() {
		assertEquals("02/04/1976", person.getDob());
	}
	@Test
	public void testPersonSetDob() {
		person.setDob("17/05/1943");
		assertEquals("17/05/1943", person.getDob());
	}
	
	@Test
	public void testPersonGetNationality() {
		assertEquals("Polish", person.getNationality());
	}
	@Test
	public void testPersonSetNationality() {
		person.setNationality("Australian");
		assertEquals("Australian", person.getNationality());
	}
	
	@Test
	public void testPersonGetVisa() {
		assertEquals("1759346/A", person.getVisa());
	}
	@Test
	public void testPersonSetVisa() {
		person.setVisa("9986342/B");
		assertEquals("9986342/B", person.getVisa());
	}
	
}
