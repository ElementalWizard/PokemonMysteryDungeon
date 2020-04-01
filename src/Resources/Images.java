package Resources;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.AreaAveragingScaleFilter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by AlexVR on 1/24/2020.
 */
public class Images {


    public static BufferedImage[] startGameButton;
    public static BufferedImage titleScreenBackground;
    public static BufferedImage pauseBackground;
    public static BufferedImage[] pauseResumeButton;
    public static BufferedImage[] pauseToTitleButton;
    public static BufferedImage[] pauseOptionsButton;

    public static BufferedImage appleWoodtileSetPicture;
    public static SpriteSheet tileSetSpriteSheet;

    public static ArrayList<BufferedImage> appleWood;




    public Images() {

        startGameButton = new BufferedImage[3];
        pauseResumeButton = new BufferedImage[2];
        pauseToTitleButton = new BufferedImage[2];
        pauseOptionsButton = new BufferedImage[2];

        appleWood = new ArrayList<>();


        try {

            startGameButton[0]= ImageIO.read(getClass().getResourceAsStream("/UI/Buttons/Start/NormalStartButton.png"));
            startGameButton[1]= ImageIO.read(getClass().getResourceAsStream("/UI/Buttons/Start/HoverStartButton.png"));
            startGameButton[2]= ImageIO.read(getClass().getResourceAsStream("/UI/Buttons/Start/ClickedStartButton.png"));

            titleScreenBackground = ImageIO.read(getClass().getResourceAsStream("/UI/Backgrounds/Title.png"));

            pauseBackground = ImageIO.read(getClass().getResourceAsStream("/UI/Backgrounds/Pause.png"));

            pauseResumeButton[0] = ImageIO.read(getClass().getResourceAsStream("/UI/Buttons/Pause/Resume/NormalHoverResume.png"));
            pauseResumeButton[1] = ImageIO.read(getClass().getResourceAsStream("/UI/Buttons/Pause/Resume/PressedResume.png"));

            pauseToTitleButton[0] = ImageIO.read(getClass().getResourceAsStream("/UI/Buttons/Pause/ToTitle/NormalHoverToTitleButton.png"));
            pauseToTitleButton[1] = ImageIO.read(getClass().getResourceAsStream("/UI/Buttons/Pause/ToTitle/PressedToTitleButton.png"));

            pauseOptionsButton[0] = ImageIO.read(getClass().getResourceAsStream("/UI/Buttons/Pause/ToOptions/NormalHoverToOptionsButton.png"));
            pauseOptionsButton[1] = ImageIO.read(getClass().getResourceAsStream("/UI/Buttons/Pause/ToOptions/PressedToOptionsButton.png"));

            appleWoodtileSetPicture = ImageIO.read(getClass().getResourceAsStream("/Tileset/Apple_Woods.png"));
            appleWoodtileSetPicture = createImage(appleWoodtileSetPicture,"appleWood_cyan",new Color(128,255,255).getRGB());

            tileSetSpriteSheet = new SpriteSheet(appleWoodtileSetPicture);

            //now the fun part!! assigning these to the correct conected texture path
            //if anyone wants to know what my train of thought is they are free to join the discord and theres a voice chat open there

            appleWood.add(tileSetSpriteSheet.crop(84,163,24,24));
            appleWood.add(tileSetSpriteSheet.crop(109,163,24,24));
            appleWood.add(tileSetSpriteSheet.crop(184,163,24,24));
            appleWood.add(tileSetSpriteSheet.crop(259,163,24,24));
            appleWood.add(tileSetSpriteSheet.crop(134,163,24,24));
            appleWood.add(tileSetSpriteSheet.crop(84,188,24,24));
            appleWood.add(tileSetSpriteSheet.crop(159,188,24,24));
            appleWood.add(tileSetSpriteSheet.crop(234,188,24,24));
            appleWood.add(tileSetSpriteSheet.crop(109,188,24,24));
            appleWood.add(tileSetSpriteSheet.crop(184,188,24,24));
            appleWood.add(tileSetSpriteSheet.crop(259,188,24,24));
            appleWood.add(tileSetSpriteSheet.crop(134,188,24,24));
            appleWood.add(tileSetSpriteSheet.crop(209,188,24,24));
            appleWood.add(tileSetSpriteSheet.crop(284,188,24,24));
            appleWood.add(tileSetSpriteSheet.crop(84,213,24,24));
            appleWood.add(tileSetSpriteSheet.crop(109,213,24,24));
            appleWood.add(tileSetSpriteSheet.crop(184,213,24,24));
            appleWood.add(tileSetSpriteSheet.crop(134,213,24,24));
            appleWood.add(tileSetSpriteSheet.crop(259,213,24,24));
            appleWood.add(tileSetSpriteSheet.crop(84,238,24,24));
            appleWood.add(tileSetSpriteSheet.crop(109,238,24,24));
            appleWood.add(tileSetSpriteSheet.crop(134,238,24,24));
            appleWood.add(tileSetSpriteSheet.crop(84,263,24,24));
            appleWood.add(tileSetSpriteSheet.crop(109,263,24,24));
            appleWood.add(tileSetSpriteSheet.crop(84,288,24,24));
            appleWood.add(tileSetSpriteSheet.crop(134,288,24,24));
            appleWood.add(tileSetSpriteSheet.crop(109,313,24,24));
            appleWood.add(tileSetSpriteSheet.crop(84,338,24,24));
            appleWood.add(tileSetSpriteSheet.crop(109,338,24,24));
            appleWood.add(tileSetSpriteSheet.crop(134,338,24,24));
            appleWood.add(tileSetSpriteSheet.crop(109,363,24,24));
            appleWood.add(tileSetSpriteSheet.crop(109,388,24,24));
            appleWood.add(tileSetSpriteSheet.crop(84,413,24,24));
            appleWood.add(tileSetSpriteSheet.crop(134,413,24,24));
            appleWood.add(tileSetSpriteSheet.crop(109,438,24,24));
            appleWood.add(tileSetSpriteSheet.crop(109,463,24,24));
            appleWood.add(tileSetSpriteSheet.crop(84,488,24,24));
            appleWood.add(tileSetSpriteSheet.crop(134,488,24,24));
            appleWood.add(tileSetSpriteSheet.crop(109,513,24,24));
            appleWood.add(tileSetSpriteSheet.crop(84,538,24,24));
            appleWood.add(tileSetSpriteSheet.crop(109,538,24,24));
            appleWood.add(tileSetSpriteSheet.crop(84,563,24,24));
            appleWood.add(tileSetSpriteSheet.crop(109,563,24,24));
            appleWood.add(tileSetSpriteSheet.crop(84,588,24,24));
            appleWood.add(tileSetSpriteSheet.crop(109,588,24,24));
            appleWood.add(tileSetSpriteSheet.crop(84,613,24,24));
            appleWood.add(tileSetSpriteSheet.crop(109,613,24,24));
            appleWood.add(tileSetSpriteSheet.crop(84,638,24,24));
            appleWood.add(tileSetSpriteSheet.crop(109,638,24,24));
            appleWood.add(tileSetSpriteSheet.crop(84,663,24,24));
            appleWood.add(tileSetSpriteSheet.crop(109,663,24,24));
            appleWood.add(tileSetSpriteSheet.crop(84,688,24,24));
            appleWood.add(tileSetSpriteSheet.crop(109,688,24,24));
            appleWood.add(tileSetSpriteSheet.crop(84,713,24,24));
            appleWood.add(tileSetSpriteSheet.crop(109,713,24,24));
            appleWood.add(tileSetSpriteSheet.crop(84,738,24,24));
            appleWood.add(tileSetSpriteSheet.crop(109,738,24,24));
            appleWood.add(tileSetSpriteSheet.crop(309,163,24,24));
            appleWood.add(tileSetSpriteSheet.crop(334,163,24,24));
            appleWood.add(tileSetSpriteSheet.crop(359,163,24,24));
            appleWood.add(tileSetSpriteSheet.crop(309,188,24,24));
            appleWood.add(tileSetSpriteSheet.crop(334,188,24,24));
            appleWood.add(tileSetSpriteSheet.crop(409,188,24,24));
            appleWood.add(tileSetSpriteSheet.crop(484,188,24,24));
            appleWood.add(tileSetSpriteSheet.crop(359,188,24,24));
            appleWood.add(tileSetSpriteSheet.crop(309,213,24,24));
            appleWood.add(tileSetSpriteSheet.crop(334,213,24,24));
            appleWood.add(tileSetSpriteSheet.crop(359,213,24,24));
            appleWood.add(tileSetSpriteSheet.crop(309,238,24,24));
            appleWood.add(tileSetSpriteSheet.crop(334,238,24,24));
            appleWood.add(tileSetSpriteSheet.crop(359,238,24,24));
            appleWood.add(tileSetSpriteSheet.crop(309,263,24,24));
            appleWood.add(tileSetSpriteSheet.crop(334,263,24,24));
            appleWood.add(tileSetSpriteSheet.crop(309,288,24,24));
            appleWood.add(tileSetSpriteSheet.crop(359,288,24,24));
            appleWood.add(tileSetSpriteSheet.crop(334,313,24,24));
            appleWood.add(tileSetSpriteSheet.crop(309,338,24,24));
            appleWood.add(tileSetSpriteSheet.crop(334,338,24,24));
            appleWood.add(tileSetSpriteSheet.crop(359,338,24,24));
            appleWood.add(tileSetSpriteSheet.crop(334,363,24,24));
            appleWood.add(tileSetSpriteSheet.crop(334,388,24,24));
            appleWood.add(tileSetSpriteSheet.crop(309,413,24,24));
            appleWood.add(tileSetSpriteSheet.crop(359,413,24,24));
            appleWood.add(tileSetSpriteSheet.crop(334,438,24,24));
            appleWood.add(tileSetSpriteSheet.crop(334,463,24,24));
            appleWood.add(tileSetSpriteSheet.crop(309,488,24,24));
            appleWood.add(tileSetSpriteSheet.crop(359,488,24,24));
            appleWood.add(tileSetSpriteSheet.crop(334,513,24,24));
            appleWood.add(tileSetSpriteSheet.crop(309,538,24,24));
            appleWood.add(tileSetSpriteSheet.crop(334,538,24,24));
            appleWood.add(tileSetSpriteSheet.crop(309,563,24,24));
            appleWood.add(tileSetSpriteSheet.crop(334,563,24,24));
            appleWood.add(tileSetSpriteSheet.crop(309,588,24,24));
            appleWood.add(tileSetSpriteSheet.crop(334,588,24,24));
            appleWood.add(tileSetSpriteSheet.crop(309,613,24,24));
            appleWood.add(tileSetSpriteSheet.crop(334,613,24,24));
            appleWood.add(tileSetSpriteSheet.crop(309,638,24,24));
            appleWood.add(tileSetSpriteSheet.crop(334,638,24,24));
            appleWood.add(tileSetSpriteSheet.crop(309,663,24,24));
            appleWood.add(tileSetSpriteSheet.crop(334,663,24,24));
            appleWood.add(tileSetSpriteSheet.crop(309,688,24,24));
            appleWood.add(tileSetSpriteSheet.crop(334,688,24,24));
            appleWood.add(tileSetSpriteSheet.crop(309,713,24,24));
            appleWood.add(tileSetSpriteSheet.crop(334,713,24,24));
            appleWood.add(tileSetSpriteSheet.crop(309,738,24,24));
            appleWood.add(tileSetSpriteSheet.crop(334,738,24,24));

        }catch (IOException e) {
        e.printStackTrace();
    }


    }

    public static BufferedImage loadImage(String path) {
        try {
            return ImageIO.read(Images.class.getResourceAsStream(path));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        return null;
    }

    public static Color transparant = new Color(255, 255, 255, 0);

    public BufferedImage createImage(BufferedImage image,String name, int RGBToReplace){

        int width=image.getWidth();
        int height=image.getHeight();
        String path = Objects.requireNonNull(getClass().getClassLoader().getResource(".")).getPath();
        String path2 = path.substring(0,path.indexOf("/out/"))+"/res/Edited/"+name+".png";
        File imagess = new File(path2.replaceAll("%20"," "));
        if (imagess.exists()){
            try {
                return ImageIO.read(imagess.getAbsoluteFile());
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
        // Create buffered image object
        BufferedImage img = null;

        img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        // file object
        File f = null;

        // create random values pixel by pixel
        for (int y = 0; y < height; y++)
        {
            for (int x = 0; x < width; x++)
            {
                if (image.getRGB(x, y) == RGBToReplace) {
                    img.setRGB(x, y, transparant.getRGB());
                } else {
                    img.setRGB(x, y, image.getRGB(x, y));
                }


            }
        }

        // write image, AKA save it to pc
        try
        {
            path = Objects.requireNonNull(getClass().getClassLoader().getResource(".")).getPath();
            path2 = path.substring(0,path.indexOf("/out/"))+"/res/Edited/"+name+".png";
            f = new File(path2.replaceAll("%20"," "));
            System.out.println("File saved in: "+path2);
            ImageIO.write(img, "png", f);
        }
        catch(IOException e)
        {
            System.out.println("Error: " + e);
        }
        return img;
    }

    public static BufferedImage tint(BufferedImage src, float r, float g, float b) {

        // Copy image
        BufferedImage newImage = new BufferedImage(src.getWidth(), src.getHeight(), BufferedImage.TRANSLUCENT);
        Graphics2D graphics = newImage.createGraphics();
        graphics.drawImage(src, 0, 0, null);
        graphics.dispose();

        // Color image
        for (int i = 0; i < newImage.getWidth(); i++) {
            for (int j = 0; j < newImage.getHeight(); j++) {
                int ax = newImage.getColorModel().getAlpha(newImage.getRaster().getDataElements(i, j, null));
                int rx = newImage.getColorModel().getRed(newImage.getRaster().getDataElements(i, j, null));
                int gx = newImage.getColorModel().getGreen(newImage.getRaster().getDataElements(i, j, null));
                int bx = newImage.getColorModel().getBlue(newImage.getRaster().getDataElements(i, j, null));
                rx *= r;
                gx *= g;
                bx *= b;
                newImage.setRGB(i, j, (ax << 24) | (rx << 16) | (gx << 8) | (bx << 0));
            }
        }
        return newImage;
    }

}
