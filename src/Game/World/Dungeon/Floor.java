package Game.World.Dungeon;

import Game.Entities.Dynamic.BasePokemon;
import Game.Entities.Static.BaseItem;
import Game.World.Dungeon.Tools.Hall;
import Game.World.Dungeon.Tools.Room;
import Game.World.Dungeon.Tools.Tile;
import Main.Handler;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by AlexVR on 4/1/2020
 */
public class Floor {

    public ArrayList<ArrayList<Tile>> floorTiles;
    Handler handler;
    public ArrayList<Room> rooms;

    ArrayList<BasePokemon> pokemons;
    ArrayList<BaseItem> items;

    public int width,height;

    public int minItems;
    public int maxItems;
    public int totalItems;


    public int minPokemon;
    public int maxPokemon;
    public int totalPokemon;


    public int minRooms;
    public int maxRooms;
    public int totalRooms;

    public int minWidth;
    public int maxWidth;
    public int totalWidth;

    public int minHeight;
    public int maxHeight;
    public int totalHeight;

    public int minHallLenght;
    public int maxHallLenght;
    public int totalHallLenght;

    int dificulti;

    public Floor(Handler handler,int dificulty) {
        this.handler = handler;

        totalPokemon = Handler.random.nextInt(maxPokemon) + minPokemon;
        totalItems = Handler.random.nextInt(maxItems) + minItems;
        this.dificulti = dificulty;
        generateRoom();
    }

    public void generateRoom(){


        if (dificulti == 1){
            minRooms = 5;
            maxRooms = 9;
            minHallLenght = 4;
            maxHallLenght = 15;
            minWidth = 4;
            maxWidth = 9;
            minHeight=4;
            maxHeight = 12;
            totalRooms = Handler.random.nextInt(maxRooms)+minRooms;
            totalHallLenght = Handler.random.nextInt(maxHallLenght)+minHallLenght;

            width = Handler.random.nextInt(maxWidth)+minWidth;
            height = Handler.random.nextInt(maxHeight)+minHeight;
            int x = Handler.random.nextInt(4);
            int y = Handler.random.nextInt(4);
            rooms.add(new Room(x,y,width,height,handler,totalRooms,1,null));

        }

    }

    public void render(Graphics g){
        for (Room room:rooms){
            room.render(g);
        }
    }
}
