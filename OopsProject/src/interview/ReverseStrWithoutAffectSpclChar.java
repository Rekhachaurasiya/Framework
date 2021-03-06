package interview;

public class ReverseStrWithoutAffectSpclChar {
	public static void main(String[] args) {
		System.out.println(reverseString("ab$c"));
	}
	public static String reverseString(String input) {
		char[] inputArr=input.toCharArray();
		int l=0;
		int r=input.length()-1;
		while(l<l)
		{
			if (!Character.isAlphabetic(inputArr[l])){
				l++;
			}
			else if(!Character.isAlphabetic(inputArr[r]))
			{
				r--;
			}
			else {
				char tempChar=inputArr[l];
				inputArr[l]=inputArr[r];
				inputArr[r]=tempChar;
				l++;
				r--;
			}
		}
		return new String(inputArr);
	}
}
