
class A {
	static int a = 2;
	static int b = 5;
	int c = 8;
	int d = 10;

	static void meth() {
		System.out.println(a);
		System.out.println(b);

	}

	void meth2() {
		System.out.println(c);
		System.out.println(d);
	}

}

public class Main2 {
	public static void main(String[] args) {
		A a = new A();
		A.meth();
		a.meth2();
	}
}
