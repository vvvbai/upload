import java.util.Scanner;
public class Demo4{
	public static void main(String[] args){
		System.out.println("����������ǰ�Ĵ��");
		int money;
		Scanner input=new Scanner(System.in);
		money=input.nextInt();

	//if����
	if(money>=100){
			System.out.println("���Կ�������");
		}else if(money>=80){
			System.out.println("������һ��·������");
		}else if(money>=30){
			System.out.println("������һ��A6");
		}else{
			System.out.println("�����𳵣������ܰ�");
		}
    //switch����
	switch(money / 10){
	   case 9:
		   System.out.println("������һ��·������");
		   break;
	   case 8:
			System.out.println("������һ��·������");
			break;
	   case 7:
		   System.out.println("������һ��A6");
		   break;
	   case 6:
		   System.out.println("������һ��A6");
		   break;
	   case 5:
		   System.out.println("������һ��A6");
		   break;
	   case 4:
		   System.out.println("������һ��A6");
		   break;		   
	   case 3:
			System.out.println("������һ��A6");
			break;
	   case 2:
		   System.out.println("�����𳵣������ܰ�");
		   break;	
	   case 1:
		   System.out.println("�����𳵣������ܰ�");
		   break;
	   case 0:
		   System.out.println("�����𳵣������ܰ�");
		   break;		   
	  default:
			System.out.println("���Կ�������");
			break;		
	}
	 
	
	}
	
	}