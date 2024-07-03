package com.slokam;

public class NormalTryCatchBlock
{

	public static void main(String[] args)
	{	
		System.out.println("Start");
		System.out.println(10/2);
		
		try
		{
		    System.out.println(10/0);
		} 
		catch(Exception e)
		{	
			System.out.println("Catch1 block executed");
			e.printStackTrace();
			System.out.println("Exception1 object handled");
		}
		
		try
		{
		    System.out.println(10/0);
		} 
		catch(Exception e)
		{	
			System.out.println("Catch2 block executed");
			e.printStackTrace();
			System.out.println("Exception2 object handled");
		}		
		
		System.out.println("End");

	}

}
