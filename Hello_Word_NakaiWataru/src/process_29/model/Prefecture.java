package process_29.model;

public class Prefecture {
	private String name;
	private String capital;
	private double area;

	public Prefecture(String name, String capital, double area) {
		this.name = name;
		this.capital = capital;
		this.area = area;

	}

	public String getName() {
		return name;
	}

	public String getCapital() {
		return capital;
	}

	public double getArea() {
		return area;
	}

	@Override
	public String toString() {
		return String.format("都道府県：%s%n県庁所在地：%s%n面積：%.1fkm2%n", this.name, this.capital, this.area);
	}

}
