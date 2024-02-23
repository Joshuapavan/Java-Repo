package Serialization_And_Deserialization.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializerClass {
    public static void main(String[] args) {
        User user = new User();
        user.firstName = "Joshua";
        user.lastName = "Pavan";

        user.printFullName();

//        FileOutputStream fileOutputStream = new FileOutputStream(user);
    }
}
