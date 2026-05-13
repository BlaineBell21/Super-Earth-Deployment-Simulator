package com.pluralsight;

import com.pluralsight.model.weapons.Weapon;
import com.pluralsight.ui.CharacterCreatorMenu;
import com.pluralsight.utils.InputReader;
import java.io.IOException;
import java.util.ArrayList;


public class Main {
     static void main(String[] args) throws IOException {
         //initializes main weapon reference to use between classes
         ArrayList<Weapon> mainWeaponReferance = InputReader.weaponReader();
       //  InputReader.weaponReader(); //initial loading of weapon inventory
        CharacterCreatorMenu.helldiverCreator(mainWeaponReferance);

    }
}
