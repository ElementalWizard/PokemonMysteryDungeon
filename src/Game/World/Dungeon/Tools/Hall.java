package Game.World.Dungeon.Tools;

import Game.World.Dungeon.AppleWoods.AppleWoodTile;
import Main.Handler;
import Resources.Images;

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
        if (root!=null) {
            switch (direction) {
                case "Up":
                    if (exit == 0) {
                        Exit = "Down";
                    } else if (exit == 1) {
                        Exit = "Left";
                    } else if (exit == 2) {
                        Exit = "Right";
                    }
                    break;
                case "Down":
                    if (exit == 0) {
                        Exit = "Up";
                    } else if (exit == 1) {
                        Exit = "Left";
                    } else if (exit == 2) {
                        Exit = "Right";
                    }
                    break;
                case "Left":
                    if (exit == 0) {
                        Exit = "Down";
                    } else if (exit == 1) {
                        Exit = "Up";
                    } else if (exit == 2) {
                        Exit = "Right";
                    }
                    break;
                case "Right":
                    if (exit == 0) {
                        Exit = "Down";
                    } else if (exit == 1) {
                        Exit = "Left";
                    } else if (exit == 2) {
                        Exit = "Up";
                    }
                    break;
            }

            for (int i = 0; i < lenght; i++) {
                if (handler.getCurrentDungeon().name.equals("AppleWoods")) {
                    AppleWoodTile tile ;
                    if (Direction.equals("Up")) {
                        exitY -= (Images.appleWood.get(55).getWidth());
                        tile =new AppleWoodTile(handler, 0, Images.appleWood.get(55), exitX, exitY);
                        tiles.add(tile);
                        root.floor.floorTiles.add(tile);

                    } else if (Direction.equals("Down")) {
                        exitY += (Images.appleWood.get(55).getWidth());
                        tile =new AppleWoodTile(handler, 0, Images.appleWood.get(55), exitX, exitY);
                        root.floor.floorTiles.add(tile);

                    } else if (Direction.equals("Left")) {
                        exitX -= (Images.appleWood.get(55).getWidth());
                        tile =new AppleWoodTile(handler, 0, Images.appleWood.get(55), exitX, exitY);
                        tiles.add(tile);
                        root.floor.floorTiles.add(tile);

                    } else if (Direction.equals("Right")) {
                        exitX += (Images.appleWood.get(55).getWidth());
                        tile =new AppleWoodTile(handler, 0, Images.appleWood.get(55), exitX, exitY);
                        tiles.add(tile);
                        root.floor.floorTiles.add(tile);
                    }
                    if (Handler.random.nextInt(30) == 1) {
                        changeDirection();
                    }

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




    public void createRoom(int exitX, int exitY,ArrayList<Room> rooms) {
        int roomWidth=0;
        int roomHeight=0;
        if (handler.getCurrentDungeon().name.equals("AppleWoods")){
            roomWidth = Handler.random.nextInt(8)+4;
            roomHeight = Handler.random.nextInt(3)+5;
        }
        switch (Exit){//base it on entry to avoid going back and foward
            case "Up":
                rooms.add(new Room(root.floor,Handler.random.nextInt(roomWidth)+ (exitX/Images.appleWood.get(0).getWidth()),(exitY)+Images.appleWood.get(0).getWidth(),roomWidth*Images.appleWood.get(0).getWidth(),roomHeight*Images.appleWood.get(0).getWidth(),handler,root.totalRooms,root.roomsSoFar+1,this,rooms));
                break;
            case "Down":
                rooms.add(new Room(root.floor,Handler.random.nextInt(roomWidth)+(exitX/Images.appleWood.get(0).getWidth()),exitY-(roomHeight*Images.appleWood.get(0).getWidth()),roomWidth*Images.appleWood.get(0).getWidth(),roomHeight*Images.appleWood.get(0).getWidth(),handler,root.totalRooms,root.roomsSoFar+1,this,rooms));
                break;
            case "Left":
                rooms.add(new Room(root.floor,exitX-Images.appleWood.get(0).getWidth(),Handler.random.nextInt(roomHeight)+(exitY/Images.appleWood.get(0).getWidth()),roomWidth*Images.appleWood.get(0).getWidth(),roomHeight*Images.appleWood.get(0).getWidth(),handler,root.totalRooms,root.roomsSoFar+1,this,rooms));
                break;
            case "Right":
                rooms.add(new Room(root.floor,exitX+(roomWidth*Images.appleWood.get(0).getWidth()),Handler.random.nextInt(roomHeight)+(exitY/Images.appleWood.get(0).getWidth()),roomWidth*Images.appleWood.get(0).getWidth(),roomHeight*Images.appleWood.get(0).getWidth(),handler,root.totalRooms,root.roomsSoFar+1,this,rooms));
                break;
        }
    }
}
