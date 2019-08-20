import java.util.Scanner;
public class Calculator_Switch
{
	static int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	static int sub(int a,int b)
	{
		int c=a-b;
		return c;
	}
	static int mul(int a,int b)
	{
		int c=a*b;
		return c;
	}
	static int div(int a,int b)
	{
		int c=a/b;
		return c;
	}
	
	public static void main(String[] args)
	{
		System.out.println("welcome");
		System.out.println("1)Additon \n 2)Substraction /n 3)Multiplication /n 4)Division");
		
		Scanner scan=new Scanner(System.in);
		System.out.println("now enter ur choice");
		int ch=scan.nextInt();
		System.out.println("ur choice is : "+ch);
		int a=0,b=0;
		switch (ch)
		{
			case 1: 
			   add(a,b);
			 //int a,b=0;
			System.out.println("enter two num: ");
			  a=scan.nextInt();
			  b=scan.nextInt();
			 System.out.println("the sum is: " + add(a,b));
			break;
			case 2: //int a,b=0;
			sub(a,b);
			/* int a,b=0; */
			System.out.println("enter two num: ");
			  a=scan.nextInt();
			  b=scan.nextInt();
			System.out.println("the subtraction is: " + sub(a,b));
			break;
			case 3://int a,b=0;
			
			/* int a,b=0; */
			System.out.println("enter two num: ");
			  a=scan.nextInt();
			  b=scan.nextInt();
			  int m=mul(a,b);
			System.out.println("the multiplication is: " + m);
			break;
			case 4: 
			System.out.println("enter two num: ");
			  a=scan.nextInt();
			  b=scan.nextInt();
			System.out.println("the division is: " + div(a,b));
			break;
			default :
			{
			System.out.println("rey pappa correct choice ivvara");
			}
		}
		
		
	}
}