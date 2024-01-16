package OOPS.staticAndNonStatic;

import OOPS.staticAndNonStatic.Human;

public class MainClass {
    public static void main(String[] args) {
        Human human1 = new Human("Josh", 23, true);

        human1.introduce(); // Non-static method can be called using an object/instance of the class
        Human.species(); // static methods can be called using the class name and not using object/instance
    }
}


