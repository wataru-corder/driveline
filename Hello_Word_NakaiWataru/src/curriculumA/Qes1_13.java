package curriculumA;

public class Qes1_13 {

	public static void main(String[] args) {

		byte a;
		short b;
		int c;
		long d;
		float e;
		double f;
		char g;
		String h;
		boolean i;

		a = 0;
		b = 0;
		c = 0;
		d = 0;
		e = 0;
		f = 0;
		g = 'a';
		h = "";
		i = false;

		a = 10;
		b = 100;
		c = 1000;
		d = 10000L;
		e = 9.5f;
		f = 10.5;
		g = 'a';
		h = "ハロー";
		i = true;

		System.out.println("-------------4の解答-------------");

		System.out.println(a + b + c + d);//11110
		System.out.println(a + (int) f);//20
		System.out.println(g + " " + h + " " + i);//a ハロー true
		System.out.println((int) (a + b + c + d + e + f));//11130
		System.out.println(a * b * c * d);//10000000000
		System.out.println(f / b);//0.105
		System.out.println(a - b);//-90

		System.out.println("-------------5の解答-------------");
		int num = 20;
		int num1 = 23;
		System.out.println("ハローJAVA" + (num + num1));

		System.out.println("-------------6の解答-------------");

		String name = "山田太郎";
		int age = 18;
		double height = 170.5;
		double weight = 62.2;
		String favoriteFood = "寿司";

		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + favoriteFood + "です");

		System.out.println("-------------7の解答-------------");

		double heightMeter = height / 100;
		double bmi = weight / (heightMeter * heightMeter);
		System.out.printf("BMIは%.1fです%n", bmi);

		System.out.println("-------------8の解答-------------");

		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
		favoriteFood = "オムライス";

		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + favoriteFood + "です");

		heightMeter = height / 100;
		bmi = weight / (heightMeter * heightMeter);
		System.out.printf("BMIは%.1fです%n", bmi);

		System.out.println("-------------9の解答-------------");

		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + (age + age) + "歳です");
		System.out.println("身長は" + (height + height) + "cmです");
		System.out.println("体重は" + (weight + weight) + "kgです");
		System.out.println("好きな食べ物は" + favoriteFood + "です");

		heightMeter = height / 100;
		bmi = weight / (heightMeter * heightMeter);
		System.out.printf("BMIは%.1fです%n", bmi);

		System.out.println("-------------10の解答-------------");
		System.out.println(age >= 25);

		System.out.println("-------------11の解答-------------");
		String ageString = String.valueOf(age);
		String heightString = String.valueOf((int) height);
		String weightString = String.valueOf((int) weight);

		System.out.println(ageString + heightString + weightString);

		System.out.println("-------------12の解答-------------");
		double heightInt = Double.parseDouble(heightString);
		double weightInt = Double.parseDouble(weightString);
		System.out.println("身長：" + heightInt + "体重：" + weightInt);

		System.out.println("-------------13の解答-------------");
		System.out.println(age >= 25 || heightInt > 160);

	}

}
