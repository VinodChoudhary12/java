import java.util.Scanner;
class Test
{
    public static void main(String[]args)                                  
    { 
	int a[]=new int[10];
	int n,i,j,temp=0,min=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the element of Array");
	n=sc.nextInt();
	System.out.println("\tthe element of Array is");
	
	for(i=0,j=1;i<n;i++,j++)
	{
	    System.out.print("Element "+j+" : ");
	    a[i]=sc.nextInt();
	}
	System.out.println("\tThe Array is");
	for(i=0;i<n;i++)
	{
	    System.out.println("\ta["+i+"]="+a[i]);
	}
	
