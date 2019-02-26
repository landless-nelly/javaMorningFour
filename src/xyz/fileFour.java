package xyz;

import java.util.Scanner;

public class fileFour {
    public static void main(String[] args) {
        String[] wanafunzi;
        Integer number;
        Scanner chukua;
        chukua =new Scanner(System.in);
        System.out.println("How many students do you have?");
        number =chukua.nextInt();
        wanafunzi = new String[number];
        for (int i=0; i<number; i++){
            System.out.println("Enter the names");
            wanafunzi[i]  = chukua.next();
        }
        for (int i=0; i<number; i++){
            System.out.println(wanafunzi[i]);
        }
    }
}
