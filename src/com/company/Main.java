package com.company;

import java.util.Scanner;

public class Main {


        public static void main (String[]args){

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please paste your file path");
            String filePath = scanner.nextLine();

            System.out.println("Your file extension is" + " " + getFileExtension(filePath));



        }

    private static String getFileExtension(String file) { if (file.lastIndexOf(".") != -1 && file.lastIndexOf(".") != 0)
        return file.substring(file.lastIndexOf(".") + 1);
    else throw new IllegalArgumentException("No extension");
    }
}


