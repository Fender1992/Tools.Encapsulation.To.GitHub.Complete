package car;

import java.util.Scanner;

public class Car {
	
	//set private variables for tires and engine
	private int tires = 4;
	private int engine = 1;
	
	public void car(int tires, int engine) {
		this.tires = tires;
		this.engine = engine;
	}

	public int getTires() {
		return tires;
	}

	public void setTires(int tires) {
		this.tires = tires;
	}

	public int getEngine() {
		return engine;
	}

	public void setEngine(int engine) {
		this.engine = engine;
	}

	public static void main(String[] args) {
		Scanner PSI = new Scanner(System.in);
		
		//create race car object
		Car raceCar = new Car();
		driver driver = new driver();
		
		driver.driverAttributes(31, 68, "Mercedes", "Rolando");
		
		//initialize variable to check against and start car
		int tirePSI;
		int speed = 0;
		boolean restart;
		
		//ask pit crew to check the status of the cars
		System.out.println("What is psi of the tires?" );
		
		//setting conditions to start, stop and drive my race car
		if (PSI.nextInt() >= 32){
			raceCar.start();
			System.out.println();
			running(speed);
			}
		else{
			raceCar.doNotStart();
			stop(speed);
			if ( restart = true) {
				System.out.println("The car has been checked and is ready to start.");
				restart();
			}
		}
		
	}
	
	public void start () {
		System.out.println("My race car is good to start.");
		System.out.println("Ready, set, GO!");
	}
	public static int stop (int a) {
		int stop = 0;
		if (stop == 0) {
		System.out.println("My race car is stopped.");
		}
		return stop;
	}
	public void doNotStart () {
		System.out.println("My race car should not be started!");
	}
	public static void restart () {
		System.out.println("My race car has restarted.");
	}
	public static int running (int a) {
		int speed = 0;
		int maxSpeed = 60;
		
		for (int i = 0; i <= 60; i++) {
			System.out.println("Car is accelerating, speed is now " + i);
		}
		if (maxSpeed == 60) {
			System.out.println("This is the fastest the car will go!");
		}
		return speed;
	}

}
