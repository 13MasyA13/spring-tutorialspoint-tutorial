package com.tutorialspoint.xml;

import org.aspectj.lang.ProceedingJoinPoint;

public class Logging {
	   /** 
	    * This is the method which I would like to execute
	    * around a selected method execution.
	    */
	   public String aroundAdvice(ProceedingJoinPoint jp) throws Throwable{
	      System.out.println("Around advice");
	      Object[] args = jp.getArgs();
	      if(args.length>0){
	         System.out.print("Arguments passed: " );
	         for (int i = 0; i < args.length; i++) {
	            System.out.print("arg "+(i+1)+": "+args[i]);
	         }
	      }

	      Object result = jp.proceed(args);
	      System.out.println("Returning " + result);
	      return result.toString();
	   } 
}
