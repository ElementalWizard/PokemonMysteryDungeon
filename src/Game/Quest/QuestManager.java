package Game.Quest;

import Main.Handler;

import java.util.ArrayList;

/**
 * Created by AlexVR on 4/1/2020
 */
public class QuestManager {

    Handler handler;
    ArrayList<BaseQuest> listOfQuest;

    public QuestManager(Handler handler, ArrayList<BaseQuest> listOfQuest) {
        this.handler = handler;
        this.listOfQuest = listOfQuest;
    }

    public ArrayList<BaseQuest> getListOfQuest() {
        return listOfQuest;
    }

    public void setListOfQuest(ArrayList<BaseQuest> listOfQuest) {
        this.listOfQuest = listOfQuest;
    }

    public void addListOfQuest(BaseQuest quest) {
        this.listOfQuest.add(quest);
    }

    public void removeListOfQuest(BaseQuest quest) {
        this.listOfQuest.remove(quest);
    }


}
