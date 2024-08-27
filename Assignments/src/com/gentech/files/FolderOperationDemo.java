package com.gentech.files;

import java.io.File;
public class FolderOperationDemo {
    public static void main(String[] args) {
        //createFolder();
        //createNestedFolder();
        //renameFolder();
        //deleteFolder();
        folderCollections();

    }

    public static void createFolder(){
        File f1 = new File("E:\\Gentech\\Java\\Hello");
        boolean v1 = f1.mkdir();
        System.out.println("Whther folder created?: "+v1);
    }

    public static void createNestedFolder(){
        File f1 = new File("E:\\Gentech\\Java\\Hello1\\Hello2");
        boolean v1 = f1.mkdirs();
        System.out.println("Whehter nestsed folder created?: "+v1);
    }

    public static void renameFolder(){
        File f1 =new File("E:\\Gentech\\Java\\Hello");
        File f2 = new File("E:\\Gentech\\Java\\HelloWolrd");
        boolean v1 = f1.renameTo(f2);
        System.out.println("Whether folder renamed?: "+ v1);
    }

    public static void deleteFolder(){
        File f2 = new File("E:\\Gentech\\Java\\HelloWolrd");
        boolean v1 = f2.delete();
        System.out.println("Whether folder deleted?: "+ v1);
    }

    public static void folderCollections(){
        File f1 = new File("E:\\Gentech\\Java");
        File f[] = f1.listFiles();
        for (int i = 0; i<f.length; i++) {
            if (f[i].isDirectory() == true) {
                String path = f[i].getAbsolutePath();
                System.out.println(path);
            }
        }
    }
}
