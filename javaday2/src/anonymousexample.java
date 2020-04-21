class anonymousinner1 {
	public void display() {
		System.out.println("I am inside");
	}
}

public class anonymousexample {

	public static void main(String[] args) {
		anonymousinner1 inner = new anonymousinner1();
		inner.display();
	anonymousinner1 inner1 = new anonymousinner1() {
			public void display() {
				System.out.println("I am object");
			}
		};
		inner1.display(); 
	}

}
