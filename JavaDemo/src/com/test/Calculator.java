package com.test;

public class Calculator 

{
	int a1;
	int a2;
	int sum;
	int sub;
	int multiply;
	int any;
	float div;
	
   public void add( )
   {
	    
	    sum= a1+a2;    
	   
   }
   
   public void sub()
   
   {
	   sub=a1-a2;
   }
   
 public void multiply()
   
   {
	   multiply=a1*a2;
   }
 
 public void divide()
 
 {
	   div=a1/a2;
 }
 
 public void anonymous()
 {
	 any=(a1*a2)+a2;
 }
 
	public static void main(String[] args)
	{
		
        Calculator calc = new Calculator();
        calc.a1=7;
        calc.a2=3;
        
        calc.add();
        calc.sub();
        calc.multiply();
        calc.divide();
        calc.anonymous();
        
        System.out.println( "The Addition of a1 and a2:" +calc.sum);
        System.out.println( "The subtraction of a1 and a2:"  +calc.sub);
        System.out.println(  "The Multiplication of a1 and a2:" +calc.multiply);
        System.out.println(  "The Divison of a1 and a2:" +calc.div);
        System.out.println(  "The anonymous of a1 and a2:" +calc.any);
        
        
	
	
	}

}
