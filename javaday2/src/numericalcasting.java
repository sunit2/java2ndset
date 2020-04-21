
public class numericalcasting {

	public static void main(String[] args) {
		int intvalue;
		float floatvalue= 123.45f;
		double doublevalue= 1234567.56;
		long longvalue=12345;
		byte bytevalue;
		
		System.out.println(Byte.MAX_VALUE);
		intvalue = (int)longvalue;
		System.out.println(intvalue);
		floatvalue = (float) doublevalue;
		System.out.println(floatvalue);
		intvalue = 230;
		bytevalue = (byte) intvalue;
		System.out.println(bytevalue);
	}

}

