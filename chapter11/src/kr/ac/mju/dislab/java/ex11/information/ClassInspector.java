package kr.ac.mju.dislab.java.ex11.information;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class ClassInspector {
	
	public static String show(Object obj){
		StringBuffer stringBuffer = new StringBuffer();
		
		Class cls = obj.getClass();
		String name = cls.getName();
		stringBuffer.append("클래스 이름: " + name + "\n");
		
		Class superCls = cls.getSuperclass();
		String superName = superCls.getName();
		stringBuffer.append("슈퍼클래스 이름: " + superName + "\n");
		
		Field field[] = cls.getDeclaredFields();
		stringBuffer.append("필드 이름: " + superName + "\n");
		for (int cnt = 0; cnt < field.length; cnt++){
			stringBuffer.append("	" + field[cnt] + "\n");
		}
		
		Method method[] = cls.getDeclaredMethods();
		stringBuffer.append("메소드 이름: " + superName + "\n");
		for (int cnt = 0; cnt < method.length; cnt++){
			stringBuffer.append("	" + method[cnt] + "\n");
		}
		
		String string = new String(stringBuffer);
		
		return string;
	}
}
