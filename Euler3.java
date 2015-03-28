/* The prime factors of 13195 are 5, 7, 13 and 29.
	What is the largest prime factor of the number 600851475143 ?
	
	Credit for optimal algorithm: 
	http://math.stackexchange.com/questions/389675/largest-prime-factor-of-600851475143
*/

import java.io.*;
public class Euler3
{
  public static void main(String []args)
  {
	long n = 600851475143L;
	int flag = 0;
	System.out.println(n/2);
	int b = 2;
	int c = 0;
	for (long i = 2; n != 1; i++)
	{
		if (n%b == 0)
		{
			n = n/b;
			if (b>c)
			 c = b;
			b = 2;
			continue;
		}
		else
		{
			while(n%b != 0)
				b = b+1;
			n = n/b;
			if (b>c)
			 c = b;
			b = 2;
			continue;
		}
	}
	System.out.println(c);
	}
}
