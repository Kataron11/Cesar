package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        main.task();

    }


    public void task(){

        Files fileCesar = new Files();
        int x;
        System.out.println("1-zaszyfrowanie 2-odczytanie 3-odszyfrowanie");
        Scanner read = new Scanner(System.in);
        x = read.nextInt();
        switch (x){
            case 1:
                System.out.print("Co chcesz zaszyfrowac: ");
                fileCesar.saveFile();
                task();

            case 2:
                System.out.print("Zaszyfrowany plik: ");
                fileCesar.readFile();
                task();

            case 3:
                fileCesar.descriptFile();

                task();

                default:
                    System.out.println("Błą");
                    task();
        }
    }

}

