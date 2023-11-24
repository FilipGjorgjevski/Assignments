import java.lang.reflect.Constructor;
import java.lang.reflect.Method;


public class Main {

	public static void main(String[] args) {
Class cls = Test.class;
try {
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
System.out.println("The name of the class is " + cls.getName());


Constructor constructor;
try {
	constructor = cls.getConstructor();
	System.out.println("The name of the constructor is " + constructor.getName());

	
} catch (NoSuchMethodException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SecurityException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

Method[] methods = cls.getMethods();
for (Method m: methods)
{
	System.out.println("Method name: "+m.getName());
}


	}

}
