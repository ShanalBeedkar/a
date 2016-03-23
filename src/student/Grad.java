/**
 * 
 */
package student;

/**
 * @author SBeedkar
 *
 */
public class Grad extends Student {

	public Grad(String name, int iD, Double grade, String address) {
		super(name, iD, grade, address);
		// TODO Auto-generated constructor stub
	}

	@Override
	boolean isPassed() 
	{if (grade>80.0)
		return true;
		else 
			return false;
	}

}
