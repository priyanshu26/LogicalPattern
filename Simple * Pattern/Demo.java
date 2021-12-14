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
		for (int i=1;i<=u-1;i++)
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

		// bottom star
		for (int i=u;i>=1;i--)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
			for (int k=0;k<=(l-i);k++)
			{
				System.out.print("  ");
			}
		}
	}
}
