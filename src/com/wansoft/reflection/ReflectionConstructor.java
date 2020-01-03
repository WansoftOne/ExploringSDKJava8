package com.wansoft.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.wansoft.entity.Shirt;

public class ReflectionConstructor {

	public static void main(String[] args) {
		Class<?> myClass = Shirt.class;
		/**
		 * Obtaining constructors Objects
		 * Shirt class
		 */
		Constructor<?>[] construstors = myClass.getConstructors();
		for(Constructor<?> constructor : construstors) {
			System.out.println(constructor);
		}
		/**
		 * if you know the precise parameters type
		 */
		Constructor<?> myConstructor = null;
		try {
			//myConstructor = myClass.getConstructor(); //without params
			//myConstructor = myClass.getConstructor(new Class<?>[] {});//empty paramas array
			myConstructor = myClass.getConstructor(int.class, String.class); //one parameter String type
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		
		/**
		 * get parameters type --> return array of .class
		 */
		Class<?>[] parameters = myConstructor.getParameterTypes();
		
		/**
		 * Instantiating object using Constructor object
		 */
		Shirt myObject = null;
		try {
			myObject = (Shirt)myConstructor.newInstance(2,"the shirt");
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
		
		System.out.println("end program");
	}
}
