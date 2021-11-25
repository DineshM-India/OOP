package training;

public class Outerclass {
 public String name = "Dinesh HSS";
	class School{ //Inner class
	void member() {
		System.out.printf("Schoolname is "+name);
	}
	}
	 public static void main(String args[]){  
		  Outerclass obj=new Outerclass();  
		  Outerclass.School in=obj.new School();  
		  in.member();  
		 }  
}
