package pkg1;

import java.util.Scanner;

public class arraypgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//int[] a=new int[3];
//a[0]=2;
//a[1]=3;
//a[2]=4;
//System.out.println(a[2]);
/*for(int i=0;i<3;i++)
{
	System.out.println(""+a[i]);
}*/
		Scanner sc=new Scanner(System.in);
String arr[]=new String[4];
/*arr[0]="Dheerav";
arr[1]="dhyan";
arr[2]="Sanju";
arr[3]="Rithik";*/
System.out.println("enter names`");
for(int i=0;i<4;i++)
{

	arr[i]=sc.next();

}

for(int i=0;i<4;i++)
{
	System.out.println(arr[i]);
}
	}

}
