package com.company;

import java.util.Scanner;

public class Cesar {

    private String text;
     private String cesarText;
    private int number;

    public String getText(){
        Scanner read = new Scanner(System.in);
        text = read.nextLine();


        return text;
    }

    public int shift(){

        Scanner read = new Scanner(System.in);
        number = read.nextInt();

        return number;
    }

    public String changeToCesar(String text, int number){

        int lenght = text.length();
        StringBuilder cesarString = new StringBuilder();
        for(int i=0;i<lenght;i++)
        {

            int tmp = (int)text.charAt(i);

                if(tmp>=65 && tmp<=90){

                    int tmp2 = ((text.charAt(i)+number-65)%26 +65);

                    char y = (char)tmp2;


                    cesarString.append(y);
                }
                else if(tmp>=97 && tmp<=122){
                    int tmp2 = ((text.charAt(i)+number-97)%26 +97);
                    char y = (char)tmp2;
                    cesarString.append(y);

                    }
                else{
                    cesarString.append(" ");
        }





        }

        cesarText = cesarString.toString();
        System.out.println(cesarText);

        return cesarText;
    }

    public String changeToNormal(String text, int number){

        int lenght = text.length();
        StringBuilder cesarString = new StringBuilder();
        for(int i=0;i<lenght;i++)
        {

            int tmp = (int)text.charAt(i);

            if(tmp>=65 && tmp<=90){

                int tmp2 = ((text.charAt(i)+65-number)%26 + 65);
                char y = (char)tmp2;
                cesarString.append(y);
            }
            else if(tmp>=97 && tmp<=122){
                int tmp2 = ((text.charAt(i)+111-number)%26 +97);
                char y = (char)tmp2;
                cesarString.append(y);

            }    else{
                cesarString.append(" ");
            }





        }

        cesarText = cesarString.toString();
        System.out.println(cesarText);

        return cesarText;
    }



}
