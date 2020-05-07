package AddNumFromString;

class Rectangle extends Shape{
	public void rect() {
		System.out.println("Drawing rectangle shape");
	}
}
class Trangle extends Shape{
	public void tran() {
		System.out.println("Drawing trangle shape");
	}
}

public class Shape {
	public static void main(String[] args) {
		Trangle t=new Trangle();
		t.tran();
		Rectangle r=new Rectangle();
		r.rect();
		
	}

}
