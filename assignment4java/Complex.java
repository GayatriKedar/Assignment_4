package assignment30Sep;

import java.util.Scanner;

public class Complex {
	
	private double real;
	private double imaginary;

	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public Complex add(Complex complex) {
		return new Complex(real + complex.real, imaginary + complex.imaginary);
	}

	public Complex subtract(Complex complex) {
		return new Complex(real - complex.real, imaginary - complex.imaginary);
	}

	public Complex multiply(Complex complex) {
		double realPart = real * complex.real - imaginary * complex.imaginary;
		double imaginaryPart = real *complex.imaginary + imaginary * complex.real;
		return new Complex(realPart, imaginaryPart);
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the real part : ");
		double real1 = scanner.nextDouble();
		System.out.print("Enter the imaginary part : ");
		double imaginary1 = scanner.nextDouble();
		Complex complex1 = new Complex(real1, imaginary1);

		System.out.print("Enter the real part : ");
		double real2 = scanner.nextDouble();
		System.out.print("Enter the imaginary part : ");
		double imaginary2 = scanner.nextDouble();
		Complex complex2 = new Complex(real2, imaginary2);

		System.out.println("Sum: " + complex1.add(complex2));
		System.out.println("Difference: " + complex1.subtract(complex2));
		System.out.println("Product: " + complex1.multiply(complex2));

	}

}
