package pkg1;
//pgm12
import java.util.Scanner;
public class arraysumvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int countp=0,countn=0,countz=0;
		int[] arr=new int[11];
		System.out.println("enter nos");
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=10;i++)
		 {
			 arr[i]=sc.nextInt();  
		 }
		 for(int i=1;i<=10;i++)
		 {
			 if(arr[i]>0)
			 {
				 countp++;
				 }
			 else if(arr[i]<0)
			 {
				 countn++;
				  }
			 else
			 {
				 countz++;
				 }
			}
		 System.out.println("count of positivenos"+countp) ;
		 System.out.println("count of negativenos"+countn) ;
		 System.out.println("count of zeros"+countz) ;

}
}