package com.gentech.files;

import java.io.File;
import java.io.IOException;

public class FileOperationDemo {
    public static void main(String[] args) {
        //createFile();
        //renameFile();
        //deleteFile();
        filesCollection();
    }

    public static void createFile(){
        try {
            File f1 = new File("E:\\Gentech\\Java\\Sample");
            boolean v1 =f1.createNewFile();
            System.out.println("Whether new file created?: "+v1);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void renameFile(){
        File f1 = new File("E:\\Gentech\\Java\\Sample");
        File f2 = new File("E:\\Gentech\\Java\\SampleFile");
        boolean v1 = f1.renameTo(f2);
        System.out.println("Whther file renamed?: "+ v1);
    }

    public static void deleteFile(){
        File f2 = new File("E:\\Gentech\\Java\\SampleFile");
        boolean v1 = f2.delete();
        System.out.println("Whethr file deletd?: "+v1);
    }

    public static void filesCollection(){
        File f2 = new File("E:\\Gentech\\Java");
        File f[] = f2.listFiles();
        for (int i =0; i<f.length; i++){
            if (f[i].isFile()==true){
                String path=f[i].getAbsolutePath();
                System.out.println(path);

            }
        }
    }
}
