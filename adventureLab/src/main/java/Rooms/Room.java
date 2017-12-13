package Rooms;

import Rooms.Enemies.Enemy;
import Rooms.Treasures.Treasure;

public abstract class Room {

        private String name;
        private Treasure treasure;
        private Enemy enemy;

        public Room(String name, Treasure treasure, Enemy enemy){
            this.name = name;
            this.treasure = treasure;
            this.enemy = enemy;
        }

    }

