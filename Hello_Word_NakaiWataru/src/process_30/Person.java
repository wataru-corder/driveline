package process_30;

public class Person {
	String name;
	int age;
	double height;
	double weight;
	double bmi;

	int count = 0;

	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.bmi = bmi();

		count++;//インスタンスが作られたらカウント
	}

	public double bmi() {
		return weight / (height * height);
	}

	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.printf("BMIは%.1fです", this.bmi);
		System.out.println();
	}

	public void printCount() {
		System.out.println("合計" + count + "人です");
	}

}
