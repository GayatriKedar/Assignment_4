package assignment30Sep;

public class Triangle {

	private int a;
	private int b;
	private int c;
	private double area1;
	private double peri;
	
	public Triangle() {
		a = 0;
		b= 0;
		c = 0;
	}

	public Triangle(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void areaOfTriangle() {
		
		int s=(a+b+c)/2;//Area of 
		area1=Math.sqrt(s*((s-a)*(s-b)*(s-c)));
		System.out.println("Area of circle : "+area1);
	}
	
	public void perimeterOfTriangle() {
		peri = a+b+c;
		System.out.println("Perimeter of Triangle : "+peri);
		
	}
	
	

	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + ", area1=" + area1 + ", peri=" + peri + "]";
	}
	
	
	
}
