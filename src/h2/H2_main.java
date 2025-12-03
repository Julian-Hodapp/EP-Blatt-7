package h2;

import java.util.Arrays;

public class H2_main {
	public static void main(String[] args) {
		int[] c = change(new int[]{2,7,1,9}, new int[]{2,7,1,9}, 2, 4);
		
		System.out.println(Arrays.toString(c));
	}
	
	public static int[] change(int[] a, int[] b, int start, int end) {
		boolean aGleichB = Arrays.compare(a, b) == 0;
		
		if (end > start && aGleichB == false) {
			int[] c = Arrays.copyOfRange(a, 0, a.length);
			
			return c;
			
		} else if (end > start && aGleichB == true) {
			Arrays.sort(a);
			
			int[] c = Arrays.copyOfRange(a, start, end);
			
			return c;
			
		} else {
			return new int[]{};
		}
	}
}
