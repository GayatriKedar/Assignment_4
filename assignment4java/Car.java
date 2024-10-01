package assignment30Sep;

public class Car {

	private String carModel;
	private String carName;
	private double carPrice;
	private String carOwner;

	public void setCarData(String model, String name, double price, String owner) {
		this.carModel = model;
		this.carName = name;
		this.carPrice = price;
		this.carOwner = owner;
	}

	public void displayCarData() {
		System.out.println("Car Model: " + carModel);
		System.out.println("Car Name: " + carName);
		System.out.println("Car Price: $" + carPrice);
		System.out.println("Car Owner: " + carOwner);
		System.out.println();
	}
	
}
