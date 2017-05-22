package assessment;

import java.util.ArrayList;

public class Boat implements Vehicle {

//Attributes
	
	private String name;
	private String country;
	private double size;
	private int speed;
	
	private ArrayList <Person> owner = new ArrayList <Person>();
	private ArrayList <Person> crew = new ArrayList <Person>();
	Person captain;
	
//Constructors	
	
	public Boat(String name, String country, double size, int speed){
		this.name=name;
		this.country=country;
		this.size=size;
		this.speed = speed;
	}
	public Boat(String name, String country, double size){
		this.name=name;
		this.country=country;
		this.size=size;
	}
	
	
//Methods		

		public String getName()
		{return this.name;}
		public void setName(String newName)
		{this.name = newName;}
		
		public String getCountry()
		{return this.country;}
		public void setCountry(String newCountry)
		{this.country = newCountry;}
		
		public double getSize()
		{return this.size;}
		public void setSize(double newSize)
		{this.size = newSize;}

		public int getSpeed() 
		{return this.speed;}

		@Override
		public void accelerate() {
			this.speed = speed+5;
		}

		@Override
		public void deccelerate() {
			this.speed= speed-5;
		}
		
		//these methods add a person to be either part of the crew, the owner or the captain 
		//a captain can only be assigned if the person is not already part of the crew
		//the methods have been overloaded to allow the same method to be carried out whether the person is British or not
		
		public void addOwner(String firstName, String surname, String dob, String nationality){
			owner.add(new Person(firstName, surname, dob, nationality));
		}
		public void addOwner(String firstName, String surname, String dob, String nationality, String visa){
			owner.add(new Person(firstName, surname, dob, nationality, visa));
		}
		
		public void addCrew(String firstName, String surname, String dob, String nationality){
			crew.add(new Person(firstName, surname, dob, nationality));
		}
		public void addCrew(String firstName, String surname, String dob, String nationality, String visa){
			owner.add(new Person(firstName, surname, dob, nationality, visa));
		}
		
		public void addCaptain(Person p){
			for (Person q : crew){
				if (q .equals(p)){
					System.out.print(p.getForename()+" "+p.getSurname()+" can't be captain!");
				}
				else{
					p=captain ;
				}
			}
		}
		// for the boat to be able to enter a marina, it has to contain people, this method is to determine
		// whether the boat has any people on it, regardless of their role
		// if the boolean is true, it can enter
			
		
		public boolean boatPeople() {
			if (captain != null||crew.size()>0||owner.size()>0){
				return true;
			}
			else{
				return false;
		}
			
		}
			
}