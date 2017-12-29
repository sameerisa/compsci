package array;
import java.util.ArrayList;
import java.util.Arrays;

public class Student
{
    //instance variables
   private String name;
   private int test1;        
   private int test2;
   private int test3;

   public static ArrayList<Student> list = new ArrayList<Student>();
   public static ArrayList<String> sl = new ArrayList<String>();
   private static ArrayList<String> osl = new ArrayList<String>();
   //static Student[] stulist= new Student(Student stu);
   
    
   
  
   
   private static String topstu = "Unknown";
   private static int topavg = 0;
   
   
   public static void getclasslist() 
   {
	   System.out.println(Arrays.toString(sl.toArray()));
   }
   public static String getTopStuName() 
   {
	   return getTopStu().getName();
   }
   public static Student getTopStu() 
   {
	  Student temp = null;
	  
	  for(int i = 1; i<(list.size()); i++) 
	  {
		  if(i==1) 
		  {
			  if(list.get(i-1).getAverage()>list.get(i).getAverage()) 
			  {
				  temp=list.get(i-1);
			  }
			  else if(list.get(i-1).getAverage()<list.get(i).getAverage()) 
			  {
				  temp=list.get(i);
			  }
			  else if(list.get(i-1).getAverage()==list.get(i).getAverage())
			  {
				  temp=list.get(i);
			  }
			  else {}
			  
		  }
		  else 
		  {
			  if(temp.getAverage()<list.get(i).getAverage()) 
			  {
				  temp = list.get(i);
			  }
		  }
		 
		
	  } 
	  if(temp!=null)
	  	return temp;
	  else {
		  return list.get(0);
	  }
   }
   private static void setBestStudent() 
   {
	   try{
	   topstu= getTopStu().getName();
	   topavg=getTopStu().getAverage();
	   }
	   catch(Exception e){}
   }
   
   public Student()
   {
       name = "";
       test1 = 0;
       test2 = 0;
       test3 = 0; 
   }
   public Student(String name, int test1, int test2, int test3) 
   {
	   this.name = name;
	   this.test1 = test1;
	   this.test2 = test2;
	   this.test3 = test3;
	   
	   list.add(this);
	   sl.add(this.name);
	   setBestStudent();
   }
   
   public String getLetterGrade()
   {
	   if(getAverage()>=90) 
	   {
		   return "A";
	   }
	   else if (getAverage()>=80)
	   {
		   return "B";
	   }
	   else if(getAverage()>=70) 
	   {
		   return "C";
	   }
	   else if (getAverage()>=60) 
	   {
		   return "D";
	   }
	   else
	   {
		   return "F";
	   }
   }
   public int compareStudents(Student s) 
   {
	   if(getAverage()>s.getAverage()) 
	   {
		   return 1;
	   }
	   else if (getAverage()<s.getAverage())
		   return -1;
	   else
		   return 0;
   }
   public void setName(String input)
   {
       name=input;
   }
   
   public String getName()
   {
       return name;
   }
   
   public void setScore(int testNumber, int score)
   {
       if(testNumber==1)
       {
           test1=score;
       }
       else if(testNumber==2)
       {
           test2=score;
       }
       else
       {
           test3=score;
       }
    }
   
    public int getScore(int whichTest)
    {
        if(whichTest==1)
        {
            return test1;
        }
        else if(whichTest==2)
        {
            return test2;
        }
        else
        {
            return test3;
        }
    }
    
    public int getAverage()
    {
        int average;
        average=(int)Math.round((test1 + test2 + test3)/3);
        return average;
    }
    public int getHighScore()
    {
        int highScore;
        highScore = test1;
        if(test2> highScore) 
            highScore= test2;
        if(test3 > highScore)
            highScore=test3;
        return highScore;
    }
         
    public String toString()
    {
        String phrase = "Name:    " + name + "\n" +
                        "Test 1:  " + test1+ "\n" +
                        "Test 2:  " + test2+ "\n" +
                        "Test 3:  " + test3+ "\n" +
                        "Average: " + getAverage() + "\n";
        return phrase;
    }
    
   
} 