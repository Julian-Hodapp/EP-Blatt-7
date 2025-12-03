package h3;

public class H3_main {
	public static void main(String[] args) {
		Mensch m = new Mensch();
		
		m.setName("Warren Buffett");
		m.setGebJahr(1930);
		m.setAlter();
		
		System.out.println(m.getName());
		System.out.println(m.getGebJahr());
		System.out.println(m.getAlter());
	}
}
