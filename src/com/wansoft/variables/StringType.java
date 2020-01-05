package com.wansoft.variables;

public class StringType {
	/**
	 * The String class in java is a object type
	 */
	
	public static void main(String[] args) {
		
		/**
		 * Creating String objects
		 */
		String value = "this value";
		String value2 = new String("this value");
		/**
		 * comparing Strings
		 */
		value.equals("My value"); //the equals method return a boolean 
		
		/**
		 * escape characters in strings
		 * \t --tab
		 * \b --insert backSpace
		 * \n --insert new linea
		 * \r --insert retorno de carro
		 * \f --Se mueve a la siguiente pagina(form feed). Se utiliza para impresoras no en consola
		 * \' --insert character '
		 * \" --insert character "
		 * \\ --insert character \
		 */
		
		/**
		 * in JAVA 10 or higher
		 */
		var greeting = "hello"; //type for inference 
		var name = "Juan";
		var number1 = 4;
		var number2 = 8;
		/**
		 * an expression is evaluated from left to right
		 */
		System.out.println(greeting + " " + name); //concatenate String 
		System.out.println(number1 + number2); //sum of integers
		System.out.println(greeting + number1 + number2); //concatenate Strings
		System.out.println(number1 + number2 + greeting); //sum of integers next concatenate strings
		
	}
	
}
