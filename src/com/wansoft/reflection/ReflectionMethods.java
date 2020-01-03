package com.wansoft.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import com.wansoft.entity.Shirt;

public class ReflectionMethods {
	
	public static void main(String[] args) {
		Class<?> _class = Shirt.class;
		/**
		 * Obtaining Method objects
		 */
		Method [] methods = _class.getMethods();
		for(Method method : methods) {
			/**
			 * for each method print console
			 */
			System.out.println(method);
		}
		/**
		 * If you know the precise parameter types of the method you whant to access, you can do
		 * so rather than obtain the array all methods
		 */
		Method _method = null;
		Method _method2 = null;
		try {
			_method = _class.getMethod("getSize", null);
			_method2 = _class.getMethod("setSize", new Class<?>[]{int.class});
			
		} catch (NoSuchMethodException | SecurityException e) {
			/**
			 * error --> NoSuchMethodException or SecurityException
			 */
			e.printStackTrace();
		}
		
		/**
		 * Method parameters and return types
		 */
		Parameter[] parameters = _method2.getParameters();
		for(Parameter parameter : parameters) {
			Class<?> parameterType = parameter.getType();
			System.out.println( parameterType);
		}
		/**
		 * you can read what parameters a given method takes like this
		 */
		Class<?>[]parameterTypes = _method2.getParameterTypes();
		/**
		 * You can access the return type of a method like t
		 */
		Class<?> returnType = _method2.getReturnType();
		
		/**
		 * You can invoke a method like this
		 */
		Shirt shirt = new Shirt(2, "the shirt");
		try {
			/**
			 * The null parameter is the object you want to invoke the method on. 
			 * If the method is static you supply null instead of an object instance. 
			 * In this example, if doSomething(String.class) is not static, you need to supply a valid MyObject instance instead of null;
			 * 
			 * The Method.invoke(Object target, Object ... parameters) method takes an optional amount of parameters, 
			 * but you must supply exactly one parameter per argument in the method you are invoking. 
			 * In this case it was a method taking a int, so one int must be supplied.
			 */
			Object object = _method2.invoke(shirt, new Object[] {54});
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		System.out.println("end Program");
	}
}
