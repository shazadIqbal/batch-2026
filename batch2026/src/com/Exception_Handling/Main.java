//package com.Exception_Handling;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.StandardOpenOption;
//import java.sql.SQLOutput;
//
//public class Main {
//    public static void main(String[] args) {
//
//        String src = "src/file";
//
//    }
//
//
//    public static void readFIle(String src){
//
//        Path path = Path.of(src);
//
////        String content = Files.readString(path);
////        System.out.println(content);
//    }
//
//    public static void writeFile(String text, String src) {
//
//        Path path = Path.of(src);
//
//        try{
//            Files.writeString(path,text, StandardOpenOption.APPEND);
//        } catch (IOException e) {
//           e.printStackTrace();
//        }
//
//
//        }
//    }
//
//}