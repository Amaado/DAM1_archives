package org.rosalia.repaso;

import java.util.*;
public class Repaso1 {
    public static void main(String[] args) {
        Scanner dato=new Scanner(System.in);
        int c=0; System.out.println("Escriba una palabra");
        String palabra=dato.nextLine();
        char caracteres[]=new char[palabra.length()];
        System.out.println("caracteres: ");
        for(int i=0;i<palabra.length();i++){
            c=c+1;
            caracteres[i]=palabra.charAt(i);
            System.out.print(caracteres[i]+ "\t");
        }
        System.out.println("\nla cantidad de caracteres es : "+c);
    }
}
