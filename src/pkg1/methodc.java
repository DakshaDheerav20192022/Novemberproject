package pkg1;

public class methodc {

	
		// TODO Auto-generated method stub
		
			int empid;
			String empname;
			String des;
			public void setvalue(int empid,String empname,String des)
			{
				this.empid=empid;
				this.empname=empname;
				this.des=des;
			}
			public void display()
			{
				System.out.println("empid="+empid);
				System.out.println("empname="+empname);
				System.out.println("des="+des);
			}

			public static void main(String[] args) {
				// TODO Auto-generated method stub
		methodc ob=new methodc();
		ob.setvalue(1,"yan","Police");
		ob.display();
			}

		
	
	}

