package kr.ac.mju.dislab.java.ex11.information;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class ClassInformation {
	
	public ClassInformation(Object obj){
		Class<?> cls = obj.getClass();
		String name = cls.getName();
		System.out.println("클래스 이름: " + name);
		
		Class<?> superCls = cls.getSuperclass();
		String superName = superCls.getName();
		System.out.println("슈퍼클래스 이름: " + superName);
		
		Field field[] = cls.getDeclaredFields();
		System.out.println("필드: ");
		for (int cnt = 0; cnt < field.length; cnt++){
			System.out.println("	" + field[cnt]);
		}
		
		Method method[] = cls.getDeclaredMethods();
		System.out.println("메소드: ");
		for (int cnt = 0; cnt < method.length; cnt++){
			System.out.println("	" + method[cnt]);
		}
	}
}
