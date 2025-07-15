package calismalar;


public class cikmisFinalCiktiSorusuSonSoru {

	public static void main(String[] args) {

		baglantiliListeLinkedList list = new baglantiliListeLinkedList();
		
		

		list.add(1);
		list.add(1);
		list.add(0);
		
		System.out.println(list.toString());
		
		System.out.println(list.getDecimalValue());
		
		
		System.out.println("current != null");
		list.denemeee1();
		
		System.out.println();
		System.out.println();
		
		
		System.out.println("current.next != null");
		list.denemeee2();
		
		System.out.println();
		

		list.BSM104_Bahar2023_Problem3();
		
	}
	
	

}
