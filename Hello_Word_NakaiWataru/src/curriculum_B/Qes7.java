package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] subject = { "英語", "数学", "理科", "社会" };
		System.out.print("生徒の人数を入力してください(2以上) ： ");
		int input = Integer.parseInt(scanner.nextLine());

		int[][] scores = new int[input][subject.length];

		//入力回数分ループする
		for (int i = 0; i < input; i++) {

			for (int j = 0; j < subject.length; j++) {
				System.out.print((i + 1) + "人目の" + subject[j] + "点数を入力してください ： ");
				scores[i][j] = Integer.parseInt(scanner.nextLine());
			}
		}
		/*
		 * n人目の平均点
		 */
		for (int i = 0; i < input; i++) {
			double sum = 0;
			for (int j = 0; j < subject.length; j++) {
				sum += scores[i][j];
			}
			double average = sum / subject.length;
			System.out.printf("%d人目の平均は%.2f点です。\n", (i + 1), average);
		}
		/*
		 * 科目ごとの平均
		 */
		for (int j = 0; j < subject.length; j++) {
			double sum = 0;
			for (int i = 0; i < input; i++) {
				sum += scores[i][j];
			}
			double average = sum / input;
			System.out.printf("%sの平均は%.2f点です。\n", subject[j], average);
		}
		//全体の科目平均
		double totalSum = 0;
		for (int i = 0; i < input; i++) {
			for (int j = 0; j < subject.length; j++) {
				totalSum += scores[i][j];
			}
		}
		double totalAverage = totalSum / (input * subject.length);
		System.out.printf("全体の平均点は %.2f 点です。\n", totalAverage);
	}

}
