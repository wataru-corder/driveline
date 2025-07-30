package execution_22;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import process_22.Japanese;

public class Main {

	public static void main(String[] args) {
		
		LocalDateTime dateTime = LocalDateTime.of(2023,3,9,10,23,39);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		
		Japanese jp = new Japanese("日本","寿司","和食",dateTime);
		
		System.out.println("こんにちは！ここは" + jp.country + "です！");
		System.out.println("この" + jp.food + "はうまい");
		System.out.println(jp.food + "は" + jp.countryFood + "です");
		System.out.println("今の現在日時は" + jp.date.format(formatter) + "です");
			
	}

}
