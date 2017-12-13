import Players.Healers.WhiteMage;
import Players.Magical.CreatureType;
import Players.Magical.MagicalType;
import Players.Magical.Warlock;
import Players.Magical.Witch;
import Players.NonMagical.*;
import Players.Player;
import Rooms.Enemies.Enemy;
import Rooms.Enemies.Orc;
import Rooms.Room1;
import Rooms.Treasures.Treasure;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Runner{

    private Room1 room1;
    private Player player1;
    private Player player2;
    private Treasure treasure;
    private Enemy enemy;


public Runner(Room1 room1, Player player1, Player player2){
        this.room1 = room1;
        this.player1 = player1;
        this.player2 = player2;
        }

public static void main(String[] args) {
        Treasure treasure = new Treasure( "money!", 10000);
        Orc orc = new Orc ( 6000, 1000);
        Room1 room1 = new Room1 ("Room of Doom", treasure, orc);
        Warlock warlock = new Warlock ("Tom", 6000, MagicalType.WARLOCK, CreatureType.DRAGON);
        Witch witch = new Witch ("Jenny", 4500, MagicalType.WITCH, CreatureType.DRAGON);
        Knight knight = new Knight ("Bob", 5000, NonMagicalType.KNIGHT, WeaponType.AXE);
        Dwarf dwarf = new Dwarf ("Mike", 4500, NonMagicalType.DWARF, WeaponType.CLUB);
        Barbarian barbarian = new Barbarian ("Barbara", 6000, NonMagicalType.BARBARIAN, WeaponType.SWORD);
        WhiteMage whitemage = new WhiteMage ("Danny", 5000, 1000);


        ///cases:
        Runner runner1 = new Runner(room1, knight, warlock);
        Runner runner2 = new Runner(room1, witch, warlock);
        Runner runner3 = new Runner(room1, witch, dwarf);


        runner1.run ();


        }

public void run() {
        String choice;
        Scanner scanner = new Scanner (new InputStreamReader (System.in));
        do {
        System.out.println("Welcome to Adventure. Pick Player 1");
        System.out.println("1. Warlock \n2. Witch \n3. Dwarf \n4. Barbarian \n5. Knight \n6. White Mage");
        choice = scanner.nextLine().toLowerCase();
        switch (choice) {

        case "1":
        String answer;
        do {
        System.out.println("Type a vehicle number to attack \n");
        System.out.println(vehicles.seeAllVehicles());
        Integer input2 = Integer.parseInt(scanner.nextLine());
        System.out.println(mothra.attack(input2, vehicles));
        mothra.checkDeath();
        System.out.println(vehicles.allDestroyed());
        System.out.println(vehicles.getRandomVehicle().attack(mothra) + "\n" + mothra.getName() + " health: "
        + mothra.getHealthValue());
        System.out.println("Press any key to attack again or q to change monster");
        answer = scanner.nextLine();
        System.out.println(mothra.move());
        System.out.println(mothra.roar() + "\n");
        } while (!answer.equals("q"));
        break;

        case "2":
        String answer2;
        do {
        System.out.println("Type a vehicle number to attack \n");
        System.out.println(vehicles.seeAllVehicles());
        Integer input2 = Integer.parseInt(scanner.nextLine());
        System.out.println(godzilla.attack(input2, vehicles));
        godzilla.checkDeath();
        System.out.println(vehicles.allDestroyed());
        System.out.println(vehicles.getRandomVehicle().attack(godzilla) + "\n" + godzilla.getName() + " health: " + godzilla.getHealthValue());
        System.out.println("Press any key to attack again or q to change monster");
        answer2 = scanner.nextLine();
        System.out.println(godzilla.move());
        System.out.println(godzilla.roar()+ "\n");
        } while (!answer2.equals("q"));
        break;

        case "q":
        System.exit(0);
        break;

default:
        System.out.println("Unrecognised Command");
        System.out.println("Press any key return to the main menu");
        String input10 = scanner.nextLine();
        choice = input10.toLowerCase();
        break;

        }
        } while (!choice.equals("q"));
        }

        }
