package pkg1;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=40,b=0;
char d='/';
switch('/')
{
case '+':
	System.out.println("add"+(a+b));
	break;
case '-':
	System.out.println("sub"+(a-b));
	break;
case '*':
	System.out.println("mult"+(a*b));
	break;
case '/':
	if(b==0)
	{
	System.out.println("not divisible by 0");
	}
	else
	{
		System.out.println("div="+(a/b));
	}
	break;

default:
	System.out.println("invalid");
	}
	}
}


