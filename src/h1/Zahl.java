package h1;

public class Zahl {
	public boolean even;
	public boolean small;
	public boolean positive;
	
	int num;
	
	public Zahl(int zahl) {
		num = zahl;
	}
	
	public void setEven() {
		even = num % 2 == 0;
		
		System.out.println(even);
	}
	
	public void setSmall() {
		small = num < 100;
		
		System.out.println(small);
	}
	
	public void setPostitive() {
		positive = num > 0;
		
		System.out.println(positive);
	}
}
