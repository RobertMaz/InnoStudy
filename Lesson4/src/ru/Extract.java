package ru;

public class Extract {

    private Extract(){

    }
    public static int getNumber(String text){
        String newData = text.substring(text.indexOf("=") + 1).trim();
        int n = Integer.parseInt(newData);
        return n;
    }
}
