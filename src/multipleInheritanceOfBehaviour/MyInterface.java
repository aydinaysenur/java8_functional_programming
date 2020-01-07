package multipleInheritanceOfBehaviour;

public interface MyInterface {
    default void defaultMethod() {
        System.out.println("Hello from the default method!");
    }

    void normalMethod();
}