import java.util.Scanner;
class NmarksheetArray
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		int i;
		System.out.println("enter how many marksheet you have: ");
		int no=sc.nextInt();
		int ro[]=new int[no];
		
		
		for(i=0;i<no;)
		{	
			sc.nextLine();
			System.out.println("enter name");
			String name=sc.nextLine();
			System.out.println("enter roll");
			ro[i]=sc.nextInt();
			sc.nextLine();
			System.out.println("enter Fname");
			String Fn=sc.nextLine();
			System.out.println("enter Mname");
			String Mn=sc.nextLine();
			System.out.println("enter course");
			String co=sc.nextLine();
			System.out.println("enter branch");
			String bran=sc.nextLine();
			System.out.println("enter year");
			String yr=sc.nextLine();
			System.out.println("enter semester");
			String sem=sc.nextLine();
			boolean y=false;
			for(int j=0;j<i;j++)
			{
				if(ro[i]==ro[j])
				{	y=true;	}
			}
			if (y==true)
			{	
				System.out.println("Roll no. already Exist ");
				continue;
			}
			else
			{
				System.out.println("enter physics marks");
				int p=sc.nextInt();
				System.out.println("enter chemistry marks");
				int c=sc.nextInt();
				System.out.println("enter maths marks");
				int m=sc.nextInt();
				System.out.println("enter english marks");
				int e=sc.nextInt();
				System.out.println("enter hindi marks");
				int h=sc.nextInt();
				
				int total=p+c+m+h+e;
				float per=(total)/5f;
				boolean x=false;
				
				System.out.println("\n\n\t\t\t\t\t  RGPV-BHOPAL\n\n\n");
				System.out.println("\tStudent's Personal Info -->\n");
				System.out.println("\t Student Name  :"    +name +    "\t\t\t\t\t\t Course :"+co);
				System.out.println("\t Roll Number   :"    +ro   +    "\t\t\t\t\t\t Branch :"+bran);
				System.out.println("\t Father Name   :Mr." +Fn+    "\t\t\t\t\t\t Sem    :"+sem);
				System.out.println("\t Mother Name   :Mrs."+Mn+    "\t\t\t\t\t\t Year   :"+yr);
				   
				System.out.println("\t SubCode     SubName     MaxMarks   MinMarks    ObtMarks\n");
				System.out.println("\t CSE-501     Physics       100         33         "+p);
				System.out.println("\t CSE-502     Chemistry     100         33         "+c);
				System.out.println("\t CSE-503     Maths         100         33         "+m);
				System.out.println("\t CSE-504     Hindi         100         33         "+h);
				System.out.println("\t CSE-505     English       100         33         "+e);
					
				   
				System.out.println("\t Precentage  :"+per);
				System.out.println("\t Grand Total :"+total);
				if(p<0||c<0||m<0||e<0||h<0||p>100||c>100||m>100||e>100||h>100)
				{
					System.out.println("Enter valid no.  ")
				}
				else if(p<33&&c<33&&m<33&&e<33&&h<33)
				{
					System.out.println("Fail in all subject");
				}
				else if(p<33&&c<33&&m<33&&e<33||p<33&&c<33&&m<33&&h<33||p<33&&c<33&&h<33&&e<33||p<33&&e<33&&h<33&&m<33||m<33&&e<33&&h<33&&c<33||c<33&&m<33&&e<33&&h<33)
				{
					System.out.println("Fail in 4 subject");
				}
				else if(p<33||c<33||m<33&&p<33||c<33||e<33&&p<33||c<33||h<33&&csme&&cmh&&meh&&mhp&&mep&&ehp)
					x=true;
									
				if(x==true)
				{	if(per>=60)
						System.out.println("\t\t\t\tPassed by First Division");
					else if(per>=45)
						System.out.println("\t\t\t\tPassed by Second Division");
					else if(per>=33)
						System.out.println("\t\t\t\tPassed by Third Division");
				}
				else
				{	System.out.println("......Failed......");}			
				i++;
			}
		}
	}
}
			