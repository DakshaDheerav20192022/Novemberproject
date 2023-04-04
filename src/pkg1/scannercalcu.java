package pkg1;

import java.util.Scanner;

public class scannercalcu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter 2nos");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("enter choice");
char c=sc.next().charAt(0);
switch(c)
{
case '+':
	System.out.println("add"+(a+b));
break;
case '-':
	System.out.println("sub"+(a-b));
break;
case '*':
	System.out.println("mul"+(a*b));
break;
case '/':
	System.out.println("div"+(a/b));
break;
default:
	System.out.println("invalid choice");
}
	}
}


