package Game.World.Dungeon;

import Game.Entities.Dynamic.BasePokemon;
import Game.Entities.Static.BaseItem;
import Game.World.Dungeon.Tools.Room;
import Game.World.Dungeon.Tools.Tile;
import Main.Handler;
import Resources.Images;

import java.util.ArrayList;

/**
 * Created by AlexVR on 4/1/2020
 */
public class Floor {

    public ArrayList<Tile> floorTiles;
    Handler handler;
    public ArrayList<Room> rooms;

    ArrayList<BasePokemon> pokemons;
    ArrayList<BaseItem> items;

    public int width,height;

    public int minItems=5;
    public int maxItems=8;
    public int totalItems;


    public int minPokemon=3;
    public int maxPokemon=6;
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
        rooms = new ArrayList<>();
        items = new ArrayList<>();
        pokemons = new ArrayList<>();
        floorTiles = new ArrayList<>();
        generateRoom();
    }



    public void generateRoom(){


        if (dificulti == 1){
            minRooms = 15;
            maxRooms = 19;
            minHallLenght = 4;
            maxHallLenght = 15;
            minWidth = 4;
            maxWidth = 12;
            minHeight=4;
            maxHeight = 16;
            totalRooms = Handler.random.nextInt(maxRooms)+minRooms;
            totalHallLenght = Handler.random.nextInt(maxHallLenght)+minHallLenght;

            width = (Handler.random.nextInt(maxWidth)+minWidth)*Images.appleWood.get(55).getWidth();
            height = (Handler.random.nextInt(maxHeight)+minHeight)*Images.appleWood.get(55).getWidth();
            int x = Handler.random.nextInt(4)* Images.appleWood.get(55).getWidth();
            int y = Handler.random.nextInt(4)*Images.appleWood.get(55).getWidth();
            rooms.add(new Room(this,x,y,width,height,handler,totalRooms,1,null,rooms));

        }

    }


}
