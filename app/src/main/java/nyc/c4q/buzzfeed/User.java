package nyc.c4q.buzzfeed;

import java.util.*;

/**
 * Created by MarckemX on 11/19/17.
 */

public class User {
    private ArrayList<String> myAnswers;
    private String myAnalysis;

    public ArrayList<String> getMyAnswers(){
        return myAnswers;
    }

    public void addAnswers(String newAnswer){
        myAnswers.add(newAnswer);
    }

    public String getMyAnalysis(){
        return myAnalysis;
    }

    public void createAnalysis(){

    }
}
