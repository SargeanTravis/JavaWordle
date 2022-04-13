package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class WordleController {

    //Takes the Words Array that I hide in a class because it unnecessarily bloats the class
    public Words Wordset;

    //The word that the user guesses on and breaks it into a char array
    private char[] word;

    //Tracks the rounds
    private int round;

    //Begin Getters and Setters
    public char[] getWord()
    {
        return word;
    }


    //This setter is different as it doesn't need a char[] parameter; it is randomly chosen when called
    public void setWord(Words wordset)
    {

        int rand = new Random().nextInt(Wordset.getWordset().length);


        word = wordset.getWordset()[rand].toCharArray();

        setRound(1);

    }



    public int getRound()
    {
        return round;
    }

    public void setRound(int value)
    {
        round = value;
    }

    //End Getters and Setters

    //Constructor
    public WordleController(Words ws)
    {
        Wordset = ws;

        String[] testSet = new String[] {"house","fleet","atoll","hours" };
        
        
        
        Wordset.setWordset(testSet);

        setWord(Wordset);

        //Always set round to 1 to start
        setRound(1);
    }



    //Compares a letter to see if it's right place, right letter
    public boolean rightPlaceRightLetter(char letter, int pos)
    {
        Character wordChar = getWord()[pos];


        //Return true if the letter is correct
        if(wordChar.equals(letter)){

            return true;



        }

        //Otherwise return false
        return false;

    }


    //This gives the JFrame the information it needs to color code the zones

    public String[] guessArray(char p1, char p2, char p3, char p4, char p5){

        String[] gArray ={" "," "," "," "," "};


        //Create Char Array from user input
        ArrayList<Character> userGuess = new ArrayList<Character>();
        userGuess.add(p1);
        userGuess.add(p2);
        userGuess.add(p3);
        userGuess.add(p4);
        userGuess.add(p5);

        //Convert the guess word into a char array so the guess can be processed
        ArrayList<Character> characterArrayList = new ArrayList<Character>();
        for(char cWord: getWord())
        {
            characterArrayList.add(cWord);
        }

        int i =0;

        //The gueschecker algorithm Part 1: remove all the greens
        for(char letter: userGuess)
        {
            //Grab current letter
            char currentLetter = letter;

            //If the letter in that place is correct, mark it as so
            //Also convert the respective guess and word arraylists to a 0 placeholder for part 2
            if(rightPlaceRightLetter(currentLetter, i)){
                gArray[i] = "RLRP";
                characterArrayList.set(i,'0');
                userGuess.set(i,'0');
            }

            //increment the counter
            i++;
        }

        //reset the counter so it can be used to validate yellow letters and
        i =0;

        //Initialize a second counter for part 2 of algorithm
        int j =0;

        //Check for Yellow (Wrong place) letters and wrong letters

        //But first make sure the word hasnt been guessed already by running a quick boolean check
        boolean check = true;


        for( String guess : gArray)
        {
            if(!guess.equals("RLRP")){
                check = false;
                break;
            }
        }

        //Guesschecker algorithm Part 2: Wrong Place letters
        if(!check){


            for(char letter: characterArrayList)
            {
                char currentLetter = letter;

                //Attempt to find the letter in the
                for(char guessLetter : userGuess)
                {
                    //If the guess isn't a placeholder value indicating a correct letter guess
                    if(!(guessLetter == '0')){

                        //if a letter is out of position but not correct (which is guaranteed because of the 0 placeholder)
                        if(guessLetter == currentLetter){
                            gArray[j] = "RLWP";
                            characterArrayList.set(i,'0');
                            userGuess.set(j,'0');
                            break;
                        }

                    }
                    else break;


                    j++;
                }


                //reset the second counter and increment first counter
                j =0;
                i++;

            }
        }
        //guesschecker algorithm Part 3: Wrong Letters
        for(i =0; i < gArray.length; i++)
        {
            //Find any letter that wasn't given a value and initialize it to
            if(gArray[i].equals(" ")){
               gArray[i] = "WRWP";
            }
        }



        return gArray;
    }

    //Increments round after unsuccessful guesses
    public void incrementRound()
    {
        int newValue = getRound();
        newValue++;

        setRound(newValue);
    }

}
