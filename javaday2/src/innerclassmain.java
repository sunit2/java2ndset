
public class innerclassmain {

	public static void main(String[] args) {
		external_demo external = new external_demo ();
		external.display();
		
		external_demo.internal_demo inner1 = external.new internal_demo();
		inner1.print();
	}

}
