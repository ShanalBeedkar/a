/**
 * 
 */
package student;

/**
 * @author SBeedkar
 *
 */
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Grad g = new Grad("abc", 1, 67.0, "pune");
		System.out.println(g.toString());
		System.out.println("Student have grad " + g.grade + "Threfor his status is : " + g.isPassed());
		Undergrad u = new Undergrad("pqr", 2, 90.0, "pune");
		System.out.println(u.toString());

		System.out.println("Student have grad " + u.grade + "Threfor his status is : " + u.isPassed());
	}

}
