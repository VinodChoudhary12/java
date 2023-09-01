//!1/2-!2/3+!3/4=1.3333333333333335
import java.io.*;
import java.util.Scanner;
class Test 
{
   	public static void main(String args[]) throws IOException, FileNotFoundException 
	{
        	File f = new File("Power.text");
        	FileOutputStream ob  = new FileOutputStream(f);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter anu number");
			int n = sc.nextInt();
			int i = 1;
			double p = 1;
			double a = 0;
			double sum = 0;
		  
			while(i<=n)
			{
					p=p*i;
					a=p/(i+1);
					if(i%2==0)
					{
						sum=sum-a;
						if(i>1)
						ob.write(45);
					}
					else
					{
						sum=sum+a;
						if(i>1)
						ob.write(43);
					}
				ob.write(33);
				ob.write(48+i);
				ob.write(47);
				ob.write(49+i);
					i++;
			}
			String s = Double.toString(sum);
			byte arr[] = s.getBytes();
			ob.write(61);
			ob.write(arr);
   
        }
}