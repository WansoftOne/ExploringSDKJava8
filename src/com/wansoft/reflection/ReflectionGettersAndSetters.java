package com.wansoft.reflection;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import com.wansoft.entity.Shirt;

public class ReflectionGettersAndSetters {

	public static void main(String[] args) {
		Class<?> _class = Shirt.class;
		Method[] methods = _class.getMethods();
		List<Method> setterMethods = new ArrayList<Method>();
		List<Method> getterMethods = new ArrayList<Method>();
		for(Method _method : methods) {
			if(isGetter(_method)) {
				setterMethods.add(_method);
			}else if (isSetter(_method)) {
				getterMethods.add(_method);
			}
		}
		
		System.out.println("end Program");
	}
	
	private static boolean isGetter(Method _method) {
		if(!_method.getName().startsWith("get")) return false;
		if(_method.getParameterTypes().length != 0) return false;
		if(void.class.equals(_method.getReturnType())) return false;
		return true;
	}
	private static boolean isSetter(Method _method) {
		if(!_method.getName().startsWith("set")) return false;
		if(_method.getParameterTypes().length != 1) return false;
		return true;
	}
}
