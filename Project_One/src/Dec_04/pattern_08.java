package Dec_04;

public class pattern_08 {
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=5; i<=n;i--)
		{
			int x=n-i;
		for(int j=1;j<=x;j++)
		{
			System.out.print(" ");
		}
		for(int k=x;k<n;k++)
		{
			System.out.print("* ");
		}
		System.out.println();
		}
	}
}
