package com.wansoft.java.operators;

/**
 * @author Juan Salinas Zavaleta
 */
public class RelationalOperators {
	
	public static void main(String[] args) {
		boolean result = false;
		/**
		 *  == , != , > , <  
		 */
		
		/**
		 *  == operator (only primitive types)
		 */
		int a=4, b=20;
		result = (a == b);
		System.out.println("is 'a' equals to 'b' ? " + result);
		
		/**
		 * != operator (only primitive types)
		 */
		result = (a != b);
		System.out.println("is 'a' diferent to 'b' ?" + result);
		
		/**
		 * > and >= operators (only primitive Integer types)
		 * the same case for < or <= operators
		 */
		
		result = a > b;
		System.out.println("is 'a' greater than 'b' ? " + result);
		
		result = a >= b;
		System.out.println("is 'a' greater than or equals to 'b' ? " + result);
		
	}
}
