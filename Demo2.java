import java.util.Scanner;
public class Demo2{
	public static void main(String[] args){
		int intNumber; short shortNumber; byte byteNumber; long longNumber;
		float floatNumber; double doubleNumber; char charNumber;   String stringNumber; boolean booleanNumber;
		
		System.out.println("������һ��int��������");
		Scanner input= new Scanner(System.in);
		intNumber=input.nextInt();
		
		System.out.println("������һ��short��������");
		shortNumber=input.nextShort();
		
		System.out.println("������һ��byte��������");
		byteNumber=input.nextByte();
		
		System.out.println("������һ��long��������");
		longNumber=input.nextLong();
		
		System.out.println("������floatһ����������");
		floatNumber=input.nextFloat();
		
		System.out.println("������doubleһ����������");
		doubleNumber=input.nextDouble();

        System.out.println("������charһ����������");
		charNumber=(char)input.nextInt();
		
		System.out.println("������booleanһ����������");
		booleanNumber=input.nextBoolean();
		
		System.out.println("int���͵�������"+intNumber);
		System.out.println("short���͵�������"+shortNumber);
		System.out.println("byte���͵�������"+byteNumber);
		System.out.println("long���͵�������"+longNumber);
		System.out.println("float���͵�������"+floatNumber);
		System.out.println("double���͵�������"+doubleNumber);
		System.out.println("char���͵�������"+charNumber);
		System.out.println("boolean���͵�������"+booleanNumber);
	
	}
	
}