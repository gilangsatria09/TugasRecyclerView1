package com.example.myrecyclerview;

import android.graphics.drawable.Drawable;

public class Mail {
    private String mailSymbol,name,title,content,clock;
    private int mailColor;

    public int getMailColor() {
        return mailColor;
    }

    public void setMailColor(int mailColor) {
        this.mailColor = mailColor;
    }

    public Mail(String mailSymbol,int mailColor,String name, String title, String content, String clock){
        this.mailSymbol = mailSymbol;
        this.mailColor = mailColor;
        this.name = name;
        this.title = title;
        this.content = content;
        this.clock = clock;
    }

    public String getMailSymbol() {
        return mailSymbol;
    }

    public void setMailSymbol(String mailSymbol) {
        this.mailSymbol = mailSymbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getClock() {
        return clock;
    }

    public void setClock(String clock) {
        this.clock = clock;
    }
}
