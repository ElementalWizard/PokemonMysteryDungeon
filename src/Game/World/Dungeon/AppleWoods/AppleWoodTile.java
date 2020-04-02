package Game.World.Dungeon.AppleWoods;

import Game.World.Dungeon.Floor;
import Game.World.Dungeon.Tools.Tile;
import Main.Handler;
import Resources.Images;

import java.awt.image.BufferedImage;

/**
 * Created by AlexVR on 4/1/2020
 */
public class AppleWoodTile extends Tile {

    public AppleWoodTile(Handler handler, int type, BufferedImage sprite, int x, int y) {
        super(handler, type, sprite, x, y);


    }

    public void setUpInfo(Floor floor){
        //SIGHS, here we go!
        if (isSolid()){
            info.setBottomRight3(Images.appleWood.get(0));
            info.addBottomHalf5(Images.appleWood.get(1));
            info.addBottomHalf5(Images.appleWood.get(2));
            info.addBottomHalf5(Images.appleWood.get(3));
            info.setTopRight3(Images.appleWood.get(4));
            info.addRightHalf5(Images.appleWood.get(5));
            info.addRightHalf5(Images.appleWood.get(6));
            info.addRightHalf5(Images.appleWood.get(7));
            info.addFullySurroundedHalf5(Images.appleWood.get(8));
            info.addFullySurroundedHalf5(Images.appleWood.get(9));
            info.addFullySurroundedHalf5(Images.appleWood.get(10));
            info.addLeftHalf5(Images.appleWood.get(11));
            info.addLeftHalf5(Images.appleWood.get(12));
            info.addLeftHalf5(Images.appleWood.get(13));
            info.setTopRight3(Images.appleWood.get(14));
            info.addTopHalf5(Images.appleWood.get(15));
            info.addTopHalf5(Images.appleWood.get(16));
            info.addTopHalf5(Images.appleWood.get(17));
            info.setTopLeft3(Images.appleWood.get(18));
            info.setDR2(Images.appleWood.get(19));
            info.setLR2(Images.appleWood.get(20));
            info.setLD2(Images.appleWood.get(21));
            info.setUD2(Images.appleWood.get(22));
            info.setNon(Images.appleWood.get(23));
            info.setUR2(Images.appleWood.get(24));
            info.setLU2(Images.appleWood.get(25));
            info.setD1(Images.appleWood.get(26));
            info.setR1(Images.appleWood.get(27));
            info.setLRUD4(Images.appleWood.get(28));
            info.setL1(Images.appleWood.get(29));
            info.setU1(Images.appleWood.get(30));
            info.setLRD3(Images.appleWood.get(31));
            info.setRUD3(Images.appleWood.get(32));
            info.setLUD3(Images.appleWood.get(33));
            info.setLRU3(Images.appleWood.get(34));
            info.setTopHalfD6(Images.appleWood.get(35));
            info.setLeftHalfRight6(Images.appleWood.get(36));
            info.setRightHalfLeft5(Images.appleWood.get(37));
            info.setBottomHalfUp6(Images.appleWood.get(38));
            info.setAllButBR(Images.appleWood.get(39));
            info.setAllButBL(Images.appleWood.get(40));
            info.setAllButTR(Images.appleWood.get(41));
            info.setAllButTL(Images.appleWood.get(42));
            info.setTopRightDown4(Images.appleWood.get(43));
            info.setTopLeftDown4(Images.appleWood.get(44));
            info.setBottomRightUp4(Images.appleWood.get(45));
            info.setBottomLeftUp4(Images.appleWood.get(46));
            info.setBottomLeftRight4(Images.appleWood.get(47));
            info.setBottomRightLeft4(Images.appleWood.get(48));
            info.setTopLeftRight4(Images.appleWood.get(49));
            info.setTopRightLeft4(Images.appleWood.get(50));
            info.setBottomRighttopLeft6(Images.appleWood.get(51));
            info.setBottomLefttopRight6(Images.appleWood.get(52));
            info.setTopRightbottomLeft5(Images.appleWood.get(53));
            info.setTopLeftbottomRight5(Images.appleWood.get(54));
            info.setTopRightbottomLeft5(Images.appleWood.get(55));
            info.setBottomRighttopLeft6(Images.appleWood.get(56));
        }else{
            info.setBottomRight3(Images.appleWood.get(57));
            info.addBottomHalf5(Images.appleWood.get(1+57));//
            info.setTopRight3(Images.appleWood.get(2+57));
            info.addRightHalf5(Images.appleWood.get(3+57));
            info.addFullySurroundedHalf5(Images.appleWood.get(4+57));
            info.addFullySurroundedHalf5(Images.appleWood.get(5+57));
            info.addFullySurroundedHalf5(Images.appleWood.get(6+57));
            info.addLeftHalf5(Images.appleWood.get(7+57));
            info.addTopHalf5(Images.appleWood.get(8+57));
            info.setDR2(Images.appleWood.get(9+57));
            info.setLR2(Images.appleWood.get(10+57));
            info.setLD2(Images.appleWood.get(11+57));
            info.setUD2(Images.appleWood.get(12+57));
            info.setNon(Images.appleWood.get(13+57));
            info.setUR2(Images.appleWood.get(14+57));
            info.setLU2(Images.appleWood.get(15+57));
            info.setD1(Images.appleWood.get(16+57));
            info.setR1(Images.appleWood.get(17+57));
            info.setLRUD4(Images.appleWood.get(18+57));
            info.setL1(Images.appleWood.get(19+57));
            info.setU1(Images.appleWood.get(20+57));
            info.setLRD3(Images.appleWood.get(21+57));
            info.setRUD3(Images.appleWood.get(22+57));
            info.setLUD3(Images.appleWood.get(23+57));
            info.setLRU3(Images.appleWood.get(24+57));
            info.setTopHalfD6(Images.appleWood.get(25+57));
            info.setLeftHalfRight6(Images.appleWood.get(26+57));
            info.setRightHalfLeft5(Images.appleWood.get(27+57));
            info.setBottomHalfUp6(Images.appleWood.get(28+57));
            info.setAllButBR(Images.appleWood.get(29+57));
            info.setAllButBL(Images.appleWood.get(30+57));
            info.setAllButTR(Images.appleWood.get(31+57));
            info.setAllButTL(Images.appleWood.get(32+57));
            info.setTopRightDown4(Images.appleWood.get(33+57));
            info.setTopLeftDown4(Images.appleWood.get(34+57));
            info.setBottomRightUp4(Images.appleWood.get(35+57));
            info.setBottomLeftUp4(Images.appleWood.get(36+57));
            info.setBottomLeftRight4(Images.appleWood.get(37+57));
            info.setBottomRightLeft4(Images.appleWood.get(38+57));
            info.setTopLeftRight4(Images.appleWood.get(39+57));
            info.setTopRightLeft4(Images.appleWood.get(40+57));
            info.setBottomRighttopLeft6(Images.appleWood.get(41+57));
            info.setBottomLefttopRight6(Images.appleWood.get(42+57));
            info.setTopRightbottomLeft5(Images.appleWood.get(43+57));
            info.setTopLeftbottomRight5(Images.appleWood.get(44+57));
            info.setTopRightbottomLeft5(Images.appleWood.get(45+57));
            info.setBottomRighttopLeft6(Images.appleWood.get(46+57));
        }

        info.setSprite(floor);

    }//well then that was something, lets push xD

}
