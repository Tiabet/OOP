// ***************************************************************
//   Student.java										Java Foundations
//
//   Represents a college student
//   
// ***************************************************************
import java.util.Random;
import java.text.DecimalFormat;

public class Student
{
	private String name;
	private String address;
	private String major;
	private double GPA;

	
	//-----------------------------------------------------------------
	//  Constructor: Sets up this student using the specified
	//  information
	//-----------------------------------------------------------------
	public Student (String newName, String newAddress, String newMajor)
	{
		name = newName;
		address = newAddress;
		major = newMajor;
		computeGPA();
	}
	
	//-----------------------------------------------------------------
	//  Constructor: Sets up this student using the specified
	//  information. Since major is not specified, it is set 
	//  to Undeclared
	//-----------------------------------------------------------------
	public Student (String newName, String newAddress)
	{
		name = newName;
		address = newAddress;
		major = "Undeclard";
		computeGPA();
	}
	
	/**
	 * Setter for name.
	 * @param newName new value for name
	 */
	public void setName(String newName) 
	{
	    name = newName;
	}

	/**
	 * Getter for name.
	 * @return name
	 */
	public String getName() 
	{
	    return name;
	}
	
	/**
	 * Setter for address.
	 * @param newAddress new value for address
	 */
	public void setAddress(String newAddress) 
	{
	    address = newAddress;
	}

	/**
	 * Getter for address.
	 * @return address
	 */
	public String getAddress() 
	{
	    return address;
	}
	
	/**
	 * Setter for major.
	 * @param newMajor new value for major
	 */
	public void setMajor(String newMajor) 
	{
	    major = newMajor;
	}

	/**
	 * Getter for major.
	 * @return major
	 */
	public String getMajor() 
	{
	    return major;
	}
	
	/**
	 * Getter for GPA.
	 * @return GPA
	 */
	public double getGPA() 
	{
	    return GPA;
	}

	/**
	 * Setter for GPA.
	 * @return 
	 */
	void setGPA(double _GPA)
	{
		this.GPA = _GPA;
	}
	
	/**
	 * Generates a Random GPA between .5 and 4.0
	 */
	public void computeGPA()
	{
		Random rand = new Random();
		GPA = 0.5 + (rand.nextDouble() * 3.5);
	}
	
	public String toString()
	{
		String result = "";
		result += ("Name: "+ name + "\n");
		result += ("Address: " + address + "\n");
		result += ("Major: " + major + "\n");
		result += ("GPA: " + GPA + "\n");
		
		return result;
	}
		
}
	