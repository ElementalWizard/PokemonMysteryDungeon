package Game.World.Dungeon.Tools;

import Main.Handler;
import Resources.Images;

import javax.swing.*;
import java.awt.*;
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

    public Room(int x, int y, int width, int height, Handler handler,int totalRooms,int roomsSoFar,Hall lastHall) {//some recursion comming up i think
        this.width = width;
        this.height = height;
        this.handler = handler;
        this.x = x;
        this.y = y;
        this.totalRooms = totalRooms;
        this.roomsSoFar = roomsSoFar;
        for (int i = 0;i<width;i++){
            for (int j = 0;j<height;j++){
                tiles.add(new Tile(handler,0, Images.appleWood.get(0),i*Images.appleWood.get(0).getWidth(),Images.appleWood.get(0).getHeight()));//TODO add if to check if its applewood
            }
        }
        totalhalls = Handler.random.nextInt(maxHalls) + minHall;
            for (int i = 0; i < totalhalls; i++) {
                switch (Handler.random.nextInt(4)) {
                    case 0://up
                        if (lastHall == null) {
                            int hallX = Handler.random.nextInt(width) + x;
                            int hallY = y-1;
                            halls.add(new Hall(this,Handler.random.nextInt(12) + 4, handler, hallX, hallY, "Up", Handler.random.nextInt(3)));
                        } else {
                            int hallX = Handler.random.nextInt(width) + x;
                            int hallY = y-1;
                            if (lastHall.Exit.equals("Up")){
                                do {
                                    hallX = Handler.random.nextInt(width) + x;
                                }while(hallX==lastHall.exitX);
                            }
                            halls.add(new Hall(this,Handler.random.nextInt(12) + 4, handler, hallX, hallY, "Up", Handler.random.nextInt(3)));

                        }
                        break;
                    case 1://left
                        if (lastHall == null) {
                            int hallX =  x-1;
                            int hallY = Handler.random.nextInt(height) + y;
                            halls.add(new Hall(this,Handler.random.nextInt(12) + 4, handler, hallX, hallY, "Left", Handler.random.nextInt(3)));
                        } else {
                            int hallX = x-1;
                            int hallY =  Handler.random.nextInt(height) + y;
                            if (lastHall.Exit.equals("Left")){
                                do {
                                    hallY =  Handler.random.nextInt(height) + y;
                                }while(hallY==lastHall.exitY);
                            }
                            halls.add(new Hall(this,Handler.random.nextInt(12) + 4, handler, hallX, hallY, "Left", Handler.random.nextInt(3)));

                        }
                        break;
                    case 2://right
                        if (lastHall == null) {
                            int hallX =  x+width;
                            int hallY = Handler.random.nextInt(height) + y;
                            halls.add(new Hall(this,Handler.random.nextInt(12) + 4, handler, hallX, hallY, "Right", Handler.random.nextInt(3)));
                        } else {
                            int hallX = x+width;
                            int hallY =  Handler.random.nextInt(height) + y;
                            if (lastHall.Exit.equals("Right")){
                                do {
                                    hallY =  Handler.random.nextInt(height) + y;
                                }while(hallY==lastHall.exitY);
                            }
                            halls.add(new Hall(this,Handler.random.nextInt(12) + 4, handler, hallX, hallY, "Right", Handler.random.nextInt(3)));

                        }
                        break;
                    case 3://down
                        if (lastHall == null) {
                            int hallX = Handler.random.nextInt(width) + x;
                            int hallY = y+height;
                            halls.add(new Hall(this,Handler.random.nextInt(12) + 4, handler, hallX, hallY, "Down", Handler.random.nextInt(3)));
                        } else {
                            int hallX = Handler.random.nextInt(width) + x;
                            int hallY = y+height;
                            if (lastHall.Exit.equals("Down")){
                                do {
                                    hallX = Handler.random.nextInt(width) + x;
                                }while(hallX==lastHall.exitX);
                            }
                            halls.add(new Hall(this,Handler.random.nextInt(12) + 4, handler, hallX, hallY, "Down", Handler.random.nextInt(3)));

                        }
                        break;
                }
                if (i >= totalhalls - 1 && roomsSoFar<totalRooms) {
                    halls.get(halls.size()-1).createRoom(halls.get(halls.size()-1).exitX,halls.get(halls.size()-1).exitY);
                }
            }

    }

    public void render(Graphics g){
        for(Tile t:tiles){
            g.drawImage(t.getCorrectTile(),t.x,t.y,t.width,t.height,null);

        }
        for (Hall h: halls){
            h.render(g);
        }
    }




    }
