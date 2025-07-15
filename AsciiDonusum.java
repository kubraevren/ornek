package calismalar;

import java.util.Scanner;

public class AsciiDonusum {

	public static String metniAsciiKodunaDonustur(String metin) {

		char[] karakterDizisi = metin.toCharArray();
		String ascii = "";
		for (char karakter : karakterDizisi) {
			ascii += (int) karakter + " ";
		}
		ascii = ascii.trim();
		return ascii;
	}

	public static String asciiKodunuMetneDonustur(String metin) {

		String[] dizi = metin.split(" ");
		String birlestirmeMetni  = "";
		for (String karakter : dizi) {
			int sayisalDeger = Integer.parseInt(karakter);
			char karakterler = (char) sayisalDeger;
			birlestirmeMetni+= karakterler;

		}

		return birlestirmeMetni ;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Şifre: ");
		String sifre = in.nextLine();
		
		System.out.println();

		String ascii = metniAsciiKodunaDonustur(sifre);

		System.out.println(sifre + " kelimesinin ascii karşılığı : " + ascii);
		
		System.out.println();
		System.out.println();


		String kelime = asciiKodunuMetneDonustur(ascii);

		System.out.println(ascii + " ascii kodunun metin karşılığı : " + kelime);

	}

}
