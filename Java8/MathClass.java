package Java8;

public class MathClass {
    public static void main(String[] args) {
        // Math has a private constructor, hence we cannot instanciate an object of it,
        // and it has all the static methods.
//        Math math = new Math();

        System.out.println(Math.max(10, 10.2));

    }
}
