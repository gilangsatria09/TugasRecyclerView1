package com.example.myrecyclerview;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MailViewHolder> {

    private List<Mail> mailList;

    public class MailViewHolder extends RecyclerView.ViewHolder{
        public TextView mailSymbol,mailColor,name,title,content,clock;

        public MailViewHolder(View view){
            super(view);
            mailSymbol = (TextView)view.findViewById(R.id.tvRounded);
            mailColor = (TextView)view.findViewById(R.id.tvRounded);
            name = (TextView)view.findViewById(R.id.name);
            title = (TextView)view.findViewById(R.id.title);
            content=(TextView)view.findViewById(R.id.content);
            clock=(TextView)view.findViewById(R.id.clock);
        }
    }

    public RecyclerViewAdapter(List<Mail> mailList){
        this.mailList = mailList;
    }

    @Override
    public MailViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemview = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.activity_recycler_view,viewGroup,false);
        MailViewHolder mvh = new MailViewHolder(itemview);
        return mvh;
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.MailViewHolder mailViewHolder, int position) {
        Mail mail = mailList.get(position);
        mailViewHolder.mailSymbol.setText(mail.getMailSymbol());
        mailViewHolder.mailColor.setBackgroundResource(mail.getMailColor());
        mailViewHolder.name.setText(mail.getName());
        mailViewHolder.title.setText(mail.getTitle());
        mailViewHolder.content.setText(mail.getContent());
        mailViewHolder.clock.setText(mail.getClock());

    }

    @Override
    public int getItemCount() {
        return mailList.size();
    }
}
