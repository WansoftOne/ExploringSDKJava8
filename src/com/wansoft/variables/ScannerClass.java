package com.wansoft.variables;

import java.util.Scanner;

public class ScannerClass {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Proporciona el nombre del libro: ");
		String libro = scanner.nextLine();
		System.out.print("Proporciona el nombre de su autor: ");
		String autor = scanner.nextLine();
		System.out.println(libro + " fue escrito por " + autor);
	}
}
