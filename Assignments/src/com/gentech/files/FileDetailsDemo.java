package com.gentech.files;

import java.io.File;

public class FileDetailsDemo {
    public static void main(String[] args) {
        File f1 = new File("E:\\Gentech\\Java\\FirstFile.txt");
        //Display name of the file
        String name= f1.getName();
        System.out.println("File name: "+ name);

        //Display file path
        String path = f1.getAbsolutePath();
        System.out.println("Path of the file: "+ path);

        //Display is it a file
        File f = f1.getAbsoluteFile();
        System.out.println("Is it a file?: "+ f);

        //verify that is it a file
        boolean v1 = f1.isFile();
        System.out.println("Is it a file?: "+v1);

        //verify the file can be readable
        boolean v2 = f1.canRead();
        System.out.println("Can file readable?:"+v2);



    }
}
