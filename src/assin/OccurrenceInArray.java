package assin;

public class OccurrenceInArray
{
	public void findname(String [] array,String name)
	{
		int i=0;
		for(String str : array)
		{
			if(str.equalsIgnoreCase(name))
			{
				System.out.println("Yes Data is Present");
				i++;				
				
			}
			else
				System.out.println("data Not found");
						
		}
		System.out.println(i);
		
	}
	

}
