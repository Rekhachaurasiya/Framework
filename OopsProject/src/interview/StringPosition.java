package interview;

public class StringPosition {
	public static void main(String[] args) {
		String s1="Rekha Chaurasiya";
		String s2="Rekha";
		String s3=new String("Rekha");
		String s4=new String("Rekha");
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println(s1==s4);
		System.out.println(s1==s3);
		System.out.println(s2==s4);
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s1));
		System.out.println(s3.equals(s4));
		System.out.println(s1.indexOf('h'));
		System.out.println(s1.lastIndexOf(s1, 7));
		
	}

}
