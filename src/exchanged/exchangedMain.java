package exchanged;

import java.util.Scanner;

public class exchangedMain {

	public static void main(String[] args)
	{
		System.out.println("Enter the String : ");
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		Exchanged e=new Exchanged();
		e.Exchang(str);	
		e.concat(str);
		
	}

}
