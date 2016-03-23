package silicus.Difference;

import java.util.Scanner;

public class Differencemain {

	public static void main(String[] args)
	{
		System.out.println("Enter two numbers : ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		SqueresandAdd Sa=new SqueresandAdd();
		System.out.println(Sa.difference(a, b));
		
	}

}
