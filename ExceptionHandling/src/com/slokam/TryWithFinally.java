package com.slokam;

public class TryWithFinally
{
	
	void m1()
	{
		System.out.println("TryWithFinally m1() method");
	}
	
	public static void main(String[] args)
	{
		try
		{
			System.out.println(10/0);
		}
		
//		catch(NullPointerException e)
//		{	
//			System.out.println("Catch block entered");
//			System.out.println(e);
//			System.out.println("Catch block exited");
//			
//			System.out.println(10/0);
//		}
		
		finally
		{
			System.out.println("Finally block executed");
			System.out.println("---------------------");
			for(int i=1; i<=5; i++)
			{
				System.out.print(i+" ");
			}
			System.out.println("\n---------------------");
			
			TryWithFinally t = new TryWithFinally();
			t.m1();
		}

	}

}
