package hospital;

public class Patient extends Person {
	/**
	 * @param fname
	 * @param lfname
	 * @param age
	 * @param pno
	 * @param hospitalName
	 * @param yojoin
	 * @param address
	 * @param fees
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Patient Pno=" + Pno + ", HospitalName=" + HospitalName + ", yojoin=" + yojoin + ", address=" + address
				+ ", fees=" + fees + ", fname=" + fname + ", lfname=" + lfname + ", age=" + age + ", getYojoin()="
				+ getYojoin() + ", getAddress()=" + getAddress() + ", getFees()=" + getFees() + ", calmedicalfees()="
				+ calmedicalfees();
	}

	int Pno;
	String HospitalName;
	int yojoin;
	String address;
	double fees;

	public Patient(String fname, String lfname, int age, int pno, String hospitalName, int yojoin, String address,
			double fees) {
		super(fname, lfname, age);
		Pno = pno;
		HospitalName = hospitalName;
		this.yojoin = yojoin;
		this.address = address;
		this.fees = fees;
	}

	/**
	 * @return the yojoin
	 */
	public int getYojoin() {
		return yojoin;
	}

	/**
	 * @param yojoin
	 *            the yojoin to set
	 */
	public void setYojoin(int yojoin) {
		this.yojoin = yojoin;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the fees
	 */
	public double getFees() {
		return fees;
	}

	/**
	 * @param fees
	 *            the fees to set
	 */
	public void setFees(double fees) {
		this.fees = fees;
	}

	public double calmedicalfees() {
		Money m = new Money();
		return m.basicfees + fees;

	}

}
