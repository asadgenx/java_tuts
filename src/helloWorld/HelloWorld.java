package helloWorld;
import static java.lang.System.out;

public class HelloWorld {

	public static void main(String asad[]) {

		TestClass obj = new TestClass();
		obj.count=1;
		out.println(obj.returnCount(obj.count));

	}

}
