
class W {
	void meth(int a) {
		System.out.println(a);
	}

	void meth(int b, int c) {
		System.out.println(b);
		System.out.println(c);
	}
}

public class main6 {
	public static void main(String[] args) {
		W w = new W();
		w.meth(12);
		w.meth(2, 23);
	}
}
