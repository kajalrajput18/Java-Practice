class demo {
    private int studentId;
    private String name;
    private int age;
    private double percentage;
    private String course;
    private String email;
    private String phoneNumber;

    public demo(int studentId, String name, int age, double percentage, String course, String email,
            String phoneNumber) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.percentage = percentage;
        this.course = course;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getPercentage() {
        return percentage;
    }

    public String getCourse() {
        return course;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

public class day2 {
    public static void main(String[] args) {
        demo s1 = new demo(101, "Kajal", 21, 85, "CSE", "kajal@example.com", "123-456-7890");
        demo s2 = new demo(102, "Sana", 20, 75, "Maths", "sana@example.com", "123-456-7890");
        demo s3 = new demo(103, "Nancy", 16, 80, "ME", "nancy@example.com", "123-456-7890");
        demo s4 = new demo(104, "Kunal", 13, 64, "EE", "kunal@example.com", "123-456-7890");
        demo s5 = new demo(105, "Ria", 22, 88, "Cloud", "ria@example.com", "123-456-7890");
        System.out.println("Student Information:");
        demo[] studentArray = { s1, s2, s3, s4, s5 };
        for (demo s : studentArray) {
            System.out.println("ID: " + s.getStudentId() + ", Name: " + s.getName() + ", Percentage: "
                    + s.getPercentage() + "%" + " Course: " + s.getCourse() + " Email: " + s.getEmail() + " Phone: "
                    + s.getPhoneNumber());
        }
    }

}
