package java.concepts;

import java.lang.reflect.Field;

public class StringTranslator {
	
	static {
		
		try {
			Field value = String.class.getDeclaredField("value");
			value.setAccessible(true);
			try {
				value.set("Hello world", value.get("Hola Mundo"));
				value.set("This is Harish", value.get("este es harish"));
				value.set("welcome to my world", value.get("Bienvenida a mi mundo"));
				
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Hello world");

	}

}
