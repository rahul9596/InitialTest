package com.test;

public class Calculator 

{
	int a1;
	int a2;
	int sum;
	int sub;
	int multiply;
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
 
	public static void main(String[] args)
	{
		
        Calculator calc = new Calculator();
        calc.a1=6;
        calc.a2=3;
        
        calc.add();
        calc.sub();
        calc.multiply();
        calc.divide();
        
        System.out.println( "The sum of a1 and a2:" +calc.sum);
        System.out.println(  calc.sub);
        System.out.println(  calc.multiply);
        System.out.println(  calc.div);
        
	
	
	}

}
