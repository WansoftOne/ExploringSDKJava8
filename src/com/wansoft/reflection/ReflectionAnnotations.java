package com.wansoft.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.wansoft.annotations.MyAnnotarion4;
import com.wansoft.annotations.MyAnnotation;
import com.wansoft.annotations.MyAnnotation2;
import com.wansoft.annotations.MyAnnotation3;
import com.wansoft.entity.Shirt;

public class ReflectionAnnotations {
	
	public static void main(String[] args) {
		Class<?> _class = Shirt.class;
		/**
		 * get all Annotations
		 * from Shirt.class
		 */
		Annotation [] annotations = _class.getAnnotations();
		
		for(Annotation annotation : annotations) {
			/**
			 * validate if "annotation" is MyAnnotation type
			 */
			if(annotation instanceof MyAnnotation) {
				MyAnnotation myAnnotation = (MyAnnotation) annotation;
				//System.out.println(myAnnotation);
				//System.out.println("name: "+ myAnnotation.name());
				//System.out.println("value: " + myAnnotation.value());
			}
		}
		/**
		 * You can also access a specific class annotation like this
		 */
		Annotation annotation = _class.getAnnotation(MyAnnotation.class);
		if(annotation instanceof MyAnnotation) {
			MyAnnotation myAnnotation = (MyAnnotation)annotation;
			System.out.println(myAnnotation);
			System.out.println("name form myAnnotation: " + myAnnotation.name());
			System.out.println("value from myAnnotation: " + myAnnotation.value());
		}
		
		
		/**
		 * Method Annotation
		 */
		Method method = null;
		try {
			method = Shirt.class.getMethod("setSize", new Class<?>[] {int.class});
			Annotation annotation2 = method.getAnnotation(MyAnnotation2.class);
			if(annotation2 instanceof MyAnnotation2) {
				MyAnnotation2 myAnnotation2 = (MyAnnotation2)annotation2;
				System.out.println(myAnnotation2);
				System.out.println("name from myAnnotation2 : " + myAnnotation2.name());
				System.out.println("value from myAnnotation2: " + myAnnotation2.value());
			}
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		
		/**
		 * Parameter Annotation
		 */
		Annotation[][] parameterAnnotations = method.getParameterAnnotations();
		Class<?>[] parameterTypes = method.getParameterTypes();
		int i=0;
		for(Annotation[] annotations3 : parameterAnnotations) {
			Class<?> parameterType = parameterTypes[i++];
			for(Annotation annotation3 : annotations3) {
				if(annotation3 instanceof MyAnnotation3) {
					MyAnnotation3 myAnnotation3 = (MyAnnotation3) annotation3;
					System.out.println("param: " + parameterType.getName());
					System.out.println(myAnnotation3);
					System.out.println("name form myAnnotation3: " + myAnnotation3.name());
					System.out.println("name from myAnnotation3: " + myAnnotation3.value());
				}		
			}
		}
		
		/**
		 * Field Annotations
		 */
		Field fieldAnnotation = null;
		try {
			fieldAnnotation = _class.getDeclaredField("color");
			fieldAnnotation.setAccessible(true);
			Annotation annotation4 = fieldAnnotation.getAnnotation(MyAnnotarion4.class);
			/**
			 * you can use getAnnotations -> this method return all annotation from color Field
			 */
			if(annotation4 instanceof MyAnnotarion4) {
				MyAnnotarion4 myAnnotation4 = (MyAnnotarion4)annotation4;
				System.out.println(myAnnotation4);
				System.out.println("name from myAnnotation4: " + myAnnotation4.name());
				System.out.println("value from myAnnotation4: " + myAnnotation4.value());
			}
		} catch (NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("End program");
	}
}
