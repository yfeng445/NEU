package edu.neu.csye6200;

public class PersonStatic {
	public static final int version=1;
	public static int age=17;
	public static String name = "Dan";
	/**
	 * demonstrate the use of this class
	 */
	public static void demo() {
		System.out.println("Using PersonStatic class for static data members");
		System.out.println("My name is " + PersonStatic.name + ", age " + PersonStatic.age);
		PersonStatic.name="Oliver";
		PersonStatic.age=18;
		System.out.println("My name is " + PersonStatic.name + ", age " + PersonStatic.age);
		System.out.println("My name is " + PersonStatic.name + ", age " + PersonStatic.age);
	}
}
