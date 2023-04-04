package pkg1;

import java.util.Scanner;

public class foreacharray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String s[]=new String[4];
		System.out.println("enter names");
		for(int i=0;i<=3;i++)
		{
			s[i]=sc.next();
			
		}
		for(String s1:s)
			
		{
			System.out.println(s1);
		}
	}

}
