/**
 * 
 */
package silicus.Difference;

/**
 * @author SBeedkar
 *
 */
public class SqueresandAdd
{
	public int difference(int no1,int no2)
	{
		int val= 0;
		
	try 
	{
		 val= ((((no1)*(no1))+((no2)*(no2)))-((no1+no2)*(no1+no2)));	
		if(val<0)
			 throw new ArithmeticException();
		
		
	}	
	catch(Exception e)
	{
		System.out.println("After modification your Answer is :");
		val=(val*(-1));
		//e.printStackTrace();
		
	}
	return val;
	}

}
