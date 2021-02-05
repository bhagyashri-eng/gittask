import java.util.ArrayList;
import java.util.Iterator;

interface Mycompany {
	public void method1();

	public void method2();

}

public class Company implements Mycompany {
	int Companyid;
	String CompantName;

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("method1 implement");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("method2 implement");
	}

	public static void main(String[] args) {
		Mycompany m = new Company();
		m.method1();
		ArrayList a = new ArrayList();
		a.add("abc");
		a.add(2);
		Iterator i = a.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());

		}
		;

	}

}
