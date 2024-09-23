   package org.poly;

public class NweMethod {
	private void empname(String name) {
		System.out.println("emp name is:"+name);
		
	}
	private void empage(int age) {
		System.out.println("my age is:"+age);
		
	}
	public static void main(String[] args) {
		NweMethod a = new NweMethod();
		a.empname("sri");
		a.empage(23);
		
		
		
		
	}
}
