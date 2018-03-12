package third;

//import java.util.Scanner;

public class Formula {
	public static void main(String[] args) {
		double x = 0, y = 0, z;
		//Scanner sc = new Scanner(System.in);

		x = 4.5;
		y = 6.8;

		double temp;
		temp = Math.cos(x) - x / 3;
		if (temp != 0){
			z = x * Math.log(x) + y / temp;
		}else {
			System.out.println("Знаменатель равен нулю");
			z = Double.NaN;
		}
		System.out.println("z="+z);
	}
}

