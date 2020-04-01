package Game.World.Dungeon.Tools;

import Main.Handler;
import Resources.Images;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by AlexVR on 3/31/2020
 */
public class Hall {

    int lenght = 0;
    Handler handler;
    public ArrayList<Tile> tiles;
    public String Entry;
    public String Exit;
    public String Direction;
    int x,y,exitX,exitY;
    Room root;
    public Hall(Room root ,int lenght, Handler handler,int x,int y,String direction,int exit) {
        this.lenght = lenght;
        this.handler = handler;
        this.root = root;
        this.x=x;
        this.y=y;
        exitX=x;
        exitY=y;
        this.Entry = direction;
        tiles = new ArrayList<>();
        Direction = direction;
        switch (direction){
            case "Up":
                if (exit==0){
                    Exit ="Down";
                }else if (exit==1){
                    Exit ="Left";
                }else if (exit==2) {
                    Exit = "Right";
                }
                break;
            case "Down":
                if (exit==0){
                    Exit ="Up";
                }else if (exit==1){
                    Exit ="Left";
                }else if (exit==2) {
                    Exit = "Right";
                }
                break;
            case "Left":
                if (exit==0){
                    Exit ="Down";
                }else if (exit==1){
                    Exit ="Up";
                }else if (exit==2) {
                    Exit = "Right";
                }
                break;
            case "Right":
                if (exit==0){
                    Exit ="Down";
                }else if (exit==1){
                    Exit ="Left";
                }else if (exit==2) {
                    Exit = "Up";
                }
                break;
            }

        for (int i = 1;i<lenght+1;i++){
            if (handler.getCurrentDungeon().name.equals("AppleWoods")){
                if (Direction.equals("Up")) {
                    tiles.add(new Tile(handler, 0, Images.appleWood.get(55), exitX, exitY - i));
                    exitY -=i;
                }else if (Direction.equals("Down")) {
                    tiles.add(new Tile(handler, 0, Images.appleWood.get(55), exitX, exitY + i));
                    exitY+=i;
                }else if (Direction.equals("Left")) {
                    tiles.add(new Tile(handler, 0, Images.appleWood.get(55), exitX-i, exitY ));
                    exitX-=i;
                }else if (Direction.equals("Right")) {
                    tiles.add(new Tile(handler, 0, Images.appleWood.get(55), exitX+i, exitY - i));
                    exitX+=i;
                }
                if (Handler.random.nextInt(20)==1){
                    changeDirection();
                }

            }
        }



        }

        public void changeDirection(){
        int exit = Handler.random.nextInt(3);
        String Exit = "" ;
            switch (Entry){//base it on entry to avoid going back and foward
                case "Up":
                    if (exit==0){
                        Exit ="Down";
                    }else if (exit==1){
                        Exit ="Left";
                    }else if (exit==2) {
                        Exit = "Right";
                    }

                    break;
                case "Down":
                    if (exit==0){
                        Exit ="Up";
                    }else if (exit==1){
                        Exit ="Left";
                    }else if (exit==2) {
                        Exit = "Right";
                    }
                    break;
                case "Left":
                    if (exit==0){
                        Exit ="Down";
                    }else if (exit==1){
                        Exit ="Up";
                    }else if (exit==2) {
                        Exit = "Right";
                    }
                    break;
                case "Right":
                    if (exit==0){
                        Exit ="Down";
                    }else if (exit==1){
                        Exit ="Left";
                    }else if (exit==2) {
                        Exit = "Up";
                    }
                    break;
            }
            Direction = Exit;
        }

        public void render(Graphics g){
            for (Tile t:tiles){
                g.drawImage(t.getCorrectTile(),t.x,t.y,t.width,t.height,null);
            }
        }

    public void createRoom(int exitX, int exitY) {
        int roomWidth=0;
        int roomHeight=0;
        if (handler.getCurrentDungeon().name.equals("AppleWoods")){
            roomWidth = Handler.random.nextInt(8)+4;
            roomHeight = Handler.random.nextInt(3)+5;
        }
        switch (Exit){//base it on entry to avoid going back and foward
            case "Up":
                handler.getCurrentDungeon().floor.rooms.add(new Room(Handler.random.nextInt(roomWidth)+exitX,exitY+1,roomWidth,roomHeight,handler,root.totalRooms,root.roomsSoFar+1,this));
                break;
            case "Down":
                handler.getCurrentDungeon().floor.rooms.add(new Room(Handler.random.nextInt(roomWidth)+exitX,exitY-roomHeight,roomWidth,roomHeight,handler,root.totalRooms,root.roomsSoFar+1,this));
                break;
            case "Left":
                handler.getCurrentDungeon().floor.rooms.add(new Room(exitX-1,Handler.random.nextInt(roomHeight)+exitY,roomWidth,roomHeight,handler,root.totalRooms,root.roomsSoFar+1,this));
                break;
            case "Right":
                handler.getCurrentDungeon().floor.rooms.add(new Room(exitX+roomWidth,Handler.random.nextInt(roomHeight)+exitY,roomWidth,roomHeight,handler,root.totalRooms,root.roomsSoFar+1,this));
                break;
        }
    }
}
