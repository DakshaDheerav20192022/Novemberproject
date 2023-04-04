package pkg1;

import java.util.Scanner;

//pgm5
public class reverse {

	public static void main(String[] args) {
		int r=0,rem;
		// TODO Auto-generated method stub
System.out.println("enter a integer");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

while(n>0)
{
	rem=n%10;
	r=r*10+rem;
	n=n/10;
}
System.out.println("the reverse of number is="+r);
	}

}
