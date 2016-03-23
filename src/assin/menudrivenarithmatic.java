package assin;

import java.util.Scanner;

public class menudrivenarithmatic {

	

	public static int add(int a, int b) {
		return (a + b);

	}

	public static int sub(int a, int b) {
		return (a - b);

	}

	public static double mul(int a, int b) {
		return (a * b);

	}

	public static int div(int a, int b) {

		if (b == 0) {
			try {
				throw new Exception();
			} catch (Exception e) {
				System.out.println("Enter nonzero number");
				e.printStackTrace();
			}

		}

		return (a / b);

	}

	public static void main(String[] args) {
		menudrivenarithmatic m = new menudrivenarithmatic();
		Scanner s = new Scanner(System.in);
		int a = 0, b = 0;
		System.out.println("Enter Two Numbers : ");

		a = s.nextInt();
		b = s.nextInt();
		System.out.println("Enter Your Option: ");
		System.out.println("Press 0 : Enter the numbers ");
		System.out.println("Press 1 : Addition ");
		System.out.println("Press 2 : Substraction");
		System.out.println("Press 3 : Multiplication ");
		System.out.println("Press 4 : division");
		// System.out.println("Press 5 : Exit");
		int c = s.nextInt();

		switch (c) {
		case 1:
			System.out.println(menudrivenarithmatic.add(a, b));
			break;
		case 2:
			System.out.println(menudrivenarithmatic.sub(a, b));
			break;

		case 3:
			System.out.println(menudrivenarithmatic.mul(a, b));
			break;

		case 4:
			System.out.println(menudrivenarithmatic.div(a, b));
			break;

		}
	}
}
