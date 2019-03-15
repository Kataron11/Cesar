package com.company;

import java.io.*;

public class Files {


    String line = null;


    public void saveFile(){

        Cesar cesar = new Cesar();
        try {

            BufferedWriter writerCesar = new BufferedWriter(new FileWriter("cesar.txt",false));
            writerCesar.append(cesar.changeToCesar(cesar.getText(),cesar.shift()));
            writerCesar.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void saveNormalFile(String x){

        try {

            BufferedWriter writerCesar = new BufferedWriter(new FileWriter("cesar.txt",false));
            writerCesar.append(x);
            writerCesar.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFile(){

        try {
            FileReader readCesar = new FileReader("cesar.txt");
            BufferedReader bufferedCesar = new BufferedReader(readCesar);

            while ((line=bufferedCesar.readLine()) != null){
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void descriptFile(){
        Cesar cesar = new Cesar();
        try {
            FileReader readCesar = new FileReader("cesar.txt");
            BufferedReader bufferedCesar = new BufferedReader(readCesar);
            System.out.print("O ile przesunać: ");
            int shift = cesar.shift();

            while ((line=bufferedCesar.readLine()) != null){
                saveNormalFile(cesar.changeToNormal(line,shift));

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
