package interview;

public class CheckVovelConsonent {
	public static void main(String[] args) {
		char ch='b';
		 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		 {
			System.out.println("vovel"); 
		 }
		 else
		 {
			 System.out.println("consonenet");
		 }
		 
		 switch(ch) {
		 case'a':
		 case'e':
		 case'i':
		 case'o':
		 case'u':
		 System.out.println("vovel:"+ch);
		 break;
		 default:
			 System.out.println("consonenet"+ch);
		 }
		 
		
	}

}
