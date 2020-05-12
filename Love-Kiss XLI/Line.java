/*
 * Author: Shayna Gersten
 * UNI: srg2178
 * 
 * A Line class that creates one Line object for the Poem class.
 * It takes in a random number from the Poem 
 * class and the word selections for that line
 * are chosen from the word bank based off the number
 * in the constructor parameter. The word banks are created 
 * based off of Kuhlmanns Love-Kiss XLI word banks.
 * Opening and closing phrases are always paired together.
 * The middle word between them changes randomly based off of
 * the selection of middle words for that specific bank.
 * 
 * */


public class Line{

    //IV 
    private int middleWordChoice;
    private String line;
    private String[] phraseChoice, middleWord;
                    
   /*constructor
    *Takes in a number for which group of words based off of
    *Kuhlmanns distribution of his base words
    *in order to make the specific line of poetry
    **/
   public Line(int wordBank){
       line = "";       
       switch(wordBank){
           case 0:
               phraseChoice = new String[]{"From Night","Fire and Plagues"};
               middleWord = new String[]{"Fog","Clash","Frost","Wind","Sea",
                                         "Heat","South","East","West","North",
                                         "Sun"};//11
               break;
           case 1:
               phraseChoice = new String[]{"Come Day","Flames and Dread"};
               middleWord = new String[]{"Blaze","Bloom","Snow","Peace","Land",
                                         "Flash","Warmth","Heat","Joy","Cool",
                                         "Light"};//11
               break;
           case 2:
               phraseChoice = new String[]{"From Ache","Scold and Fraud"};
               middleWord = new String[]{"Pain","Shame","Fear","War","Oh",
                                         "Cross","Stress","Scorn","Hurt",
                                         "Schock","Guile"};//11
               break;               
           case 3:
               phraseChoice = new String[]{"Come Joy","Morning Rays"};
               middleWord = new String[]{"Charm","Fame","Ease","Wins","Truce",
                                         "Gains","Peace","Jokes","Games","Rest"
                                             ,"Mild"};//11
               break;
           case 4://12
               phraseChoice = new String[]{"The Moon","All at Play"};
               middleWord = new String[]{"Beam","Smoke","Buck","Fish","Gold",
                                         "Pearl","Tree","Flame","Stork","Frog",
                                         "Lamb","Ox"};//12
               break;
           case 5:
               phraseChoice = new String[]{"Love Sheen","Wheat and Bread:"};
               middleWord = new String[]{"Straw","Steam","Peak","Flood","Glow",
                                         "Foam","Fruit","Ash","Roof","Pool",
                                         "Field"};//11
               break;
           case 6:
               phraseChoice = new String[]{"The Guard","Faith and G-d"};
               middleWord = new String[]{"Man","Work","Strain","Art","Play",
                                         "Ship","Mouth","Prince","Rage","Care",
                                         "Greed"};//11
               break;
           case 7:
               phraseChoice = new String[]{"Seek Goal","Thanks to Say"};
               middleWord = new String[]{"Sleep","Praise","Prize","Luck",
                                         "Strife","Port","Kiss","Throne","Death"
                                          ,"Shroud","Gold"};//11
               break;
           case 8:
               phraseChoice = new String[]{"What Good","Should Be Named"};
               middleWord = new String[]{"Strong","Hard","Right","Long","Great",
                                         "White","One","Yeah","Air","Fire",
                                         "High","Wide"};//12
               break;
           case 9:
               phraseChoice = new String[]{"With Care","To Avoid"};
               middleWord = new String[]{"Bad","Weak","Plain","Bent","Broad",
                                         "Small","Black","Three","Navy","Earth",
                                         "Flood","Deep"};//12
               break;
           case 10:
               phraseChoice = new String[]{"Lest Pluck","Be Destroyed"};
               middleWord = new String[]{"Love","Wise","Wit","Mind","Soul",
                                         "Friend","Joy","Grace","Fame","Peace",
                                         "Play","Praise"};//12
               break;
           case 11://10
               phraseChoice = new String[]{"Where Fear","Rule the Day"};
               middleWord = new String[]{"Hate","Lies","Wine","Meat","Flesh",
                                         "Foe","Woe","Shame","Angst","Strife","Pain"};//11
               break;
       }//end switch 
       middleWordChoice = (int)(Math.random() * middleWord.length); //0-(middleWord.length - 1)       
       line = phraseChoice[0] + " " + middleWord[middleWordChoice] + " " + phraseChoice[1];        
    }//end constructor
    
    
    //methods
    public String getLine(){
        return line;
    }
}//end class