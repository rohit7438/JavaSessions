package practiceJava;

public class ErrorVerification {

	int arry[]={2,9,4};
	int max = arry[0];
		public void sort(){

			for(int i = 0; i <=arry.length ; i++)
					{
					for(int j = 1; j <= arry.length-1; j++)
						{
if (max < arry[j]) {
	max = arry[i];
}
								
						}
					}

			System.out.println(max);
				   }
	
		public static void main(String[]args) {
			ErrorVerification obj = new ErrorVerification();
			obj.sort(); 
		}
		
		
		
}
