package com.wansoft.java.operators;

/**
 * @author Juan Salinas Zavaleta
 */
public class ArithmeticOperators {
	
	public static void main(String[] args) {
		int a = 20 , b = 4 ;
		int result;
		
		/**
		 * sum operator
		 */
		result = a + b;
		System.out.println("result a+b:" + result);
		System.out.println("result a+b (with priority):" + (a+b));
		/**
		 * subtraction operator 
		 */
		result = a - b;
		System.out.println("result a-b:" + result);
		/**
		 * multiplication operator
		 */
		result = a * b;
		System.out.println("result a*b:" + result);
		
		/**
		 * division operator
		 */
		result = a / b;
		System.out.println("result a/b:" + result);
		
		/**
		 * module operator
		 */
		result = a % b;
		System.out.println("result a%b:" + result);
	}
}
