package SMS;

public class Student {
    private String name;
    private int rollNo;
    private String course;

    Student(String name, int rollNo, String course) {
        this.course = course;
        this.rollNo = rollNo;
        this.name = name;
    }

    void showDetails() {
        System.out.println("Name:" + name);
        System.out.println("Roll No:" + rollNo);
        System.out.println("Course Name:" + course);
    }
}
