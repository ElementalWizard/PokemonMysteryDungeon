package Game.World.Dungeon;

import Game.Entities.Dynamic.BasePokemon;
import Game.Entities.Static.BaseItem;
import Game.World.Dungeon.Tools.Hall;
import Game.World.Dungeon.Tools.Room;
import Game.World.Dungeon.Tools.Tile;
import Main.Handler;

import java.util.ArrayList;

/**
 * Created by AlexVR on 4/1/2020
 */
public class Floor {
    ArrayList<ArrayList<Tile>> floorTiles;
    Handler handler;
    ArrayList<Hall> halls;
    ArrayList<Room> rooms;

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

    public Floor(Handler handler) {
        this.handler = handler;

        totalPokemon = Handler.random.nextInt(maxPokemon) + minPokemon;
        totalItems = Handler.random.nextInt(maxItems) + minItems;
    }
}
