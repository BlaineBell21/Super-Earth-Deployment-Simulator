package com.pluralsight;


import com.pluralsight.ui.CharacterCreatorMenu;
import com.pluralsight.utils.InputReader;

import java.io.IOException;


public class Main {
     static void main(String[] args) throws IOException {
         //initializes main weapon reference to use between classes
         InputReader mainWeaponReferance = new InputReader();
         InputReader.weaponReader(); //initial loading of weapon inventory
         //CharacterCreatorMenu.helldiverCreator(mainWeaponReferance);
        CharacterCreatorMenu.helldiverCreator(mainWeaponReferance);
         //MainMenu.mainMenuUI();
        //MainMenu.mainMenuOptions();
         //CharacterCreatorMenu.collectAmountOfPlayers();
    }
}
