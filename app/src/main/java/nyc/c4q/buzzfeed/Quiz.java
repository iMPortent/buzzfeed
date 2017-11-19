package nyc.c4q.buzzfeed;

import java.util.*;

/**
 * Created by MarckemX on 11/18/17.
 */

public class Quiz {

    private String focusQuestion;
    private ArrayList<String> qOptions = new ArrayList();

    public Quiz(){ }

    public void setFocusQuestion(String focusQuestion){
        this.focusQuestion = focusQuestion;
    }

    public void setOptions(String option) {
        if (qOptions.size() < 4) {
            qOptions.add(option);
        }
    }
    public String getFocusQuestion(){
        return focusQuestion;
    }


    public String getOptions(int position){
        return qOptions.get(position);
    }

    public ArrayList<String> getOptions(){
        return qOptions;
    }

}
