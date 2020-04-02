package Game.World.Dungeon.Tools;

import Game.World.Dungeon.AppleWoods.AppleWoodTile;
import Game.World.Dungeon.Floor;
import Main.Handler;
import Resources.Images;

import java.util.ArrayList;

/**
 * Created by AlexVR on 3/31/2020
 */
public class Room {

    int width=0,height=0;
    Handler handler;
    ArrayList<Hall> halls;
    ArrayList<Tile> tiles;
    int minHall=1;
    int maxHalls=4;
    int totalhalls;
    int x,y;
    public int totalRooms,roomsSoFar;
    Floor floor;

    public Room(Floor floor, int x, int y, int width, int height, Handler handler, int totalRooms, int roomsSoFar, Hall lastHall, ArrayList<Room> rooms) {//
        this.width = width;
        this.height = height;
        this.handler = handler;
        this.floor = floor;
        this.x = x;
        this.y = y;
        this.totalRooms = totalRooms;
        this.roomsSoFar = roomsSoFar;
        tiles=new ArrayList<>();
        halls = new ArrayList<>();
        for (int i = (x/Images.appleWood.get(55).getWidth());i<((x/Images.appleWood.get(55).getWidth())+(width/Images.appleWood.get(55).getWidth()));i++){
            for (int j = (y/Images.appleWood.get(55).getWidth());j<((y/Images.appleWood.get(55).getWidth())+(height/Images.appleWood.get(55).getWidth()));j++){
                if (handler.getCurrentDungeon().name.equals("AppleWoods")) {
                    AppleWoodTile tile = new AppleWoodTile(handler, 0, Images.appleWood.get(0), i * Images.appleWood.get(0).getWidth(),j* Images.appleWood.get(0).getHeight());
                    tiles.add(tile);
                    floor.floorTiles.add(tile);
                }
            }
        }
        totalhalls = Handler.random.nextInt(maxHalls) + minHall;
            for (int i = 0; i < totalhalls; i++) {
                switch (Handler.random.nextInt(4)) {
                    case 0://up
                        if (lastHall == null) {
                            int hallX = Handler.random.nextInt((width/Images.appleWood.get(55).getWidth())) + (x/Images.appleWood.get(55).getWidth());
                            int hallY = (y/Images.appleWood.get(55).getWidth())-1;
                            halls.add(new Hall(this,Handler.random.nextInt(12) + 4, handler, hallX*Images.appleWood.get(55).getWidth(), hallY*Images.appleWood.get(55).getWidth(), "Up", Handler.random.nextInt(3)));
                        } else {
                            int hallX = Handler.random.nextInt((width/Images.appleWood.get(55).getWidth())) + (x/Images.appleWood.get(55).getWidth());
                            int hallY = (y/Images.appleWood.get(55).getWidth())-1;
                            if (lastHall.Exit.equals("Up")){
                                do {
                                    hallX = Handler.random.nextInt((width/Images.appleWood.get(55).getWidth())) + (x/Images.appleWood.get(55).getWidth());
                                }while(hallX==lastHall.exitX/Images.appleWood.get(55).getWidth());
                            }
                            halls.add(new Hall(this,Handler.random.nextInt(12) + 4, handler, hallX*Images.appleWood.get(55).getWidth(), hallY*Images.appleWood.get(55).getWidth(), "Up", Handler.random.nextInt(3)));

                        }
                        break;
                    case 1://left
                        if (lastHall == null) {
                            int hallX =  (x/Images.appleWood.get(55).getWidth())-1;
                            int hallY = Handler.random.nextInt(height/Images.appleWood.get(55).getWidth()) + (y/Images.appleWood.get(55).getWidth());
                            halls.add(new Hall(this,Handler.random.nextInt(12) + 4, handler, hallX*Images.appleWood.get(55).getWidth(), hallY*Images.appleWood.get(55).getWidth(), "Left", Handler.random.nextInt(3)));
                        } else {
                            int hallX = (x/Images.appleWood.get(55).getWidth())-1;
                            int hallY =  Handler.random.nextInt(height/Images.appleWood.get(55).getWidth()) + (y/Images.appleWood.get(55).getWidth());
                            if (lastHall.Exit.equals("Left")){
                                do {
                                    hallY =  Handler.random.nextInt(height) + (y/Images.appleWood.get(55).getWidth());
                                }while(hallY==lastHall.exitY/Images.appleWood.get(55).getWidth());
                            }
                            halls.add(new Hall(this,Handler.random.nextInt(12) + 4, handler, hallX*Images.appleWood.get(55).getWidth(), hallY*Images.appleWood.get(55).getWidth(), "Left", Handler.random.nextInt(3)));

                        }
                        break;
                    case 2://right
                        if (lastHall == null) {
                            int hallX =  (x/Images.appleWood.get(55).getWidth())+1;
                            int hallY = Handler.random.nextInt(height/Images.appleWood.get(55).getWidth()) + (y/Images.appleWood.get(55).getWidth());
                            halls.add(new Hall(this,Handler.random.nextInt(12) + 4, handler, hallX*Images.appleWood.get(55).getWidth(), hallY*Images.appleWood.get(55).getWidth(), "Right", Handler.random.nextInt(3)));
                        } else {
                            int hallX = (x/Images.appleWood.get(55).getWidth())+1;
                            int hallY =  Handler.random.nextInt(height/Images.appleWood.get(55).getWidth()) + (y/Images.appleWood.get(55).getWidth());
                            if (lastHall.Exit.equals("Right")){
                                do {
                                    hallY =  Handler.random.nextInt(height) + (y/Images.appleWood.get(55).getWidth());
                                }while(hallY==lastHall.exitY/Images.appleWood.get(55).getWidth());
                            }
                            halls.add(new Hall(this,Handler.random.nextInt(12) + 4, handler, hallX*Images.appleWood.get(55).getWidth(), hallY*Images.appleWood.get(55).getWidth(), "Right", Handler.random.nextInt(3)));

                        }
                        break;
                    case 3://down
                        if (lastHall == null) {
                            int hallX = Handler.random.nextInt((width/Images.appleWood.get(55).getWidth())) + (x/Images.appleWood.get(55).getWidth());
                            int hallY = (y/Images.appleWood.get(55).getWidth())+1;
                            halls.add(new Hall(this,Handler.random.nextInt(12) + 4, handler, hallX*Images.appleWood.get(55).getWidth(), hallY*Images.appleWood.get(55).getWidth(), "Down", Handler.random.nextInt(3)));
                        } else {
                            int hallX = Handler.random.nextInt(width/Images.appleWood.get(55).getWidth()) + (x/Images.appleWood.get(55).getWidth());
                            int hallY = (y/Images.appleWood.get(55).getWidth())+1;
                            if (lastHall.Exit.equals("Down")){
                                do {
                                    hallX = Handler.random.nextInt((width/Images.appleWood.get(55).getWidth())) + (x/Images.appleWood.get(55).getWidth());
                                }while(hallX==lastHall.exitX/Images.appleWood.get(55).getWidth());
                            }
                            halls.add(new Hall(this,Handler.random.nextInt(12) + 4, handler, hallX*Images.appleWood.get(55).getWidth(), hallY*Images.appleWood.get(55).getWidth(), "Down", Handler.random.nextInt(3)));

                        }
                        break;
                }
                if (i >= totalhalls - 1 && roomsSoFar<totalRooms) {
                    halls.get(halls.size()-1).createRoom(halls.get(halls.size()-1).exitX,halls.get(halls.size()-1).exitY,rooms);
                }
            }

    }






    }
