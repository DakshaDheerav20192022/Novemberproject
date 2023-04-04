package pkg1;

import java.util.Scanner;

public class multidimenarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
int arr[][]=new int[5][2];
System.out.println("enter values");
for(int i=0;i<=4;i++)
{
	for(int j=0;j<=1;j++)
	{
		
	
	arr[i][j]=sc.nextInt();
}
}
for(int i=0;i<=4;i++)
{
	for(int j=0;j<=1;j++)
	{
		
		System.out.print(arr[i][j]);
	
}
	System.out.println();
}

	}

}
