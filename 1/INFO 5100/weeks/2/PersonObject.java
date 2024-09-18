package edu.neu.csye6200;

/**
 * Person class demonstrates Encapsulation with all data (private) and methods defined together in class
 */
public class PersonObject  {
	public static final int VERSION=2;
	private int age=17;	// object instance data member
	private String name = "Daniel";	// object instance data member
	/**
	 * static initialization executed with 
	 */
	static {
	}
	/**
	 * object initialization executed with each constructor
	 */
	{
		this.age = 17;
		this.name = "Dan";
	}
	/**
	 * default constructor
	 */
	public PersonObject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PersonObject(int age, String name) {
		super();	// call super class default constructor
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * birthday method: person ages by one year
	 * @param age	current age of Person
	 * 
	 * @return		new age of Person on birthday
	 */
	public static int birthdayStatic(int age) {
		System.out.println("my age was " + age);
		System.out.println("on my birthdaty, my age is now " + ++age);
		
		return age;	// new age because of birthday
	}
	/**
	 * birthday method: person ages by one year
	 * @param person	Person
	 * 
	 * @return		new age of Person on birthday
	 */
	public static int birthdayStatic(PersonObject person) {
		System.out.println("my age was " + person.getAge());
		person.setAge(person.getAge() + 1);
		System.out.println("on my birthdaty, my age is now " + person.getAge());
		
		return person.getAge();	// new age because of birthday
	}
	/**
	 * demonstrate the use of this class
	 */
	public static void demo() {
		System.out.println("Using Person class for static data members");
		
		{
			int age = 45;
			System.out.println("block age=" + age);
		}
		PersonObject dan = null; 	// create object reference variable on stack memory
		dan = new PersonObject(); // create Person object using default constructor
		System.out.println("My name is " + dan.getName() + ", age " + dan.getAge());
		System.out.println("Version # " + PersonObject.VERSION);
		
		PersonObject oliver = new PersonObject(18, "Oliver"); // create Person object using parameterized constructor
		System.out.println("My name is " + oliver.getName() + ", age " + oliver.getAge());
		
		{
			System.out.println("demonstrate pass-by-value with birthday...");
			int age = dan.getAge();  // dan's age
			System.out.println("age = " + age);
			int newAge = PersonObject.birthdayStatic(age);
			System.out.println("age = " + age);
			System.out.println("new age = " + newAge);
		}
		
		{
			System.out.println("demonstrate pass-by-reference with birthday...");
			System.out.println("My name is " + dan.getName() + ", age " + dan.getAge());
			int newAge = PersonObject.birthdayStatic(dan);
			System.out.println("My name is " + dan.getName() + ", age " + dan.getAge());
			System.out.println("new age = " + newAge);
		}
	}
}
