package pkg1;
//pgm8
import java.util.Scanner;

public class avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("enter a no");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int avg = 0,sum=0;
		for(int i=1;i<=num;i++)
		{
			sum=sum+i;
		avg=sum/num;
		}
		System.out.println(""+avg);
		}
	}


