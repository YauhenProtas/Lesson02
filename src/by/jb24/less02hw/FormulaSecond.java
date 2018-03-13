package by.jb24.less02hw;

import java.util.Scanner;

public class FormulaSecond {

	public static void main(String[] args) {
		double a = 0, b = 0, c = 0, result;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите a: ");
		if (sc.hasNextDouble()) {
			a = sc.nextDouble();
		}
		System.out.print("Введите b: ");
		if (sc.hasNextDouble()) {
			b = sc.nextDouble();
		}
		System.out.print("Введите c: ");
		if (sc.hasNextDouble()) {
			c = sc.nextDouble();
		}

		// result = a+b+c+d;
		result = (b + (Math.sqrt(b * b + 4 * a * c))) / 2 * a - a * a * a * c + b;

		System.out.println("Ответ = " + result);

	}

}
