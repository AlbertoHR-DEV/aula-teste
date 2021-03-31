package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double areaX, areaY;
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();

		System.out.println("Entre com as medidas do Triangulo X:  ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com as medidas do Triangulo Y:  ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		areaX = x.area();
		areaY = y.area();

		System.out.printf("Area triangulo X: %.3f%n", areaX);
		System.out.printf("Area triangulo Y: %.3f%n", areaY);

		if (areaX < areaY) {
			System.out.println("Area X é maior");
		} else {
			System.out.println("Area Y é maior");
		}

		sc.close();
	}

}