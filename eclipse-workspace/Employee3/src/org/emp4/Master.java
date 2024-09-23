package org.emp4;

import org.emp3.Employee;

public class Master extends Company{
	private void masterId() {
		System.out.println("master id is 5566");

	}
	private void masterName()  {
		System.out.println("my master name is zoho");

	}
	private static void main(String[] args) {
		Master a = new Master();
		a.masterId();
	    a.masterName();
	   
		
	}
	

}
