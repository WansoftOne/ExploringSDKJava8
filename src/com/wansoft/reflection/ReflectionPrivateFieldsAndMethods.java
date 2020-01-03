package com.wansoft.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.wansoft.entity.Shirt;

public class ReflectionPrivateFieldsAndMethods {
	
	public static void main(String[] args) {
		/**
		 * Accessing private Fields
		 */
		Shirt privateShirt = new Shirt(2, "Red");
		Field privateField = null;
		try {
			/**
			 * get "color" field
			 */
			privateField = Shirt.class.getDeclaredField("color");
			/**
			 * Set accessible value true
			 */
			privateField.setAccessible(true);
			String color = (String) privateField.get(privateShirt);
			System.out.println("the color is " + color);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException 
				| IllegalAccessException e) {
			e.printStackTrace();
		}
		
		/**
		 * Accessing private methods
		 */
		Method privateMethod = null;
		try {
			/**
			 * get "getSize" method
			 */
			privateMethod = Shirt.class.getDeclaredMethod("getSize", null);
			/**
			 * Set accessible value true
			 */
			privateMethod.setAccessible(true);
			int size = (int)privateMethod.invoke(privateShirt, null);
			System.out.println("The size is: " + size);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException 
				| IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("End program");
	}
}
