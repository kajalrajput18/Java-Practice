//Interface:- Only declaration, no logic. Logic can be implemented by subclass wwhich implements this interface.
interface flyable {
    public void fly();
}

interface swimmable {
    public void swim();
}

class Bird implements flyable, swimmable {
    public void fly() {
        System.out.println("Bird can fly");
    }

    public void swim() {
        System.out.println("Bird can swim");
    }
}

public class day6 {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.fly();
        b.swim();
    }
}