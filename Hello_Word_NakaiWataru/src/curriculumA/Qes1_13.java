package curriculumA;

public class Qes1_13 {

	public static void main(String[] args) {

		byte byteValue;
		short shortValue;
		int intValue;
		long longValue;
		float floatValue;
		double doubleValue;
		char charValue;
		String stringValue;
		boolean booleanValue;

		byteValue = 0;
		shortValue = 0;
		intValue = 0;
		longValue = 0;
		floatValue = 0.0f;
		doubleValue = 0.0;//
		charValue = ' ';//
		stringValue = "";//
		booleanValue = false;
		
		

		byteValue = 10;
		shortValue = 100;
		intValue = 1000;
		longValue = 10000L;
		floatValue = 9.5f;
		doubleValue = 10.5;
		charValue = 'a';
		stringValue = "ハロー";
		booleanValue = true;

		System.out.println("-------------4の解答-------------");

		System.out.println(byteValue + shortValue + intValue + longValue); // 11110
		System.out.println(byteValue + (int) doubleValue); // 20
		System.out.println(charValue + " " + stringValue + " " + booleanValue); // a ハロー true
		System.out.println((int) (byteValue + shortValue + intValue + longValue + floatValue + doubleValue)); // 11130
		System.out.println(byteValue * shortValue * intValue * longValue); // 10000000000
		System.out.println(doubleValue / shortValue); // 0.105
		System.out.println(byteValue - shortValue); // -90

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
		
		age = age + age;
		height = height + height;
		weight = weight + weight;
		
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
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
