import java.io.*;
class Test
{
	public static void main(String args[]) throws Exception
	{
		File ob = new File("Pattern.txt");
		FileOutputStream obj = new FileOutputStream(ob);
		for(int i=1;i<6;i++)
		{
			for(int j=1;j<=i;j++)
			{
				obj.write(i+48); //42 Ascii value Star
				obj.write(32); // Space Ascii value 
				
				// s = '*'+"\t";
				 // byte arr[] = s.getBytes();
				// ob.write(arr);
				// ob.flush();
	   		// }
	  		// s = "\n";	
			// byte arr[] = s.getBytes();
			// ob.write(arr);
			// ob.flush();	
				
			}
				obj.write(10); // New Line Ascii Value
				
				
				
		}
		obj.flush();
		obj.close;
	}
}