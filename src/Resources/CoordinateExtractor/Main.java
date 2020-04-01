package Resources.CoordinateExtractor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created by AlexVR on 3/9/20200
 */
public class Main {
    public static void main(String[] args) {
        // define the path to your text file
        String myFilePath = "D:\\Code\\intellij\\PokemonMysteryDungeon\\src\\Resources\\CoordinateExtractor\\temp.txt";

        // read and parse the file
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(myFilePath)));
            String line;
            while ((line = br.readLine()) != null) {
                line = line.replace(line.substring(0,line.indexOf("x=") +3),"            appleWood.add(tileSetSpriteSheet.crop(");
                line = line.replace("\" y=\"",",");
                line = line.replace("\" w=\"",",");
                line = line.replace("\" h=\"",",");
                line = line.replace("\"/>","));");
                System.out.println(line);
            }
            br.close();
        } catch (Exception e) {
            System.out.println("There was an issue parsing the file.");
        }
    }
}
