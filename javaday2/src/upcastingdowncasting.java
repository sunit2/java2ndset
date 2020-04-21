
public class upcastingdowncasting {

	public static void main(String[] args) {
		animal animal1 = new animal();
		animal1.color();

		catupcasting cat1 = new catupcasting();
		cat1.color();
		cat1.type();

		animal animal2 = new catupcasting();
		animal2.color();

		animal animal3 = cat1;
		animal3.color();
		// animal3.type();

		if (animal1 instanceof catupcasting) {
			catupcasting cat2 = (catupcasting) animal1;
			cat2.color();
		}

		if (animal1 instanceof dog_upercasting) {
			dog_upercasting dog = (dog_upercasting) animal1;
			dog.color();
		}
	}

}
