import java.util.Scanner;

class Marksheet
{
		private int Roll;
		private String Branch;
		private String MName;
		private String FName;
		private int Year;
		private int Sem;
		private int p ;
		private int c ;
		private int m ;
		private int h ;
		private int e ;
		private int n;
		private double total;
		private double per;
		private String Name;
		private String Course;
		
		public int checkYear(Scanner sc)
		{
			int Year = sc.nextInt();
			while(Year!=1 && Year!=2 && Year!=3 && Year!=4)
			{
				System.out.println(" Invalid Year...");
				System.out.print("\n Re-Enter Year             : ");
				Year = sc.nextInt();
			}
			return Year;
		}
		
		public int checkSem(Scanner sc,int Year)
		{
			int Sem = sc.nextInt();
			if(Year==1)
			{	
				while(Sem!=1 && Sem!=2)
			    {
				   System.out.println(" Invalid Semester...");
				   System.out.print("\n Re-Enter Semester         : ");
				   Sem = sc.nextInt();
			    }
			}
			
			else if(Year==2)
			{
				while(Sem!=3 && Sem!=4)
			    {
				   System.out.println(" Invalid Semester...");
				   System.out.print("\n Re-Enter Semester         : ");
				   Sem = sc.nextInt();
			    }
			}
			
			else if(Year==3)
			{
				while(Sem!=5 && Sem!=6)
			    {
				   System.out.println(" Invalid Semester...");
				   System.out.print("\n Re-Enter Semester         : ");
				   Sem = sc.nextInt();
			    }
			}
			
			else if(Year==4)
			{
				while(Sem!=7 && Sem!=8)
			    {
				   System.out.println(" Invalid Semester...");
				   System.out.print("\n Re-Enter Semester         : ");
				   Sem = sc.nextInt();
			    }
			}
			
			return Sem;
		}
		
		public int checkMarks(Scanner sc)
		{
			int marks = sc.nextInt();
			while(marks<0 || marks>100)
			{
				System.out.println(" Invalid Marks...");
				System.out.print(" Re-Enter the Marks of recent Subject : ");
				marks = sc.nextInt();
			}
			return marks;
		}
		
		public void searchByPer(int n,Marksheet a[],double p)
		{
		        Scanner sc = new Scanner(System.in);
		        boolean flag=false;
		    
		        for(int i=0;i<n;i++)
		        {
		            if(a[i].per==p)
		            {
		                a[i].printMarksheet();
		                flag=true;
		            }
		        }
		        
		        if(!flag)
		        {
		           System.out.println(" This Percentage does not Exist.");
		           System.out.print(" Enter Percentage : ");
		           p = sc.nextDouble();
		           this.searchByPer(n,a,p);
		        }
		}
		
		public void searchByRoll(int n,Marksheet a[],int roll)
		{
		        Scanner sc = new Scanner(System.in);
		        boolean flag=false;
		    
		        for(int i=0;i<n;i++)
		        {
		            if(a[i].Roll==roll)
		            {
		                a[i].printMarksheet();
		                flag=true;
		            }
		        }
		        
		        if(!flag)
		        {
		           System.out.println(" This Roll Number does not Exist.");
		           System.out.print(" Enter Roll Number : ");
		           roll = sc.nextInt();
		           this.searchByRoll(n,a,roll);
		        }
		}
		
		public void searchByName(int n,Marksheet a[],String name)
		{
		        Scanner sc = new Scanner(System.in);
		        boolean flag=false;
		    
		        for(int i=0;i<n;i++)
		        {
		            if(a[i].Name.equals(name))
		            {
		                a[i].printMarksheet();
		                flag=true;
		            }
		        }
		        
		        if(!flag)
		        {
		           System.out.println(" This Name does not Exist.");
		           System.out.print(" Enter Name : ");
		           name = sc.nextLine();
		           this.searchByName(n,a,name);
		        }
		}
		
		
		public void rollInput(int n,Marksheet a[],int x)
		{
				Scanner sc = new Scanner(System.in);
				boolean y = false;
					
					System.out.print("\n Enter Roll Number(Integer): ");
				         Roll =sc.nextInt();
				    if(Roll>0)
				    {
					for(int i=0;i<x;i++)
					{
					    if(a[i].Roll == this.Roll)
					    {
						   System.out.println(" Roll Number already Exist. ");
						   y=true;
					    }
					}
					if(y==true)
					{
						this.rollInput(n,a,x);
					}
			             }
			             else
			             {
			                 System.out.println(" This Roll Number is not Possible.");
			                 this.rollInput(n,a,x);
			             }
		}
		
	   public void getData(int n,Marksheet a[],int x,int j)
	   {
			    Scanner sc = new Scanner(System.in);
				
				System.out.println("----------------------------------------------------------------");
			    System.out.println("\n\n\t<-- Enter Details for Student "+j+" -->\n");
				System.out.print("\n Enter Student's Name      : ");
				Name =sc.nextLine();
				this.rollInput(n,a,x);
				System.out.print("\n Enter Father's Name       : Mr.");
				FName =sc.nextLine();
				System.out.print("\n Enter Mother's Name       : Mrs.");
				MName = sc.nextLine();
				System.out.print("\n Enter Course              : ");
				Course=sc.nextLine();
				System.out.print("\n Enter Branch              : ");
				Branch=sc.nextLine();
				System.out.print("\n Enter Year                : ");
				Year=checkYear(sc);
				System.out.print("\n Enter Semester            : ");
				Sem=checkSem(sc,Year);
				
					System.out.println("\n\n\t<-- Enter Marks Of Subjects -->\n");
					System.out.print("\n Physics   : ");
					p=checkMarks(sc);
					System.out.print("\n Chemistry : ");
					c=checkMarks(sc);
					System.out.print("\n Maths     : ");
					m=checkMarks(sc);
					System.out.print("\n Hindi     : ");
					h=checkMarks(sc);
					System.out.print("\n English   : ");
					e=checkMarks(sc);
				System.out.println("----------------------------------------------------------------");	
					
					total=(p+c+m+h+e);
				    per =(total/5);			
	   }

	public void printMarksheet()
	{
			Scanner sc = new Scanner(System.in);
				
			
   System.out.println("\n\n\t ___________________________________________________________________________________________________");
       System.out.println("\t|                                                                                                   ");
       System.out.println("\t|                                                                                                   ");
       System.out.println("\t|                                          RGPV - BHOPAL                                            ");
       System.out.println("\t|                                                                                                   ");
       System.out.println("\t|___________________________________________________________________________________________________");
       System.out.println("\t|                                                                                                   ");
       System.out.println("\t|                                     Student's Personal Info                                       ");
       System.out.println("\t|___________________________________________________________________________________________________");
       System.out.println("\t|                                                                                                   ");
       System.out.println("\t| Student Name  : "+Name +"                                                                         ");
       System.out.println("\t| Roll Number   : "+Roll +"                                                                         ");
       System.out.println("\t| Father Name   : Mr." +FName+"                                                                     ");
       System.out.println("\t| Mother Name   : Mrs."+MName+"                                                                     ");
       System.out.println("\t| Course        : "+Course+"                                                                        ");
       System.out.println("\t| Branch        : "+Branch+"\t                                                                      ");
       System.out.println("\t| Year          : "+Year+"\t                                                                        ");
       System.out.println("\t| Sem           : "+Sem+"\t                                                                         ");
       System.out.println("\t|___________________________________________________________________________________________________");
       System.out.println("\t|                                                                                                   ");
       System.out.println("\t|                                     Marks Gained By Student                                       ");
       System.out.println("\t|___________________________________________________________________________________________________");
       System.out.println("\t|                 |                 |                    |                     |                    ");
       System.out.println("\t|     SubCode     |     SubName     |      MaxMarks      |      MinMarks       |      ObtMarks      ");
       System.out.println("\t|_________________|_________________|____________________|_____________________|____________________");
       System.out.println("\t|                 |                 |                    |                     |                    ");
       System.out.println("\t|     CSE-501     |     Physics     |        100         |        33           |        "+p+"       ");
       System.out.println("\t|     CSE-502     |     Chemistry   |        100         |        33           |        "+c+"       ");
       System.out.println("\t|     CSE-503     |     Maths       |        100         |        33           |        "+m+"       ");
       System.out.println("\t|     CSE-504     |     Hindi       |        100         |        33           |        "+h+"       ");
       System.out.println("\t|     CSE-505     |     English     |        100         |        33           |        "+e+"       ");
       System.out.println("\t|_________________|_________________|____________________|_____________________|____________________");
       System.out.println("\t|                                                                                                   ");
       System.out.println("\t|                                    Student's Promotion Status                                     ");
       System.out.println("\t|___________________________________________________________________________________________________");
       System.out.println("\t|                                                                                                   ");
       System.out.println("\t| Precentage  :"+per+ " %                                                                           ");
       System.out.println("\t| Grand Total :"+total+"                                                                            ");
       System.out.println("\t|___________________________________________________________________________________________________");
       System.out.println("\t|                                                                                                   ");
       System.out.println("\t| Status With Subjects :                                                                            "); 
	    if(p<33 && c<33 && m<33 && h<33 && e<33)
          System.out.print("\t|\t\t\tFail in all Subjects.                                                       ");
       else if((p<33 && c<33 && m<33 && h<33 )||(p<33 && c<33 && h<33 && e<33)||(p<33 && m<33 && h<33 && e<33)||(c<33 && m<33 && h<33 && e<33))
       {
       if(p<33 && c<33 && m<33 && h<33 )
           System.out.print("\t|\t\t\tFail in Phy.,Chem.,Maths,Hindi.                                             ");
       else if(p<33 && c<33 && m<33 && e<33)
           System.out.print("\t|\t\t\tFail in Phy.,Chem.,Maths,English.                                           ");       
       else if(p<33 && c<33 && h<33 && e<33)
           System.out.print("\t|\t\t\tFail in Phy.,Chem.,Hindi,English.                                           ");    
       else if(p<33 && m<33 && h<33 && e<33)
           System.out.print("\t|\t\t\tFail in Phy.,Maths,Hindi,English.                                           ");
       else if(c<33 && m<33 && h<33 && e<33)
           System.out.print("\t|\t\t\tFail in Phy.,Chem.,Maths,English.                                           ");    
       }
       
       else if((p<33 && c<33 && m<33 )||(p<33 && c<33 && h<33)||(p<33 && m<33 && e<33)||(p<33 && m<33 && e<33)||(p<33 && m<33 && h<33)||(c<33 && m<33 && e<33)||(c<33 && m<33 && h<33)||(c<33 && h<33 && e<33)||(m<33 && h<33 && e<33))
       {
       if(p<33 && c<33 && m<33 )
           System.out.print("\t|\t\t\tFail in Phy.,Chem.,Maths.                                                   ");
       else if(p<33 && c<33 && h<33)
           System.out.print("\t|\t\t\tFail in Phy.,Chem.,Hindi.                                                   ");
       else if(p<33 && c<33 && e<33)
           System.out.print("\t|\t\t\tFail in Phy.,Chem.,English.                                                 ");   
       else if(p<33 && m<33 && e<33) 
           System.out.print("\t|\t\t\tFail in Phy.,Maths,English.                                                 ");
       else if(p<33 && m<33 && h<33)
           System.out.print("\t|\t\t\tFail in Phy.,Maths,Hindi.                                                   ");  
       else if(c<33 && m<33 && e<33)
           System.out.print("\t|\t\t\tFail in Chem.,Maths,English.                                                ");      
       else if(c<33 && m<33 && h<33)
           System.out.print("\t|\t\t\tFail in Chem.,Maths,Hindi.                                                  ");      
       else if(c<33 && h<33 && e<33)
           System.out.print("\t|\t\t\tFail in Chem.,Hindi,English.                                                ");      
       else if(m<33 && h<33 && e<33)
           System.out.print("\t|\t\t\tFail in Maths,Maths,English.                                                ");      
       }
       
       else if((p<33 && c<33 )||(p<33 && m<33 )||(p<33 && h<33 )||(p<33 && e<33 )||(c<33 && m<33 )||(c<33 && h<33 )||(c<33 && e<33 )||(m<33 && h<33)||(m<33 && e<33)||(h<33 && e<33))
       {
       if(p<33 && c<33 )
           System.out.print("\t|\t\t\tFail in Phy.,Chem..                                                         ");    
       else if(p<33 && m<33 )
           System.out.print("\t|\t\t\tFail in Phy.,Maths.                                                         ");      
       else if(p<33 && h<33 )
           System.out.print("\t|\t\t\tFail in Phy.,Hindi.                                                         ");    
       else if(p<33 && e<33 )
           System.out.print("\t|\t\t\tFail in Phy.,English.                                                       "); 
       else if(c<33 && m<33 )
           System.out.print("\t|\t\t\tFail in Chem.,Maths.                                                        ");  
       else if(c<33 && h<33 )
           System.out.print("\t|\t\t\tFail in Chem.,Hindi.                                                        "); 
       else if(c<33 && e<33 )
           System.out.print("\t|\t\t\tFail in Chem.,English.                                                      "); 
       else if(m<33 && h<33)
           System.out.print("\t|\t\t\tFail in Maths,Hindi.                                                        ");     
       else if(m<33 && e<33)
           System.out.print("\t|\t\t\tFail in Maths,English.                                                      ");
       else if(h<33 && e<33)
           System.out.print("\t|\t\t\tFail in Hindi.English                                                       ");
        }   
       
       else if(p<33 || c<33 || m<33 || h<33 || e<33)
       {
       if(p<33)
       	  System.out.print("\t|\t\t\tFail in Phy..                                                               ");
       else if(c<33)
       	  System.out.print("\t|\t\t\tFail in Chem..                                                              ");
       else if(m<33)
       	  System.out.print("\t|\t\t\tFail in Maths.                                                              ");
       else if(h<33)
       	  System.out.print("\t|\t\t\tFail in Hindi.                                                              ");
       else if(e<33)
       	  System.out.print("\t|\t\t\tFail in English.                                                            ");
       }
	   else
           System.out.print("\t|\t\t\tPass in all Subjects.                                                                          "); 
	   System.out.println("\n\t| Status               :                                                                            ");
      
	  if(per>=33 && per<100)
      {
           System.out.print("\t|\t\t\tPASS                                                                        ");
         System.out.println("\n\t| Division             :                                                         ");
       if(per>=60)
      {
           System.out.print("\t|\t\t\tFirst Division                                                            ");
      }
      else if(per>=45)
      {
           System.out.print("\t|\t\t\tSecond Division                                                           ");
      }
      else if(per>=33)
      {
           System.out.print("\t|\t\t\tThird Division                                                            ");
      }
      }
      else
           System.out.print("\t|\t\t\tFAIL                                                                      "); 
					
					
	   
        System.out.println("\n\t|___________________________________________________________________________________________________");
						
					
	}
}
 
class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n\n----------------------------------------------------------------");	
		System.out.print("\n How many Marksheet you want to print : ");
		int n=sc.nextInt();
		System.out.println();
		Marksheet marksheet[]=new Marksheet[n];
		for(int i=0,j=1;i<n;i++,j++)
		{
			marksheet[i]=new Marksheet();
			
			marksheet[i].getData(n,marksheet,i,j);
		}
		
		int pwd=2112;
		int ch1=0;
		int ch2;
		int pass=0;
		
		do
		{
		   
		   System.out.println("\n\n Press 1 for More Details.");
		   System.out.println(" Press 0 for Exit.");
		   System.out.print("\n Enter Your Choice : ");
		   ch1 = sc.nextInt();
		   sc.nextLine();
		   
		 do
		 {
		  	if(ch1==1)
			  { 
			      System.out.print("\n Enter Password : ");
			      pass=sc.nextInt();
				        
			   if(pass==pwd)
			   {
			   
			   System.out.println("\n Perform Searching Via --> \n");
			   System.out.println(" Press 1 for Search by Name. ");
			   System.out.println(" Press 2 for Search by Roll Number.");
			   System.out.println(" Press 3 for Search by Percentage.");
			   System.out.println(" Press 4 for Print All Marksheets.");
			   System.out.println(" Press 0 for Exit.");
			   
			   System.out.print("\n Enter Your Choice : ");
			   ch2 = sc.nextInt();
			   sc.nextLine();
			   switch(ch2)
			   {
			      case 1 :    System.out.print(" Enter Name : ");
				          String name = sc.nextLine();
					 marksheet[0].searchByName(n,marksheet,name);
			      		 break;
			      
			      case 2 :   System.out.print(" Enter Roll Number : ");
				         int roll = sc.nextInt();
				         marksheet[0].searchByRoll(n,marksheet,roll);
				         break;
				         
			      case 3 :   System.out.print(" Enter Percentage : ");
				         double p = sc.nextDouble();
				         marksheet[0].searchByPer(n,marksheet,p);
				          break;
			      case 4 :   for(int i=0;i<n;i++)
				         {
				            marksheet[i].printMarksheet();
				         }
				         break;
			      
				        
			   
			  }
			}
			else
			   System.out.println("\n Wrong Password. ");
			}
			}while(pass!=pwd);
		}while(ch1!=0);             
	}
} 
 


