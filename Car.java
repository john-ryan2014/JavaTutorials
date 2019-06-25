/* 
 * Author: John Ryan
 * Basic example to demonstrate the use of Classes and Objects in OOP. 
 * */

public class Car
{
	String make;
	int year;
	Boolean moving = false;
	
	//Constructor
	public Car(String carMake, int carYear)
	{
		make = carMake;
		year = carYear;
	}
	
	public String getMake()
	{
		return make;
	}
	
	public int getYear()
	{
		return year;
	}
	
	void move()
	{
		moving = true;
		System.out.println("The car in now moving.");
	}
	
	void stop()
	{
		moving = false;
		System.out.println("The car in now stopped.");
	}
	
	
	public static void main(String[] args) 
	{
		// Object Instantiation
		Car passat = new Car("Volkswagon",2013); 
		
		passat.move();
		passat.stop();
		
		System.out.println("The make and year of the car is: " + passat.getMake() + " " + passat.getYear());

	}

}
