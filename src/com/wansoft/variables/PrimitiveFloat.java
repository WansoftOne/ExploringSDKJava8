package com.wansoft.variables;

public class PrimitiveFloat {
	private float primitiveFloat; //32 bits --default:0.0
	private double primitiveDouble; //64 bits --default:0.0
	
	public static void main(String[] args) {
		float floatVar = 100.10f;
		System.out.println("float information");
		System.out.println("bits in float: " + Float.SIZE);
		System.out.println("bytes in float: " + Float.BYTES);
		System.out.println("min value: " + Float.MIN_VALUE);
		System.out.println("max value: " + Float.MAX_VALUE +"\n");
		
		double doubleVar = 10.10d;
		System.out.println("double information");
		System.out.println("bits in double: " + Double.SIZE);
		System.out.println("bytes in double: " + Double.BYTES);
		System.out.println("min value: " + Double.MIN_VALUE);
		System.out.println("max value: " + Double.MAX_VALUE +"\n");
	}
}
