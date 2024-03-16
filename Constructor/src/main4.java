
interface C {
	void meth();
}

class D implements C {

	@Override
	public void meth() {
		System.out.println("interface");
		
	}

}

public class main4 {
	public static void main(String[] args) {
		D d = new D();
		d.meth();

	}
}
