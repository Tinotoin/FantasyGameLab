import Pets.Ogre;
import Pets.Pet;
import Players.Mage.Cleric;
import Players.Mage.Wizard;
import Players.Player;
import Rooms.Room;
import Spells.Fireball;
import Spells.IAmASpell;
import Spells.LightningBolt;
import Spells.Spell;

import Pets.Blob;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner myObject = new Scanner(System.in);
        Room room = new Room("The dungeon");
        Fireball fireball = new Fireball("Flamey");
        LightningBolt lightningBolt = new LightningBolt("Zappy");


        System.out.println("Enter your name challenger!");
        String name = myObject.nextLine();

        System.out.println("Choose your character! [C] - Cleric, [W] - Warlock, [Z] - Wizard");
        String player =  myObject.nextLine();
        if (player == "Wizard"){
            System.out.println("Choose your pet! [B] - Blob, [O] Ogre");
            String pet = myObject.next();

            if (pet == "Blob") {
                    Blob friend = new Blob("Blobert");
                    Wizard character = new Wizard(name, friend, fireball);

             } else if (pet == "Ogre"){
            Ogre friend = new Ogre("Ogrish");
            Wizard character = new Wizard(name, friend, fireball);
            }
        }



    }

}
