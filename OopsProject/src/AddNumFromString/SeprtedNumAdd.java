package AddNumFromString;

public class SeprtedNumAdd {
	public static void main(String[] args) {
		
		int i = 0;
		for (String s : "123abdhdjs95hhdhdsj15".split("\\D+")) {
		    i += (s.isEmpty() ? 0 : Integer.parseInt(s));
		}
		System.out.println("result : " + i);
	}

}
