
//WAP Fectoriyal Serices sum 2/1! - 3/2! + 4/3! - 5/4!  + 6/5! = 1.0083334
import java.util.Scanner;
class  Test
{
	public static void main(String[]args)                                  
	{
		int n,i=1;
		float sum=0,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		for(i=1;i<=y;i++)
		{
			fact*=i;
			if(i%2==0)
			{
				sum = sum - ((i+1)/fact);
				System.out.print(" -"+(i+1)+"!/"+i);
			}
			else
			{
				sum = sum + ((i+1)/fact);
				if(i>1)
					System.out.print(" + ");
				System.out.print((i+1)+"!/"+i);
			}
			
		}
		System.out.println(" = "+sum);
	}
}

