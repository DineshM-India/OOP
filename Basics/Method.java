package training;

import java.util.Scanner;

public class Method { //Method this is a class name
	/*method declaration,
	a method is a collection of instructions 
	that perform specific task,methods are classified into two types there are
	predefined method,user defined method.
	 */

@SuppressWarnings("resource")
public static void main(String[] args) {
	System.out.println("Enter Any Two number");
	Scanner obj = new Scanner(System.in);//obj this is a object
	int a = obj.nextInt();
	int b = obj.nextInt();
	System.out.println("A = " + a + "  B = " + b);
	//predefined method max()
	System.out.println("Maximum number"+Math.max(a,b));
	System.out.println("Add two numbers"+addTwoNumbers(a,b));
	
	
}
    //user defined method
    public static int addTwoNumbers(int a,int b) {
    	return a+b;
    }
}