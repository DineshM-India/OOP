package training;

class Dept
{
	private String name;
	Dept(String name)
	{
		this.name = name;
	}
	
	public String getDeptName()
	{
		return this.name;
	}
}

class Class
{
	private String student;
	Class(String name)
	{
		this.student = name;
	}
	
	public String getStudentName()
	{
		return this.student;
	}
}

class Association
{
	public static void main (String[] args)
	{
		Dept obj1 = new Dept("CS");
		Class obj2 = new Class("BCA");
		System.out.println(obj1.getDeptName() +"   "+obj2.getStudentName());
	}
}
