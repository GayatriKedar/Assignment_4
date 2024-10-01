package assignment30Sep;

public class TestTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle triangle = new Triangle();
		
		System.out.println(triangle);
		
		System.out.println("================");
		
		
		Triangle triangle2 = new Triangle(5, 7, 9);
		
		triangle2.areaOfTriangle();
		triangle2.perimeterOfTriangle();
		
		System.out.println(triangle2);

	}

}
