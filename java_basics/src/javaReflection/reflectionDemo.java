package javaReflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.TypeVariable;

public class reflectionDemo<T> {
	public Class<T> cls;
	public reflectionDemo() {
		System.out.println(cls.getName());
	}
	public static void main(String[] args) {
		Class demo1 = classDemo1.class;
		Class demo2= classDemo2.class;
		Class demo3= classDemo3.class;
		
		
		try {
			System.out.println(Class.forName("javaReflection.classDemo1").getDeclaredConstructor());
			System.out.println(Class.forName("javaReflection.classDemo1").getDeclaredConstructor());
			
			
		    
		    
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//new reflectionDemo<classDemo1>();
		//new reflectionDemo<classDemo2>();
		//new reflectionDemo<classDemo3>();
	}
	
	
	
	public static void classDetails(){
		
	}
}
