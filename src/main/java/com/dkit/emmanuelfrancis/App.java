package com.dkit.emmanuelfrancis;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {        Computer computer1 = new Computer("Dell", "Intel Core i5 9th Gen", "8GB", "1TB", "3.5kg", "DKIT-24105", "18-11-20");

        System.out.println("The attributes of computer 1 are " + computer1);

        Student student1 = new Student("Ben Walker", "D001228292", "ben.walker@dkit.ie", "083-3399778", "DKIT-24105, DKIT-12345");

        System.out.println("The attributes of the student are " + student1);

        Booking booking1 = new Booking("1200", "18-11-20, 09:00", "30-11-20, 09:00", "Laptop", "Dkit_24105", "D001228292");

        System.out.println("The attributes of booking one are " + booking1);
    }
}

