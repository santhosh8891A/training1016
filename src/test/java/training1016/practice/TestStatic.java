package training1016.practice;

public class TestStatic {
	
	
	static {
		System.out.println("this is a static block");
	}
	
	static int a=25;
	int b=35;
	
	public static void  method()
	{
		System.out.println("a value"+a);
	}
}
