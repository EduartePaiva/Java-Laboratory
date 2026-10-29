import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationLesson {
    void main() throws IOException, ClassNotFoundException {
        UserSerialization user = new UserSerialization();

        user.name = "Bro";
        user.password = "I<3pizza";

        FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);

        out.close();
        fileOut.close();

        System.out.println("object info saved! :)");

        UserSerialization deserializedUser;

        FileInputStream fileIn = new FileInputStream("UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        deserializedUser = (UserSerialization) in.readObject();

        in.close();
        fileIn.close();

        System.out.println(
                "Data deserialized:\nname: " + deserializedUser.name + "\npassword:" + deserializedUser.password);

    }

}

class UserSerialization implements Serializable {
    String name;
    String password;

    public void sayHello() {
        System.out.println("Hello " + name);
    }
}
