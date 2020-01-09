package com.wansoft.java.operators;

/**
 * @author Juan Salinas Zavaleta
 */
@SuppressWarnings("unused")
public class UnaryOperators {
	
	public static void main(String[] args) {
		
		/**
		 * UNARY OPERATORS
		 * - , ! , ++ , --
		 */
		int a = 3;
		
		/**	
		 * - operator
		 * invest sign value
		 */
		int b = -a;
		
		/**
		 * ONLY boolean or binary
		 * ! operator
		 * invest boolean value
		 */
		boolean c = true;
		boolean d = !c;
		
		/**
		 * pre-increment
		 * first the value of "f" is incremented ​​next assign the value of "f" to "preIncrement"
		 */
		int f=6;
		int preIncrement = ++f;
		System.out.println("value of preIncrement = " + preIncrement);
		System.out.println("value of f = "  +  f);
		/**
		 * post-increment
		 * first the value of "g" is assigned to "posIncrement" new the value of "g" is incremented 
		 */
		int g = 10;
		int posIncrement = g++;
		System.out.println("value of posIncrement = " + posIncrement);
		System.out.println("value of g = "  +  g);
		
		
		/**
		 * pre-decrement
		 * first the value of "h" is decremented ​​next assign the value of "h" to "preDecrement"
		 */
		int h=20;
		int preDecrement = --h;
		System.out.println("value of preDecrement = " + preDecrement);
		System.out.println("value of h = "  +  h);
		/**
		 * post-decrement
		 * first the value of "i" is assigned to "posDecrement" next the value of "i" is incremented 
		 */
		int i = 15;
		int posDecrement = i--;
		System.out.println("value of posDecrement = " + posDecrement);
		System.out.println("value of i = "  +  i);
		
	}
}
