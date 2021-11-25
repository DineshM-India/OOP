package training;
class Encapsulate {
	private String studname;
    private int id;
	private int mark;//Encapsulation
    

public String getStudname() {
		return studname;
	}


	public void setStudname(String studname) {
		this.studname = studname;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getMark() {
		return mark;
	}


	public void setMark(int mark) {
		this.mark = mark;
	}

}
public class Encapsulation {
	public static void main(String[] args)
	{
		Encapsulate obj = new Encapsulate();
        obj.setStudname("Dinesh");
		obj.setId(118);
		obj.setMark(440);
        System.out.println("Student  : " + obj.getStudname());
		System.out.println("IDENTITY : " + obj.getId());
		System.out.println("MARKS    : " + obj.getMark());
	}
}

