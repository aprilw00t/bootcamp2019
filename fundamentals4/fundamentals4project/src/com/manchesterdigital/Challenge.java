package com.manchesterdigital;

public class Challenge {
    public static void main(String[] args) {
        Party(3, 6);}

public static void Party(int tea, int candy){
    String party;
        if(tea < 5|| candy < 5)
        {
            party = "bad";
        }
        else
        if(tea >= candy * 2 || candy >= tea * 2 )
        {
            party = "great";
        }
        else
            {
                party = "good";
        }

        System.out.println(party);
        }}


