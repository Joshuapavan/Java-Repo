package OOPS.staticAndNonStatic;

public class Human{
    String name;
    int age;
    boolean isAdult;


    // No Argument constructor
    public Human(){

    }

    // All Arguments constructor / parameterized constructor
    public Human(String name, int age, boolean isAdult){
        this.name = name;
        this.age = age;
        this.isAdult = isAdult;
    }

    // copy constructor
    public Human(Human human){
        this.name = human.name;
        this.age = human.age;
        this.isAdult = human.isAdult;
    }


    public void introduce(){
        System.out.println("My name is "+this.name+", my age is "+this.age);
    }

    public  static void species(){
        System.out.println("This is human species");
    }
}
