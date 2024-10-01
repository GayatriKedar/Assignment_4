package assignment30Sep;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();
		car.setCarData("hyundai", "i20", 1200000, "Pranav");
		car.displayCarData();
		System.out.println("==================================");
		Car car1 = new Car();
		car1.setCarData("Mercedes", "GLE300", 5000000, "Pranav Hande");
		car1.displayCarData();
		System.out.println("==================================");
		Car car2 = new Car();
		car2.setCarData("Toyota", "Fortuner", 4500000, "Adi");
		car2.displayCarData();

		
	}

}
