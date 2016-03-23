package exception;

public class A {

	public static void main(String[] args) throws Userdefexception
	{
		
		String [] str={"a","b","c"};
		System.out.println(str[4]);
		throw new Userdefexception();
	}
	
}
