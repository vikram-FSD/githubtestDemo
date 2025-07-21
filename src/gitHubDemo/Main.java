package gitHubDemo;

public class Main {
	public static void main(String args[]) {
		System.out.println("Hello world");

		Student.Grade();
		Student.Attendance();
		System.out.println("New line added by vikram");

	}

	public class Student {
		public static void Grade() {
			System.out.println("Grade is 'D'");
		}
		
		public static void Attendance() {
			System.out.println("Your attendance percentage is: 82%");
		}
	}
}
