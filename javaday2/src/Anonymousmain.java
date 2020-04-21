
abstract class anonymousinner {
	abstract void display(); 
}


public class Anonymousmain {

	public static void main(String[] args) {
		anonymousinner inner = new anonymousinner() {
			public void display () {
				System.out.println("I am AnonymousInner");
			}
		};
		inner.display();
	}

}
