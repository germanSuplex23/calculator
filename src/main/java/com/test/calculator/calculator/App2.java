package com.test.calculator.calculator;

public class App2 {

	 public static void main( String[] args ){
		 
		 String lot = "";
		 
		 if(!lot.equalsIgnoreCase("Kib279")){
			 System.out.println("here"); 
		 }
		 else {
			 System.out.println("here2"); 
		 }
		 
		 if (!checkNull(returnNull(lot))) {
			 System.out.println("here3"); 
	        }
	 	}
	 
	    public static boolean checkNull(Object o) {

	        return o == null;

	    }
	    
	    public static String returnNull(String str) {

	        if (str == null) {
	            return str;
	        }

	        if ("".equals(str.trim())) {
	            return null;
	        }
	        return str.trim();

	    }
	    
	    
	
	
}
