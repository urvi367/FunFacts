package com.example.funfacts;

import android.graphics.Color;

import java.util.Random;

public class bgcolor {
    private String[] bgc={
            "#39add1",
            "#3079ab",
            "#c25975",
            "#e15258",
            "#f9845b",
            "#838cc7",
            "#7d669e",
            "#53bbb4",
            "#51b46d",
            "#e0ab18",
            "#637a91",
            "#7092b0",
            "#b7c0c7"};

    int getbg ()
    {
        Random r=new Random();
        int x= r.nextInt(bgc.length);
        return Color.parseColor(bgc[x]);
    }
}
