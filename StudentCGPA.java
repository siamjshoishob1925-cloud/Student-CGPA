import java.util.Scanner;

public class StudentCGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Student ID
        System.out.print("Enter Student ID: ");
        String studentID = sc.nextLine();

        // Input number of courses
        System.out.print("Enter number of courses: ");
        int numCourses = sc.nextInt();

        double totalCredits = 0;
        double totalWeightedPoints = 0;

        // Loop through each course
        for (int i = 1; i <= numCourses; i++) {
            System.out.println("\nCourse " + i + ":");

            System.out.print("Enter Credit (Max 3): ");
            double credit = sc.nextDouble();

            System.out.print("Enter Class Test Marks (Max 30): ");
            double ct = sc.nextDouble();

            System.out.print("Enter Attendance Marks (Max 10): ");
            double at = sc.nextDouble();

            System.out.print("Enter Final Exam Marks (Max 60): ");
            double fe = sc.nextDouble();

            // Calculate total marks
            double totalMarks = ct + at + fe;

            // Calculate GPA for this course
            double gpa = 0.0;

            if (totalMarks >= 80) gpa = 4.00;
            else if (totalMarks >= 75) gpa = 3.75;
            else if (totalMarks >= 70) gpa = 3.50;
            else if (totalMarks >= 65) gpa = 3.25;
            else if (totalMarks >= 60) gpa = 3.00;
            else if (totalMarks >= 55) gpa = 2.75;
            else if (totalMarks >= 50) gpa = 2.50;
            else if (totalMarks >= 45) gpa = 2.25;
            else if (totalMarks >= 40) gpa = 2.00;
            else gpa = 0.00;

            // Update totals
            totalCredits += credit;
            totalWeightedPoints += (gpa * credit);
        }

        // Calculate CGPA
        double cgpa = totalWeightedPoints / totalCredits;

        // Determine Grade
        String grade = "";
        if (cgpa == 4.00) grade = "A+";
        else if (cgpa >= 3.75) grade = "A";
        else if (cgpa >= 3.50) grade = "A-";
        else if (cgpa >= 3.25) grade = "B+";
        else if (cgpa >= 3.00) grade = "B";
        else if (cgpa >= 2.75) grade = "B-";
        else if (cgpa >= 2.50) grade = "C+";
        else if (cgpa >= 2.25) grade = "C";
        else if (cgpa >= 2.00) grade = "D";
        else grade = "F";

        // Display result
        System.out.println("Student ID: " + studentID);
        System.out.println("Credit Taken: " + totalCredits);
        System.out.println("Credit Earned: " + totalCredits);
        System.out.printf("CGPA: %.2f\n", cgpa);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
