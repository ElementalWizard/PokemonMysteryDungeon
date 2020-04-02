package Game.World.Dungeon;

import Game.Quest.BaseQuest;
import Game.World.Dungeon.Tools.Tile;
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
    public int xOffset=0;
    public int yOffset=0;


    public Dungeon(Handler handler, int floorsTotal, ArrayList<BaseQuest> listOfQuest,String name,int difficulty) {
        this.handler = handler;
        this.floorsTotal = floorsTotal;
        this.currentFloor = 0;
        this.listOfQuest = listOfQuest;
        this.dificulty=difficulty;
        this.name=name;
        handler.setCurrentDungeon(this);
        generateFloor();
    }



    private void generateFloor() {

        floor = new Floor(handler,dificulty);
        handler.setCurrentFloor(floor);
        for (Tile tile:floor.floorTiles){
            tile.setUpInfo(floor);
        }
        currentFloor++;
    }

    public void tick(){
        if (handler.getKeyManager().right){
            xOffset-=4;
        }
        if (handler.getKeyManager().left){
            xOffset+=4;
        }
        if (handler.getKeyManager().down){
            yOffset-=4;
        }
        if (handler.getKeyManager().up){
            yOffset+=4;
        }
    }


    public void render(Graphics g) {
        for (Tile tile: floor.floorTiles){
            tile.render(g);
        }
    }
}
