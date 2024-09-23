//package org.class1;

//public class New1 {
	//private void empData(String name,int a) {
	//	System.out.println("emp name is:"+"/n"+ "emp age is:"+a);
	
	//}
	//private void empData(int age,String n) {
	//	System.out.println("emp age is:"+age);
		
		
	//}
//	public static void main(String[] args) {
		//New1 a = new New1();
		//a.empData("sri",15);
	//	a.empData(15,"n"); 
		//	}

//}
package org.class1;

public class New1 {
	private void empName(String name) {
		System.out.println("emp name is:"+name);
		this.empName(10);
		this.empName('m');	
	
	}
	private void empName(int age) {
	System.out.println("emp age is:"+age);
		
		
	}
	private void age(char a) {
		System.out.println("emp age is:"+a);
		
	}
	public static void main(String[] args) {
		New1 a = new New1();
		a.empName("Sivan");
		a.empName("Krish");
		
	}
}   
