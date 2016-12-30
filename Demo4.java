import java.util.Scanner;
public class Demo4{
	public static void main(String[] args){
		System.out.println("请输入您当前的存款");
		int money;
		Scanner input=new Scanner(System.in);
		money=input.nextInt();

	//if方法
	if(money>=100){
			System.out.println("可以考虑买卡宴");
		}else if(money>=80){
			System.out.println("可以买一辆路虎极光");
		}else if(money>=30){
			System.out.println("可以买一辆A6");
		}else{
			System.out.println("还买不起车，再攒攒吧");
		}
    //switch方法
	switch(money / 10){
	   case 9:
		   System.out.println("可以买一辆路虎极光");
		   break;
	   case 8:
			System.out.println("可以买一辆路虎极光");
			break;
	   case 7:
		   System.out.println("可以买一辆A6");
		   break;
	   case 6:
		   System.out.println("可以买一辆A6");
		   break;
	   case 5:
		   System.out.println("可以买一辆A6");
		   break;
	   case 4:
		   System.out.println("可以买一辆A6");
		   break;		   
	   case 3:
			System.out.println("可以买一辆A6");
			break;
	   case 2:
		   System.out.println("还买不起车，再攒攒吧");
		   break;	
	   case 1:
		   System.out.println("还买不起车，再攒攒吧");
		   break;
	   case 0:
		   System.out.println("还买不起车，再攒攒吧");
		   break;		   
	  default:
			System.out.println("可以考虑买卡宴");
			break;		
	}
	 
	
	}
	
	}