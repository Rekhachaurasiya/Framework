package interview;

public class SwapingNum {
	public static void main(String[] args) {
		int a=20;
		int b=30;
		System.out.println("Before swaping a:"+a);
		System.out.println("Before swaping b:"+b );
//		int temp=a;
//		a=b;
//		b=temp;
		a=a-b; //-10
		b=a+b;//20
		a=b-a;//30
		System.out.println("After swaping a:"+a);
		System.out.println("After swaping b:"+b);
	}

}
