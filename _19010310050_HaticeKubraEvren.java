import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _19010310050_HaticeKubraEvren {

	public static void main(String[] args) throws FileNotFoundException {

		File metin = new File("boole.txt");
		Scanner input = new Scanner(metin);

		String parcalanmisIfade = fazlalikKaldir(input);

		System.out.println(parcalanmisIfade);

		int degiskenSayisi = kacDegiskenVar(parcalanmisIfade);

		System.out.println(degiskenSayisi);

		String degiskenler = degiskenlerNeler(parcalanmisIfade);

		System.out.println(degiskenler);

		dogrulukTablosuOlusturma(degiskenSayisi, degiskenler);

	}

	public static String fazlalikKaldir(Scanner input) {
		String parcalanmisIfade = null;

		while (input.hasNextLine()) {
			String i = input.nextLine();
			System.out.println(i);
			parcalanmisIfade = i.replaceAll("[^a-zA-Z]", "");
			parcalanmisIfade = parcalanmisIfade.substring(1, parcalanmisIfade.length());
		}
		return parcalanmisIfade;
	}

	public static int kacDegiskenVar(String parcalanmisIfade) {

		Set<Character> set = new HashSet<>();

		for (char ch : parcalanmisIfade.toCharArray()) {
			set.add(ch);
		}
		return set.size();
	}

	public static String degiskenlerNeler(String parcalanmisIfade) {

		Set<Character> set = new HashSet<>();

		for (char ch : parcalanmisIfade.toCharArray()) {
			set.add(ch);
		}
		StringBuilder sadeceDegiskenAdi = new StringBuilder();
		for (Character ch : set) {
			sadeceDegiskenAdi.append(ch).append(" ");
		}
		String degiskenler = sadeceDegiskenAdi.toString().trim();

		return degiskenler;
	}

	public static void dogrulukTablosuOlusturma(int degiskenSayisi, String degiskenler) {

		for (int i = 0; i < Math.pow(2, degiskenSayisi); i++) {
			String binary = Integer.toBinaryString(i);
			while (binary.length() < degiskenSayisi) {
				binary = "0" + binary;
			}
			StringBuilder yeniBinary = new StringBuilder();
			for (int k = 0; k < binary.length(); k++) {
				yeniBinary.append(binary.charAt(k)).append(" ");
			}
			System.out.println(yeniBinary.toString().trim());
		}
	}

}