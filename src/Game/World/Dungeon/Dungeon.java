package Game.World.Dungeon;

import Game.Quest.BaseQuest;
import Main.Handler;

import java.util.ArrayList;

/**
 * Created by AlexVR on 3/31/2020
 */
public class Dungeon {

    Handler handler;
    Floor floor;
    public int floorsTotal;
    public int currentFloor;
    public ArrayList<BaseQuest> listOfQuest;


    public Dungeon(Handler handler, int floorsTotal, ArrayList<BaseQuest> listOfQuest) {
        this.handler = handler;
        this.floorsTotal = floorsTotal;
        this.currentFloor = 0;
        this.listOfQuest = listOfQuest;
        generateFloor();
    }



    private void generateFloor() {

        floor = new Floor(handler);
        currentFloor++;
    }


}
