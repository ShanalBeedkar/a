package hospital;

public class Person {
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Person fname=" + fname + ", lfname=" + lfname + ", age=" + age;
	}

	String fname;
	String lfname;
	int age;

	public Person(String fname, String lfname, int age) {
		super();
		this.fname = fname;
		this.lfname = lfname;
		this.age = age;
	}

}
