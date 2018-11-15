package area;

public class Rectangulo {

	private int base, heigth, area;
	
	public Rectangulo(int base, int heigth) {
		this.base = base;
		this.heigth = heigth;
	}
	
	public void CalculateArea(){
		area = base * heigth;
	}
	
	public void Print(){
		CalculateArea();
		System.out.println("The area is = " + area);
		
		
	}
}
