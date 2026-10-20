package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Variables
        System.out.print("Enter your full name: ");
        String fullName = input.nextLine();
        System.out.print("Enter the date of movie: ");
        String date = input.nextLine();
        System.out.print("Enter number of ticket(s): ");
        int ticket = input.nextInt();

        // Variables for name for print
        int spaceIndex = fullName.indexOf(" ");
        String firstName = fullName.substring(0, spaceIndex);
        fullName = fullName.substring(spaceIndex).trim();
        String lastName = fullName.substring(0);
        System.out.println(lastName + ", " + firstName);

        //Date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate movieDate = LocalDate.parse(date, formatter);

        System.out.println(movieDate);

        input.close();

    }
}
