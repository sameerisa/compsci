
public class TwoStudents {
	public static void main (String[]args) 
	{
		Student s1 = new Student();
		Student s2 = new Student();
		s1.setName("Joe");
		s2.setName("Sally");
		s1.setScore(1, 80);
		s1.setScore(2, 90);
		s1.setScore(3, 99);
		s2.setScore(1, 100);
		s2.setScore(2, 75);
		s2.setScore(3, 88);
		System.out.println("Student 1:" + " "+s1.toString());
		System.out.println("Student 2:" + " "+s2.toString());
		if(s1.getAverage()>s2.getAverage()) 
		{
			System.out.println(s1.getName()+" had the higher average");
		}
		else if(s1.getAverage()==s2.getAverage()) 
		{
			System.out.println("Both students had the same average");
		}
		else 
		{
			System.out.println(s2.getName()+" had the higher average");
		}
	}

}
