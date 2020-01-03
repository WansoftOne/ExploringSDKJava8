package com.wansoft.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import com.wansoft.entity.Shirt;

@SuppressWarnings("unused")
public class ReflectionClasses {
	public static void main(String[] args) {
		Class<?> myClass = Shirt.class;
		//return class name and package name
		String name  = myClass.getName(); 
		 //return just the class name
		String simpleName = myClass.getSimpleName();
		
		/**
		 * class Modifiers --> getModifiers()
		 * this method return a int(modifier type)
		 */
		int modifiers = myClass.getModifiers();
		boolean typeModifier;
		typeModifier = Modifier.isPublic(modifiers);
		typeModifier = Modifier.isAbstract(modifiers);
		typeModifier = Modifier.isFinal(modifiers);
		typeModifier = Modifier.isInterface(modifiers);
		typeModifier = Modifier.isNative(modifiers);
		typeModifier = Modifier.isPrivate(modifiers);
		typeModifier = Modifier.isProtected(modifiers);
	    typeModifier = Modifier.isPublic(modifiers);
	    typeModifier = Modifier.isStatic(modifiers);
	    typeModifier = Modifier.isStrict(modifiers);
	    typeModifier = Modifier.isSynchronized(modifiers);
	    typeModifier = Modifier.isTransient(modifiers);
	    typeModifier = Modifier.isVolatile(modifiers);
		
	    /**
	     * class SuperClass --> getSuperClass()
	     */
	    Class<?> superClass = myClass.getSuperclass();
	    
	    /**
	     * class implemented Interfaces ->  getInterfaces()
	     */
	    Class<?>[] interfaces = myClass.getInterfaces();
	    
	    /**
	     * class constructors --> getConstructors()
	     */
	    Constructor<?>[] constructors = myClass.getConstructors();
	    
	    /**
	     * class Methods --> getMethods()
	     */
	    Method[] methods = myClass.getMethods();
	    
	    /**
	     * class Fields --> getFields()
	     */
	    Field[] fields = myClass.getFields();
	    
	    /**
	     * class annotations --> getAnnotations()
	     */
	    Annotation[] annotations = myClass.getAnnotations();
	}
}
