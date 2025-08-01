package process_27;

public class Animal {
	private String name;
	private double height;
	private int spped;
	private String scientificName;
	
	Animal(String name, double height, int spped, String scientificName) {
		this.name = name;
		this.height = height;
		this.spped = spped;
		this.scientificName = scientificName;
	}

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public int getSpeed() {
		return spped;
	}
	

	public String getScientificName() {
		return scientificName;
	}
	
	
}
