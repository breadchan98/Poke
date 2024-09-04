package CharChoice;

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CharSelect {
    public String str;
    File fileName = new File("C:\\Users\\brent\\Desktop\\Poke\\CharChoice\\Char.txt");
    
    public void wordToString(String s) {
        this.str = s;
    }
    public void choiceDeclared() {
        System.out.println("You chose: " + str + "!");
    }
    public void briefDesc() {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(str)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
