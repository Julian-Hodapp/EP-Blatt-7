package h3;

public class H3_main {
	public static void main(String[] args) {
		Mensch warrenBuffet = new Mensch();
		
		warrenBuffet.setName("Warren Buffett");
		warrenBuffet.setGebJahr(1930);
		warrenBuffet.setAlter();
		
		System.out.println(warrenBuffet.getName());
		System.out.println(warrenBuffet.getGebJahr());
		System.out.println(warrenBuffet.getAlter());
		
		Mensch elonMusk = new Mensch();
		
		elonMusk.setName("Elon Musk");
		elonMusk.setGebJahr(1971);
		elonMusk.setAlter();
		
		System.out.println(elonMusk.getName());
		System.out.println(elonMusk.getGebJahr());
		System.out.println(elonMusk.getAlter());
		
		
		Mensch billGates = new Mensch();
		
		billGates.setName("Bill Gates");
		billGates.setGebJahr(1955);
		billGates.setAlter();
		
		System.out.println(billGates.getName());
		System.out.println(billGates.getGebJahr());
		System.out.println(billGates.getAlter());
	}
}
