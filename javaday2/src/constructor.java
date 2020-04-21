class constructor1 {
	int age;
	public final static int agelimit = 65;
	String name;
	public constructor1 () {
		this(3);
		System.out.println("age is " + age);
	}
	public constructor1(int age) {
		this(3,"Sunit");
		System.out.println("age and name is " + age + " " + name);
	}
	public constructor1(int age, String name) {
		this.age = age;
		this.name = name;
		System.out.println("name and age is " + name + " " + age);
	}
}
public class constructor {

	public static void main(String[] args) {
		constructor1 cons = new constructor1(3,"Amit");
		constructor1 cons2 = new constructor1(4);
		System.out.println(constructor1.agelimit);
		
				
	}

}

