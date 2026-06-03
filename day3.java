//extends keyword
//Single inheritance
//Method inheritance
//Constructor chaining using super

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void Display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    public int studentId;
    public String course;

    public Student(String name, int age, int studentId, String course) {
        super(name, age);
        this.studentId = studentId;
        this.course = course;
    }

    public void Display() {
        super.Display();
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
    }
}

class Teacher extends Person {
    public int employeeId;
    public String subject;

    public Teacher(String name, int age, int employeeId, String subject) {
        super(name, age);
        this.employeeId = employeeId;
        this.subject = subject;
    }

    public void Display() {
        super.Display();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Subject: " + subject);
    }
}

public class day3 {
    public static void main(String[] args) {
        Student student = new Student("Kajal", 21, 12345, "CSE");
        Teacher teacher = new Teacher("Mr. Sam", 45, 4566, "Maths");
        System.out.println("Student Information:");
        student.Display();
        System.out.println("Teacher Information:");
        teacher.Display();
    }
}