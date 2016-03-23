
package student;
/**
 * @author SBeedkar
 *
 */
public abstract class Student
{
	String name;
	int ID;
	Double grade;
	String Address;
	/**
	 * @param name
	 * @param iD
	 * @param grade
	 * @param address
	 */
	public Student(String name, int iD, Double grade, String address) {
		super();
		this.name = name;
		ID = iD;
		this.grade = grade;
		Address = address;
	}
	 abstract boolean isPassed();
	/**
	 * @return the grade
	 */
	public Double getGrade() {
		return grade;
	}
	/**
	 * @param grade the grade to set
	 */
	public void setGrade(Double grade) {
		this.grade = grade;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Student name=" + name + ", ID=" + ID + ", grade=" + grade + ", Address=" + Address;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
