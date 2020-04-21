class overload {
	//double multi;
	void demo (int a) {
		System.out.println("Numer is " + a);
	}
	void demo (int a, int b) {
		System.out.println("Numer is  " + a + " " + b);
	}
	double demo (double a) {
		return a*a;
	}
}

public class comiletimepolymorphism {

	public static void main(String[] args) {
		double multi;
		overload overload1 = new overload();
		overload1.demo(15);
		overload1.demo(10, 20);
		multi = overload1.demo(2.3);
		System.out.println("Number is " + multi);
	}

}
