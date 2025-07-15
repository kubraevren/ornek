package calismalar;

	public class cikmisFinalCiktiSorusu2 {
		
		
	    public static void main(String[] args) {
	        int a = 3;
	        int b = 5;
	        cikmisFinalCiktiSorusu1 home = new cikmisFinalCiktiSorusu1(52, 85);

	        mystery(a, b, home);
	        System.out.println(a + " " + b + " " + home);

	       home.lng+=b;
	       a=a*3;
	       
	        mystery(a, b, home);
	        System.out.println(a + " " + b + " " + home);
	    }
	    
	    
	    public static void mystery(int a, int b, cikmisFinalCiktiSorusu1 loc) {
	        loc.lat = loc.lng + 15;
	        b--;
	        System.out.println(a + " " + b + " " + loc);
	    }
	    }


