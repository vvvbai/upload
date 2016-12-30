public class Demo3{
	public static void main(String[] args){
		byte byteNumber=20; short shortNumber=32; int intNumber=40; long longNumber=52;
		float floatNumber=60.12f; double doubleNumber=12.60;char charNumber='a'; boolean booleanNumber=true;
		byteNumber=(byte)shortNumber;
		shortNumber=byteNumber;
		shortNumber=(short)intNumber;
		intNumber=byteNumber;
		longNumber=shortNumber;
		doubleNumber=floatNumber;
		shortNumber=(short)charNumber;
		charNumber=(char)73;
System.out.println("byteNumber="+byteNumber);
System.out.println("shortNumber="+shortNumber);
System.out.println("intNumber="+intNumber);
System.out.println("longNumber="+longNumber);
System.out.println("floatNumber="+floatNumber);
System.out.println("doubleNumber="+doubleNumber);
System.out.println("charNumber="+charNumber);

	}
	
	
}