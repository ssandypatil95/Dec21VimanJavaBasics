package exceptionhandling;

public class ErrorDiscussion {
	
	public void m1()
	{
		System.out.println("m1 method");
		m2();
	}

	public void m2()
	{
		System.out.println("m2 method");
		
		m1();
	}
	
	public static void main(String[] args) {
		ErrorDiscussion ed = new ErrorDiscussion();
		
		ed.m1();
		
		
	}

}
