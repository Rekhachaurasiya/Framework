package AddNumFromString;

  abstract class A{
	  
	  abstract void run();
	   void show() {
		  System.out.println("showing...");
	  }
  }
  class B extends A{
	  void run() {
		  System.out.println("running...");
	  }
  }

public class Abstractaa {
	public static void main(String[] args) {
		A obj=new B();
		obj.show();
		obj.run();
	}

}
