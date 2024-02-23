package Serialization_And_Deserialization.serialization;

import java.io.Serializable;

public class User implements Serializable {

    String firstName;
    String lastName;

    transient String password;

    void printFullName(){
        System.out.printf("%s %s%n", this.firstName, this.lastName);
    }

}
