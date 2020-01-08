package com.wansoft.reflection;

import java.lang.reflect.Array;

@SuppressWarnings("unused")
public class ArrayReflection {
	
	public static void main(String[] args) {
		/**
		 * Creating arrays via Java reflection is done using the java.lang.reflect.Array class.
		 * Here is an example showing how to create an array
		 */
		int [] intArray = (int[])Array.newInstance(int.class, 3);
		/**
		 * Set value to array with Java Reflection
		 * first parameter: object reference
		 * second parameter: array position
		 * third parameter: value in array position
		 */
		Array.set(intArray, 0, 44);
		Array.set(intArray, 1, 10);
		Array.set(intArray, 2, 0);
		
		System.out.println("values in intArray[0] : " + intArray[0]);
		System.out.println("values in intArray[1] : " + intArray[1]);
		System.out.println("values in intArray[2] : " + intArray[2]);
		
		/**
		 * Obtain the Object class of an Array
		 */
		Class<?> stringArrayClass = String[].class;
		/**
		 * Doing this using Class.forName() is not quite straightforward. 
		 * For instance, you can access the primitive int array class object like this:
		 */
		try {
			Class<?> intArrayClass = Class.forName("[I");
			Class<?> charArrayClass = Class.forName("[C");

			/**
			 * The JVM represents an int via the letter I. 
			 * The [ on the left means it is the class of an int array I am interested in. 
			 * This works for all other primitives too. For objects you need to use a slightly different notation:
			 */
			Class<?> objectArrayClass = Class.forName("[Ljava.lang.String;");
			/**
			 * Notice the [L to the left of the class name, and the ; to the right. 
			 * This means an array of objects with the given type.
			 */
			
			/**
			 * Once you have obtained the Class object of a type there is a simple way to obtain the Class of an array of that type. 
			 * The solution, or workaround as you might call it, is to create an empty array of the desired type and obtain the class object from that empty array. 
			 * It's a bit of a cheat, but it works. Here is how that looks:
			 */
			Class<?> _class = Class.forName("java.lang.String");
			Class<?> _arrayClass = Array.newInstance(_class, 0).getClass();
			
			
			/**
			 * Obtaining the component type of an Array
			 */
			String stringArray [] = new String [10];
			Class<?> arrayClass =stringArray.getClass();
			/**
			 * The component type is the type of the items in the array.
			 */
			Class<?> arrayComponentType = arrayClass.getComponentType();
			System.out.println("the component type of the array is: " + arrayComponentType);
			System.out.println("end program");
			
			
		} catch (ClassNotFoundException e) {
 			e.printStackTrace();
		}
	}
}
