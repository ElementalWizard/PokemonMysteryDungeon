package Game.World.Dungeon.AppleWoods;

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

    public void setUpInfo(){
        //SIGHS, here we go!
        if (isSolid()){
            info.setBottomRight3(Images.appleWood.get(0));
            info.setBottomHalf5(Images.appleWood.get(1+Handler.random.nextInt(3)));//
            info.setTopRight3(Images.appleWood.get(4));
            info.setRightHalf5(Images.appleWood.get(5+Handler.random.nextInt(3)));
            info.setBottomRight3(Images.appleWood.get(8+Handler.random.nextInt(3)));
            info.setFullySurrounded(Images.appleWood.get(11+Handler.random.nextInt(3)));
            info.setLeftHalf5(Images.appleWood.get(14));
            info.setTopHalf5(Images.appleWood.get(15+Handler.random.nextInt(3)));
            info.setDR2(Images.appleWood.get(18));
            info.setLR2(Images.appleWood.get(19));
            info.setLD2(Images.appleWood.get(20));
            info.setUD2(Images.appleWood.get(21));
            info.setNon(Images.appleWood.get(22));
            info.setTR(Images.appleWood.get(23));
            info.setTL(Images.appleWood.get(24));
            info.setD(Images.appleWood.get(25));
            info.setR(Images.appleWood.get(26));
            info.setLRUD4(Images.appleWood.get(27));
            info.setL(Images.appleWood.get(28));
            info.setT(Images.appleWood.get(29));
            info.setLRD3(Images.appleWood.get(30));
            info.setRUD3(Images.appleWood.get(31));
            info.setLUD3(Images.appleWood.get(32));
            info.setLRU3(Images.appleWood.get(33));
            info.setTopHalfD6(Images.appleWood.get(34));
            info.setLeftHalfRight6(Images.appleWood.get(35));
            info.setRightHalfLeft5(Images.appleWood.get(36));
            info.setBottomHalfUp6(Images.appleWood.get(37));
            info.setAllButBR(Images.appleWood.get(38));
            info.setAllButBL(Images.appleWood.get(39));
            info.setAllButTR(Images.appleWood.get(40));
            info.setAllButTL(Images.appleWood.get(41));
            info.setTopRightDown4(Images.appleWood.get(42));
            info.setTopLeftDown4(Images.appleWood.get(43));
            info.setBottomRightUp4(Images.appleWood.get(44));
            info.setBottomLeftUp4(Images.appleWood.get(45));
            info.setBottomLeftRight4(Images.appleWood.get(46));
            info.setBottomRightLeft4(Images.appleWood.get(47));
            info.setTopLeftRight4(Images.appleWood.get(48));
            info.setTopRightLeft4(Images.appleWood.get(49));
            info.setBottomRighttopLeft6(Images.appleWood.get(50));
            info.setBottomLefttopRight6(Images.appleWood.get(51));
            info.setTopRightbottomLeft5(Images.appleWood.get(52));
            info.setTopLeftbottomRight5(Images.appleWood.get(53));
            info.setTopRightbottomLeft5(Images.appleWood.get(54));
            info.setBottomRighttopLeft6(Images.appleWood.get(55));

        }else{
            info.setBottomRight3(Images.appleWood.get(56));
            info.setBottomHalf5(Images.appleWood.get(1+56));//
            info.setTopRight3(Images.appleWood.get(2+56));
            info.setRightHalf5(Images.appleWood.get(3+56));
            info.setBottomRight3(Images.appleWood.get(4+Handler.random.nextInt(3)+56));
            info.setFullySurrounded(Images.appleWood.get(7+56));
            info.setLeftHalf5(Images.appleWood.get(8+56));
            info.setTopHalf5(Images.appleWood.get(9+56));
            info.setDR2(Images.appleWood.get(10+56));
            info.setLR2(Images.appleWood.get(11+56));
            info.setLD2(Images.appleWood.get(12+56));
            info.setUD2(Images.appleWood.get(13+56));
            info.setNon(Images.appleWood.get(14+56));
            info.setTR(Images.appleWood.get(15+56));
            info.setTL(Images.appleWood.get(16+56));
            info.setD(Images.appleWood.get(17+56));
            info.setR(Images.appleWood.get(18+56));
            info.setLRUD4(Images.appleWood.get(19+56));
            info.setL(Images.appleWood.get(20+56));
            info.setT(Images.appleWood.get(21+56));
            info.setLRD3(Images.appleWood.get(22+56));
            info.setRUD3(Images.appleWood.get(23+56));
            info.setLUD3(Images.appleWood.get(24+56));
            info.setLRU3(Images.appleWood.get(25+56));
            info.setTopHalfD6(Images.appleWood.get(26+56));
            info.setLeftHalfRight6(Images.appleWood.get(27+56));
            info.setRightHalfLeft5(Images.appleWood.get(28+56));
            info.setBottomHalfUp6(Images.appleWood.get(29+56));
            info.setAllButBR(Images.appleWood.get(30+56));
            info.setAllButBL(Images.appleWood.get(31+56));
            info.setAllButTR(Images.appleWood.get(32+56));
            info.setAllButTL(Images.appleWood.get(33+56));
            info.setTopRightDown4(Images.appleWood.get(34+56));
            info.setTopLeftDown4(Images.appleWood.get(35+56));
            info.setBottomRightUp4(Images.appleWood.get(36+56));
            info.setBottomLeftUp4(Images.appleWood.get(37+56));
            info.setBottomLeftRight4(Images.appleWood.get(38+56));
            info.setBottomRightLeft4(Images.appleWood.get(39+56));
            info.setTopLeftRight4(Images.appleWood.get(40+56));
            info.setTopRightLeft4(Images.appleWood.get(41+56));
            info.setBottomRighttopLeft6(Images.appleWood.get(42+56));
            info.setBottomLefttopRight6(Images.appleWood.get(43+56));
            info.setTopRightbottomLeft5(Images.appleWood.get(44+56));
            info.setTopLeftbottomRight5(Images.appleWood.get(45+56));
            info.setTopRightbottomLeft5(Images.appleWood.get(46+56));
            info.setBottomRighttopLeft6(Images.appleWood.get(47+56));
        }

    }//well then that was something, lets push xD

}
