package homeworktwofiles;

import java.io.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        InputStream in;
        OutputStream out;
        createfile("test.txt", "Hello \n");
        createfile("test2.txt", "GoodDay \n");
        seachWord("test.txt");


    }

    private static void createfile(String name,String text) {
      //  for (int i = 0; i<75; i++) {
            try {
                FileOutputStream fos = new FileOutputStream(name, true);
                for (int i = 0; i<5; i++) {
                fos.write(text.getBytes());}
                fos.close();

                FileInputStream fis = new FileInputStream(name);
                int b = 0;
                while (b != -1){
                    b = fis.read();
                    System.out.print((char) b);
                }
                System.out.println(fis.read());
                fis.close();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
       // }
    }
    private static void seachWord(String name){


        try {
            FileInputStream slo = new FileInputStream(name);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a seach word: ");
            String word = scanner.next();
            int b;
            do {
                b = 0;
                b = slo.read();
                if (word.equals((char)b)) {
                    System.out.println("Match is found");
                }else {System.out.println("Match is not found");}
            } while (b != -1);
            {
                // b = slo.read();
                // if (word.equals(b)){
                // System.out.println("Match is found");
                //else {System.out.println("Match is not found");}
            }
            System.out.println(slo.read());
            slo.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
