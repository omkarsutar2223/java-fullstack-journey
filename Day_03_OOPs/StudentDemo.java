// make student name class
class Student {
    String name;
    int rollNo;

    // make a method
    void showDetailes() {
        System.out.println("Name:" +  name);
        System.out.println("Roll No:" +  rollNo);

    }
}

public class StudentDemo {
    public static void main(String[] args) {
        // create an object
        Student s1 = new Student();

        s1.name = "omkar";
        s1.rollNo = 21;

        s1.showDetailes();
    }

}