package com.slokam;

public class NestedTryCatchBlock
{

	public static void main(String[] args)
	{
		try
		{
		
		try
		{	
						
				try
				{	
					System.out.println("try 1 entered");
					String s1= null;
					System.out.println(s1.length());
					System.out.println("try 1 completed");
				} 
				catch (NullPointerException e)
				{
					System.out.println("Inner catch 1 block entered");
					e.printStackTrace();
					System.out.println(10/0);
					System.out.println("Inner catch 1 block completed");
				}
				
	
				try
				{
					System.out.println("try 2 entered");
					char[] Arr = new char[5];
					Arr[5] = '7';
					System.out.println("try 2 completed");
	
				} 
				catch (ArrayIndexOutOfBoundsException e)
				{	
					System.out.println("Inner catch block 2 entered");
					e.printStackTrace();
					System.out.println("Inner catch block 2 completed");
				}
				
				
				
				String s2= null;
				System.out.println(s2.length());
			
			
		} 
		catch (NullPointerException | ArithmeticException e)
		{	
			System.out.println("Main Catch block entered");
			e.printStackTrace();
			System.out.println("Main Catch block completed");
		}
		finally
		{
			System.out.println("Main finally block entered");
			
			System.out.println(10/0);
			
			System.out.println("Main finally block completed");

		
		}
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
