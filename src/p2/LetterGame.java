package p2;

public class LetterGame {
	String keyString = new String("FRANZ JAGT IM KOMPLETT VERWAHRLOSTEN TAXI QUER DURCH BAYERN!");
	String word = new String("");
	
	public void setWord(int[] a) {
		String convertedString = "";
		
		for (int i = 0; i < a.length; i++) {
			char letter = keyString.charAt(a[i] % keyString.length());
			
			convertedString = convertedString + letter;
		}
		
		System.out.println(convertedString);
	}
	
	public String toString() {
		return("a");
	}
	
	//Key constrained
	public void setArray(String a) {
		
	}
}
