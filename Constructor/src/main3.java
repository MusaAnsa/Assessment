
abstract class M{
	
  static void meth() {
	System.out.println("static");

}
   void meth2() {
	System.out.println("non-static");

}
   abstract void meth3();
}
class N extends M{

	@Override
	void meth3() {
		System.out.println("Musa");
		
	}
	 
}

public class main3 {
public static void main(String[] args) {
	N n = new N();
	M.meth();
	n.meth2();
	n.meth3();
	
}
}
