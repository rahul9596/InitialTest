package com.test;

public class Constrctr {

	int a=5;
	int b=6;
	
	public Constrctr( )
	{  
		
	} 
	
	Constrctr( int a1 , int b1)
	{  
		this.a=a1;
		this.b=b1;
	}
	public static void main(String[] args) 
	
	{
		Constrctr c =new Constrctr(5,6);
		System.out.println("1st number is :" +c.a);
		System.out.println("2nd numbers is :" +c.b);

	}

}
