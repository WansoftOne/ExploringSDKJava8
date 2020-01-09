package com.wansoft.java.operators;

/**
 * @author Juan Salinas Zavaleta
 */
public class AssigmentOperators {
	
	public static void main(String[] args) {
		/**
		 * = , += , -= , *= , /= , %= , -- , ++ , 
		 * ++ , -- , = , *= , /= , += , -= , <<= , >>= , >>>= , &= , |= , ^=
		 */
		int a=3 , b=10;
		
		/**
		 *  = operator
		 */
		int c = a;
		System.out.println("value of c = "+ c);
		
		/**
		 * += operator
		 * sum "x" to value of "a"
		 */
		a += 1; 
		System.out.println("value of a = "+ a);
		
		/**
		 * -= operator
		 * subtract "x" to value of "a" 
		 */
		a -= 2;
		System.out.println("value of a = "+ a);
		/**
		 * this functionality is the same in *=, /=, %= operators 
		 */
	}
}
