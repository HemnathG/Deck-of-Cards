package com.bridgelabz;

public class DeckOfCards {

        String[] suit = {"Diamond", "Heart", "Spade", "Club"};
        String[] rank = {"2","3","4","5","6","7","8","9","10", "Jack","Queen","King","Ace"};
        String [][] cardSet = new String[4][13];

    public void assignCard(){
        for (int i=0; i<4; i++){
            for (int j=0; j<13; j++){
                cardSet[i][j] = suit [i] + rank[j];
            }
        }
    }

}
