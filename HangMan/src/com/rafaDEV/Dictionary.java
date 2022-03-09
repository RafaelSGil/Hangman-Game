package com.rafaDEV;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Dictionary {
    static ArrayList<String> dictionary = new ArrayList<String>(Arrays.asList("form", "permit", "whistle", "nifty", "gruesome", "hatch", "steel", "talk",
                                                                              "beef", "ornament", "tart", "abusive", "scat", "innocent", "ring", "airplane",
                                                                              "transform", "bottle", "breathe", "agreeable", "spotted", "waste", "foregoing",
                                                                              "curtain", "crow", "wary", "property", "married", "like", "argument", "phobia",
                                                                              "unaccountable", "careless", "reminiscent", "crazy", "infuse", "practise", "meaty"));

    public static String getAWord(){
        Random random = new Random();

        return dictionary.get((random.nextInt(0, dictionary.size())));
    }

    public static String getSpecificWord(int index){
        if(index >= 0 && index < dictionary.size()){
            return dictionary.get(index);
        }

        return "Index out of bounds";
    }

    public static int getNumberOfWords(){
        return dictionary.size();
    }


}
