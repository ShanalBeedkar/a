package ass12;

import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {
		System.out.println("Enter the two numbers : ");
		Scanner s= new Scanner(System.in);
		int no1=s.nextInt();
		int n1=0;
		int n2=1;
		/*
		 *for true false code 
		 * int no2=s.nextInt();
		trueIfBothPositive T=new trueIfBothPositive();
		T.greaterthanten(no1, no2);*/
		System.out.print(n1+" "+n2);
		Febonaci f=new Febonaci();
		f.fibonacci(no1-1);
		

	}

}
