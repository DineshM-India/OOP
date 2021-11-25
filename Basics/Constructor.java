package training;

public class Constructor {

	public Constructor() {
		/*class name and method name are same,no return type,
		 constructor classified into two types defaultconstructor 
		 and parameterised constructor*/
		//Default constructor creation
		String word = "Hello World";
			System.out.println(word);
			
		
	}
	
public Constructor(int a ,int b){//Parameterised constructor creation
	this();//calling default constructor
	
	System.out.println(a+b);
	
	
}
public Constructor(String a ,String b){//Parameterised constructor creation
 
	System.out.println(a+b);
	
	
}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Constructor obj1 = new Constructor(2,3);
		Constructor obj2 = new Constructor("Hello","Chennai");//Constructor overloading
        //caling a constructor
	}

}
