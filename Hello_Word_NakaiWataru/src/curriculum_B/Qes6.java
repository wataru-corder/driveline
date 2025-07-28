package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {
	public static void main(String[] args) {
		Random rand = new Random();

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();

		String[] items = input.split("[、]+");

		for (String name : items) {
			int stock = rand.nextInt(12);
			switch (name) {
			case "パソコン":
				System.out.println("パソコンの残り台数は" + stock + "台です");
				System.out.println();
				break;
			case "冷蔵庫":
				System.out.println("冷蔵庫の残り台数は" + stock + "台です");
				System.out.println();
				break;
			case "扇風機":
				System.out.println("扇風機の残り台数は" + stock + "台です");
				System.out.println();
				break;
			case "洗濯機":
				System.out.println("洗濯機の残り台数は" + stock + "台です");
				System.out.println();
				break;
			case "加湿器":
				System.out.println("加湿器の残り台数は" + stock + "台です");
				System.out.println();
				break;
			case "テレビ":
				System.out.println("テレビの残り台数は" + stock + "台です");
				System.out.println();
				break;
			case "ディスプレイ":
				System.out.println("ディスプレイの残り台数は" + stock + "台です");
				System.out.println();
				break;
			default:
				System.out.println("『 " + name + " 』" + "は指定の商品ではありません");
			}
		}

	}
}
