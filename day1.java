public class day1 {
    public int studentId;
    public String name;
    public int age;
    public double percentage;
    public String course;
    public String email;
    public String phoneNumber;

    public day1(int studentId, String name, int age, double percentage, String course, String email,
            String phoneNumber) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.percentage = percentage;
        this.course = course;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void displayInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Course: " + course);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
    }

    public static void main(String[] args) {
        day1 s1 = new day1(101, "Kajal", 21, 85, "CSE", "kajal@example.com", "123-456-7890");
        day1 s2 = new day1(102, "Sana", 20, 75, "Maths", "sana@example.com", "123-456-7890");
        day1 s3 = new day1(103, "Nancy", 16, 80, "ME", "nancy@example.com", "123-456-7890");
        day1 s4 = new day1(104, "Kunal", 13, 64, "EE", "kunal@example.com", "123-456-7890");
        day1 s5 = new day1(105, "Ria", 22, 88, "Cloud", "ria@example.com", "123-456-7890");
        System.out.println("Student Information:");
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
        s4.displayInfo();
        s5.displayInfo();
    }

}