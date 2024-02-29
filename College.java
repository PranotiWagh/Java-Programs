
public class College 
{
	String cname;
	int cid;
	Student s=new Student(123,"pranoti");
	College(String cname,int cid)
	{
		this.cname=cname;
		this.cid=cid;
	}
	

	public void collegeDetails()
	{
		System.out.println("college name is"+cname);
		System.out.println("college id is"+cid);
		System.out.println("Student name is"+s.name);
		System.out.println("student id is"+s.id);// TODO Auto-generated method stub
		
	}

}
