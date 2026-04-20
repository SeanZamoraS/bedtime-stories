package com.pluralsight;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class StoryRead
{
    static Scanner userInput = new Scanner(System.in);
    static FileReader fileReader1;
    static FileReader fileReader2;
    static FileReader fileReader3;

    public void main() throws InterruptedException {
        System.out.println("""
                Which story would you like to read? 
                Enter 1, 2, or 3
                
                1) Goldilocks
                2) Hansel and Gretel
                3) Mary Had a Little Lamb\n""");

        try
        {
            this.fileReader1 = new FileReader("goldilocks.txt");
            this.fileReader2 = new FileReader("hansel_and_gretel.txt");
            this.fileReader3 = new FileReader("mary_had_a_little_lamb.txt");
        }
        catch(Exception ex)
        {
            System.out.println("Oops, missing story files/wrong path. Exiting program.");
        }

        String userChoice = userInput.nextLine();


        try {
            switch(userChoice)
            {
                case "1":
                    BufferedReader reader1 = new BufferedReader(fileReader1);
                    String line = reader1.readLine();
                    while(line != null)
                    {
                        System.out.println(line);
                        Thread.sleep(250);
                        line = reader1.readLine();
                    }
                    reader1.close();
                    break;

                case "2":
                    BufferedReader reader2 = new BufferedReader(fileReader2);
                    String line2 = reader2.readLine();
                    while(line2 != null)
                    {
                        System.out.println(line2);
                        Thread.sleep(250);
                        line2 = reader2.readLine();
                    }
                    reader2.close();
                    break;

                case "3":
                    BufferedReader reader3 = new BufferedReader(fileReader3);
                    String line3 = reader3.readLine();
                    while(line3 != null)
                    {
                        System.out.println(line3);
                        Thread.sleep(250);
                        line3 = reader3.readLine();
                    }
                    reader3.close();
                    break;

                default:
                    System.out.println("Enter a valid number.");
                    main();
                    break;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}