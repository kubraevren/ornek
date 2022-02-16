package deneme1;

public class denemecalismasi {

	public static void main(String[] args) {
		// kalýn sesliler : a, ý, o, u
		// ince sesliler : e , i, ö , ü

		char harf = 'u';
		boolean kalin = true;
		char[] kalinlar = { 'a', 'ý', 'o', 'u' };
		char[] inceler = { 'e', 'i', 'ö', 'ü' };

		for (char myList : kalinlar) {
			if (harf == myList) {
				kalin = true;
			}
		}
		for (char myList2 : inceler) {
			if (harf == myList2) {
				kalin = false;
			}
		}
		if (kalin)
			System.out.println("kalýn seslidir");
		else {
			System.out.println("ince seslidir.");
		}

	}
}