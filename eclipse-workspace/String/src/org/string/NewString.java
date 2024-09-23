package org.string;

public class NewString {
	public static void main(String[] args) {
		String a="sri";
		int length = a.length();
		System.out.println(length);
		
		//CharAt
		char charAt=a.charAt(1);
		System.out.println(charAt);
		
		
		//indexOf
		int indexOf =a.indexOf('r');
		System.out.println(indexOf);
		
		//lastindexOf
		int lastindexOf=a.indexOf('i');
		System.out.println(lastindexOf);
		
		//boolean
		boolean empty=a.isEmpty();
		System.out.println(empty);
		
		//boolen contains
		boolean contains=a.contains("g");
		System.out.println(contains);
		
		//trim
		
		//String trim=s.trim();
		//System.out.println(trim);
		
		
		boolean startsWith=a.startsWith("sr");
		System.out.println(startsWith);
		
		
		//end with
		
		boolean endsWith=a.endsWith("de");
		System.out.println(endsWith);
		
		//uppercase
		String upperCase=a.toUpperCase();
		System.out.println(upperCase);
		
		//lower case
		String lowerCase=a.toLowerCase();
		System.out.println(lowerCase);
		
		//endWith2
		boolean endsWith1=a.endsWith("ri");
		System.out.println(endsWith1);
		String b="SRI";
		String c="sri";
		
		//equals
		boolean equalas=b.equals(c);
		System.out.println(equalas);
		
		//equalCase
		boolean equalsIgnoreCase=b.equalsIgnoreCase(c);
		System.out.println(equalsIgnoreCase);
		
		String replace=b.replace("sr", "si");
		System.out.println(replace);
		
		String replaceAll=c.replaceAll("sri","siva");
		System.out.println(replaceAll);
		
		//String 
		String substring=a.substring(3);
		System.out.println(substring);
		
		//
		String substring2=a.substring(3,3);
		System.out.println(substring2);
		
		int compareTO=a.compareTo(c);
		System.out.println(compareTO);
		
		
		
		
                		
		
		
		
	
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
				
		
		
		
		
		
	}

}
