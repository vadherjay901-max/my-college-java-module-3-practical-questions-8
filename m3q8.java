
final class A {

    // Final variable
    final int num = 100;

    // Final method
    final void display() {
        System.out.println("Final method is called");
        System.out.println("Final variable value: " + num);
    }
}

// Class B cannot extend class A
// because class A is final.

public class m3q8{
    public static void main(String[] args) {

        A obj = new A();

        // Calling final method
        obj.display();

        // obj.num = 200;  // Error: Cannot modify final variable
    }
}
