package Game.World.Dungeon.Tools;

import Main.Handler;

import java.util.ArrayList;

/**
 * Created by AlexVR on 3/31/2020
 */
public class Hall {

    int lenght = 0;
    Handler handler;
    ArrayList<Hall> halls;
    ArrayList<Tile> tiles;

    public Hall(int lenght, Handler handler) {
        this.lenght = lenght;
        this.handler = handler;
    }
}
