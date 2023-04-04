package pkg1;
//pgm11
import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a no");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int p=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				p++;
			}
		}
		if(p==2)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("notprime");
		}
		
	}

}
