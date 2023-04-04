package pkg1;
//pgm6
import java.util.Scanner;

public class sumevod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter set of integers");
int[] arr=new int[12];
Scanner sc=new Scanner(System.in);
int sumev=0,sumod=0;

for(int i=1;i<=10;i++)
{
	 arr[i]=sc.nextInt();
	
}
for(int i=1;i<=10;i++)
{
if(arr[i]%2==0)
{
sumev=sumev+arr[i];	

}

else
{
	sumod=sumod+arr[i];
}}
System.out.println("sum of evennos="+sumev);
System.out.println("sum of oddnos="+sumod);
}}