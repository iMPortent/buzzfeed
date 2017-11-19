package nyc.c4q.buzzfeed;

import java.util.*;

/**
 * Created by MarckemX on 11/18/17.
 */

public class Quiz {

    private String focusQuestion;
    private ArrayList<String> qOptions;

    public String getFocusQuestion(){
        return focusQuestion;
    }


    public String getOption(int position){
        return qOptions.get(position);
    }

    public ArrayList<String> getOptions(){
        return qOptions;
    }

}
