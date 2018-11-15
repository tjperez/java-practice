package area;

/*
 * Curso de Programacion JAVA Intermedio #7
 * Working with this
 *  
 * */

import java.util.Scanner;

public class RectanguloMain {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Give the value of the base: ");
		int base = input.nextInt();
		
		System.out.println("Give the height: ");
		int heigth = input.nextInt();		
		
		
		Rectangulo msg = new Rectangulo(base, heigth);
		msg.Print();
	}
}
