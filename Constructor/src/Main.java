
class Emp{
	String Name;
	int Id;
	double Sal;
	String Address;
	public Emp(String name, int id, double sal, String address) {
		super();
		Name = name;
		Id = id;
		Sal = sal;
		Address = address;
	}
	@Override
	public String toString() {
		return "Emp [Name=" + Name + ", Id=" + Id + ", Sal=" + Sal + ", Address=" + Address + "]";
	}
	
}


public class Main {
public static void main(String[] args) {
	Emp emp = new Emp("Musa", 63640, 20000, "71/4d naya nagar, mira road(e) ");
	System.out.println(emp);
}
	
}
