package training;
//Runtime Polymorphism
class Overriding{ 
	void ride(){//Override the method,same method name and parameter
	System.out.println("over");
}  
}  
class Sample extends Overriding{  
void ride(){
	System.out.println("override");
	} 

public static void main(String[] args)
{
    Overriding obj = new Overriding();
    Sample obj2 = new Sample();
    obj.ride();
    obj2.ride();
    
}
}
