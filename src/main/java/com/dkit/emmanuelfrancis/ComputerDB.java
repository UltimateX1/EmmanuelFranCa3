package com.dkit.emmanuelfrancis;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ComputerDB {
    private ArrayList<Computer> computers;
    private static Scanner keyboard = new Scanner(System.in);

    public ComputerDB() {
        this.computers = new ArrayList<>();
    }

    protected void loadComputerFromFile() {
        try (Scanner computerFile = new Scanner(new BufferedReader
                (new FileReader("computer.txt")))) {
            String input;
            while (computerFile.hasNextLine()) {
                input = computerFile.nextLine();
                String[] data = input.split(",");
                String manufacturer = data[0];
                String processor = data[1];
                String ramSize = data[2];
                String diskSize = data[3];
                String weight = data[4];
                String assetTag = data[5];
                String purchaseDate = data[6];


                Computer readInComputer = new Computer(manufacturer, processor, ramSize, diskSize, weight, assetTag, purchaseDate);
                this.computers.add(readInComputer);
            }
        } catch (FileNotFoundException fne) {
            System.out.println(Colours.BLUE + "Could not load computers. If this is " +
                    "the first time running the program this could be fine" + Colours.RESET);
        }
    }
}
