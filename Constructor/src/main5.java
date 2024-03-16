
class F {
	void meth(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}

	void meth2(int c) {
		System.out.println(c);

	}
}

class E extends F {
	@Override
	void meth(int a, int b) {
		// TODO Auto-generated method stub
		super.meth(a, b);
	}
}

public class main5 {
	public static void main(String[] args) {
		E e = new E();
		e.meth(12, 15);
	}
}
