package process_31;

public class Main {

	public static void main(String[] args) {
		
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		person1.print();
		System.out.println("合計" + person1.count +"人です");
		
		Person person2 = new Person("山田花子", 22, 1.5, 40);
		person2.print();
		person2.printCount();
	}

}
