package exchanged;

public class Exchanged
{
	public void Exchang(String str)
	{
		int strlen=str.length();
		
		String a_letter = Character.toString(str.charAt(0));
		//System.out.println(a_letter);
		String b_letter = Character.toString(str.charAt(str.length()-1));
		if (strlen==1)
		
			System.out.println(str);
		
		else 
		System.out.println(b_letter+ str.substring(1,str.length()-1)+a_letter);
		
	}
	public void concat(String str)
	{
		int strlen=str.length();
		String b_letter = Character.toString(str.charAt(str.length()-1));
		System.out.println(b_letter+ str+b_letter);		
		
	}

	

}
