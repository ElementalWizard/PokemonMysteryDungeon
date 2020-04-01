package Game.World.Dungeon.Tools;

import Main.Handler;

import java.util.ArrayList;

/**
 * Created by AlexVR on 3/31/2020
 */
public class Room {

    int width=0,height=0;
    Handler handler;
    ArrayList<Hall> halls;
    int minHall=2;
    int maxHalls=5;
    int totalhalls;

    public Room(int width, int height, Handler handler) {
        this.width = width;
        this.height = height;
        this.handler = handler;
        totalhalls = Handler.random.nextInt(maxHalls) + minHall;
    }
}
