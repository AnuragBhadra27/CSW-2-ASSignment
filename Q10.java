/*Q10. Design a Java program for university student enrollment, ensuring loose coupling and
high cohesion. Create Student and Course classes, and an Enrollment class that
interacts with them through an EnrollmentSystem interface. Implement methods for
enrolling and dropping students from courses, and displaying enrollment details. In the
MainEnrollApp class, demonstrate functionality by managing student enrollments.
Use comments to explain how the design maintains loose coupling (by relying on
interfaces) and high cohesion (by keeping related functionalities within appropriate
classes). */

import java.util.ArrayList;
import java.util.List;

public class Q10 {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student(1, "John Doe");
        Student student2 = new Student(2, "Jane Smith");

        // Create courses
        Course course1 = new Course(101, "Mathematics");
        Course course2 = new Course(102, "Computer Science");

        // Create enrollment system
        EnrollmentSystem enrollmentSystem = new Enrollment();

        // Enroll students in courses
        enrollmentSystem.enrollStudent(student1, course1);
        enrollmentSystem.enrollStudent(student2, course2);

        // Display enrollment details
        enrollmentSystem.displayEnrollmentDetails();

        // Drop a student from a course
        enrollmentSystem.dropStudent(student1, course1);

        // Display enrollment details again
        enrollmentSystem.displayEnrollmentDetails();
    }
}

class Student {
    private int studentId;
    private String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }
}

class Course {
    private int courseId;
    private String courseName;

    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }
}

interface EnrollmentSystem {
    void enrollStudent(Student student, Course course);
    void dropStudent(Student student, Course course);
    void displayEnrollmentDetails();
}

class Enrollment implements EnrollmentSystem {
    private List<String> enrollments = new ArrayList<>();

    @Override
    public void enrollStudent(Student student, Course course) {
        enrollments.add("Student: " + student.getStudentName() + " enrolled in Course: " + course.getCourseName());
    }

    @Override
    public void dropStudent(Student student, Course course) {
        enrollments.remove("Student: " + student.getStudentName() + " enrolled in Course: " + course.getCourseName());
    }

    @Override
    public void displayEnrollmentDetails() {
        System.out.println("Enrollment Details:");
        for (String enrollment : enrollments) {
            System.out.println(enrollment);
        }
        System.out.println();
    }
}
