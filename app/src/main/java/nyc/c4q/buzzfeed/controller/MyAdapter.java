package nyc.c4q.buzzfeed.controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.buzzfeed.Quiz;
import nyc.c4q.buzzfeed.R;

/**
 * Created by MarckemX on 11/19/17.
 */

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private List<Quiz> quizList;

    public MyAdapter(List<Quiz> quizzes){
        quizList = quizzes;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate((R.layout.quiz_layout),parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        MyViewHolder myViewHolder = (MyViewHolder) holder;
        holder.bind(quizList.get(position));
    }

    @Override
    public int getItemCount() {
        return quizList.size();
    }
}
