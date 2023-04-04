package pkg1;
//pgm10
import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a no");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int n=0,rem,arm=0;
		n=num;
		while(n>0)
		{
		rem=n%10;
		arm=arm+(rem*rem*rem);
		n=n/10;
		}
		if(num==arm)
		{
			System.out.println("armstrong");
			
		}
		else
	
			System.out.println("not armstrong");
		

}
}
