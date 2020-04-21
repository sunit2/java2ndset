
public class box <type> {
	private type type1;
	
	public void add (type type1) {
		this.type1 = type1;
	}
	
	public type get () {
		return type1;
	}

	public static void main(String[] args) {
	   	box <Integer> intbox = new box<Integer>();
	   	intbox.add(15);
	   	System.out.println(intbox.get());
	   	
	   	box<Double> doublebox = new box <Double> ();
	   	doublebox.add(1234.45);
	   	System.out.println(doublebox.get());
	   	
	   	box <String> stringbox = new box<String>();
	   	stringbox.add("Generic class");
	   	System.out.println(stringbox.get());

	}
}
