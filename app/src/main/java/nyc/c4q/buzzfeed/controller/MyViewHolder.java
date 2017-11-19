package nyc.c4q.buzzfeed.controller;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import nyc.c4q.buzzfeed.Quiz;
import nyc.c4q.buzzfeed.R;

/**
 * Created by MarckemX on 11/19/17.
 */

public class MyViewHolder extends RecyclerView.ViewHolder {
    TextView fQuestion;
    Button answerOne, answerTwo, answerThree, answerFour;
    ArrayList<Button>buttons;
    public MyViewHolder(View itemView) {
        super(itemView);
    }

    public void setValues(){
        buttons.add(answerOne = itemView.findViewById(R.id.answer_one));
        buttons.add(answerTwo = itemView.findViewById(R.id.answer_two));
        buttons.add(answerThree = itemView.findViewById(R.id.answer_three));
        buttons.add(answerFour = itemView.findViewById(R.id.answer_four));
        fQuestion = itemView.findViewById(R.id.the_question);
    }

    public void updateValues(Quiz data){
        fQuestion.setText(data.getFocusQuestion());
        for(int i = 0; i < data.getOptions().size(); i ++ ) {
            buttons.get(i).setText(data.getOption(i));
        }
    }
    public void bind(Quiz data){
        setValues();
        updateValues(data);

    }
}
