package oop;

//Vehicle → Car Rental Tracker
//Base class: Vehicle
//
//Fields: registrationNumber, make, baseRate
//
//Constructor should initialize them
//
//Derived class: CarRental
//
//Fields: daysRented, totalCost
//
//Constructor should take all details, compute totalCost = baseRate * daysRented
//
//Method: printInvoice() prints full rental bil

class Vehicle
{
	private int registrationNumber;
	private int make;
	private String carname;
	private int baseRate;
	Vehicle(int registrationNumber,int make,String carname,int baseRate)
	{
		this.registrationNumber=registrationNumber;
		this.make=make;
		this.baseRate=baseRate;
		this.carname=carname;
	}
	public int getRegistrationNumber() {
		return registrationNumber;
	}
	public int getMake() {
		return make;
	}
	public String getCarname() {
		return carname;
	}
	public int getBaseRate() {
		return baseRate;
	}
	
}
class CarRental extends Vehicle
{
	private int daysRented;
	private int totalcost;

	CarRental(int registrationNumber, int make, String carname, int baseRate,int daysRented) {
		super(registrationNumber, make, carname, baseRate);
		this.daysRented=daysRented;
		
	}
	void printbill()
	{
		totalcost=getBaseRate()*daysRented;
		System.out.println("Registration number"+getRegistrationNumber());
		System.out.println("make date"+getMake());
		System.out.println("car name="+getCarname());
		System.out.println("base rate ="+getBaseRate());
		System.out.println("days ="+daysRented);
		System.out.println("totalcost="+totalcost);
	}
}
public class Task1 {

	public static void main(String[] args) {
		
		CarRental c=new CarRental(123, 12-12-2001, "bmw", 120, 10);
		c.printbill();
		
	}
}
