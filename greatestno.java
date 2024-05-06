package newproject;
import java.util.Scanner;

public class greatestno {
	public static void main(String[] args) {
		int a,b,c, largest, temp=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number:");
		a=sc.nextInt();
		System.out.println("Enter second number:");
		b=sc.nextInt();
		System.out.println("Enter third number:");
		c=sc.nextInt();
		temp=a>b?a:b;
		largest=c>temp?c:temp;
		System.out.println("The largest no. is= "+largest);
		
		}
	
	}
