package pkg1;

import java.util.Scanner;

public class methodspractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		methodspractise m1=new methodspractise();
		m1.avg(1,2,3);
		//m1.vow();
	}

	public void avg(double x,double y,double z)
	{
	double avg,sum=0;
	sum=x+y+z;
	avg=sum/3;
	System.out.println("avg="+avg);
	}
	
	}

