
package uff.ic.lleme.tcc00328.s20202.exercicios.scratch3;

import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.FileNotFoundException;
        
public class main {
    public static String save_load = "src/main/java/uff/ic/lleme/tcc00328/s20202/exercicios/"
            + "scratch3/testes.txt";
    public static teste testes = new teste(5);
    public static teste obj;
    
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        System.out.println(testes.getUm());
        
        testes.setUm(1);
        save(testes, "save_load");
        load(obj, "save_load");
        
        System.out.println(obj.getUm());
        
    }
    
    public static void save(Object obj, String file) throws FileNotFoundException, IOException {
        try (OutputStream out = new FileOutputStream(file, false);) {
            ObjectOutputStream s = new ObjectOutputStream(out);
            s.writeObject(obj);
            s.flush();
        }
    }
    
    public static void load(Object obj, String file) throws FileNotFoundException, IOException, ClassNotFoundException {
        try (InputStream in = new FileInputStream(file);) {
            ObjectInputStream s = new ObjectInputStream(in);
            obj = s.readObject();
        }
    }
    
}
