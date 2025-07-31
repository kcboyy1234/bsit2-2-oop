import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        String studentId = input.nextLine();

        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Enter Course: ");
        String course = input.nextLine();

        System.out.print("Enter Section: ");
        String section = input.nextLine();

        System.out.println("\nSTUDENT INFORMATION");
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + firstName + " " + lastName);
        System.out.println("Course: " + course);
        System.out.println("Section: " + section);

        System.out.print("\nEnter Midterm Exam Score: ");
        int midterm = input.nextInt();

        System.out.print("Enter Final Exam Score: ");
        int finalExam = input.nextInt();

        System.out.print("Enter Project Score: ");
        int project = input.nextInt();

        System.out.print("Enter Attendance Percentage: ");
        int attendance = input.nextInt();

        int totalScore = midterm + finalExam + project + attendance;
        double averageScore = (double) totalScore / 400 * 100;
        String remarks = (averageScore < 75) ? "FAILED" : "PASSED";

        System.out.println("\nSTUDENT SCORE");
        System.out.println("Midterm Exam Score: " + midterm);
        System.out.println("Final Exam Score: " + finalExam);
        System.out.println("Project Score: " + project);
        System.out.println("Attendance Score: " + attendance);
        System.out.println("Average Score: " + averageScore);
        System.out.println("Remarks: " + remarks);

        input.close();
    }
}
