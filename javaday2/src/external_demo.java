
public class external_demo {

	int item = 75;
	public class internal_demo {
		void print () {
			System.out.println("This is inner class");
		}
	}
	void display () {
		internal_demo inner = new internal_demo ();
		inner.print();
		System.out.println("This is outer class");
		}
}
