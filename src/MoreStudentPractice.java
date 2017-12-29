
public class MoreStudentPractice {
	public static void main(String[]args) 
	{
		Student s1 = new Student("Joe", 50, 100, 80);
		Student s2 = new Student("Nolan", 0, 100, 50);
		System.out.println(s1.getName() + " had a "+ s1.getLetterGrade());
		System.out.println(s2.getName()+" had a "+s2.getLetterGrade());
		if(s1.compareStudents(s2)==1) 
		{
			System.out.println(s1.getName()+" had the higher average");
			
		}
		if(s1.compareStudents(s2)==0)
			System.out.println("They had the same average");
		if(s1.compareStudents(s2)==-1)
			System.out.println(s2.getName() +" had the higher average");
	}

}
