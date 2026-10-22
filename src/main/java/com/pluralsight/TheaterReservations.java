package com.pluralsight;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Variables
        System.out.print("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String date = input.nextLine();

        System.out.print("How many tickets would you like: ");
        int ticket = input.nextInt();

        // Variables for name for print
        int spaceIndex = fullName.indexOf(" ");
        String firstName = fullName.substring(0, spaceIndex);
        fullName = fullName.substring(spaceIndex).trim();
        String lastName = fullName.substring(0);

        /*int indexOfSpace = fullName.indexOf(" ");
        String firstName = fullName.substring(0, indexOfSpace);
        String lastName = fullName.substring(indexOfSpace + 1);*/

        System.out.println(lastName + ", " + firstName);

        //Date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate movieDate = LocalDate.parse(date, formatter);
        // Printing a LocalDate gives the ISO format yyyy-MM-dd, e.g. 2023-05-13

        System.out.println(movieDate);

        // If statement for tickets
        /*if(ticket > 1){
            String ticketString = "Tickets";
        } else {
            String ticketString = "Ticket";
        }*/

        String ticketString = ticket == 1 ? " ticket" : " tickets";


        String confirmationMessage = ticket + ticketString + " reserved for " + movieDate + " under " + lastName + ", " + firstName;
        System.out.println(confirmationMessage);

        input.close();

    }
}
