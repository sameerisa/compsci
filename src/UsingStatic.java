import java.util.Scanner;

public class UsingStatic {
	public static void main(String[]args) 
	{
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter in students name followed by 3 test scores");
		System.out.println("S1:");
		Student s1 = new Student(read.nextLine(),read.nextInt(),read.nextInt(),read.nextInt());
		read.nextLine();
		System.out.println("S2:");
		Student s2 = new Student(read.nextLine(),read.nextInt(),read.nextInt(),read.nextInt());
		read.nextLine();
		System.out.println("S3:");
		Student s3 = new Student(read.nextLine(),read.nextInt(),read.nextInt(),read.nextInt());
		read.nextLine();
		Student.getclasslist();
		System.out.println(Student.getTopStuName());
	}

}
