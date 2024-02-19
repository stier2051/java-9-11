package mun.cookbook.interfaces;

import java.io.FileInputStream;
import java.io.IOException;

public interface PrivateMethodInterface {
    default void method1() {
        System.out.println("In method 1");
        try {
            utilResource();
        } catch (IOException e) {
            //TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    default void method2() {
        System.out.println("In method 2");
        try {
            utilResource();
        } catch (IOException e) {
            //TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    //private method for sharing common resource across default methods
    private void utilResource() throws IOException {
        System.out.println("==Reading common resources== ");
//        FileInputStream fis = new FileInputStream("data.dat");
//        while (fis.read() != -1) {
//            //Some business logic
//        }
    }
}
