package training1016.practice;

class Counter {
	 static int count = 0;//count=5
	 
	

	 public void displayCount()
	 {
		 anotherMethod(this);
	 }
	 
	 public void anotherMethod(Counter c)
	 {  
		 System.out.println("thsi is example");
	 }
}
