package training1016.practice;

public final class Child extends Parent {
	
	Child()
	{
		System.out.println("I am from child Construcotr");
	}

	int a=10;
	public void methodfromParent(int a)
	{
		super.methodfromParent(5);
		System.out.println("I am from Child - "+a);
	}
	
	public void display()
	{
		System.out.println(super.a);
	}
	
	
}
