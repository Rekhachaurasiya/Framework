package interview;

public class FactorialNumbers {
	public static void main(String[] args) {
		//!0=1
		int fact=1;
		int num=10;
		for (int i=1;i<=num;i++)
		{
		fact=fact*i;
		}
        System.out.println(fact);
}
}
