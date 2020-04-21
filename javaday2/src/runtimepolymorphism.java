class animal2 {
	void type () {
		System.out.println("Type is animal");
	}
}

class catanimal extends animal2{
	void type () {
		System.out.println("This animal is cat");
	}
}

class doganimal extends animal2{
	void type () {
		System.out.println("This animal is dog");
	}
}
public class runtimepolymorphism {

	public static void main(String[] args) {
		animal2 animal1 = new animal2 ();
		animal1.type();
		
		catanimal cat = new catanimal ();
		cat.type();
		
		doganimal dog = new doganimal ();
		dog.type();

	}

}
