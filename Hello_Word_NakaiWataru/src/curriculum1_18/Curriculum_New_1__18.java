package curriculum1_18;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Curriculum_New_1__18 {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void printString(String val1, int val2) {
		System.out.println(val1 + " " + val2);
	}

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static void multiply(int val1, int val2) {
		System.out.println(val1 * val2);
	}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void printNumbers(int[] nums) {
		for (int num : nums) {
			System.out.print(num + ",");
		}
		System.out.println();//改行
	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void multiply(double val1, double val2) {
		System.out.println(val1 + val2);
	}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	public static List<Integer> randomNumbers(int num) {
		Random random = new Random();
		List<Integer> lists = new ArrayList<>();
		for (int i = 0; i < num; i++) {
			int rand = random.nextInt(100) + 1;
			lists.add(rand);
		}
		for (int list : lists) {
			System.out.print(list + ",");
		}
		System.out.println();//改行
		return lists;
	}

	 // Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。

	static double average;
	public static void printAverage(List<Integer> nums) {
		double sum = 0;
		int count = 0;
		//sumに合計値を加算していってnumの回数で割る
		for (int num : nums) {
			sum += num;
			++count;
		}
		average = sum / count;
		System.out.println(average);
	}
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	
	public static void isValueOver50(double average) {
			boolean result = average >= 50;
			System.out.print(result);
	}

	public static void main(String[] args) {
		//Q1
		printString("Hello JavaSE", 11);
		//Q2
		multiply(3, 2);
		//Q3
		int[] nums = { 2, 4, 6, 1 };
		printNumbers(nums);
		//Q4
		multiply(4, 2);
		//Q5
		randomNumbers(10);
		//Q6
		List<Integer> arrayNumber = randomNumbers(10);
		printAverage(arrayNumber);
		//Q7
		isValueOver50(average);
	}

}
