package com.mycompany.ejemploflex1;

import mi.primer.scanner.Scanner;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ejemploJflex {
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            Reader r = new FileReader("prueba.txt");
            Scanner scan= new Scanner(r);
            scan.yylex();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }





}
