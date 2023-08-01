package practiceJava;

public class CountNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="ewf50cZecv sA2dgdBhrf";
		
		
		System.out.println(str);
		for (int i = 0; i < str.length(); i++) {
			 
		
			
			if (str.charAt(i) <= '0' || str.charAt(i) <= '9') {
				System.out.println(str.charAt(i)) ;
			} 
		}

	}

}
