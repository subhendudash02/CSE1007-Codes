package Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class deserialization implements Serializable {
    public static void main(String[] args) {
        try {
            FileInputStream f = new FileInputStream("emp.txt");
            ObjectInputStream o = new ObjectInputStream(f);
            serialization s = (serialization)o.readObject();
            System.out.println(s.id + " " + s.name);
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
