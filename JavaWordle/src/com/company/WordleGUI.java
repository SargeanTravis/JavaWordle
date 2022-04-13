package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.Objects;

public class WordleGUI extends JFrame {

    private JLabel r1p1, r1p2, r1p3, r1p4, r1p5;//First guess row
    private JLabel r2p1, r2p2, r2p3, r2p4, r2p5;//Second guess row
    private JLabel r3p1, r3p2, r3p3, r3p4, r3p5;//Third guess row
    private JLabel r4p1, r4p2, r4p3, r4p4, r4p5;//Fourth guess row
    private JLabel r5p1, r5p2, r5p3, r5p4, r5p5;//Fifth guess row
    private JLabel r6p1, r6p2, r6p3, r6p4, r6p5;//Last guess row

    JTextField tGuess1, tGuess2, tGuess3, tGuess4, tGuess5; //User Input fields

    JButton bInput; //User submits data via this button

    private JLabel tMessages; //Displays any error messages like incorrect amount of words, etc.

    JPanel jp1, jp2;//Segments the JFrame into 2 sections so I can use GridLayout

    WordleController wc;

    //JFrame Height and width controls
    private int WIDTH = 600;
    private int HEIGHT = 1200;

    //ActionListener pays attention to this value to check for an end game condition



    public WordleGUI() {
        //Generic Initialization settings
        setTitle("Java Wordle!");

        Container pane = getContentPane();
        pane.setLayout(new GridLayout(3, 1));

        wc = new WordleController(new Words());


        //Display section of UI
        jp1 = new JPanel(new GridLayout(7, 5));
        r1p1 = new JLabel();
        r1p1.setBorder(BorderFactory.createLineBorder(Color.black));
        r1p1.setFont(new Font("Roboto", Font.BOLD, 24));
        r1p1.setForeground(Color.WHITE);
        r1p1.setHorizontalAlignment(SwingConstants.CENTER);
        r1p1.setOpaque(true);

        r1p2 = new JLabel();
        r1p2.setBorder(BorderFactory.createLineBorder(Color.black));
        r1p2.setFont(new Font("Roboto", Font.BOLD, 24));
        r1p2.setForeground(Color.WHITE);
        r1p2.setHorizontalAlignment(SwingConstants.CENTER);
        r1p2.setOpaque(true);

        r1p3 = new JLabel();
        r1p3.setBorder(BorderFactory.createLineBorder(Color.black));
        r1p3.setFont(new Font("Roboto", Font.BOLD, 24));
        r1p3.setForeground(Color.WHITE);
        r1p3.setHorizontalAlignment(SwingConstants.CENTER);
        r1p3.setOpaque(true);

        r1p4 = new JLabel();
        r1p4.setBorder(BorderFactory.createLineBorder(Color.black));
        r1p4.setFont(new Font("Roboto", Font.BOLD, 24));
        r1p4.setForeground(Color.WHITE);
        r1p4.setHorizontalAlignment(SwingConstants.CENTER);
        r1p4.setOpaque(true);

        r1p5 = new JLabel();
        r1p5.setBorder(BorderFactory.createLineBorder(Color.black));
        r1p5.setFont(new Font("Roboto", Font.BOLD, 24));
        r1p5.setForeground(Color.WHITE);
        r1p5.setHorizontalAlignment(SwingConstants.CENTER);
        r1p5.setOpaque(true);

        r2p1 = new JLabel();
        r2p1.setBorder(BorderFactory.createLineBorder(Color.black));
        r2p1.setFont(new Font("Roboto", Font.BOLD, 24));
        r2p1.setForeground(Color.WHITE);
        r2p1.setHorizontalAlignment(SwingConstants.CENTER);
        r2p1.setOpaque(true);

        r2p2 = new JLabel();
        r2p2.setBorder(BorderFactory.createLineBorder(Color.black));
        r2p2.setFont(new Font("Roboto", Font.BOLD, 24));
        r2p2.setForeground(Color.WHITE);
        r2p2.setHorizontalAlignment(SwingConstants.CENTER);
        r2p2.setOpaque(true);

        r2p3 = new JLabel();
        r2p3.setBorder(BorderFactory.createLineBorder(Color.black));
        r2p3.setFont(new Font("Roboto", Font.BOLD, 24));
        r2p3.setForeground(Color.WHITE);
        r2p3.setHorizontalAlignment(SwingConstants.CENTER);
        r2p3.setOpaque(true);

        r2p4 = new JLabel();
        r2p4.setBorder(BorderFactory.createLineBorder(Color.black));
        r2p4.setFont(new Font("Roboto", Font.BOLD, 24));
        r2p4.setForeground(Color.WHITE);
        r2p4.setHorizontalAlignment(SwingConstants.CENTER);
        r2p4.setOpaque(true);

        r2p5 = new JLabel();
        r2p5.setBorder(BorderFactory.createLineBorder(Color.black));
        r2p5.setFont(new Font("Roboto", Font.BOLD, 24));
        r2p5.setForeground(Color.WHITE);
        r2p5.setHorizontalAlignment(SwingConstants.CENTER);
        r2p5.setOpaque(true);

        r3p1 = new JLabel();
        r3p1.setBorder(BorderFactory.createLineBorder(Color.black));
        r3p1.setFont(new Font("Roboto", Font.BOLD, 24));
        r3p1.setForeground(Color.WHITE);
        r3p1.setHorizontalAlignment(SwingConstants.CENTER);
        r3p1.setOpaque(true);

        r3p2 = new JLabel();
        r3p2.setBorder(BorderFactory.createLineBorder(Color.black));
        r3p2.setFont(new Font("Roboto", Font.BOLD, 24));
        r3p2.setForeground(Color.WHITE);
        r3p2.setHorizontalAlignment(SwingConstants.CENTER);
        r3p2.setOpaque(true);

        r3p3 = new JLabel();
        r3p3.setBorder(BorderFactory.createLineBorder(Color.black));
        r3p3.setFont(new Font("Roboto", Font.BOLD, 24));
        r3p3.setForeground(Color.WHITE);
        r3p3.setHorizontalAlignment(SwingConstants.CENTER);
        r3p3.setOpaque(true);


        r3p4 = new JLabel();
        r3p4.setBorder(BorderFactory.createLineBorder(Color.black));
        r3p4.setFont(new Font("Roboto", Font.BOLD, 24));
        r3p4.setForeground(Color.WHITE);
        r3p4.setHorizontalAlignment(SwingConstants.CENTER);
        r3p4.setOpaque(true);

        r3p5 = new JLabel();
        r3p5.setBorder(BorderFactory.createLineBorder(Color.black));
        r3p5.setFont(new Font("Roboto", Font.BOLD, 24));
        r3p5.setForeground(Color.WHITE);
        r3p5.setHorizontalAlignment(SwingConstants.CENTER);
        r3p5.setOpaque(true);

        r4p1 = new JLabel();
        r4p1.setBorder(BorderFactory.createLineBorder(Color.black));
        r4p1.setFont(new Font("Roboto", Font.BOLD, 24));
        r4p1.setForeground(Color.WHITE);
        r4p1.setHorizontalAlignment(SwingConstants.CENTER);
        r4p1.setOpaque(true);

        r4p2 = new JLabel();
        r4p2.setBorder(BorderFactory.createLineBorder(Color.black));
        r4p2.setFont(new Font("Roboto", Font.BOLD, 24));
        r4p2.setForeground(Color.WHITE);
        r4p2.setHorizontalAlignment(SwingConstants.CENTER);
        r4p2.setOpaque(true);

        r4p3 = new JLabel();
        r4p3.setBorder(BorderFactory.createLineBorder(Color.black));
        r4p3.setFont(new Font("Roboto", Font.BOLD, 24));
        r4p3.setForeground(Color.WHITE);
        r4p3.setHorizontalAlignment(SwingConstants.CENTER);
        r4p3.setOpaque(true);

        r4p4 = new JLabel();
        r4p4.setBorder(BorderFactory.createLineBorder(Color.black));
        r4p4.setFont(new Font("Roboto", Font.BOLD, 24));
        r4p4.setForeground(Color.WHITE);
        r4p4.setHorizontalAlignment(SwingConstants.CENTER);
        r4p4.setOpaque(true);

        r4p5 = new JLabel();
        r4p5.setBorder(BorderFactory.createLineBorder(Color.black));
        r4p5.setFont(new Font("Roboto", Font.BOLD, 24));
        r4p5.setForeground(Color.WHITE);
        r4p5.setHorizontalAlignment(SwingConstants.CENTER);
        r4p5.setOpaque(true);

        r5p1 = new JLabel();
        r5p1.setBorder(BorderFactory.createLineBorder(Color.black));
        r5p1.setFont(new Font("Roboto", Font.BOLD, 24));
        r5p1.setForeground(Color.WHITE);
        r5p1.setHorizontalAlignment(SwingConstants.CENTER);
        r5p1.setOpaque(true);

        r5p2 = new JLabel();
        r5p2.setBorder(BorderFactory.createLineBorder(Color.black));
        r5p2.setFont(new Font("Roboto", Font.BOLD, 24));
        r5p2.setForeground(Color.WHITE);
        r5p2.setHorizontalAlignment(SwingConstants.CENTER);
        r5p2.setOpaque(true);


        r5p3 = new JLabel();
        r5p3.setBorder(BorderFactory.createLineBorder(Color.black));
        r5p3.setFont(new Font("Roboto", Font.BOLD, 24));
        r5p3.setForeground(Color.WHITE);
        r5p3.setHorizontalAlignment(SwingConstants.CENTER);
        r5p3.setOpaque(true);


        r5p4 = new JLabel();
        r5p4.setBorder(BorderFactory.createLineBorder(Color.black));
        r5p4.setFont(new Font("Roboto", Font.BOLD, 24));
        r5p4.setForeground(Color.WHITE);
        r5p4.setHorizontalAlignment(SwingConstants.CENTER);
        r5p4.setOpaque(true);

        r5p5 = new JLabel();
        r5p5.setBorder(BorderFactory.createLineBorder(Color.black));
        r5p5.setFont(new Font("Roboto", Font.BOLD, 24));
        r5p5.setForeground(Color.WHITE);
        r5p5.setHorizontalAlignment(SwingConstants.CENTER);
        r5p5.setOpaque(true);

        r6p1 = new JLabel();
        r6p1.setBorder(BorderFactory.createLineBorder(Color.black));
        r6p1.setFont(new Font("Roboto", Font.BOLD, 24));
        r6p1.setForeground(Color.WHITE);
        r6p1.setHorizontalAlignment(SwingConstants.CENTER);
        r6p1.setOpaque(true);

        r6p2 = new JLabel();
        r6p2.setBorder(BorderFactory.createLineBorder(Color.black));
        r6p2.setFont(new Font("Roboto", Font.BOLD, 24));
        r6p2.setForeground(Color.WHITE);
        r6p2.setHorizontalAlignment(SwingConstants.CENTER);
        r6p2.setOpaque(true);

        r6p3 = new JLabel();
        r6p3.setBorder(BorderFactory.createLineBorder(Color.black));
        r6p3.setFont(new Font("Roboto", Font.BOLD, 24));
        r6p3.setForeground(Color.WHITE);
        r6p3.setHorizontalAlignment(SwingConstants.CENTER);
        r6p3.setOpaque(true);

        r6p4 = new JLabel();
        r6p4.setBorder(BorderFactory.createLineBorder(Color.black));
        r6p4.setFont(new Font("Roboto", Font.BOLD, 24));
        r6p4.setForeground(Color.WHITE);
        r6p4.setHorizontalAlignment(SwingConstants.CENTER);
        r6p4.setOpaque(true);

        r6p5 = new JLabel();
        r6p5.setBorder(BorderFactory.createLineBorder(Color.black));
        r6p5.setFont(new Font("Roboto", Font.BOLD, 24));
        r6p5.setForeground(Color.WHITE);
        r6p5.setHorizontalAlignment(SwingConstants.CENTER);
        r6p5.setOpaque(true);

        jp1.add(r1p1);
        jp1.add(r1p2);
        jp1.add(r1p3);
        jp1.add(r1p4);
        jp1.add(r1p5);
        jp1.add(r2p1);
        jp1.add(r2p2);
        jp1.add(r2p3);
        jp1.add(r2p4);
        jp1.add(r2p5);
        jp1.add(r3p1);
        jp1.add(r3p2);
        jp1.add(r3p3);
        jp1.add(r3p4);
        jp1.add(r3p5);
        jp1.add(r4p1);
        jp1.add(r4p2);
        jp1.add(r4p3);
        jp1.add(r4p4);
        jp1.add(r4p5);
        jp1.add(r5p1);
        jp1.add(r5p2);
        jp1.add(r5p3);
        jp1.add(r5p4);
        jp1.add(r5p5);
        jp1.add(r6p1);
        jp1.add(r6p2);
        jp1.add(r6p3);
        jp1.add(r6p4);
        jp1.add(r6p5);

        //user Input
        tGuess1 = new JTextField(5);
        jp1.add(tGuess1);
        tGuess1.setDocument(new JTextFieldLimit(1));

        tGuess2 = new JTextField(5);
        jp1.add(tGuess2);
        tGuess2.setDocument(new JTextFieldLimit(1));

        tGuess3 = new JTextField(5);
        jp1.add(tGuess3);
        tGuess3.setDocument(new JTextFieldLimit(1));

        tGuess4 = new JTextField(5);
        jp1.add(tGuess4);
        tGuess4.setDocument(new JTextFieldLimit(1));

        tGuess5 = new JTextField(5);
        jp1.add(tGuess5);
        tGuess5.setDocument(new JTextFieldLimit(1));

        pane.add(jp1);

        //JButton and messages field

        jp2 = new JPanel(new GridLayout(2, 1));
        bInput = new JButton("SUBMIT");
        bInput.addActionListener(new inputActionListener());
        jp2.add(bInput);
        tMessages = new JLabel();
        jp2.add(tMessages);

        pane.add(jp2);


        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    //Action Listener for Button
    private class inputActionListener implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {

            tMessages.setText("");
            boolean isSolved = true;


            //Ensure all data is valid
            if (Objects.equals(tGuess1.getText(), "") || Objects.equals(tGuess2.getText(), "") ||
                    Objects.equals(tGuess3.getText(), "") || Objects.equals(tGuess4.getText(), "") ||
                    Objects.equals(tGuess5.getText(), "")) {
                tMessages.setText("You must enter a five letter word!");
            } else {
                //Grab user data and display appropriate leters in the given row
                setDisplay(wc.getRound());


                char pos1 = tGuess1.getText().toLowerCase(Locale.ROOT).charAt(0);
                char pos2 = tGuess2.getText().toLowerCase(Locale.ROOT).charAt(0);
                char pos3 = tGuess3.getText().toLowerCase(Locale.ROOT).charAt(0);
                char pos4 = tGuess4.getText().toLowerCase(Locale.ROOT).charAt(0);
                char pos5 = tGuess5.getText().toLowerCase(Locale.ROOT).charAt(0);

                //Begin guess check
                String[] guessArray = wc.guessArray(pos1, pos2, pos3, pos4, pos5);

                //Update
                setDisplayColor(wc.getRound(), guessArray);

                //Is the word a success? Check to make sure the guess is correct, otherwise proceed
                for(String result: guessArray)
                {
                    if(!result.equals("RLRP")){
                        isSolved = false;
                        break;
                    }
                }

                //Check to make sure the game should be over or not (6 rounds with failed guess)
                if(!isSolved && wc.getRound()==6)
                {
                    StringBuilder word = new StringBuilder();
                    for(char letter: wc.getWord())
                    {
                        word.append(letter);
                    }

                    String upperWord = String.valueOf(word).toUpperCase(Locale.ROOT);

                    int input = JOptionPane.showConfirmDialog(rootPane, "GAME OVER! The word was: " + upperWord
                            + ". Select \"Yes\" to play again.");

                    if(input == 0)//Reset board
                    {
                        reset();
                    }
                    else//Exit
                    {
                        //TODO: Figure out how to reset from this location
                    }
                }
                else if(!isSolved &&wc.getRound() <6)//Not solved but not game over
                {
                    isSolved = true;
                    wc.incrementRound();
                }
                else//Was solved
                {
                    int input = JOptionPane.showConfirmDialog(rootPane, "CONGRATS! YOu guesed the word in " + wc.getRound()
                            + "guesses. Select \"Yes\" to play again.");

                    if(input == 0)//Reset board
                    {
                        reset();
                    }
                    else//Exit
                    {
                        //TODO: Figure out how to reset from this location
                    }
                }

            }


            //reset text values

            tGuess1.setText("");
            tGuess2.setText("");
            tGuess3.setText("");
            tGuess4.setText("");
            tGuess5.setText("");
        }

        public void setDisplay(int round) {

            //Place the most recent guess into he correct collumn
            switch (round) {
                case 1:
                    r1p1.setText(tGuess1.getText().toUpperCase(Locale.ROOT));
                    r1p2.setText(tGuess2.getText().toUpperCase(Locale.ROOT));
                    r1p3.setText(tGuess3.getText().toUpperCase(Locale.ROOT));
                    r1p4.setText(tGuess4.getText().toUpperCase(Locale.ROOT));
                    r1p5.setText(tGuess5.getText().toUpperCase(Locale.ROOT));
                    break;
                case 2:
                    r2p1.setText(tGuess1.getText().toUpperCase(Locale.ROOT));
                    r2p2.setText(tGuess2.getText().toUpperCase(Locale.ROOT));
                    r2p3.setText(tGuess3.getText().toUpperCase(Locale.ROOT));
                    r2p4.setText(tGuess4.getText().toUpperCase(Locale.ROOT));
                    r2p5.setText(tGuess5.getText().toUpperCase(Locale.ROOT));
                    break;
                case 3:
                    r3p1.setText(tGuess1.getText().toUpperCase(Locale.ROOT));
                    r3p2.setText(tGuess2.getText().toUpperCase(Locale.ROOT));
                    r3p3.setText(tGuess3.getText().toUpperCase(Locale.ROOT));
                    r3p4.setText(tGuess4.getText().toUpperCase(Locale.ROOT));
                    r3p5.setText(tGuess5.getText().toUpperCase(Locale.ROOT));
                    break;
                case 4:
                    r4p1.setText(tGuess1.getText().toUpperCase(Locale.ROOT));
                    r4p2.setText(tGuess2.getText().toUpperCase(Locale.ROOT));
                    r4p3.setText(tGuess3.getText().toUpperCase(Locale.ROOT));
                    r4p4.setText(tGuess4.getText().toUpperCase(Locale.ROOT));
                    r4p5.setText(tGuess5.getText().toUpperCase(Locale.ROOT));
                    break;
                case 5:
                    r5p1.setText(tGuess1.getText().toUpperCase(Locale.ROOT));
                    r5p2.setText(tGuess2.getText().toUpperCase(Locale.ROOT));
                    r5p3.setText(tGuess3.getText().toUpperCase(Locale.ROOT));
                    r5p4.setText(tGuess4.getText().toUpperCase(Locale.ROOT));
                    r5p5.setText(tGuess5.getText().toUpperCase(Locale.ROOT));
                    break;
                case 6:
                    r6p1.setText(tGuess1.getText().toUpperCase(Locale.ROOT));
                    r6p2.setText(tGuess2.getText().toUpperCase(Locale.ROOT));
                    r6p3.setText(tGuess3.getText().toUpperCase(Locale.ROOT));
                    r6p4.setText(tGuess4.getText().toUpperCase(Locale.ROOT));
                    r6p5.setText(tGuess5.getText().toUpperCase(Locale.ROOT));
                    break;
            }


        }

        public void setDisplayColor(int round, String[] gArray) {

            String temp;
            //For each letter determine the value it's supposed to be in each tile and place that respective tile there
            for (int i = 0; i < 5; i++)
            {
                //Determine letter column
                switch(i)
                {
                    case 0://1
                        //Store value of guess Array here
                        temp = gArray[i];
                        if(temp.equals("RLRP")){//Correct guess
                            switch(round)//Determine Row and recolor as needed
                            {
                                case 1:
                                    r1p1.setBackground(new Color(56, 168, 0));
                                    break;
                                case 2:
                                    r2p1.setBackground(new Color(56, 168, 0));
                                    break;
                                case 3:
                                    r3p1.setBackground(new Color(56, 168, 0));
                                    break;
                                case 4:
                                    r4p1.setBackground(new Color(56, 168, 0));
                                    break;
                                case 5:
                                    r5p1.setBackground(new Color(56, 168, 0));
                                    break;
                                case 6:
                                    r6p1.setBackground(new Color(56, 168, 0));
                                    break;
                            }
                        }
                        else if(temp.equals("RLWP")){//Wrong location
                            switch(round)//Determine Row and recolor as needed
                            {
                                case 1:
                                    r1p1.setBackground(new Color(230, 230, 0));
                                    break;
                                case 2:
                                    r2p1.setBackground(new Color(230, 230, 0));
                                    break;
                                case 3:
                                    r3p1.setBackground(new Color(230, 230, 0));
                                    break;
                                case 4:
                                    r4p1.setBackground(new Color(230, 230, 0));
                                    break;
                                case 5:
                                    r5p1.setBackground(new Color(230, 230, 0));
                                    break;
                                case 6:
                                    r6p1.setBackground(new Color(230, 230, 0));
                                    break;
                            }
                        }
                        else//Wrong guess
                        {
                            switch(round)//Determine Row and recolor as needed
                            {
                                case 1:
                                    r1p1.setBackground(Color.DARK_GRAY);
                                    break;
                                case 2:
                                    r2p1.setBackground(Color.DARK_GRAY);
                                    break;
                                case 3:
                                    r3p1.setBackground(Color.DARK_GRAY);
                                    break;
                                case 4:
                                    r4p1.setBackground(Color.DARK_GRAY);
                                    break;
                                case 5:
                                    r5p1.setBackground(Color.DARK_GRAY);
                                    break;
                                case 6:
                                    r6p1.setBackground(Color.DARK_GRAY);
                                    break;
                            }
                        }
                        break;
                    case 1://2
                        //Store value of guess Array here
                        temp = gArray[i];
                        if(temp.equals("RLRP")){//Correct guess
                            switch(round)//Determine Row and recolor as needed
                            {
                                case 1:
                                    r1p2.setBackground(new Color(56, 168, 0));
                                    break;
                                case 2:
                                    r2p2.setBackground(new Color(56, 168, 0));
                                    break;
                                case 3:
                                    r3p2.setBackground(new Color(56, 168, 0));
                                    break;
                                case 4:
                                    r4p2.setBackground(new Color(56, 168, 0));
                                    break;
                                case 5:
                                    r5p2.setBackground(new Color(56, 168, 0));
                                    break;
                                case 6:
                                    r6p2.setBackground(new Color(56, 168, 0));
                                    break;
                            }
                        }
                        else if(temp.equals("RLWP")){//Wrong location
                            switch(round)//Determine Row and recolor as needed
                            {
                                case 1:
                                    r1p2.setBackground(new Color(230, 230, 0));
                                    break;
                                case 2:
                                    r2p2.setBackground(new Color(230, 230, 0));
                                    break;
                                case 3:
                                    r3p2.setBackground(new Color(230, 230, 0));
                                    break;
                                case 4:
                                    r4p2.setBackground(new Color(230, 230, 0));
                                    break;
                                case 5:
                                    r5p2.setBackground(new Color(230, 230, 0));
                                    break;
                                case 6:
                                    r6p2.setBackground(new Color(230, 230, 0));
                                    break;
                            }
                        }
                        else//Wrong guess
                        {
                            switch(round)//Determine Row and recolor as needed
                            {
                                case 1:
                                    r1p2.setBackground(Color.DARK_GRAY);
                                    break;
                                case 2:
                                    r2p2.setBackground(Color.DARK_GRAY);
                                    break;
                                case 3:
                                    r3p2.setBackground(Color.DARK_GRAY);
                                    break;
                                case 4:
                                    r4p2.setBackground(Color.DARK_GRAY);
                                    break;
                                case 5:
                                    r5p2.setBackground(Color.DARK_GRAY);
                                    break;
                                case 6:
                                    r6p2.setBackground(Color.DARK_GRAY);
                                    break;
                            }
                        }
                        break;
                    case 2://3
                        //Store value of guess Array here
                        temp = gArray[i];
                        if(temp.equals("RLRP")){//Correct guess
                            switch(round)//Determine Row and recolor as needed
                            {
                                case 1:
                                    r1p3.setBackground(new Color(56, 168, 0));
                                    break;
                                case 2:
                                    r2p3.setBackground(new Color(56, 168, 0));
                                    break;
                                case 3:
                                    r3p3.setBackground(new Color(56, 168, 0));
                                    break;
                                case 4:
                                    r4p3.setBackground(new Color(56, 168, 0));
                                    break;
                                case 5:
                                    r5p3.setBackground(new Color(56, 168, 0));
                                    break;
                                case 6:
                                    r6p3.setBackground(new Color(56, 168, 0));
                                    break;
                            }
                        }
                        else if(temp.equals("RLWP")){//Wrong location
                            switch(round)//Determine Row and recolor as needed
                            {
                                case 1:
                                    r1p3.setBackground(new Color(230, 230, 0));
                                    break;
                                case 2:
                                    r2p3.setBackground(new Color(230, 230, 0));
                                    break;
                                case 3:
                                    r3p3.setBackground(new Color(230, 230, 0));
                                    break;
                                case 4:
                                    r4p3.setBackground(new Color(230, 230, 0));
                                    break;
                                case 5:
                                    r5p3.setBackground(new Color(230, 230, 0));
                                    break;
                                case 6:
                                    r6p3.setBackground(new Color(230, 230, 0));
                                    break;
                            }
                        }
                        else//Wrong guess
                        {switch(round)//Determine Row and recolor as needed
                        {
                            case 1:
                                r1p3.setBackground(Color.DARK_GRAY);
                                break;
                            case 2:
                                r2p3.setBackground(Color.DARK_GRAY);
                                break;
                            case 3:
                                r3p3.setBackground(Color.DARK_GRAY);
                                break;
                            case 4:
                                r4p3.setBackground(Color.DARK_GRAY);
                                break;
                            case 5:
                                r5p3.setBackground(Color.DARK_GRAY);
                                break;
                            case 6:
                                r6p3.setBackground(Color.DARK_GRAY);
                                break;
                        }

                        }
                        break;
                    case 3://4
                        //Store value of guess Array here
                        temp = gArray[i];
                        if(temp.equals("RLRP")){//Correct guess
                            switch(round)//Determine Row and recolor as needed
                            {
                                case 1:
                                    r1p4.setBackground(new Color(56, 168, 0));
                                    break;
                                case 2:
                                    r2p4.setBackground(new Color(56, 168, 0));
                                    break;
                                case 3:
                                    r3p4.setBackground(new Color(56, 168, 0));
                                    break;
                                case 4:
                                    r4p4.setBackground(new Color(56, 168, 0));
                                    break;
                                case 5:
                                    r5p4.setBackground(new Color(56, 168, 0));
                                    break;
                                case 6:
                                    r6p4.setBackground(new Color(56, 168, 0));
                                    break;
                            }
                        }
                        else if(temp.equals("RLWP")){//Wrong location
                            switch(round)//Determine Row and recolor as needed
                            {
                                case 1:
                                    r1p4.setBackground(new Color(230, 230, 0));
                                    break;
                                case 2:
                                    r2p4.setBackground(new Color(230, 230, 0));
                                    break;
                                case 3:
                                    r3p4.setBackground(new Color(230, 230, 0));
                                    break;
                                case 4:
                                    r4p4.setBackground(new Color(230, 230, 0));
                                    break;
                                case 5:
                                    r5p4.setBackground(new Color(230, 230, 0));
                                    break;
                                case 6:
                                    r6p4.setBackground(new Color(230, 230, 0));
                                    break;
                            }
                        }
                        else//Wrong guess
                        {
                            switch(round)//Determine Row and recolor as needed
                            {
                                case 1:
                                    r1p4.setBackground(Color.DARK_GRAY);
                                    break;
                                case 2:
                                    r2p4.setBackground(Color.DARK_GRAY);
                                    break;
                                case 3:
                                    r3p4.setBackground(Color.DARK_GRAY);
                                    break;
                                case 4:
                                    r4p4.setBackground(Color.DARK_GRAY);
                                    break;
                                case 5:
                                    r5p4.setBackground(Color.DARK_GRAY);
                                    break;
                                case 6:
                                    r6p4.setBackground(Color.DARK_GRAY);
                                    break;
                            }
                        }
                        break;
                    case 4://5
                        //Store value of guess Array here
                        temp = gArray[i];
                        if(temp.equals("RLRP")){//Correct guess
                            switch(round)//Determine Row and recolor as needed
                            {
                                case 1:
                                    r1p5.setBackground(new Color(56, 168, 0));
                                    break;
                                case 2:
                                    r2p5.setBackground(new Color(56, 168, 0));
                                    break;
                                case 3:
                                    r3p5.setBackground(new Color(56, 168, 0));
                                    break;
                                case 4:
                                    r4p5.setBackground(new Color(56, 168, 0));
                                    break;
                                case 5:
                                    r5p5.setBackground(new Color(56, 168, 0));
                                    break;
                                case 6:
                                    r6p5.setBackground(new Color(56, 168, 0));
                                    break;
                            }
                        }
                        else if(temp.equals("RLWP")){//Wrong location
                            switch(round)//Determine Row and recolor as needed
                            {
                                case 1:
                                    r1p5.setBackground(new Color(230, 230, 0));
                                    break;
                                case 2:
                                    r2p5.setBackground(new Color(230, 230, 0));
                                    break;
                                case 3:
                                    r3p5.setBackground(new Color(230, 230, 0));
                                    break;
                                case 4:
                                    r4p5.setBackground(new Color(230, 230, 0));
                                    break;
                                case 5:
                                    r5p5.setBackground(new Color(230, 230, 0));
                                    break;
                                case 6:
                                    r6p5.setBackground(new Color(230, 230, 0));
                                    break;
                            }
                        }
                        else//Wrong guess
                        {
                            switch(round)//Determine Row and recolor as needed
                            {
                                case 1:
                                    r1p5.setBackground(Color.DARK_GRAY);
                                    break;
                                case 2:
                                    r2p5.setBackground(Color.DARK_GRAY);
                                    break;
                                case 3:
                                    r3p5.setBackground(Color.DARK_GRAY);
                                    break;
                                case 4:
                                    r4p5.setBackground(Color.DARK_GRAY);
                                    break;
                                case 5:
                                    r5p5.setBackground(Color.DARK_GRAY);
                                    break;
                                case 6:
                                    r6p5.setBackground(Color.DARK_GRAY);
                                    break;
                            }
                        }
                        break;
                }
            }
        }

        public void reset()
        {
            wc.setRound(1);
            wc.setWord(new Words());

            r1p1.setText("");
            r1p1.setBackground(Color.white);
            r1p2.setText("");
            r1p2.setBackground(Color.white);
            r1p3.setText("");
            r1p3.setBackground(Color.white);
            r1p4.setText("");
            r1p4.setBackground(Color.white);
            r1p5.setText("");
            r1p5.setBackground(Color.white);
            r2p1.setText("");
            r2p1.setBackground(Color.white);
            r2p2.setText("");
            r2p2.setBackground(Color.white);
            r2p3.setText("");
            r2p3.setBackground(Color.white);
            r2p4.setText("");
            r2p4.setBackground(Color.white);
            r2p5.setText("");
            r2p5.setBackground(Color.white);
            r3p1.setText("");
            r3p1.setBackground(Color.white);
            r3p2.setText("");
            r3p2.setBackground(Color.white);
            r3p3.setText("");
            r3p3.setBackground(Color.white);
            r3p4.setText("");
            r3p4.setBackground(Color.white);
            r3p5.setText("");
            r3p5.setBackground(Color.white);
            r4p1.setText("");
            r4p1.setBackground(Color.white);
            r4p2.setText("");
            r4p2.setBackground(Color.white);
            r4p3.setText("");
            r4p3.setBackground(Color.white);
            r4p4.setText("");
            r4p4.setBackground(Color.white);
            r4p5.setText("");
            r4p5.setBackground(Color.white);
            r5p1.setText("");
            r5p1.setBackground(Color.white);
            r5p2.setText("");
            r5p2.setBackground(Color.white);
            r5p3.setText("");
            r5p3.setBackground(Color.white);
            r5p4.setText("");
            r5p4.setBackground(Color.white);
            r5p5.setText("");
            r5p5.setBackground(Color.white);
            r6p1.setText("");
            r6p1.setBackground(Color.white);
            r6p2.setText("");
            r6p2.setBackground(Color.white);
            r6p3.setText("");
            r6p3.setBackground(Color.white);
            r6p4.setText("");
            r6p4.setBackground(Color.white);
            r6p5.setText("");
            r6p5.setBackground(Color.white);
        }

    }


}

