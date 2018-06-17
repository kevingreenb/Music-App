package com.example.android.musicapp;

public class Information {

    private String mFirstLine;
    private String mSecondLine;

   public Information(String firstLine, String secondLine) {
       mFirstLine = firstLine;
       mSecondLine = secondLine;
   }

   public String getFirstLine() {
       return mFirstLine;
   }
    public String getSecondLine() {
        return mSecondLine;
    }
}
