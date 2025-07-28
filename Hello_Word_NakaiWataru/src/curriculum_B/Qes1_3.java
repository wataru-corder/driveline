package curriculum_B;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String userName = "";
		boolean isValidName = false;//入力が正常まで判定するフラグ

		while (!isValidName) {
			//ユーザー名を登録
			System.out.println("半角英数字のみで名前を入力してください");
			userName = scanner.nextLine();

			if (userName.length() == 0 || userName == null) {
				System.out.println("名前を入力してください");
			} else if (userName.length() > 10) {
				System.out.println("名前を10字以内にしてください");
			} else {
				System.out.println("ユーザー名「" + userName + "」を登録しました");
				isValidName = true;
			}
		}
		jankenLogic(userName);
		scanner.close();
	}

	public static void jankenLogic(String userName) {
		int[] hand = { 0, 1, 2 };//0=グー 1=チョキ 2=パー

		Random rand = new Random();

		List<String> handName = new ArrayList<>();
		handName.add("グー");
		handName.add("チョキ");
		handName.add("パー");

		int judge = 0;
		int count = 0;

		while (judge == 0) {
			++count;

			int user = rand.nextInt(hand.length);
			int com = rand.nextInt(hand.length);

			System.out.println(userName + "の手は" + handName.get(user));
			System.out.println("相手の手は" + handName.get(com));

			if (user == com) {
				System.out.println("DRAW あいこ もう一回しましょう！");
			} else if ((user - com + 3) % 3 == 2) {
				System.out.println("やるやん。");
				System.out.println("次は俺にリベンジさせて");
				judge = 1;
			} else {
				if (com == 0) {
					System.out.println("俺の勝ち！");
					System.out.println("負けは次につながるチャンスです！");
					System.out.println("ネバーギブアップ！");
				} else if (com == 1) {
					System.out.println("俺の勝ち！");
					System.out.println("たかがじゃんけん、そう思ってないですか？");
					System.out.println("それやったら次も、俺が勝ちますよ");
				} else {
					System.out.println("俺の勝ち！");
					System.out.println("なんで負けたか、明日まで考えといてください。");
					System.out.println("そしたら何かが見えてくるはずです");
				}
			}
		}
		System.out.println("勝つまでにかかった合計回数は" + count + "回です");
	}
}
