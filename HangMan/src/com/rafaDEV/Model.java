package com.rafaDEV;

import java.util.ArrayList;

public class Model {
    private String word;
    final private ArrayList<Character> guessedLetters;

    public Model(){
        guessedLetters = new ArrayList<Character>();
        generateWord();
    }

    public String getWord(){
        return word;
    }

    public void generateWord(){
        word = Dictionary.getAWord();
    }

    public boolean checkGuess(String guess){
        if(word.contains(guess)){
            guessedLetters.add(guess.charAt(0));
        }

        return word.contains(guess);
    }

    public boolean checkWinningConditions(String guess){
        return word.equals(guess);
    }

    public StringBuilder getGuessedLetters(){
        StringBuilder sb = new StringBuilder();

        for(char i : guessedLetters){
             sb.append(i);
             sb.append(" ");
        }

        return sb;
    }

    public StringBuilder show(){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < word.length(); ++i){
            if(guessedLetters.contains(word.charAt(i))){
                sb.append(word.charAt(i));
            }else{
                sb.append("-");
            }
        }

        return sb;
    }

    public String game(String input){
        if(input.length() > 1){
            if(checkWinningConditions(input)){
                return "You guessed right!\nCongratulations on winning the game";
            }
            return "Wrong answer";
        }else{
            if(checkGuess(input)){
                return "You guessed right!";
            }
            return "Wrong answer!";
        }
    }
}













