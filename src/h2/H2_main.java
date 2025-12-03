package h2;

public class H2_main {
	public static int[] change(int[] a, int[] b, int start, int end) {
		boolean aGleichB;
		
		if (a.length == b.length) {
			for (int i = 1; i < a.length; i++) {
				if (a[i] != b[i]) {
					aGleichB = false;
					break;
				}
			}
			
			aGleichB = true;
		} else {
			aGleichB = false;
		}
		
		if (end > start && )
	}
}
