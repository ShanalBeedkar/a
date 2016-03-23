/**
 * 
 */
package student;

/**
 * @author SBeedkar
 *
 */
public class Undergrad extends Student {

	
	public Undergrad(String name, int iD, Double grade, String address) {
		super(name, iD, grade, address);
		// TODO Auto-generated constructor stub
	}

	@Override
	boolean isPassed() 
	{
		if (grade>70.0)
		return true;
		else 
			return false;
	}

}
