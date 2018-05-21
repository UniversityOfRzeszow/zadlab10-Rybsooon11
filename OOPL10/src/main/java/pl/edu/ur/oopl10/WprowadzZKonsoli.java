/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author twork
 */
public class WprowadzZKonsoli {
    
     static public void wprowadzInt() {
        Scanner input = new Scanner(System.in); 
         try {
            System.out.println("Podaj int");
            int test = input.nextInt();
            FileReader fr = new FileReader("test.txt");
            BufferedReader br = new BufferedReader(fr);
            String output = br.readLine();
            br.close();
            FileWriter fwo = new FileWriter("test.txt");
            BufferedWriter bwo = new BufferedWriter(fwo);
            bwo.write(test);
            bwo.newLine();
            bwo.close();
        } catch (FileNotFoundException z) {
            System.out.print("Wyjątek  braku pliku ");
            System.out.println(z.getMessage());
        } catch (Exception w) {
            System.out.print("Wyjątek: ");
            System.out.println(w.getMessage());
        }
    }
    static public void wprowadzChar() {
        Scanner input = new Scanner(System.in); 
         try {
             System.out.println("Podaj char");
           char test = input.next().charAt(0);
            FileReader fr = new FileReader("test.txt");
            BufferedReader br = new BufferedReader(fr);
            String output = br.readLine();
            br.close();
            FileWriter fwo = new FileWriter("test.txt");
            BufferedWriter bwo = new BufferedWriter(fwo);
            bwo.write(test);
            bwo.newLine();
            bwo.close();
        } catch (FileNotFoundException z) {
            System.out.print("Wyjątek  braku pliku ");
            System.out.println(z.getMessage());
        } catch (Exception w) {
            System.out.print("Wyjątek: ");
            System.out.println(w.getMessage());
        }
    }
    static public void wprowadzString() {
        Scanner input = new Scanner(System.in); 
         try {
             System.out.println("Podaj string");
           String test = input.nextLine();
            FileReader fr = new FileReader("test.txt");
            BufferedReader br = new BufferedReader(fr);
            String output = br.readLine();
            br.close();
            FileWriter fwo = new FileWriter("test.txt");
            BufferedWriter bwo = new BufferedWriter(fwo);
            bwo.write(test);
            bwo.newLine();
            bwo.close();
        } catch (FileNotFoundException z) {
            System.out.print("Wyjątek  braku pliku ");
            System.out.println(z.getMessage());
        } catch (Exception w) {
            System.out.print("Wyjątek: ");
            System.out.println(w.getMessage());
        }
    }
    static public void wprowadzLong() {
        Scanner input = new Scanner(System.in); 
         try {
             System.out.println("Podaj long");
           long test = input.nextLong();
            FileReader fr = new FileReader("test.txt");
            BufferedReader br = new BufferedReader(fr);
            String output = br.readLine();
            br.close();
            FileWriter fwo = new FileWriter("test.txt");
            BufferedWriter bwo = new BufferedWriter(fwo);
            bwo.write((int) test);
            bwo.newLine();
            bwo.close();
        } catch (FileNotFoundException z) {
            System.out.print("Wyjątek  braku pliku ");
            System.out.println(z.getMessage());
        } catch (Exception w) {
            System.out.print("Wyjątek: ");
            System.out.println(w.getMessage());
        }
    }
    static public void wprowadzShort() {
        Scanner input = new Scanner(System.in); 
         try {
             System.out.println("Podaj short");
           short test = input.nextShort();
            FileReader fr = new FileReader("test.txt");
            BufferedReader br = new BufferedReader(fr);
            String output = br.readLine();
            br.close();
            FileWriter fwo = new FileWriter("test.txt");
            BufferedWriter bwo = new BufferedWriter(fwo);
            bwo.write(test);
            bwo.newLine();
            bwo.close();
        } catch (FileNotFoundException z) {
            System.out.print("Wyjątek  braku pliku ");
            System.out.println(z.getMessage());
        } catch (Exception w) {
            System.out.print("Wyjątek: ");
            System.out.println(w.getMessage());
        }
    }
    static public void wprowadzFloat() {
        Scanner input = new Scanner(System.in); 
         try {
             System.out.println("Podaj float");
          float test = input.nextFloat();
            FileReader fr = new FileReader("test.txt");
            BufferedReader br = new BufferedReader(fr);
            String output = br.readLine();
            br.close();
            FileWriter fwo = new FileWriter("test.txt");
            BufferedWriter bwo = new BufferedWriter(fwo);
            bwo.write((int) test);
            bwo.newLine();
            bwo.close();
        } catch (FileNotFoundException z) {
            System.out.print("Wyjątek  braku pliku ");
            System.out.println(z.getMessage());
        } catch (Exception w) {
            System.out.print("Wyjątek: ");
            System.out.println(w.getMessage());
        }
    }
    static public void wprowadzDouble() {
        Scanner input = new Scanner(System.in); 
         try {
             System.out.println("Podaj double");
          double test = input.nextDouble();
            FileReader fr = new FileReader("test.txt");
            BufferedReader br = new BufferedReader(fr);
            String output = br.readLine();
            br.close();
            FileWriter fwo = new FileWriter("test.txt");
            BufferedWriter bwo = new BufferedWriter(fwo);
            bwo.write((int) test);
            bwo.newLine();
            bwo.close();
        } catch (FileNotFoundException z) {
            System.out.print("Wyjątek  braku pliku ");
            System.out.println(z.getMessage());
        } catch (Exception w) {
            System.out.print("Wyjątek: ");
            System.out.println(w.getMessage());
        }
    }
    
}
