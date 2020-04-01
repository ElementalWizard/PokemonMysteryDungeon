package Game.World.Dungeon.Tools;

import Game.Entities.Dynamic.BasePokemon;
import Game.Entities.Static.BaseItem;
import Main.Handler;

import java.awt.image.BufferedImage;

/**
 * Created by AlexVR on 4/1/2020
 */
public class Tile {

    Handler handler;
    int type; //0 for floor, 1 for solid
    BasePokemon pokemon = null;
    BaseItem item = null;
    protected TileInfo info;
    int x, y;

    public Tile(Handler handler, int type, BufferedImage sprite,int x, int y) {
        this.handler = handler;
        this.type = type;
        this.x=x;
        this.y=y;
        info = new TileInfo(handler,x,y,type);
        info.sprite=sprite;
        setUpInfo();
    }



    public BufferedImage getCorrectTile(){
        return info.getCorrectTile();//well get back to this, itll be fun.... #connected texture and stuff
    }

    public int getType() {
        return type;
    }

    public boolean isSolid(){
        return type==1;
    }

    public void setType(int type) {
        this.type = type;
    }

    public BasePokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(BasePokemon pokemon) {
        this.pokemon = pokemon;
    }

    public BaseItem getItem() {
        return item;
    }

    public void setItem(BaseItem item) {
        this.item = item;
    }



    private void setUpInfo() {


    }


}
