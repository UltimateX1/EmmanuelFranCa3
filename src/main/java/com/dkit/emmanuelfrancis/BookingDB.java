package com.dkit.emmanuelfrancis;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class BookingDB {
    private ArrayList<Booking> bookings;
    private static Scanner keyboard = new Scanner(System.in);

    public BookingDB() {
        this.bookings = new ArrayList<>();
    }

    protected void loadBookingFromFile() {
        try (Scanner bookingFile = new Scanner(new BufferedReader
                (new FileReader("bookings.txt")))) {
            String input;
            while (bookingFile.hasNextLine()) {
                input = bookingFile.nextLine();
                String[] data = input.split(",");
                String bookingId = data[0];
                String dateTime = data[1];
                String returnDateTime = data[2];
                String type = data[3];
                String assetTag = data[4];
                String studentId = data[5];


                Booking readInBooking = new Booking(bookingId, dateTime, returnDateTime, type, assetTag, studentId);
                this.bookings.add(readInBooking);
            }
        } catch (FileNotFoundException fne) {
            System.out.println(Colours.BLUE + "Could not load bookings. If this is " +
                    "the first time running the program this could be fine" + Colours.RESET);
        }
    }
}
