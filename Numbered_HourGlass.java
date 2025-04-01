package number_patterns;

import java.util.Scanner;

/*
1234321
 12321
  121
   1
  121
 12321
1234321
 */
public class Numbered_HourGlass 
{
	public static void main(String[] args) 
	{
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		for(int i=1;i<=n;i++)
		{
			int num = 1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<n;j++)
			{
				System.out.print(num++);
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print(num--);
			}
			System.out.println();
		}
		for(int i=2;i<=n;i++)
		{
			int num = 1;
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print(num++);
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(num--);
			}
			System.out.println();
		}
	}
}
