package assessment;

public class Person {
	
//Attributes
	
private String forename;
private String surname;
private String dob ;
private String nationality;
private String visa;

//Constructors

public Person(String forename, String surname, String dob, String nationality)
{
this.forename = forename;
this.surname = surname;
this.dob = dob;
this.nationality = nationality;
this.visa = "";
}
 
public Person(String forename, String surname, String dob, String nationality, String visa)
{
this.forename = forename;
this.surname = surname;
this.dob = dob;
this.nationality = nationality;
this.visa = visa;
}

//Methods

	public String getForename()
	{return this.forename;}
	public void setForename(String newForename)
	{this.forename = newForename;}

	public String getSurname()
	{return this.surname;}
	public void setSurname(String newSurname)
	{this.surname = newSurname;}

	public String getDob()
	{return this.dob;}
	public void setDob(String newDob)
	{this.dob = newDob;}

	public String getNationality()
	{return this.nationality;}
	public void setNationality(String newNationality)
	{this.nationality = newNationality;}

	public String getVisa() 
	{return visa;}
	public void setVisa(String newVisa) {
	this.visa = newVisa;}

}



