package AddNumFromString;

class A1 implements Printable{
	public void show()
	{
		System.out.println("shwoing.....");
	}
}
class A2 implements Printable1{
	public void print ()
	{
		System.out.println("pringting...");
	}
}
public class Test {
	public static void main(String[] args) {
		A2 obj=new A2();
		obj.print();
		A1 obj1=new A1();
		obj1.show();
	}

}
