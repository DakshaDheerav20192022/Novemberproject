package pkg1;
//pgm7
import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a no");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int a=0,b=0,c=1;
		for(int i=1;i<=num;i++)
		{
		a=b;
		b=c;
		c=a+b;
		System.out.println(""+a);
	}
		
}
}