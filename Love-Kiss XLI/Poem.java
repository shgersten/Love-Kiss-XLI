/*
 * Author: Shayna Gersten
 * UNI: srg2178
 * 
 * A class that creates one full String poem.
 * A poem will have 12 lines.
 * Each line will be from a completely different 
 * word bank from Kuhlmann's Love-Kiss XLI
 * Each lines' word bank is randomly selected.
 * This way the order for the lines in the poem
 * will be completely different each time a poem
 * is created. Three constructors allow for
 * three different algorithms with which to 
 * construct a Poem. 
 * 1) Randomized Lines
 * 2) Randomized Stanzas
 * 3) Never Changing Lines
 * 
 * */

import java.util.Random;
import java.util.ArrayList;

public class Poem{
    
    //IV
    private String poem;
    private Line line;
    
    /* 
     * -----POEM WITH 12 COMPLETELY RANDOM LINES OF POETRY-----------
     * constructor for poem with 12 randomized lines of poetry
     * */
    public Poem(int x){
        poem = "";  
        //array for each word bank to be accessed in Line class
        int[] wordBank = {0,1,2,3,4,5,6,7,8,9,10,11};
        //shuffle array so the order of word banks to be accessed is randomized
        shuffle(wordBank);
        //make 12 lines of poetry and store them in the string poem
        makePoem(wordBank);      
    }//end constructor
  
    
    /*
     * -----POEM WITH 3 RANDOMIZED STANZAS------------------
     * constructor for poem with 3 randomized stanzas of 
     * 4 randomized lines of poetry 
     * */
    public Poem(){
        poem = "";
        String stanza1 = "";
        String stanza2 = "";
        String stanza3 = "";

        int[] wordBank1 = {0,1,2,3};
        int[] wordBank2 = {4,5,6,7};
        int[] wordBank3 = {8,9,10,11};        
   
        //------MAKE THE FIRST STANZA-----
        //shuffle word bank        
        shuffle(wordBank1);        
        //store in stanza1         
        stanza1 = makeStanzas(wordBank1);
        
        //-----MAKE THE SECOND STANZA-----
        //shuffle word bank        
        shuffle(wordBank2);
        //store in stanza2         
        stanza2 = makeStanzas(wordBank2);
        
        //-----MAKE THE THIRD STANZA------
        //shuffle word bank        
        shuffle(wordBank3);
        //store in stanza3         
        stanza3 = makeStanzas(wordBank3);
        
        //-----MAKE THE POEM-----
        //randomize stanzas
        String[] stanzas = {stanza1,stanza2,stanza3};
        shuffle(stanzas);        
        poem = stanzas[0].toString() + "\n\n\n" + stanzas[1] 
               + "\n\n\n" + stanzas[2];        
    }//end constructor
   
    
    
    /*
     * -----NEVER CHANGING LINES---------------
     * constructor to make a poem where the line order never
     * changes, but the middle words for each line change. 
     * */
    public Poem(String x){
        poem = "";  
        //array for each word bank to be accessed in Line class
        int[] wordBank = {0,1,2,3,4,5,6,7,8,9,10,11};
        //make 12 lines of poetry and store them in the string poem
        makePoem(wordBank);
    }//end constructor
    
    //methods
    public String getPoem(){
        return poem;
    }    
    
    private void shuffle(int[] array){
        for(int i = array.length-1; i >= 0; i--){
            int randomSelection = (int)(Math.random() * (i + 1));//0-i
            int temp = array[randomSelection];
            array[randomSelection] = array[i];
            array[i] = temp;
        }
    }//end method
    
    private void shuffle(String[] array){
        for(int i = array.length-1; i >= 0; i--){
            int randomSelection = (int)(Math.random() * (i + 1));//0-i
            String temp = array[randomSelection];
            array[randomSelection] = array[i];
            array[i] = temp;
        }
    }//end method 
    
    private void makePoem(int[] wordBank){
        for(int i = 0; i < wordBank.length; i++){
            line = new Line(wordBank[i]);
            poem +="\n" + line.getLine() + "\n";
        }
    }//end method
    
    private String makeStanzas(int[] wordBank){
        String theStanza = "";
                for(int i = 0; i < wordBank.length; i++){
                line = new Line(wordBank[i]);
                theStanza +="\n" + line.getLine() + "\n";
                }
        return theStanza;
    }//end method
}//end class