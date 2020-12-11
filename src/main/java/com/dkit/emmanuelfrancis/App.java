package com.dkit.emmanuelfrancis;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Scanner keyboard = new Scanner(System.in);
    public static void main( String[] args )
   {        //Computer computer1 = new Computer("Dell", "Intel Core i5 9th Gen", "8GB", "1TB", "3.5kg", "DKIT-24105", "18-11-20");
//        System.out.println("The attributes of computer 1 are " + computer1);
//        Student student1 = new Student("Ben Walker", "D001228292", "ben.walker@dkit.ie", "083-3399778", "DKIT-24105, DKIT-12345");
//        System.out.println("The attributes of the student are " + student1);
//        Booking booking1 = new Booking("1200", "18-11-20, 09:00", "30-11-20, 09:00", "Laptop", "Dkit_24105", "D001228292");
//        System.out.println("The attributes of booking one are " + booking1);


        App mainApp = new App();
        mainApp.start();
    }

    private void start() {
        System.out.println(Colours.BLUE + "Welcome to the " +
                "main menu" + Colours.RESET);
        ComputerDB computerDB = new ComputerDB();
       computerDB.loadComputerFromFile();
       StudentDB studentDB = new StudentDB();
       studentDB.loadStudentFromFile();
       BookingDB bookingDB = new BookingDB();
       bookingDB.loadBookingFromFile();


        doMainMenuLoop(computerDB,studentDB, bookingDB);
    }

    private void doMainMenuLoop(ComputerDB computerDB, StudentDB studentDB, BookingDB bookingDB) {
        boolean loop = true;
        MainMenu menuOption;
        int option = -1;
        while(loop)
        {
            printMainMenu();
            try{
                String input = keyboard.nextLine();
                if(input.isEmpty() || input.length() > 1)
                {
                    throw new IllegalArgumentException();
                }
                else
                {
                    option = Integer.parseInt(input);
                }

                //keyboard.nextLine();
                menuOption = MainMenu.values()[option];
                switch(menuOption)
                {
                    case QUIT_APPLICATION:
                        loop = false;
                        break;
                    case DISPLAY_BOOKINGS_MENU:
                        doBookingMainMenuLoop(bookingDB);
                        break;
                    case DISPLAY_STUDENT_MENU:
                        //doStudentMainMenuLoop(studentDB);
                        break;
                    case DISPLAY_COMPUTER_MENU:
                        //doComputerMainMenuLoop(computerDB);
                        break;

                }
            }
            catch (InputMismatchException ime)
            {
                System.out.println(Colours.RED + "Please enter a valid option" + Colours.RESET);
            }
        }
        System.out.println(Colours.BLUE + "Thanks for the using the app" + Colours.RESET);
    }

    private void printMainMenu() {
        System.out.println("\n Options to select:");
        for(int i=0; i < MainMenu.values().length; i++)
        {
            System.out.println("\t" + Colours.BLUE + i + ". " + MainMenu.values()
                    [i].toString()+Colours.RESET);
        }
        System.out.print("Enter a number to select the option (0 to quit):>");
    }

    private void doBookingMainMenuLoop(BookingDB bookingDB) {
        boolean loop = true;
        bookingMainMenu menuOption;
        int option;
        while(loop)
        {
            printBookingMainMenu();
            try{
                if(keyboard.hasNext())
                {
                    option = keyboard.nextInt();
                }
                else
                {
                    throw new IllegalArgumentException();
                }
                if(option < 0 || option >= MainMenu.values().length){
                    throw new IllegalArgumentException();
                }
                keyboard.nextLine();
                menuOption = bookingMainMenu.values()[option];
                switch(menuOption)
                {
                    case QUIT_BOOKING_MENU:
                        loop = false;
                        break;
                    case ADD_BOOKING:
                        //bookingDB.addBooking();
                        break;
                    case DELETE_BOOKING:
                        //bookingDB.deleteBooking();
                        break;
                    case PRINT_BOOKING:
                        //bookingDB.printBooking();
                        break;
                }
            }
            catch (InputMismatchException ime)
            {
                System.out.println(Colours.RED + "Please enter a valid option" + Colours.RESET);
                keyboard.nextLine();
            }
            catch (IllegalArgumentException iae)
            {
                System.out.println(Colours.RED + "Please enter a valid option" + Colours.RESET);
                keyboard.nextLine();
            }
        }
        System.out.println(Colours.BLUE + "Thanks for the using the app" + Colours.RESET);
    }

    private void printBookingMainMenu() {
        System.out.println("\n Options to select:");
        for(int i=0; i < bookingMainMenu.values().length; i++)
        {
            System.out.println("\t" + Colours.BLUE + i + ". " + bookingMainMenu.values()
                    [i].toString()+Colours.RESET);
        }
        System.out.print("Enter a number to select the option (0 to quit):>");
    }
/*
    private void doPlayerMainMenuLoop(PlayerDB playerDB) {
        boolean loop = true;
        playerMainMenu menuOption;
        int option;
        while(loop)
        {
            printPlayerMainMenu();
            try{
                if(keyboard.hasNext())
                {
                    option = keyboard.nextInt();
                }
                else
                {
                    throw new IllegalArgumentException();
                }
                if(option < 0 || option >= MainMenu.values().length){
                    throw new IllegalArgumentException();
                }
                keyboard.nextLine();
                menuOption = playerMainMenu.values()[option];
                switch(menuOption)
                {
                    case QUIT_PLAYER_MENU:
                        loop = false;
                        break;
                    case ADD_PLAYER:
                        playerDB.addPlayer();
                        break;
                    case DELETE_PLAYER:
                        playerDB.deletePlayer();
                        break;
                    case PRINT_PLAYER:
                        playerDB.printPlayer();
                        break;
                }
            }
            catch (InputMismatchException ime)
            {
                System.out.println(Colours.RED + "Please enter a valid option" + Colours.RESET);
                keyboard.nextLine();
            }
            catch (IllegalArgumentException iae)
            {
                System.out.println(Colours.RED + "Please enter a valid option" + Colours.RESET);
                keyboard.nextLine();
            }
        }
        System.out.println(Colours.BLUE + "Thanks for the using the app" + Colours.RESET);
    }

    private void doPlayerMainMenuLoop(PlayerDB playerDB) {
        boolean loop = true;
        playerMainMenu menuOption;
        int option;
        while(loop)
        {
            printPlayerMainMenu();
            try{
                if(keyboard.hasNext())
                {
                    option = keyboard.nextInt();
                }
                else
                {
                    throw new IllegalArgumentException();
                }
                if(option < 0 || option >= MainMenu.values().length){
                    throw new IllegalArgumentException();
                }
                keyboard.nextLine();
                menuOption = playerMainMenu.values()[option];
                switch(menuOption)
                {
                    case QUIT_PLAYER_MENU:
                        loop = false;
                        break;
                    case ADD_PLAYER:
                        playerDB.addPlayer();
                        break;
                    case DELETE_PLAYER:
                        playerDB.deletePlayer();
                        break;
                    case PRINT_PLAYER:
                        playerDB.printPlayer();
                        break;
                }
            }
            catch (InputMismatchException ime)
            {
                System.out.println(Colours.RED + "Please enter a valid option" + Colours.RESET);
                keyboard.nextLine();
            }
            catch (IllegalArgumentException iae)
            {
                System.out.println(Colours.RED + "Please enter a valid option" + Colours.RESET);
                keyboard.nextLine();
            }
        }
        System.out.println(Colours.BLUE + "Thanks for the using the app" + Colours.RESET);
    }*/

}

