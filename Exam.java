
/*

Problem 1 : Accelerate the Car (20 Marks)
a) Create a new Java class named Car that has the following private fields
⚫ year - The year field is an int that holds a car's year model (e.g. 2010)
⚫ make - The make field is a String object that holds the make of the car (e.g. "Porsche")
⚫ speed - The speed field is an double that holds a car's current speed (e.g. 25.0)
b) In addition, the Car class should have the following methods.
⚫ Constructor - The constructor should accept the car's year, make, and beginning speed as 
arguments
◆ These values should be used to initialize the Car's year, make, and speed fields
⚫ Getter Methods - Write three accessor (getter) methods to get the values stored in an object's fields
⚫ accelerate - Write an accelerate method that has no arguments (parameters) passed to it and adds
1 to the speed field each time it is called
◆ For example: if the car was going 3 mph, accelerate would set the speed to 4 mph
c) Write a separate java class RaceTrack in a separate file with a main() method that
⚫ Create a new Car object (using the Car constructor method), passing in the year, make, and speed
⚫ Display the current status of the car object using the getter methods getYear(), getMake(), and
getSpeed()
⚫ Call the car's accelerate method and then re-display the car's speed using getSpeed()

*/

class Car{
	private int year;
	private String  make;
	private double speed;
	
	Car(int year,String  make,double speed){
		this.year=year;
		this.make=make;
		this.speed=speed;
	}
	int getYear(){
		return year;
	}
	String getMake(){
		return make;
	}
	double getSpeed(){
		return speed;
	}
	void accelerate(){
		speed=speed+1;
	}
}

class RaceTrack{
	public static void main(String[] args){
		Car c = new Car(2008,"i20",100.0);
		System.out.println("manufacturing year is : "+c.getYear());
		System.out.println("name of car is : "+c.getMake());
		System.out.println("speed of car is : "+c.getSpeed());
		
		c.accelerate();
		System.out.println("speed of car after acceleration is : "+c.getSpeed());
	}
}









