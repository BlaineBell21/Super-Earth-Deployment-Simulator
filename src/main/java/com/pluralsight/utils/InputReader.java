package com.pluralsight.utils;

import com.pluralsight.model.Weapon;

import java.io.*;
import java.util.ArrayList;

public class InputReader {
    private static final ArrayList<Weapon> weapons = new ArrayList<>();

    public static ArrayList<Weapon> weaponReader() throws IOException {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/weaponsList"));

            String line;
            reader.readLine(); //allows reader to skip first line that shows the file formatting
            while((line = reader.readLine()) != null) {

                String[] parts = line.split("\\|");

                String weaponName = parts[0].trim();
                String weaponType = parts[1].trim();
                int damage = Integer.parseInt(parts[2].trim());
                String penetrationLevel = parts[3].trim();
                double recoil = Double.parseDouble(parts[4].trim());
                weapons.add(new Weapon(damage, penetrationLevel, weaponName, weaponType, recoil));
                //reads csv file and adds transactions into array to be accessed elsewhere
            }
            reader.close();
        } catch (IOException e){
            System.out.println("File not found");
        }
        return weapons;
    }
}
