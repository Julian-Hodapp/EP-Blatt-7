package p1;

public class P1_main {
	public static void main(String[] args) {
		multFracFrac(new Bruch(5,2), new Bruch(3,4));
	}
	
	public static void multFracFrac(Bruch a, Bruch b) {
		multFrac(a.z,a.n,b.z,b.n);
	}
	
	public static void multFrac(int z1, int n1, int z2, int n2) {
		//numerator:denominator
		//they are calculated by multiplying their counterparts from fracture 1 and 2 
		System.out.println(z1 * z2 + " : " + n1 * n2);
	}
}
