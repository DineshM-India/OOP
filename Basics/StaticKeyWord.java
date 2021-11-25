package training;

public class StaticKeyWord {
	int empid;
	String name;
	static String company = " CMPS"; /*CMPS name is common for each
	employee as same so I use  staic method it reduce the memory spaces*/
	public StaticKeyWord(int e,String n){
		empid = e;
		name = n;
	}
public void display() {
	System.out.println(empid+name+company);
} 
	public static void main(String[] args) {
		
	StaticKeyWord obj1 = new StaticKeyWord(18,"Dinesh");
	StaticKeyWord obj2 = new StaticKeyWord(19,"Ravi");
	StaticKeyWord obj3 = new StaticKeyWord(20,"Raja");
	obj1.display();
	obj2.display();
	obj3.display();

	}

}
