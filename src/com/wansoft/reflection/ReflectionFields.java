package com.wansoft.reflection;

import java.lang.reflect.Field;

import com.wansoft.entity.Shirt;

public class ReflectionFields {
	
	public static void main(String[] args) {
		Class<?> _class = Shirt.class;
		/**
		 * Obtaining field objects from _class
		 * The Field[] array will have one Field instance for each public field declared
		 * in the class
		 */
		Field [] fields = _class.getFields();
		
		/**
		 * If you know the name of the field instance corresponding to the field size
		 * as declared in the Shirt class
		 */
		Field field = null;
		try {
			field = _class.getField("size");
		} catch (NoSuchFieldException | SecurityException e) {
			/**
			 * is possible generate NoSuchFieldException or SecurityException
			 */
			e.printStackTrace();
		}
		
		/**
		 * Field name
		 */
		String fieldName = field.getName();
		
		/**
		 * Field type
		 */
		Object fieldTypeObject = field.getType();
		Class<?> fieldTypeClass = field.getType();
		
		/**
		 * Getting and Setting Field values
		 */
		Shirt myShirt = new Shirt(2, "the Shirt");
		Object value = null;
		try {
			/**
			 * Once you have obtained a Field reference you can get and set its values
			 * using the Field.get() and Field.set()methods, like this:
			 */
			value = field.get(myShirt);
			value = 44;
			field.set(myShirt, value);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		System.out.println("end program");
				
	}
}
