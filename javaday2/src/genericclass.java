import java.util.ArrayList;

public class genericclass {

	public static void main(String[] args) {
		ArrayList list = new ArrayList ();
		list.add("Orange");
		list.add("Apple");
		list.add("Grapse");
		
		String fruit = (String)list.get(1);
		System.out.println(fruit);
		
		ArrayList<String> list1 = new ArrayList<String> ();
		list1.add("Cat");
		list1.add("Dog");
		
		String animal = list1.get(0);
		System.out.println(animal);
	}
}
