package pkg1;

import java.util.Scanner;

public class countvow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter string");
String s=sc.next();
countvow v1=new countvow();
v1.count(s);
	}
public void count(String s)
{
int count=0;

	for(int i=0;i<s.length();i++)
	{
	if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='u')
	{
		count++;
	}
	
}
	System.out.println(count);
}
}
