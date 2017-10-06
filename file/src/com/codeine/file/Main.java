package com.codeine.file;

import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

/**
 * Created by admin on 05.10.2017.
 */
public class Main {
    public static void main(String[] args) {
        fileExemp001();
        fileExemp002();
        fileExemp003();
        fileExemp003();
        fileExemp003();
        fileExemp004();
        fileExemp004();
        fileExemp005();

    }

    public static void fileExemp001() {
        try {
            File filePath = new File("text001.txt");
            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write("Hello World");
            fileWriter.close();

        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public static void fileExemp002() {
        try {
            File filePath = new File("text002.txt");
            BufferedWriter bufferedWriter =
                    new BufferedWriter(new FileWriter(filePath));
            bufferedWriter.write("Hello World ");
            bufferedWriter.flush();// Do not wait for execution, discard data on disk
            bufferedWriter.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public static void fileExemp003() {
        try {
            File filePath = new File("text003.txt");
            BufferedWriter bufferedWriter =
                    new BufferedWriter(new FileWriter(filePath, true));
            bufferedWriter.write("Hello World\n");
            bufferedWriter.flush();
            bufferedWriter.close();

        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public static void fileExemp004() {
        try {
            File filePath = new File("text004.txt");
            PrintWriter printWriter = new PrintWriter(
                    new BufferedWriter(new FileWriter(filePath, true)));
            printWriter.println("Hello World");
            printWriter.flush();
            printWriter.close();

        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public static void fileExemp005() {
        try {

            String path = "text005.txt";
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
