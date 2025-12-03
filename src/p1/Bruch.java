package p1;

public class Bruch {
	int z;
	int n;
	
	public Bruch(int zaehler, int nenner) {
		z = zaehler;
		n = nenner;
	}
	
	public String toString(Bruch a) {
		return new String(z + ":" + n);
	}
}
