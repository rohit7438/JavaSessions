package practiceJava;

import java.util.ArrayList;



public class ReplaceInArrayList {
	 int rollno;  
	  String name;  
	  int age;  
	ReplaceInArrayList(int rollno,String name,int age){  
		   this.rollno=rollno;  
		   this.name=name;  
		   this.age=age;  
		  }  

	public static void main(String[] args) {
	
		ReplaceInArrayList s1=new ReplaceInArrayList(101,"Sonoo",23); 	
	
		ArrayList<ReplaceInArrayList> obj = new ArrayList<ReplaceInArrayList>();
	

		obj.add(s1);

	
	
	}
}
		
	
	
