package by.minsk.jb24;

import java.util.Scanner;

public class Formula2 {

	public static void main(String[] args) {
		double radius = 0, l, s;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите Radius: ");
		if (sc.hasNextDouble()) {
			radius = sc.nextDouble();
		}

		// result = a+b+c+d;
		l = 2 * Math.PI * radius;
		s = Math.PI * radius * radius;

		System.out.println("Длина = " + l);
		System.out.println("Площадь = " + s);

	}

}
