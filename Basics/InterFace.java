package training;

public interface InterFace {
	void task();
}

class Today implements InterFace{
	public void task() {
		System.out.println("Completed");
	}
	
public static void main(String[] args) {
	Today obj = new Today();
	obj.task();
}
}