import java.util.Scanner;
class MarksheetPojo
{
	private String name,course,father,mother,branch,college;
	private int year,rollno,phy,chemistry,maths,hindi,english,semester,total;
	private double percentage;
	public void setTotal(int total)
	{
		this.total=phy+chemistry+maths+hindi+english;
	}
	public void setPercentage(double persentage)
	{
		this.percentage=this.getTotal()/5;
	}
	public  void setName(String name)
    {
		this.name=name;
    }
	public  void setFather(String father)
    {
		this.father=father;
    }
	public  void setMother(String mother)
    {
		this.mother=mother;
    }
	public  void setCourse(String course)
    {
		this.course=course;
    }
	public  void setBranch(String branch)
    {
		this.branch=branch;
    }  
	public  void setCollege(String college)
    {
		this.college=college;
    }  
	public  void setYear(int year)
    {
		this.year=year;
    }  
	public  void setRollno(int rollno)
    {
		this.rollno=rollno;
    }  
	public  void setPhy(int phy)
    {
		this.phy=phy;
    }
	public  void setChemistry(int chemistry)
    {
		this.chemistry=chemistry;
    }  
	public  void setMaths(int maths)
    {
		this.maths=maths;
    }
	public  void setEnglish(int english)
    {
		this.english=english;
    }
	public  void setHindi(int hindi)
    {
		this.hindi=hindi;
    }
	public  void setSemester(int semester)
    {
		this.semester=semester;
    }
	public String getName()
    {
		return this.name;
    }
    public  String getFather()
    {
      return this.father;
    }
	public  String  getMother()
    {
      return this.mother;
    }
	public  String getCourse()
    {
     return this.course;
    }
	public  String getBranch()
    {
      return this.branch;
    }  
	public  String getCollege()
    {
      return this.college;
    }  
	public  int getYear()
    {
      return this.year;
    }  
	public  int getRollno()
    {
      return this.rollno;
    }  
	public  int getPhy()
    {
       return this.phy;
    }
	public int getChemistry()
    {
      return this.chemistry;
    }  
	public int getMaths()
    {
      return this.maths;
    }
	public int getEnglish()
    {
      return this.english;
    }
	public int getHindi()
    {
      return this.hindi;
    }
	public int getSemester()
    {
      return this.semester;
    }  
	public int getTotal()
	{
		return this.total;
	}
	public double getPercentage()
	{
		return this.percentage;
	}
}
class MarksheetOperations
{
    public void display(MarksheetPojo ref[],int i,int n)
    {
		String name=ref[i].getName();
		String course=ref[i].getCourse();
		String father=ref[i].getFather();
		String mother=ref[i].getMother();
		String branch=ref[i].getBranch();
		String college=ref[i].getCollege();
	    int year=ref[i].getYear();
		int rollno=ref[i].getRollno();
		int phy=ref[i].getPhy();
		int chemistry=ref[i].getChemistry();
		int maths=ref[i].getMaths();
		int hindi=ref[i].getHindi();
		int english=ref[i].getEnglish();
		int semester=ref[i].getSemester();
		int total=ref[i].getTotal();
		double percentage=ref[i].getPercentage();;
		System.out.println("|________________________________________________________________________________________");
		System.out.println("|\t\t\t\t<"+college+">");
		System.out.println("|\t\t\t\t________________");
		System.out.println("|                                                                                         ");
		System.out.println("|\tRoll        : "+rollno+"\t\t\t\t\tCourse :\t "+course+"      ");
		System.out.println("|\tName        : "+name+"\t\t\t\t\tBranch : "+branch+"  ");
		System.out.println("|\tFather Name : "+father+"\t\t\t\t\tSem  : "+semester+"      ");
		System.out.println("|\tMother Name : "+mother+"\t\t\t\t\tYear : "+year+"     ");
		System.out.println("|");
		System.out.println("|__________________________________________________________________________________________");
		System.out.println("|\tSubCode      SubName       MaxMarks      MinMarks      ObtMark    ");
		System.out.println("|__________________________________________________________________________________________");
		System.out.println("|\tBSC101       physics        100            33            "+phy+"       ");
		System.out.println("|------------------------------------------------------------------------------------------");
		System.out.println("|\tBSC102       chemeistry     100            33            "+chemistry+"       ");
		System.out.println("|------------------------------------------------------------------------------------------");
		System.out.println("|\tBSC103       Maths          100            33            "+maths+"       ");
		System.out.println("|------------------------------------------------------------------------------------------");
		System.out.println("|\tBSC104       Hindi          100            33            "+hindi+"       ");
		System.out.println("|------------------------------------------------------------------------------------------");
		System.out.println("|\tBSC105       English        100            33            "+english+"       ");
		System.out.println("|------------------------------------------------------------------------------------------");
		System.out.println("|\t\t\t\t\t\t\t\t\t  ");
		System.out.println("|\t\t\t\t\t\t\t\t\t  ");
		System.out.println("|\t\t\t\t\t\t\t\t\t  ");
		/*------------------------------------------------------------*/
		if(phy<33&&maths<33&&chemistry<33&&hindi<33&&english<33)
		{
		System.out.println("|\t\t\t\t\t\tStatus: | FAIL");  /*continue.....*/
		System.out.println("|\tFail in all Subject");
		}

		else if((phy<33&&chemistry<33&&maths<33&&hindi<33)||(phy<33&&maths<33&&hindi<33&&english<33)||(phy<33&&hindi<33&&english<33&&chemistry<33)||(phy<33&&english<33&&chemistry<33&&maths<33)||(chemistry<33&&maths<33&&hindi<33&&english<33))
		{    

		System.out.println("|\t\t\t\t\t\tStatus: | FAIL");


		if(phy<33&&chemistry<33&&maths<33&&hindi<33)
		System.out.println("|\tFail in four Subject:\n\tphysics\n\tchemistry\n\tmath\n\thindi");

		else if(phy<33&&maths<33&&hindi<33&&english<33)
		System.out.println("|\tFail in four Subject:\n\tphysics\n\tchemistry\n\tmath\n\tEnglish");

		else if(phy<33&&hindi<33&&english<33&&chemistry<33)
		System.out.println("\tFail in four Subject:\n\tphysics\n\tchemistry\n\thindi\n\tEnglish");

		else if(phy<33&&english<33&&chemistry<33&&maths<33)
		System.out.println("|\tFail in four Subject:\n\tphysics\n\tchemistry\n\tmath\n\tEnglish");

		else if(chemistry<33&&maths<33&&hindi<33&&english<33)
		System.out.println("|\tFail in four Subject:\n\tchemistry\n\tmath\n\thindi\n\tEnglish");
		}

		else if((phy<33&&maths<33&&chemistry<33)||(phy<33&&chemistry<33&&hindi<33)||(phy<33&&maths<33&&hindi<33)||(chemistry<33&&maths<33&&hindi<33)||(phy<33&&chemistry<33&&english<33)||
		(maths<33&&hindi<33&&english<33)||(chemistry<33&&hindi<33&&english<33)||(phy<33&&hindi<33&&english<33)||(english<33 &&maths<33&&chemistry<33)||(phy<33&&maths<33&&english<33))
		{    
		System.out.println("|\t\t\t\t\t\tStatus: | FAIL");

		if(phy<33&&maths<33&&chemistry<33)
		System.out.println("|\tFail in three Subject:\n|\tphysics\n|\tmath\n|\tchemistry ");

		else if(phy<33&&chemistry<33&&hindi<33)
		System.out.println("|\tFail in three Subject:\n|\tphysics\n|\tchemistry\n|\thindi");

		else if(phy<33&&maths<33&&hindi<33)
		System.out.println("|\tFail in three Subject:\n|\tphysics\n|\tmath\n|\thindi ");

		else if(chemistry<33&&maths<33&&hindi<33)
		System.out.println("|\tFail in three Subject:\n|\tchemistry\n|\tmath\n|\thindi ");

		else if(phy<33&&chemistry<33&&english<33)
		System.out.println("|\tFail in three Subject:\n|\tphysics\n|\tchemistry\n|\tenglish ");

		else if(maths<33&&hindi<33&&english<33)
		System.out.println("|\tFail in three Subject:\n|\tmath\n|\thindi\n|\tenglish ");

		else if(chemistry<33&&hindi<33&&english<33)
		System.out.println("|\tFail in three Subject:\n|\tchemistry\n|\thindi\n|\tenglish ");

		else if(phy<33&&hindi<33&&english<33)
		System.out.println("|\tFail in three Subject:\n|\tphysics\n|\thindi\n|\tenglish ");

		else if(english<33 &&maths<33&&chemistry<33)
		System.out.println("|\tFail in three Subject:\n|\tmath\n|\tchemistry\n|\tenglish  ");

		else if(phy<33&&maths<33&&english<33)
		System.out.println("|\tFail in three Subject:\n|\tphysics\n|\tmath\n|\tenglish  ");
		}

		else if((phy<33&&maths<33)||(phy<33&&chemistry<33)||(phy<33&&hindi<33)||(phy<33&&english<33)||
		(maths<33&&chemistry<33)||(maths<33&&hindi<33)||(maths<33&&english<33)||(chemistry<33&&hindi<33)||(chemistry<33&&english<33)||(hindi<33&& english<33))
		{
		System.out.println("|\t\t\t\t\t\tStatus: | SUPPLY");

		if(phy<33&&maths<33)
		System.out.println("|\tFail in two subject:\n|\tphysics\n|\tmath");

		else if(phy<33&&chemistry<33)
		System.out.println("|\tFail in two subject:\n|\tphysics\n|\tchemistry");

		else if(phy<33&&hindi<33)
		System.out.println("|\tFail in two subject:\n|\tphysics\n|\thindi");

		else if(phy<33&english<33)
		System.out.println("|\tFail in two subject:\n|\tphysics\n|\tEnglish");

		else if(maths<33&chemistry<33)
		System.out.println("|\tFail in two subject:\n|\tmath\n|\tchemistry");

		else if(maths<33&hindi<33)
		System.out.println("|\tFail in two subject:\n|\tmath\n|\thindi");

		else if(maths<33&english<33)
		System.out.println("|\tFail in two subject:\n|\tmath\n|\tenglish");

		else if(chemistry<33&hindi<33)
		System.out.println("|\tFail in two subject:\n|\tchemistry\n|\tHindi");

		else if(chemistry<33&english<33)
		System.out.println("|\tFail in two subject:\n|\tchemistry\n|\tenglish");

		else if(hindi<33&english<33)
		System.out.println("|\tFail in two subject:\n|\tHindi\n|\tenglish");
		}


		else if(phy<33||maths<33||chemistry<33||hindi<33|english<33)
		{
		System.out.println("|\t\t\t\t\t\tStatus: | SUPPLY");
		if(phy<33)
		System.out.println("|\tFail in one subject\n|\tphysics");
		else if(maths<33)
		System.out.println("|\tFail in one subject\n|\\tmath");
		else if(chemistry<33)
		System.out.println("|\tFail in one subject\n|\tchemistry");
		else if(hindi<33)
		System.out.println("|\tFail in one subject\n|\thindi");
		else if(english<33)
		System.out.println("|\tFail in one subject\n|\tEnglish");

		} /*COMPLETE*/

		/*ELSE BLOCK-----   COUNT TOTAL PERSENTAGE*/
		else
		{
		 total = phy+chemistry+maths+hindi+english;
		 percentage=total/5.0;
		if(phy>=33&&chemistry>=33&&maths>=33&&hindi>=33&&english>33)
		{



				System.out.println("|\t\t\t\t\t\tStatus: | PASS");
			}
			else
			{
				System.out.println("|\t\t\t\t\t\tStatus: | FAIL");
			}  
			System.out.println("|\tTotal mark is:  "+total+"\t\t\t\t\t\t  ");
			System.out.println("|\tPersentage is:  "+percentage+"\t\t");
			if(percentage>=60)
			{
				System.out.println("|\tpass in first Division\t\t\t\t\t\t  ");
			}
			else if(percentage>=45)
			{
				System.out.println("|\tpass in Second Division\t\t\t\t\t\t  ");
			}
			else if(percentage>=33)
			{
				System.out.println("|\tpass in Third Division\t\t\t\t\t\t  ");
			}
			else
			{
				System.out.println("|\t---- FAIL ----");
			}

		}/*COMPLETE*/

		System.out.println("|____________________________________________________________________________________________|");
		 
		   
	}  
}
class Main
{ 
	public static void main(String args[])
	{
		Main.input();
	}
	public static void choice(MarksheetPojo stu[],MarksheetOperations op,int i,int n,Scanner sc)
	{
		int ch=0;
		do
		{
		    System.out.println("_____________________________________________________________________________________________________ ");
			System.out.println("|\t\tYOUR CHOICE ARE :                                                                   |");                                                                               
			System.out.println("|\t\t---------------                                                                     |");
			System.out.println("|\tPRESS.1 FOR ALL MARKSHEET PRINT   : PRESS.2 FOR PERCENTAGE SEARCH MARKSHEET :                |");
			System.out.println("|----------------------------------------------------------------------------------------------------|");
			System.out.println("|\tPRESS.3 FOR ROLL NUMBER MARKSHEET : PRESS.4 FOR SEARCH BY NAME MARKSHEET    :                |");
			System.out.println("|----------------------------------------------------------------------------------------------------|");
			System.out.println("|\t\t\tPRESS.5 Exit                                                                             |");
			System.out.println("|                                                                                                    |");
			System.out.println("|\tENTER YOUR CHOICE  :                                                                         |");
		    System.out.println("|____________________________________________________________________________________________________|");
			ch=sc.nextInt();
			sc.nextLine();
			switch(ch)
			{
				case 1 :for(i=0;i<n;i++)
						{
								op.display(stu,i,n);
						}
						break;
				case 2 :System.out.println("Please Enter Search Perceantage");
						double m=sc.nextInt();
						for(i=0;i<n;i++)
						{
							if(m<=stu[i].getPercentage())
							{
								op.display(stu,i,n);
							}
						} 
						break;
				case 3 :System.out.println("Enter seaching Roll Number");
						int num =sc.nextInt();
						for(i=0;i<n;i++)
						{
							if(stu[i].getRollno()==num)
							{
								op.display(stu,i,n);
							}
						}
						break;
				case 4 :System.out.println("Please Enter Searching Name");
						String naam=sc.nextLine();
						for(i=0;i<n;i++)
						{
							if(stu[i].getName().equalsIgnoreCase(naam))
							{
								op.display(stu,i,n);
							}
						}
						break;
			}
		}
		while(ch!=5);
	}	
	public static void roll(MarksheetPojo stu[],int i,Scanner sc)
	{
		boolean z;
		do
		{
			System.out.println("Enter the roll number");
			int roll=sc.nextInt();
			stu[i].setRollno(roll);
			sc.nextLine();
			z = false; 	
			for(int j=0;i>0&&j<i; j++)
			if(stu[j].getRollno()==roll)
			{
				System.out.println("roll number already exist please valid roll number\n");
				z=true;
			}
		}
		while(z);
	}	
	public static void input()
	{
    	Scanner sc = new Scanner(System.in);
		MarksheetPojo ob = new MarksheetPojo();
		MarksheetOperations op = new MarksheetOperations();
		int i=0;
		System.out.println("how many sutudent result");
		int n = sc.nextInt();
		MarksheetPojo stu[] = new MarksheetPojo[n];
		for(i=0;i<n;i++)
		{	
	        stu[i]=new MarksheetPojo();
			Main.roll(stu,i,sc);
			System.out.println("Enter your name :");
			stu[i].setName(sc.nextLine());
			System.out.println("Enter your Father's name :");
			stu[i].setFather(sc.nextLine());
			System.out.println("Enter your Mother's name :");
			stu[i].setMother(sc.nextLine());
			System.out.println("Enter your college :");
			stu[i].setCollege(sc.nextLine());
			System.out.println("Enter your branch:");
			stu[i].setBranch(sc.nextLine());
			System.out.println("Enter your course :");
			stu[i].setCourse(sc.nextLine());
			System.out.println("Enter your year :");
			stu[i].setYear(sc.nextInt());
			System.out.println("Enter your Semester :");
			stu[i].setSemester(sc.nextInt());	
		    Main.takeMark(stu,i,sc);
		}
		 Main.choice(stu,op,i,n,sc);
	}	
	public static void takeMark(MarksheetPojo stu[],int i,Scanner sc)
    {	
            int phy=stu[i].getPhy(),chemistry=stu[i].getChemistry(),maths=stu[i].getMaths(),hindi=stu[i].getHindi(),english=stu[i].getEnglish();			
			do
			{
				System.out.println("Enter physics number:   ");
				stu[i].setPhy(sc.nextInt());	
				if(phy<0||phy>100)
				{
					System.out.println("Invalid mark Of physics..!!\nPleas re enter mark..");
				}
			}	
			while(phy<0||phy>100);
			do
			{
				System.out.println("Enter chemistry number:   ");
				stu[i].setChemistry(sc.nextInt());
				if(chemistry<0||chemistry>100)
				{
					System.out.println("Invalid mark Of chemistry..!!\nPleas re enter mark..");
				}
			}
			while(chemistry<0||chemistry>100);
			do
			{
				System.out.println("Enter math number:   ");
				stu[i].setMaths(sc.nextInt());
				if(maths<0||maths>100)
				{
					System.out.println("Invalid mark Of math..!!\nPleas re enter mark..");
				}	
			}
			while(maths<0||maths>100);
			do
			{
				System.out.println("Enter hindi number:   ");
				stu[i].setHindi(sc.nextInt());
				if(hindi<0||hindi>100)
				{
					System.out.println("Invalid mark Of Hindi..!!\nPleas re enter mark..");
				}
			}
			while (hindi<0||hindi>100);

			do
			{
				System.out.println("Enter english number:   ");
				stu[i].setEnglish(sc.nextInt());
				if(english<0||english>100)
				{
					System.out.println("Invalid mark Of English..!!\nPleas re enter mark..");
				}
			}
			while(english<0||english>100);	
	}
  }

  

