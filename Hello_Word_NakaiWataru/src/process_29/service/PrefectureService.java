package process_29.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import process_29.model.Prefecture;

public class PrefectureService {

	private static final List<Prefecture> PREFECTURE = Arrays.asList(
			new Prefecture("北海道", "札幌市", 83424),
			new Prefecture("青森", "青森市", 9646),
			new Prefecture("岩手県", "盛岡市", 15275),
			new Prefecture("宮城県", "仙台市", 7282),
			new Prefecture("秋田県", "秋田市", 11638),
			new Prefecture("山形県", "山形市", 9323),
			new Prefecture("福島県", "福島市", 13784),
			new Prefecture("茨城県", "水戸市", 6097),
			new Prefecture("栃木県", "宇都宮市", 6408),
			new Prefecture("群馬県", "前橋市", 6362),
			new Prefecture("埼玉県", "さいたま市", 3798));

	public static void run() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("番号をカンマ区切りで入力してください（例: 8,5,9）：");
		List<Integer> nums = parseInputToInteger(scanner.nextLine());

		System.out.print("昇順 or 降順 を入力して下さい：");
		String sortOrder = scanner.nextLine().trim();

		sortNumbers(nums, sortOrder);

		List<Prefecture> sortList = sortPrefecture(nums, PREFECTURE);
		printPrefectures(sortList);
	}

	//入力された数字をInteger型に変換
	private static List<Integer> parseInputToInteger(String input) {
		List<Integer> result = new ArrayList<>();
		for (String val : input.split(",")) {
			try {
				result.add(Integer.parseInt(val.trim()));
			} catch (NumberFormatException e) {
				System.out.println("無効な入力です：" + val);
			}
		}
		return result;
	}

	//入力された数字の配列を昇順または降順で並び替える
	private static void sortNumbers(List<Integer> nums, String order) {

		switch (order) {
		case "昇順":
			Collections.sort(nums);
			break;
		case "降順":
			Collections.sort(nums, Collections.reverseOrder());
			break;
		default:
			System.out.println("指定が不正です: " + order);
		}
	}

	//都道府県リストを昇順または降順で並び替えて取り出す
	public static List<Prefecture> sortPrefecture(List<Integer> indices, List<Prefecture> prefecture) {
		List<Prefecture> sorted = new ArrayList<>();
		for (int index : indices) {
			if (index >= 0 && index < prefecture.size()) {
				sorted.add(prefecture.get(index));
			} else {
				System.out.println("無効な番号: " + index);
			}
		}
		return sorted;
	}

	//配列を出力
	private static void printPrefectures(List<Prefecture> prefectures) {
		for (Prefecture p : prefectures) {
			System.out.println(p);

		}
	}
}
