package Game.GameStates;

import Game.World.Dungeon.Dungeon;
import Main.Handler;

import java.awt.*;

/**
 * Created by AlexVR on 1/24/2020.
 */
public class GameDungeonState extends State {

    String name;
    public Dungeon dungeon;

    public GameDungeonState(Handler handler,String name){
        super(handler);
        refresh();
        this.name = name;
        dungeon = new Dungeon(handler,12,null,"AppleWoods",1);
        if (name.equals("AppleWoods")){//TODO add something

        }
    }


    @Override
    public void tick() {


    }

    @Override
    public void render(Graphics g) {


    }

    @Override
    public void refresh() {

    }
}
