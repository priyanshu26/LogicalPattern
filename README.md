## LogicalPattern
This repo. based on logical pattern like star(*) pattern number pyramid and so on. these Patterns are written on java language. It will help beginners who wants to learn logical Patterns.
```java

import java.util.Scanner;
class Demo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a value: ");
		int u = sc.nextInt();
		int l=u;
		//for upper star
		for (int i=1;i<=u;i++)
		{
			for (int k=(l-i-1);k>=0;k--)
			{
				System.out.print("  ");
			}
			for (int j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		}
	}
}
```
<img width="217" alt="DemoClasshalf" src="https://user-images.githubusercontent.com/79014731/146033697-6374001b-5c50-4e9b-91eb-cf21544fa7c6.png">
