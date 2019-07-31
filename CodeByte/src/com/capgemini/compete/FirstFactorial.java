package com.capgemini.compete;

import java.util.Scanner;

public class FirstFactorial {

	public static int FirstFactorial(int num) { 
		  int factorial = 1;
	   for(int i = num; i >=1; i--) {
		   factorial *= i;
	   }
	       
	    return factorial;
	    
	  } 
	  
	  public static void main (String[] args) {  
	    // keep this function call here     
	    Scanner s = new Scanner(System.in);
	    System.out.print(FirstFactorial(Integer.parseInt(s.nextLine()))); 
	    s.close();
	  }   

}
