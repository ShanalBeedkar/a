package multipleInheritance;

public class Implimention extends Prime implements evenNumber
{
 
	@Override
	public void even(int no) 
	{
		if((no%2)==0)
			System.out.println("Number is even");
		
	}

	@Override
	public void isprime(int no) {
		System.out.println("It might not be multiple of two ");
	}


}
