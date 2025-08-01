package process_27;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("入力してください：");
		String input = scanner.nextLine();

		String[] animals = input.split(",");

		Map<String, String> scientificNames = new HashMap<>();

		scientificNames.put("ライオン", "パンテラ レオ");
		scientificNames.put("ゾウ", "ロキソドンタ・サイクロティス");
		scientificNames.put("パンダ", "アイルロポダ・メラノレウカ");
		scientificNames.put("チンパンジー", "パン・トゥログロディテス");
		scientificNames.put("シマウマ", "チャップマンシマウマ");
		scientificNames.put("インコ", "不明");

		for (String animal : animals) {
			String[] parts = animal.split(":");
			String name = parts[0];
			double height = Double.parseDouble(parts[1]);
			int speed = Integer.parseInt(parts[2]);

			Animal a = new Animal(name, height, speed, scientificNames.getOrDefault(name, ""));

			printAnimal(a);
		}

	}

	private static void printAnimal(Animal animal) {
		System.out.println("動物名：" + animal.getName());
		System.out.println("体長：" + animal.getHeight() + "m");
		System.out.println("速度：" + animal.getSpeed() + "km/h");
		System.out.println("学名：" + animal.getScientificName());
		System.out.println();
	}

}
