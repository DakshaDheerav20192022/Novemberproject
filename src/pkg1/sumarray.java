package pkg1;

import java.util.Scanner;

public class sumarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
Scanner sc=new Scanner(System.in);
int arr[]=new int[10];
System.out.println("enter values");
for(int i=0;i<3;i++)
{
	arr[i]=sc.nextInt();
}

for(int i=0;i<3;i++)
{
	sum=sum+arr[i]  ;
	
	System.out.println(arr[i]);
	
	
}

System.out.println("sum="+sum);
	}

}
