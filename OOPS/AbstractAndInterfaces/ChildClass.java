package OOPS.AbstractAndInterfaces;

/**
 * Through interfaces, we can achieve multiple inheritance.
 */

public class ChildClass extends AbstractClass implements InterfaceClass{
    @Override
    public void implementThisAbstractMethod() {
        System.out.println("Abstract method from abstract class");
    }

    @Override
    public void implementInterfaceMethod() {
        System.out.println("Abstract method from interface");
    }
}
