package deneme1;

public class methods {

	public static void main(String[] args) {
		System.out.println("sayýlarýn ortalamasý: " + Ortalama(20,80,50,550));

	}

	public static double Ortalama(int a,int b, int c,int y){
	
   
		double ort = (a+b+c+y)/4.0;
		return ort;
	}
}
