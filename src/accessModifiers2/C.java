package accessModifiers2;
import accessModifiers1.A;

public class C extends A {
	public static void main(String[] args) {
		A obj = new A();
		C childObj = new C();
	//	System.out.println(childObj.x);
	//	System.out.println(childObj.y);
		System.out.println(childObj.z);
		System.out.println(obj.w);
		System.out.println(childObj.w);

	}
}
