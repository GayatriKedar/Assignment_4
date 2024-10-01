package assignment30Sep;

import java.util.Scanner;

public class Employee {

	private double salary;
	private int noOfworkHours;

	public void getInfo(double salary, int noOfworkHours) {
		this.salary = salary;
		this.noOfworkHours = noOfworkHours;
	}

	public void addSalary() {
		if (salary < 500) {
			salary += 10;
		}
	}

	public void addWork() {
		if (noOfworkHours > 6) {
			salary += 5;
		}
	}

	public double getFinalSalary() {
		return salary;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the salary of the employee: ");
		double salary = scanner.nextDouble();
		System.out.print("Enter the number of hours worked per day: ");
		int workHours = scanner.nextInt();

		Employee employee = new Employee();
		employee.getInfo(salary, workHours);

		employee.addSalary();
		employee.addWork();

		System.out.println("Final salary of the employee:" + employee.getFinalSalary());
	}

}
