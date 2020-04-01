package Game.World.Dungeon;

import Game.Quest.BaseQuest;
import Main.Handler;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by AlexVR on 3/31/2020
 */
public class Dungeon {

    Handler handler;
    public Floor floor;
    public int floorsTotal;
    public int currentFloor;
    public ArrayList<BaseQuest> listOfQuest;
    public String name;
    int dificulty;


    public Dungeon(Handler handler, int floorsTotal, ArrayList<BaseQuest> listOfQuest,String name,int difficulty) {
        this.handler = handler;
        this.floorsTotal = floorsTotal;
        this.currentFloor = 0;
        this.listOfQuest = listOfQuest;
        this.dificulty=difficulty;
        this.name=name;
        generateFloor();
    }



    private void generateFloor() {

        floor = new Floor(handler,dificulty);
        currentFloor++;
    }

    public void render(Graphics g){
        floor.render(g);
    }


}
