import java.util.Scanner;
class Test
{
	public static void main(String args[])
{
	Scanner sc = new  Scanner(System.in);
	System.out.println("Enter The line");
	int n=sc.nextInt();
	int i=1;
	int sum=1;
	while(i<=n)
{
	sum=sum*i;
	i++;
}
	System.out.println(sum);
}
}
	
