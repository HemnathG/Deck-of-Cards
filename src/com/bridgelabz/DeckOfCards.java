package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeckOfCards {

    Scanner sc = new Scanner(System.in);
    List<Player> playerList = new ArrayList<Player>();

    String[] suit = {"Diamond", "Heart", "Spade", "Club"};
    String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    String[][] cardSet = new String[4][13];

    public void assignCard() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                cardSet[i][j] = suit[i] + rank[j];
            }
        }
    }

    public void addplayer(int numberOfPlayers) {
        System.out.println("Enter Player");
        if (numberOfPlayers <= 4 && numberOfPlayers > 2) {
            for (int i = 0; i < numberOfPlayers; i++) {
                System.out.println("Player Name :");
                String name = sc.next();
                Player player = new Player(name);
                playerList.add(player);

            }else{
                System.out.println("Many Players");
            }

        } }
    public static void main (String[]args){
            addplayer(2);
        }
    }

