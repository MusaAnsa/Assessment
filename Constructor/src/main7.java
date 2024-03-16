class Employ {
	static String Name;
	static int Id;
	static double Sal;
	String Address;

	static void meth() {
		System.out.println(Name);
		System.out.println(Id);
		System.out.println(Sal);
	}

	void meth1() {
		System.out.println(Address);
	}
}

public class main7 {
	public static void main(String[] args) {
		Employ emp = new Employ();
		Employ.Name = "musa";
		Employ.Id = 123456;
		Employ.Sal = 22340;
		emp.Address = "71/4d naya nagar, mira road(e)";
		Employ.meth();
		emp.meth1();
	}
}
