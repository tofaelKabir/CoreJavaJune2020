package lec17_1_java_collection_array;

import java.util.Iterator;

import lec13_4_java_access_modifiers_protected.E;

/*
 * Author: Shohag, Organised by: Tofael
 */

public class UseOfArray05 {

	public static void main(String[] args) {
		String[] a = new String[6]; // Different data type (String, char, int etc) can't be mix in an Array
		a[0] = "Tofael";
		a[1] = "A";
		a[2] = "  "; // white space //empty string when "", no space inside
		a[3] = "9";

		a[5] = "Mohammad";
		
		// print single index value:
		System.out.println("^^^^^^^^^^^^^ Printing single index value ^^^^^^^^^^^^^^^^ ");
		System.out.println("Single index value: " + a[0]);// output: Tofael
		System.out.println("Single index value: " + a[2]);// output: why empty?
		System.out.println("Single index value: " + a[4]);// output: why null?
		System.out.println("Single index value: " + a[5]);// output: Mohammad

		System.out.println("\nThe length of the array is: " + a.length);
		System.out.println("\nlast index value: " + a[a.length - 1]); // find the value for (length-1) no.

		// print all index value:

		System.out.println("\n^^^^^^^^^^^^^ Printing all index value of Array a [] ^^^^^^^^^^^^^^^^ ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		
	}
}