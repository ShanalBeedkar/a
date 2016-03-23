package hospital;

public class Hospitalmain {

	public static void main(String[] args)
	{
	Patient p =new Patient("Shanal", "Beedkar", 25, 904,"abc", 2016,"pune",30);
	System.out.println(p.toString());
	System.out.println("Total fees : "+p.calmedicalfees());

	}

}
