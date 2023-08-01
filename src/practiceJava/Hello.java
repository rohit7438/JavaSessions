

package practiceJava;
import java.util.*;

 public class Hello {

	 public void myMethod(){
		 
		 String  myarry[] = new String[2];
		 ArrayList<String> arry = new ArrayList<>();

		 Scanner obj = new Scanner(System.in);
		 System.out.println("Enter number");
		 int a = obj.nextInt();

		 if(a%2 == 0){
		 System.out.println("Number is even");
		 }
		 else{
		 System.out.println("Number is odd");
		 }

	 }

		 public static void main(String[] args){
			 Hello obj = new Hello();
		 obj.myMethod();
		 }

}
