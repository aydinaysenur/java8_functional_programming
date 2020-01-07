package multipleInheritanceOfBehaviour;

public interface MyInterface2 {
    default void defaultMethod() {
        System.out.println("Hello from the default method!");
    }

    void normalMethod();
}