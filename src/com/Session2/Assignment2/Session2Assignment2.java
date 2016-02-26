package com.Session2.Assignment2;

public class Session2Assignment2 {

	public static void main(String[] args) {
		
		/*
		 *  Generate prime numbers between 1 and 100 using for loop. A prime number (or a prime) is a
			natural number greater than 1 that has no positive divisors other than 1 and itself. A natural
			number greater than 1 that is not a prime number is called a composite number. Use for loop
			and break statement to achieve this task. 
		 * 
		 */
		
		for(int i=1; i<=100; i++)
		{
			int count =0; 
			for(int j=1; j<=100; j++)
			{
				if(i%j==0)
				{
					count ++;
				}
				if(count>3)
					break;
			}
			if(count<=3)
			{
				System.out.print(" "+i);
			}
				
		}
			
	}
}
