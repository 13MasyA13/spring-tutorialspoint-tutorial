package com.tutorialspoint.xml;

public class Logging {
	
	   /** 
	    * This is the method which I would like to execute
	    * when any method returns.
	    */
	   public void afterReturningAdvice(Object retVal){
	      System.out.println("Returning:" + retVal.toString() );
	   }
}
