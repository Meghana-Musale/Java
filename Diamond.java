
public class Diamond {

	public static void main(String[] args) {
		int n=5, i, j, k;
		for(i=1; i<=n; i++)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1; k<=i; k++)
			{
				System.out.print(" *");
			}
			System.out.println();
			
		}
		for(i=1; i<=n; i++)
		{
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(k=4; k>=i-1; k--)
			{
				System.out.print(" *");
			}
			System.out.println();
			
			
		}
		
		
	}

}