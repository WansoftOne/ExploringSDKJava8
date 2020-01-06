package com.wansoft.variables;

public class PrimitiveInteger {
	/**
	 * data type primitives
	 */
	private byte primitiveByte; //8 bits -- default:0
	private short primitiveShort; //16 bits -- default:0
	private char primitiveChar; //16 bits -- default:\u0000
	private int primitiveInt; //32 bits -- default:0
	private long primitiveLong; //64 bits -- default:0
	
	public static void main(String[] args) {
		/**
		 * byte information
		 */
		byte byteVar = 127;
		System.out.println("byte information");
		System.out.println("bits type byte: " + Byte.SIZE); //8bits
		System.out.println("bytes type byte: " + Byte.BYTES); //1 byte
		System.out.println("Min value: " + Byte.MIN_VALUE); // -128
		System.out.println("Max value: " + Byte.MAX_VALUE + "\n");// 127
		
		/**
		 * short information
		 */
		short shortvar = 32767;
		System.out.println("short information");
		System.out.println("bits type short: " + Short.SIZE); // 16bits
		System.out.println("bytes type short: " + Short.BYTES);// 2 bytes
		System.out.println("Min value: " + Short.MIN_VALUE); // -32768
		System.out.println("Max value: " + Short.MAX_VALUE + "\n"); //32767
		
		/**
		 * Int information
		 */
		int intVar = 2147483647;
		System.out.println("int information");
		System.out.println("bits type int: " + Integer.SIZE); // 32bits
		System.out.println("bytes type int: " + Integer.BYTES);// 4 bytes
		System.out.println("Min value: " + Integer.MIN_VALUE); // -2147483648
		System.out.println("Max value: " + Integer.MAX_VALUE + "\n"); //2147483647
		
		/**
		 * long information
		 */
		long longVar = 9223372036854775807l;
		System.out.println("long information");
		System.out.println("bits type long: " + Long.SIZE); // 64bits
		System.out.println("bytes type long: " + Long.BYTES);// 8 bytes
		System.out.println("Min value: " + Long.MIN_VALUE); // -9223372036854775808
		System.out.println("Max value: " + Long.MAX_VALUE + "\n"); // 9223372036854775807
		
		/**
		 * char information
		 */
		System.out.println("char information");
		System.out.println("bits type char: " + Character.SIZE); // 16bits
		System.out.println("bytes type char: " + Character.BYTES);// 2 bytes
		System.out.println("Min value: " + Character.MIN_VALUE);
		System.out.println("Max value: " + Character.MAX_VALUE + "\n");	
		
		char charVar = '!';
		char charVarUnicode = '\u0021';
		char charVarDecimal = 33;
		System.out.println(charVar);
		System.out.println(charVarUnicode);
		System.out.println(charVarDecimal);
	}
}
