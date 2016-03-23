package assin;

public class Largnumber<T>
{

	
	//FOr Int only
	public int largnumber(int  a,int b,int c)
	{
		return (c > (a > b ? a : b) ? c : ((a > b) ? a : b));		
		
	}
	/* To make it more generic
	 * 
	 public T largnumber(T a,T b,T c)
	{
		 T p = (c > (a > b ? a : b) ? c : ((a > b) ? a : b));
		return p;		
		
	}
	*/ 
	
}
