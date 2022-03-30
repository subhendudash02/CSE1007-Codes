package Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class serialization implements Serializable {
    int id;
    String name;
    public serialization(int i, String n) {
        this.id = i;
        this.name = n;
    }

    public static void main(String[] args) {
        try {
            serialization s = new serialization(101, "Ram");
            FileOutputStream f = new FileOutputStream("emp.txt");
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(s);
            o.flush();
            o.close();
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
