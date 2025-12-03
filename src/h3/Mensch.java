package h3;

public class Mensch {
	public String name = new String("Peter Hurensohn");
	public int gebJahr = 1995;
	public int alter = 1;
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setGebJahr(int newGebJahr) {
		gebJahr = newGebJahr;
	}
	
	//has to be updated every Year
	public void setAlter() {
		alter = 2025 - gebJahr;
	}
	
	public String getName() {
		return name;
	}
	
	public int getGebJahr() {
		return gebJahr;
	}
	
	public int getAlter() {
		return alter;
	}
}
