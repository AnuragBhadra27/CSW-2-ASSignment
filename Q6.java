/*Q6. Develop a Java-based College Management System to model the relationship between
colleges and students. Create a College class with attributes collegeName and
collegeLoc, and a Student class with studentId, studentName, and a reference to a
College object. Implement a constructor in Student to initialize these attributes and a
displayStudentInfo() method to print student and college details. In the MainApp
class, instantiate at least two College and Student objects, enroll each student in one of
the colleges, and display all details using appropriate methods. */

public class Q6 {
    public static void main(String[] args) {
        // Create College objects
        College college1 = new College("ABC College", "New York");
        College college2 = new College("XYZ University", "Los Angeles");

        // Create Student objects and enroll them in colleges
        Student student1 = new Student(1, "John Doe", college1);
        Student student2 = new Student(2, "Jane Smith", college2);

        // Display student and college details
        student1.displayStudentInfo();
        student2.displayStudentInfo();
    }
}

class College {
    private String collegeName;
    private String collegeLoc;

    public College(String collegeName, String collegeLoc) {
        this.collegeName = collegeName;
        this.collegeLoc = collegeLoc;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public String getCollegeLoc() {
        return collegeLoc;
    }
}

class Student {
    private int studentId;
    private String studentName;
    private College college;

    public Student(int studentId, String studentName, College college) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.college = college;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("College Name: " + college.getCollegeName());
        System.out.println("College Location: " + college.getCollegeLoc());
        System.out.println();
    }
}
