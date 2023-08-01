package practiceJava;

public class Conversion {

	public static void main(String[] args) {

		
		
		int a = 123;
	
		
		Integer i = a; // used wrapper class to convert
		
		
		
		String s = i.toString(); // converted into String
		
//		char c = 'd';
//		String g = "dgsdg";
//		char f[] = g.toCharArray();
		
		char h[] = s.toCharArray();
		
		for( char e : h) {
			System.out.println(e);
			
		}

	}

}
