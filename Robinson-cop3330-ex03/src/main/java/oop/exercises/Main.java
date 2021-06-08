package oop.exercises;
/*
 * UCF cop3330 Summer 2021 Assignment 1 solutions
 * Copyright 2021 Keondez Robinson
 */

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("What is the quote?");
        Scanner input = new Scanner(System.in);
        String userQuote = "\"" + input.nextLine() + "\"";

        System.out.println("Who said it?");
        String userAuthor = input.nextLine();

        System.out.println(userAuthor + " says, " +  userQuote );


    }
}
