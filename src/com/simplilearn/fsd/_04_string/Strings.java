package com.simplilearn.fsd._04_string;

public class Strings {

	String str = new String("Hello");
	
	/*
	 * Strings are immutable - cannot change
	 */
	public static void main(String[] args) {
		
		
		Strings obj = new Strings();

		int a = 4;
		
		String str1 = "Simplilearn loves Java";
		
		System.out.println(str1);
		
		System.out.println( str1.length() );
		
		String str2 = "Hello";
		
		String str3 = str2 + " " + str1;
		
		//System.out.println(str2 + " " + str1);

	    str3 = str2.concat(" ").concat(str1);
	    
	    System.out.println(str3);
	    
	    String str5 = "  Hello Java  ";
	    
	    System.out.println("-->" + str5.trim() + "<--");
	    
	    str5 = str5.trim();
	    
	    System.out.println("-->" + str5 + "<--");
	    
	    String str6 = "Hello";
	    //             01234

	    System.out.println(str6.charAt(3));

	    
	    System.out.println("Hello".contains("el"));
	    
	    String str7 = "HELLO";
	    
	    System.out.println(str6.equals(str7));
	    System.out.println(str6.equalsIgnoreCase(str7));
	    
	    String str8 = "I love Java";
	    //             01234567890
	    //System.out.println(str8.replace("a", "hello"));
	    System.out.println(str8.replace("a", "e"));
	    //str8 = str8.replace("a", "hello");
	    //System.out.println(str8);
	    
	    System.out.println(str8.substring(7));
	    System.out.println(str8.substring(7,9));
	    
	    StringBuffer strB = new StringBuffer("Hello");
	    
	    strB.append(" Java");
	    
	    System.out.println(strB);
	    
	    
	    
	    
	}

}
