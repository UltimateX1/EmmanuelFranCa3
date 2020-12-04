package com.dkit.emmanuelfrancis;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class BookingDB {
    private ArrayList<Booking> bookings;
    private static Scanner keyboard = new Scanner(System.in);

    public BookingDB()
    {
        this.bookings = new ArrayList<>();
    }

    protected void loadPlayerFromFile()
    {
        try(Scanner playersFile = new Scanner(new BufferedReader
                (new FileReader("players.txt"))))
        {
            String input;
            while(playersFile.hasNextLine())
            {
                input = playersFile.nextLine();
                String[] data = input.split(",");
                String name = data[0];
                int hitPoints = Integer.parseInt(data[1]);
                int strength = Integer.parseInt(data[2]);
                String weapon = data[3];

                Booking readInPlayer = new Booking(name, hitPoints, strength, weapon);
                this.players.add(readInPlayer);
            }
        }
        catch(FileNotFoundException fne)
        {
            System.out.println(Colours.BLUE + "Could not load players. If this is " +
                    "the first time running the program this could be fine" + Colours.RESET );
        }
}
