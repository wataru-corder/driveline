package execution_23;

import process_23.Animal;

public class Main {

	public static void main(String[] args) {

		Animal animal = new Animal("ライオン", 2.1, 80);

		System.out.println("動物名：" + animal.getName());
		System.out.println("体長：" + animal.getHeight() + "m");
		System.out.println("速度：" + animal.getSpped() + "km/h");

	}

}
