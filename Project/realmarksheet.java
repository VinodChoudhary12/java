import java.util.Scanner;
class marksheet
{
	private String name,course,father,mother,branch,college;
   private int year,rollno,phy,chemistry,maths,hindi,english,semester;
   Scanner sc=new Scanner(System.in);
  public void setName()
  {
	  System.out.println("Enter Your Name");
	  name=sc.nextLine();
	  this.name = name;
  }
  public void setFather()
   {
	   System.out.println("Enter Father Name");
	  father =sc.nextLine();
	    this.father = father;
   }
   public void setMother()
   {
		System.out.println("Enter Mother Name");
		mother =sc.nextLine();
	   this.mother=mother;
   }
   public void setCourse()
   {
		System.out.println("Enter Your Course ");
		course =sc.nextLine();
	    this.course = course;
   }
   public void setYear()
   {
	   System.out.println("Enter Year");
	   year =sc.nextInt();
	   this.year = year;
   }
   public void setRollno()
   {
	   this.rollno = rollno;
   }
   public void setBranch()
   {
	   System.out.println("Enter The Branch ");
	   branch=sc.nextLine();
	   this.branch = branch;
   }
   public void setCollage()
   {
	   System.out.println("Enter Your Collage Name");
	   college =sc.nextLine();
	   this.college = college;
   }
   public void setPhy()
   {
	   do
		{	
			System.out.println("Enter physics number:   ");
			phy = sc.nextInt(); 
			if(phy<0||phy>100)	
			{
				System.out.println("Invalid mark Of physics..!!\nPleas re enter mark..");
			}
		}while(phy<0||phy>100);
	   this.phy = phy;
   }
   public void setChemistry()
   {
	   do{
			System.out.println("Enter chemistry number:   "); 
			chemistry = sc.nextInt();
			if(chemistry<0||chemistry>100)	
			{
				System.out.println("Invalid mark Of chemistry..!!\nPleas re enter mark..");
			}
		}
		while(chemistry<0||chemistry>100);
		
	   this.chemistry = chemistry;
   }
   public void setMaths()
   {do
		{
			System.out.println("Enter math number:   ");
			maths = sc.nextInt();
		if(maths<0||maths>100)	
			{
				System.out.println("Invalid mark Of math..!!\nPleas re enter mark..");
			}	
		}while(maths<0||maths>100);
	   this.maths = maths;
   }
   public void setHindi()
   {
	   do{	 
			System.out.println("Enter hindi number:   ");
			hindi = sc.nextInt();
		if(hindi<0||hindi>100)	
			{
				System.out.println("Invalid mark Of Hindi..!!\nPleas re enter mark..");
			}	
		}while (hindi<0||hindi>100);
	   this.hindi = hindi;
   }
   public void setEnglish()
   {
	   do{	
			System.out.println("Enter english number:   ");
			english = sc.nextInt();
		if(english<0||english>100)	
			{
				System.out.println("Invalid mark Of English..!!\nPleas re enter mark..");
			}			
		}
		while(english<0||english>100);
	   this.english = english;
   }
   public void setSemester()
   {
	   System.out.println("Enter Your Semester:");
	   semester =sc.nextInt();
	   this.semester=semester;
   }
   
   //GetData..............
   
   
   public  String getName()
   {
	    return this.father;
   }
   public  String getFather()
   {
	    return this.father;
   }
   public String getMother()
   { 
	   return this.mother;
   }
   public String getCourse()
   {
	    return this.course;
   }
   public int getYear()
   {
	   return this.year;
   }
   public int getRollno()
   {
	   return this.rollno;
   }
   public String getBranch()
   {
	  return  this.branch;
   }
   public String getCollage()
   {
	   return this.college;
   }
   public int getPhy()
   {
	   return this.phy ;
   }
   public int getChemistry()
   {
	  return  this.chemistry;
   }
   public int getMaths()
   {
	   return this.maths;
   }
   public int getHindi()
   {
	   return this.hindi ;
   }
   public int getEnglish()
   {
	   return this.english;
   }
   public int getSemester()
   {
	   return this.semester;
   }
   public void Roll(int i,Student stu[],Scanner sc)
	{
		boolean z;
		do
		{
			System.out.println("Enter Roll number");
			rollno=sc.nextInt();
			sc.nextLine();
			z = false; //continue....
			for(int j=0; i>0&&j<i; j++)
			{	
				if(rollno==stu[j].rollno)
				{
					System.out.println("roll number alredy added\n");
					z=true;
				}
			}
		}
		while(z);
	}
   
}

class Student
{
	/*public void print(int i,Student stu[],Scanner sc)
	{
		    System.out.println("Enter Roll number");
			rollno=sc.nextInt();
			sc.nextLine();
			for(int j=0; j<=stu.length; j++)
			{	
				if(j==i&&rollno==stu[j].rollno)
				{
					System.out.println(" "+this.display(i,stu,sc));
				}
			}
	}*/	
		public int display(int i,marksheet stu[],Scanner sc)
	{
		System.out.println("|-------------------------------------------------------------------------|");
				
				System.out.println("|\t\t\t\t"+stu[i].getcollege());
				System.out.println("|\tRoll  : "+stu[i].getRollno()+"\t\t\t\t\tCourse : "+stu[i].getCourse());
				System.out.println("|\tName  : "+stu[i].getName()+"\t\t\t\t\tBranch : "+stu[i].getBranch()+"  ");	
				System.out.println("|\tFName : "+stu[i].getFather()+"\t\t\t\t\tSem  : "+stu[i].getSemester()+"      ");
				System.out.println("|\tMName : "+stu[i].getMother()+"\t\t\t\t\tYear : "+stu[i].getYear()+"     ");
				System.out.println("|");
				System.out.println("|\tSubCode      SubName       MaxMarks      MinMarks      ObtMark    ");
				System.out.println("|\tBSC101       physics        100            33            "+stu[i].getPhy()+"       ");
				System.out.println("|\tBSC102       chemestr       100            33            "+stu[i].getChemistry()+"       ");
				System.out.println("|\tBSC103       Maths         100            33            "+stu[i].getMaths()+"       ");
				System.out.println("|\tBSC104       Hindi          100            33            "+stu[i].getHindi()+"       ");
				System.out.println("|\tBSC105       English        100            33            "+stu[i].getEnglish()+"       ");
				System.out.println("|\t\t\t\t\t\t\t\t\t  ");
				System.out.println("|\t\t\t\t\t\t\t\t\t  ");
				System.out.println("|\t\t\t\t\t\t\t\t\t  ");
			/*------------------------------------------------------------*/	
			if(stu[i].getPhy()<33&&stu[i].getMaths()<33&&stu[i].getChemistry()<33&&stu[i].getHindi()<33&&stu[i].getEnglish()<33)
			{ 
				System.out.println("|\t\t\t\t\t\tStatus: | FAIL");  /*continue.....*/
				System.out.println("|\tFail in all Subject");
			}

			else if((stu[i].getPhy()<33&&stu[i].getChemistry()<33&&stu[i].getMaths()<33&&stu[i].getHindi()<33)||(stu[i].getPhy()<33&&stu[i].getMaths()<33&&stu[i].getHindi()<33&&stu[i].getEnglish()<33)||(stu[i].getPhy()<33&&stu[i].getHindi()<33&&stu[i].getEnglish()<33&&stu[i].getChemistry()<33)||(stu[i].getPhy()<33&&stu[i].getEnglish()<33&&stu[i].getChemistry()<33&&stu[i].getMaths()<33)||(stu[i].getChemistry()<33&&stu[i].getMaths()<33&&stu[i].getHindi()<33&&stu[i].getEnglish()<33))
			{    
	
				System.out.println("|\t\t\t\t\t\tStatus: | FAIL"); 
					

				if(stu[i].getPhy()<33&&stu[i].getChemistry()<33&&stu[i].getMaths()<33&&stu[i].getHindi()<33)
					System.out.println("|\tFail in four Subject:\n\tphysics\n\tchemistry\n\tmath\n\thindi");
				
				else if(stu[i].getPhy()<33&&stu[i].getMaths()<33&&stu[i].getHindi()<33&&stu[i].getEnglish()<33)
					System.out.println("|\tFail in four Subject:\n\tphysics\n\tchemistry\n\tmath\n\tEnglish");
				
				else if(stu[i].getPhy()<33&&stu[i].getHindi()<33&&stu[i].getEnglish()<33&&stu[i].getChemistry()<33)
					System.out.println("\tFail in four Subject:\n\tphysics\n\tchemistry\n\thindi\n\tEnglish");
				
				else if(stu[i].getPhy()<33&&stu[i].getEnglish()<33&&stu[i].getChemistry()<33&&stu[i].getMaths()<33)
					System.out.println("|\tFail in four Subject:\n\tphysics\n\tchemistry\n\tmath\n\tEnglish");
				
				else if(stu[i].getChemistry()<33&&stu[i].getMaths()<33&&stu[i].getHindi()<33&&stu[i].getEnglish()<33)
					System.out.println("|\tFail in four Subject:\n\tchemistry\n\tmath\n\thindi\n\tEnglish");
			}

			else if((stu[i].getPhy()<33&&stu[i].getMaths()<33&&stu[i].getChemistry()<33)||(stu[i].getPhy()<33&&stu[i].getChemistry()<33&&stu[i].getHindi()<33)||(stu[i].getPhy()<33&&stu[i].getMaths()<33&&stu[i].getHindi()<33)||(stu[i].getChemistry()<33&&stu[i].getMaths()<33&&stu[i].getHindi()<33)||(stu[i].getPhy()<33&&stu[i].getChemistry()<33&&stu[i].getEnglish()<33)||
			(stu[i].getMaths()<33&&stu[i].getHindi()<33&&stu[i].getEnglish()<33)||(stu[i].getChemistry()<33&&stu[i].getHindi()<33&&stu[i].getEnglish()<33)||(stu[i].getPhy()<33&&stu[i].getHindi()<33&&stu[i].getEnglish()<33)||(stu[i].getEnglish()<33 &&stu[i].getMaths()<33&&stu[i].getChemistry()<33)||(stu[i].getPhy()<33&&stu[i].getMaths()<33&&stu[i].getEnglish()<33))
			{     
				System.out.println("|\t\t\t\t\t\tStatus: | FAIL");
				
				if(stu[i].getPhy()<33&&stu[i].getMaths()<33&&stu[i].getChemistry()<33)
						System.out.println("|\tFail in three Subject:\n|\tphysics\n|\tmath\n|\tchemistry ");
				
				else if(stu[i].getPhy()<33&&stu[i].getChemistry()<33&&stu[i].getHindi()<33)
						System.out.println("|\tFail in three Subject:\n|\tphysics\n|\tchemistry\n|\thindi");
					
				else if(stu[i].getPhy()<33&&stu[i].getMaths()<33&&stu[i].getHindi()<33)
						System.out.println("|\tFail in three Subject:\n|\tphysics\n|\tmath\n|\thindi ");
					
				else if(stu[i].getChemistry()<33&&stu[i].getMaths()<33&&stu[i].getHindi()<33)
						System.out.println("|\tFail in three Subject:\n|\tchemistry\n|\tmath\n|\thindi ");	
						
				else if(stu[i].getPhy()<33&&stu[i].getChemistry()<33&&stu[i].getEnglish()<33)
						System.out.println("|\tFail in three Subject:\n|\tphysics\n|\tchemistry\n|\tenglish ");		
				
				else if(stu[i].getMaths()<33&&stu[i].getHindi()<33&&stu[i].getEnglish()<33)
						System.out.println("|\tFail in three Subject:\n|\tmath\n|\thindi\n|\tenglish ");	
				
				else if(stu[i].getChemistry()<33&&stu[i].getHindi()<33&&stu[i].getEnglish()<33)
						System.out.println("|\tFail in three Subject:\n|\tchemistry\n|\thindi\n|\tenglish ");
				
				else if(stu[i].getPhy()<33&&stu[i].getHindi()<33&&stu[i].getEnglish()<33)
						System.out.println("|\tFail in three Subject:\n|\tphysics\n|\thindi\n|\tenglish ");
				
				else if(stu[i].getEnglish()<33 &&stu[i].getMaths()<33&&stu[i].getChemistry()<33)
						System.out.println("|\tFail in three Subject:\n|\tmath\n|\tchemistry\n|\tenglish");
					
				else if(stu[i].getPhy()<33&&stu[i].getMaths()<33&&stu[i].getEnglish()<33)
						System.out.println("|\tFail in three Subject:\n|\tphysics\n|\tmath\n|\tenglish  ");		
				
			}

			else if((stu[i].getPhy()<33&&stu[i].getMaths()<33)||(stu[i].getPhy()<33&&stu[i].getChemistry()<33)||(stu[i].getPhy()<33&&stu[i].getHindi()<33)||(stu[i].getPhy()<33&&stu[i].getEnglish()<33)||
			(stu[i].getMaths()<33&&stu[i].getChemistry()<33)||(stu[i].getMaths()<33&&stu[i].getHindi()<33)||(stu[i].getMaths()<33&&stu[i].getEnglish()<33)||(stu[i].getChemistry()<33&&stu[i].getHindi()<33)||(stu[i].getChemistry()<33&&stu[i].getEnglish()<33)||(stu[i].getHindi()<33&& stu[i].getEnglish()<33))
			{
				 System.out.println("|\t\t\t\t\t\tStatus: | SUPPLY");
				 
				if(stu[i].getPhy()<33&&stu[i].getMaths()<33)
					System.out.println("|\tFail in two subject:\n|\tphysics\n|\tmath");
				
				else if(stu[i].getPhy()<33&&stu[i].getChemistry()<33)	
					 System.out.println("|\tFail in two subject:\n|\tphysics\n|\tchemistry");
				
				else if(stu[i].getPhy()<33&&stu[i].getHindi()<33)	
					  System.out.println("|\tFail in two subject:\n|\tphysics\n|\thindi");
				 
				else if(stu[i].getPhy()<33&stu[i].getEnglish()<33)	
					 System.out.println("|\tFail in two subject:\n|\tphysics\n|\tEnglish");
				 
				else if(stu[i].getMaths()<33&stu[i].getChemistry()<33)	
					 System.out.println("|\tFail in two subject:\n|\tmath\n|\tchemistry");
				 
				else if(stu[i].getMaths()<33&stu[i].getHindi()<33)	
					 System.out.println("|\tFail in two subject:\n|\tmath\n|\thindi");
				 
				else if(stu[i].getMaths()<33&stu[i].getEnglish()<33)
					 System.out.println("|\tFail in two subject:\n|\tmath\n|\tenglish");
				 
				else if(stu[i].getChemistry()<33&stu[i].getHindi()<33)	
					 System.out.println("|\tFail in two subject:\n|\tchemistry\n|\tHindi");
				 
				else if(stu[i].getChemistry()<33&stu[i].getEnglish()<33)	
					 System.out.println("|\tFail in two subject:\n|\tchemistry\n|\tenglish");
				 
				else if(stu[i].getHindi()<33&stu[i].getEnglish()<33)	
					 System.out.println("|\tFail in two subject:\n|\tHindi\n|\tenglish");
			}


			else if(stu[i].getPhy()<33||stu[i].getMaths()<33||stu[i].getChemistry()<33||stu[i].getHindi()<33|stu[i].getEnglish()<33)
			{      System.out.println("|\t\t\t\t\t\tStatus: | SUPPLY");
				if(stu[i].getPhy()<33)
					System.out.println("|\tFail in one subject\n|\tphysics");
				else if(stu[i].getMaths()<33)
					System.out.println("|\tFail in one subject\n|\\tmath");
				else if(stu[i].getChemistry()<33)
					System.out.println("|\tFail in one subject\n|\tchemistry");
				else if(stu[i].getHindi()<33)
					System.out.println("|\tFail in one subject\n|\thindi");
				else if(stu[i].getEnglish()<33)
					System.out.println("|\tFail in one subject\n|\tEnglish");
				
			} /*COMPLETE*/

			/*ELSE BLOCK-----   COUNT TOTAL PERSENTAGE*/
			else
			{
			int total = stu[i].getPhy()+stu[i].getChemistry()+stu[i].getMaths()+stu[i].getHindi()+stu[i].getEnglish();
					double per=total/5.0;
					if(stu[i].getPhy()>=33&&stu[i].getChemistry()>=33&&stu[i].getMaths()>=33&&stu[i].getHindi()>=33&&stu[i].getEnglish()>=33)
					{
						System.out.println("|\t\t\t\t\t\tStatus: | PASS");
					}
					else
					{
						System.out.println("|\t\t\t\t\t\tStatus: | FAIL");
					}  
					System.out.println("|\tTotal mark is:  "+total+"\t\t\t\t\t\t  ");		
					System.out.println("|\tPersentage is:  "+per+"\t\t");
					if(per>=60)
					{
						System.out.println("|\tpass in first Division\t\t\t\t\t\t  ");
					}
					else if(per>=45)
					{
						System.out.println("|\tpass in Second Division\t\t\t\t\t\t  ");
					}
					else if(per>=33)
					{
						System.out.println("|\tpass in Third Division\t\t\t\t\t\t  ");	
					}	
					else
					{
					System.out.println("|\t---- FAIL ----");
					}					
					
			}/*COMPLETE*/

			System.out.println("|-------------------------------------------------------------------------|");
		   		  
        return rollno;
	}
}    
	
class Test
 {
    public static void main(String args[])
    {
		  Scanner sc=new Scanner(System.in);
		  Student ob=new Student();
		  marksheet stu[] = new marksheet[100];
		  
		  
		  System.out.println("Enter how many student data you want to store :");
		  int n=sc.nextInt();
		  int i;
		for(i=0;i<n;i++)
		{
			stu[i]=new marksheet();
			stu[i].setName();
			stu[i].setFather();
			stu[i].setMother();
			stu[i].setRollno();
			stu[i].setCourse();
			stu[i].setBranch();
			stu[i].setCollage();
			stu[i].setPhy();
			stu[i].setChemistry();
			stu[i].setMaths();
			stu[i].setEnglish();
			stu[i].setHindi();
		}
		for(i=0;i<n;i++) 
		{
		   //stu[i].display(i,ob,sc);
		   ob.display(i,stu,sc);
		}
			/*System.out.println("YOUR CHOICE ARE :");
		    System.out.println("press 1.search by Marksheet for roll no :");
			System.out.println("press 2.Print by all marksheet          :");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				for(i=0;i<n;i++)
				stu[i].print(i,stu,sc);
						break;
			}*/
    }
 }	

	