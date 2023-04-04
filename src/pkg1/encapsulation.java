package pkg1;
class encap

{
	private int empid;
	private String empname;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	
}
public class encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
encap ob=new encap();
ob.setEmpid(101);
ob.setEmpname("revu");
System.out.println("empname="+ob.getEmpname());
System.out.println("empid="+ob.getEmpid());


	}

}
