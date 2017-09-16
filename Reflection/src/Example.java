import java.io.Serializable;
import java.lang.reflect.Method;

public class Example implements Serializable {

	public static void main(String[] args) {
		
		Student obj = new Student();
		
		Class clsObj = obj.getClass();
		
		
		try {
			Object obj1= clsObj.newInstance();
			
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		System.out.println(clsObj.getName());
		
		
		Method[] methods = clsObj.getDeclaredMethods();
		
			for (Method method : methods) {
				System.out.println(method);
			}
		
		
	}

	
	
	public void printName(Object obj) throws InstantiationException, IllegalAccessException{
		
		
		String fname = "";
		
		System.out.println(fname.length());
		
		Class cls = obj.getClass();
		
		Object newObj = cls.newInstance();
	}
}
