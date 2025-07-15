package solution;

import java.util.Scanner;

public class kelimeCounter {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("string giriniz : ");
		String s = input.nextLine();
		s = s.replaceAll("[\\p{Punct}&&[^']]", "");
		s = s.trim();

		String[] words = s.split("['\\s\\;]");
		System.out.println(words.length);

		for (int counter = 0; counter < words.length; counter++) {
			System.out.println(words[counter]);
		}

	}
}