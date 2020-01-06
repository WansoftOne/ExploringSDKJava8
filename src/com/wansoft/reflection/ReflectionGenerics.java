package com.wansoft.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import com.wansoft.objects.GenericTypeObj;

public class ReflectionGenerics {
	
	public static void main(String[] args) {
		/**
		 * rule of thumb
		 * Using Java Generics typically falls into one of two different situations:
		 * 	-Declaring a class/interface as being parameterizable.
		 * 	-Using a parameterizable class.
		 */
		
		/**
		 * Generic Method Return Types
		 */
		Method _method;
		try {
			_method = GenericTypeObj.class.getMethod("getValues", null);
			Type returnGenericType = _method.getGenericReturnType();
			if(returnGenericType instanceof ParameterizedType) {
				ParameterizedType type = (ParameterizedType) returnGenericType;
				Type[] typeArguments = type.getActualTypeArguments();
				for(Type typeArgument : typeArguments) {
					Class<?> typeClass = (Class<?>) typeArgument;
					System.out.println("typeClass: " + typeClass);
				}
			}
		} catch (NoSuchMethodException | SecurityException e) {
			/**
			 * printing errors 
			 */
			e.printStackTrace();
		}
		
		/**
		 * Generic Method Parameter Types
		 */
		try {
			_method = GenericTypeObj.class.getMethod("setValues", List.class);
			Type[] genericParameterTypes = _method.getGenericParameterTypes();
			for(Type genericParameter : genericParameterTypes) {
				if(genericParameter instanceof ParameterizedType) {
					ParameterizedType parameterizedType = (ParameterizedType) genericParameter;
					Type[] parameterArgTypes = parameterizedType.getActualTypeArguments();
					for(Type parameterArgType : parameterArgTypes) {
						Class<?> parameterClass = (Class<?>) parameterArgType;
						System.out.println("parameterClass: " + parameterClass);
					}
				}
			}
		} catch (NoSuchMethodException | SecurityException e) {
			/**
			 * printing errors 
			 */
			e.printStackTrace();
		}
		
		/**
		 * Generic Field Types
		 */
		Field _field;
		try {
			_field = GenericTypeObj.class.getField("values");
			Type genericFieldType = _field.getGenericType();
			if(genericFieldType instanceof ParameterizedType) {
				ParameterizedType parameterizedType = (ParameterizedType) genericFieldType;
				Type[] fieldArgTypes = parameterizedType.getActualTypeArguments();
				for(Type fieldArgType: fieldArgTypes) {
					Class<?> fielClass = (Class<?>)fieldArgType;
					System.out.println("fieldClass: " + fielClass);
				}
			}
		} catch (NoSuchFieldException | SecurityException e) {
			/**
			 * printing errors 
			 */
			e.printStackTrace();
		}
		
	}
}
