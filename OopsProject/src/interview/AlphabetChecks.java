package interview;

public class AlphabetChecks {
	public static void main(String[] args) {
		char cha='h';
		if((cha>='a' && cha<='z') || (cha>='A' && cha<='Z'))
		{
			System.out.println(cha+ " : character is alphabet");
		}
		else
		{
			System.out.println(cha+ " : charachter is not alphabet");
		}
	}

}
