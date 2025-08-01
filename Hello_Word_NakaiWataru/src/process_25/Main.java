package process_25;

import java.util.Random;
import java.util.Scanner;

import execution_25.Hero;

public class Main {

	public static void main(String[] args) {
		
		System.out.print("名前を入力してください：");

		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		Random rand = new Random();
		int hp = rand.nextInt(1000) + 1;
		int mp = rand.nextInt(1000) + 1;
		int attack = rand.nextInt(1000) + 1;
		int speed = rand.nextInt(1000) + 1;
		int defence = rand.nextInt(1000) + 1;
		
		Hero h = new Hero();
		
		h.setName(name);
		h.setHp(hp);
		h.setMp(mp);
		h.setAttack(attack);
		h.setSpeed(speed);
		h.setDefense(defence);
		
		System.out.println("こんにちは 「 " + h.getName()  +  " 」さん");
		System.out.println("ステータス");
		System.out.println("HP：" + h.getHp());
		System.out.println("MP：" + h.getMp());
		System.out.println("攻撃力：" + h.getAttack());
		System.out.println("素早さ：" + h.getSpeed());
		System.out.println("防御力：" + h.getDefense());
	}

}
