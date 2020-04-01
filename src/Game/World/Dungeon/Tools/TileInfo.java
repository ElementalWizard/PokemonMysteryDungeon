package Game.World.Dungeon.Tools;

import Game.World.Dungeon.Floor;
import Main.Handler;

import javax.print.attribute.HashAttributeSet;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 * Created by AlexVR on 4/1/2020
 */
public class TileInfo {

    private int type;
    Handler handler;

    public int x;
    public int y;

    public Boolean isT = false;
    public Boolean isD = false;
    public Boolean isL = false;
    public Boolean isR = false;

    public Boolean isTL = false;
    public Boolean isTR = false;
    public Boolean isBL = false;
    public Boolean isBR = false;

    //sprites for checks
    public BufferedImage bottomRight3;
    public BufferedImage bottomLeft3;
    public BufferedImage topRight3;
    public BufferedImage topLeft3;
    public BufferedImage[] bottomHalf5;
    public BufferedImage[] topHalf5;
    public BufferedImage[] leftHalf5;
    public BufferedImage[] rightHalf5;
    public BufferedImage[] fullySurrounded;

    public BufferedImage DR2;
    public BufferedImage LR2;
    public BufferedImage LD2;
    public BufferedImage UD2;
    public BufferedImage UR2;
    public BufferedImage LU2;
    public BufferedImage non;

    public BufferedImage D1;
    public BufferedImage R1;
    public BufferedImage U1;
    public BufferedImage L1;
    public BufferedImage LRUD4;

    public BufferedImage LRU3;
    public BufferedImage LRD3;
    public BufferedImage LUD3;
    public BufferedImage RUD3;

    public BufferedImage bottomHalfUp6;
    public BufferedImage topHalfD6;
    public BufferedImage leftHalfRight6;
    public BufferedImage rightHalfLeft5;

    public BufferedImage allButBR;
    public BufferedImage allButBL;
    public BufferedImage allButTR;
    public BufferedImage allButTL;

    public BufferedImage bottomRightUp4;
    public BufferedImage bottomLeftUp4;
    public BufferedImage topRightDown4;
    public BufferedImage topLeftDown4;

    public BufferedImage bottomRightLeft4;
    public BufferedImage bottomLeftRight4;
    public BufferedImage topRightLeft4;
    public BufferedImage topLeftRight4;

    public BufferedImage bottomRightupLeft5;
    public BufferedImage bottomLeftupRight5;
    public BufferedImage topRightbottomLeft5;
    public BufferedImage topLeftbottomRight5;

    public BufferedImage bottomRighttopLeft6;
    public BufferedImage bottomLefttopRight6;

    public  BufferedImage sprite;

    public boolean checkDirection(ArrayList<ArrayList<Tile>> tiles, int x, int y, int type){
        return  tiles.get(x).get(y)!=null && tiles.get(x+1).get(y).type==type;
    }

    public TileInfo(Handler handler,int x, int y,int type) {
        this.handler = handler;
        this.x=x;
        this.y=y;
        this.type=type;

    }

    public void setSprite(){
        //check if were at border, not needed

        Floor floor = handler.getCurrentFloor();

        //trigger flags based on surrounding blocks, now here we get fun xD
        ArrayList<ArrayList<Tile>> tiles = floor.floorTiles;

        //actually better idea!

        isR = checkDirection(tiles,x+1,y,type);

        isT = checkDirection(tiles,x,y-1,type);

        isL = checkDirection(tiles,x-1,y,type);

        isD = checkDirection(tiles,x,y+1,type);

        isBR = checkDirection(tiles,x+1,y+1,type);

        isTR = checkDirection(tiles,x+1,y-1,type);

        isTL = checkDirection(tiles,x-1,y+1,type);

        isR = checkDirection(tiles,x+1,y,type);

        boolean checkLeft = x == 0;//lol
        boolean checkRight = x == floor.width-1;//lol
        boolean checkTop = y == 0;//lol
        boolean checkBottom = y == floor.height-1;//lol


        if (checkLeft)
        {
            isL = true;
            isTL = true;
            isBL = true;
        }
        if (checkRight)
        {
            isR = true;
            isTR = true;
            isBR = true;
        }
        if (checkTop)
        {
            isT = true;
            isTR = true;
            isTL = true;
        }
        if (checkBottom)
        {
            isD = true;
            isBR = true;
            isBL = true;
        }

        //now we change sprite based on flag to trigger connected textures

        if (!isL && isR && isD && !isT && !isBL && isBR && !isTL && !isTR)
        {
            sprite = bottomRight3;
        }
        else if (isL && isR && isD && !isT && isBL && isBR && !isTL && !isTR)
        {
            sprite = bottomHalf5[Handler.random.nextInt( bottomHalf5.length)];
        }
        else if (isL && !isR && isD && !isT && isBL && !isBR && !isTL && !isTR)
        {
            sprite = bottomLeft3;
        }

        else if (!isL && isR && isD && isT && !isBL && isBR && !isTL && isTR)
        {
            sprite = rightHalf5[Handler.random.nextInt(rightHalf5.length)];
        }
        else if (isL && isR && isD && isT && isBL && isBR && isTL && isTR)
        {
            sprite = fullySurrounded[Handler.random.nextInt( fullySurrounded.length)];
        }
        else if (isL && !isR && isD && isT && isBL && !isBR && isTL && !isTR)
        {
            sprite = leftHalf5[Handler.random.nextInt( leftHalf5.length)];
        }

        else if (!isL && isR && !isD && isT && !isBL && !isBR && !isTL && isTR)
        {
            sprite = topRight3;
        }
        else if (isL && isR && !isD && isT && !isBL && !isBR && isTL && isTR)
        {
            sprite = topHalf5[Handler.random.nextInt( topHalf5.length)];
        }
        else if (isL && !isR && !isD && isT && !isBL && !isBR && isTL && !isTR)
        {
            sprite = topRight3;
        }
    }

    public Boolean getT() {
        return isT;
    }

    public void setT(Boolean t) {
        isT = t;
    }

    public Boolean getD() {
        return isD;
    }

    public void setD(Boolean d) {
        isD = d;
    }

    public Boolean getL() {
        return isL;
    }

    public void setL(Boolean l) {
        isL = l;
    }

    public Boolean getR() {
        return isR;
    }

    public void setR(Boolean r) {
        isR = r;
    }

    public Boolean getTL() {
        return isTL;
    }

    public void setTL(Boolean TL) {
        isTL = TL;
    }

    public Boolean getTR() {
        return isTR;
    }

    public void setTR(Boolean TR) {
        isTR = TR;
    }

    public Boolean getBL() {
        return isBL;
    }

    public void setBL(Boolean BL) {
        isBL = BL;
    }

    public Boolean getBR() {
        return isBR;
    }

    public void setBR(Boolean BR) {
        isBR = BR;
    }

    public BufferedImage getBottomRight3() {
        return bottomRight3;
    }

    public void setBottomRight3(BufferedImage bottomRight3) {
        this.bottomRight3 = bottomRight3;
    }

    public BufferedImage getBottomLeft3() {
        return bottomLeft3;
    }

    public void setBottomLeft3(BufferedImage bottomLeft3) {
        this.bottomLeft3 = bottomLeft3;
    }

    public BufferedImage getTopRight3() {
        return topRight3;
    }

    public void setTopRight3(BufferedImage topRight3) {
        this.topRight3 = topRight3;
    }

    public BufferedImage getTopLeft3() {
        return topLeft3;
    }

    public void setTopLeft3(BufferedImage topLeft3) {
        this.topLeft3 = topLeft3;
    }

    public BufferedImage[] getBottomHalf5() {
        return bottomHalf5;
    }

    public void setBottomHalf5(BufferedImage[] bottomHalf5) {
        this.bottomHalf5 = bottomHalf5;
    }

    public BufferedImage[] getTopHalf5() {
        return topHalf5;
    }

    public void setTopHalf5(BufferedImage[] topHalf5) {
        this.topHalf5 = topHalf5;
    }

    public BufferedImage[] getLeftHalf5() {
        return leftHalf5;
    }

    public void setLeftHalf5(BufferedImage[] leftHalf5) {
        this.leftHalf5 = leftHalf5;
    }

    public BufferedImage[] getRightHalf5() {
        return rightHalf5;
    }

    public void setRightHalf5(BufferedImage[] rightHalf5) {
        this.rightHalf5 = rightHalf5;
    }

    public BufferedImage[] getFullySurrounded() {
        return fullySurrounded;
    }

    public void setFullySurrounded(BufferedImage[] fullySurrounded) {
        this.fullySurrounded = fullySurrounded;
    }

    public BufferedImage getDR2() {
        return DR2;
    }

    public void setDR2(BufferedImage DR2) {
        this.DR2 = DR2;
    }

    public BufferedImage getLR2() {
        return LR2;
    }

    public void setLR2(BufferedImage LR2) {
        this.LR2 = LR2;
    }

    public BufferedImage getLD2() {
        return LD2;
    }

    public void setLD2(BufferedImage LD2) {
        this.LD2 = LD2;
    }

    public BufferedImage getUD2() {
        return UD2;
    }

    public void setUD2(BufferedImage UD2) {
        this.UD2 = UD2;
    }

    public BufferedImage getUR2() {
        return UR2;
    }

    public void setUR2(BufferedImage UR2) {
        this.UR2 = UR2;
    }

    public BufferedImage getLU2() {
        return LU2;
    }

    public void setLU2(BufferedImage LU2) {
        this.LU2 = LU2;
    }

    public BufferedImage getNon() {
        return non;
    }

    public void setNon(BufferedImage non) {
        this.non = non;
    }

    public BufferedImage getD1() {
        return D1;
    }

    public void setD1(BufferedImage d1) {
        D1 = d1;
    }

    public BufferedImage getR1() {
        return R1;
    }

    public void setR1(BufferedImage r1) {
        R1 = r1;
    }

    public BufferedImage getU1() {
        return U1;
    }

    public void setU1(BufferedImage u1) {
        U1 = u1;
    }

    public BufferedImage getL1() {
        return L1;
    }

    public void setL1(BufferedImage l1) {
        L1 = l1;
    }

    public BufferedImage getLRUD4() {
        return LRUD4;
    }

    public void setLRUD4(BufferedImage LRUD4) {
        this.LRUD4 = LRUD4;
    }

    public BufferedImage getLRU3() {
        return LRU3;
    }

    public void setLRU3(BufferedImage LRU3) {
        this.LRU3 = LRU3;
    }

    public BufferedImage getLRD3() {
        return LRD3;
    }

    public void setLRD3(BufferedImage LRD3) {
        this.LRD3 = LRD3;
    }

    public BufferedImage getLUD3() {
        return LUD3;
    }

    public void setLUD3(BufferedImage LUD3) {
        this.LUD3 = LUD3;
    }

    public BufferedImage getRUD3() {
        return RUD3;
    }

    public void setRUD3(BufferedImage RUD3) {
        this.RUD3 = RUD3;
    }

    public BufferedImage getBottomHalfUp6() {
        return bottomHalfUp6;
    }

    public void setBottomHalfUp6(BufferedImage bottomHalfUp6) {
        this.bottomHalfUp6 = bottomHalfUp6;
    }

    public BufferedImage getTopHalfD6() {
        return topHalfD6;
    }

    public void setTopHalfD6(BufferedImage topHalfD6) {
        this.topHalfD6 = topHalfD6;
    }

    public BufferedImage getLeftHalfRight6() {
        return leftHalfRight6;
    }

    public void setLeftHalfRight6(BufferedImage leftHalfRight6) {
        this.leftHalfRight6 = leftHalfRight6;
    }

    public BufferedImage getRightHalfLeft5() {
        return rightHalfLeft5;
    }

    public void setRightHalfLeft5(BufferedImage rightHalfLeft5) {
        this.rightHalfLeft5 = rightHalfLeft5;
    }

    public BufferedImage getAllButBR() {
        return allButBR;
    }

    public void setAllButBR(BufferedImage allButBR) {
        this.allButBR = allButBR;
    }

    public BufferedImage getAllButBL() {
        return allButBL;
    }

    public void setAllButBL(BufferedImage allButBL) {
        this.allButBL = allButBL;
    }

    public BufferedImage getAllButTR() {
        return allButTR;
    }

    public void setAllButTR(BufferedImage allButTR) {
        this.allButTR = allButTR;
    }

    public BufferedImage getAllButTL() {
        return allButTL;
    }

    public void setAllButTL(BufferedImage allButTL) {
        this.allButTL = allButTL;
    }

    public BufferedImage getBottomRightUp4() {
        return bottomRightUp4;
    }

    public void setBottomRightUp4(BufferedImage bottomRightUp4) {
        this.bottomRightUp4 = bottomRightUp4;
    }

    public BufferedImage getBottomLeftUp4() {
        return bottomLeftUp4;
    }

    public void setBottomLeftUp4(BufferedImage bottomLeftUp4) {
        this.bottomLeftUp4 = bottomLeftUp4;
    }

    public BufferedImage getTopRightDown4() {
        return topRightDown4;
    }

    public void setTopRightDown4(BufferedImage topRightDown4) {
        this.topRightDown4 = topRightDown4;
    }

    public BufferedImage getTopLeftDown4() {
        return topLeftDown4;
    }

    public void setTopLeftDown4(BufferedImage topLeftDown4) {
        this.topLeftDown4 = topLeftDown4;
    }

    public BufferedImage getBottomRightLeft4() {
        return bottomRightLeft4;
    }

    public void setBottomRightLeft4(BufferedImage bottomRightLeft4) {
        this.bottomRightLeft4 = bottomRightLeft4;
    }

    public BufferedImage getBottomLeftRight4() {
        return bottomLeftRight4;
    }

    public void setBottomLeftRight4(BufferedImage bottomLeftRight4) {
        this.bottomLeftRight4 = bottomLeftRight4;
    }

    public BufferedImage getTopRightLeft4() {
        return topRightLeft4;
    }

    public void setTopRightLeft4(BufferedImage topRightLeft4) {
        this.topRightLeft4 = topRightLeft4;
    }

    public BufferedImage getTopLeftRight4() {
        return topLeftRight4;
    }

    public void setTopLeftRight4(BufferedImage topLeftRight4) {
        this.topLeftRight4 = topLeftRight4;
    }

    public BufferedImage getBottomRightupLeft5() {
        return bottomRightupLeft5;
    }

    public void setBottomRightupLeft5(BufferedImage bottomRightupLeft5) {
        this.bottomRightupLeft5 = bottomRightupLeft5;
    }

    public BufferedImage getBottomLeftupRight5() {
        return bottomLeftupRight5;
    }

    public void setBottomLeftupRight5(BufferedImage bottomLeftupRight5) {
        this.bottomLeftupRight5 = bottomLeftupRight5;
    }

    public BufferedImage getTopRightbottomLeft5() {
        return topRightbottomLeft5;
    }

    public void setTopRightbottomLeft5(BufferedImage topRightbottomLeft5) {
        this.topRightbottomLeft5 = topRightbottomLeft5;
    }

    public BufferedImage getTopLeftbottomRight5() {
        return topLeftbottomRight5;
    }

    public void setTopLeftbottomRight5(BufferedImage topLeftbottomRight5) {
        this.topLeftbottomRight5 = topLeftbottomRight5;
    }

    public BufferedImage getBottomRighttopLeft6() {
        return bottomRighttopLeft6;
    }

    public void setBottomRighttopLeft6(BufferedImage bottomRighttopLeft6) {
        this.bottomRighttopLeft6 = bottomRighttopLeft6;
    }

    public BufferedImage getBottomLefttopRight6() {
        return bottomLefttopRight6;
    }

    public void setBottomLefttopRight6(BufferedImage bottomLefttopRight6) {
        this.bottomLefttopRight6 = bottomLefttopRight6;
    }

    public BufferedImage getCorrectTile() {

        return sprite;
    }
}
