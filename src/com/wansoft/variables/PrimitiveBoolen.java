package com.wansoft.variables;

public class PrimitiveBoolen {
	private boolean primitiveBoolean; //only contains true or false -- default:false
	/**
	 * boolean information
	 */
	public static void main(String[] args) {
		System.out.println("first value: " + Boolean.TRUE);
		System.out.println("second value: " + Boolean.FALSE);
		
		/**
		 * creating a boolean variable
		 */
		boolean booleanVar = false;
		if(booleanVar) {
			System.out.println("is true");
		}else {
			System.out.println("is false");
		}
	}
}
