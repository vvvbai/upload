import java.util.Scanner;
public class Demo2{
	public static void main(String[] args){
		int intNumber; short shortNumber; byte byteNumber; long longNumber;
		float floatNumber; double doubleNumber; char charNumber;   String stringNumber; boolean booleanNumber;
		
		System.out.println("请输入一个int类型数据");
		Scanner input= new Scanner(System.in);
		intNumber=input.nextInt();
		
		System.out.println("请输入一个short类型数据");
		shortNumber=input.nextShort();
		
		System.out.println("请输入一个byte类型数据");
		byteNumber=input.nextByte();
		
		System.out.println("请输入一个long类型数据");
		longNumber=input.nextLong();
		
		System.out.println("请输入float一个类型数据");
		floatNumber=input.nextFloat();
		
		System.out.println("请输入double一个类型数据");
		doubleNumber=input.nextDouble();

        System.out.println("请输入char一个类型数据");
		charNumber=(char)input.nextInt();
		
		System.out.println("请输入boolean一个类型数据");
		booleanNumber=input.nextBoolean();
		
		System.out.println("int类型的数据是"+intNumber);
		System.out.println("short类型的数据是"+shortNumber);
		System.out.println("byte类型的数据是"+byteNumber);
		System.out.println("long类型的数据是"+longNumber);
		System.out.println("float类型的数据是"+floatNumber);
		System.out.println("double类型的数据是"+doubleNumber);
		System.out.println("char类型的数据是"+charNumber);
		System.out.println("boolean类型的数据是"+booleanNumber);
	
	}
	
}