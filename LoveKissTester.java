/*
 * Author: Shayna Gersten
 * UNI: srg2178
 * 
 * QUIRINUS KUHLMANN.     LOVE-KISS XLI TESTER CLASS
 * 
 * A tester class that creates a Poem object poem,
 * based off of Quirinus Kuhlman's word banks from
 * Love-Kiss XLI. 3 new poems are created every time this
 * class is run. The Poem can access 12 word banks.
 * The Poem object shuffles the order of 
 * the word banks to be accessed, then sends each word bank
 * number to the Line class. Based on the word bank, a 
 * line of poetry is created. All opening and closing phrases
 * are forever paired based off of what Kuhlman wrote. 
 * In Love-Kiss XLI, I interpreted each '/' as a delineator
 * and broke up the words and phrases accordingly. For 
 * example, in the first line Kuhlmann writes, "From Night/Fog/Clash/".
 * I interpreted it to mean that the two words 'From Night' 
 * will forever be paired together as a singular phrase.
 * At the end of each line in Love-Kiss XLI, is a similar
 * grouping for closing phrases, for example line 1 ends with, 
 * "/North/Sun/Fire and Plagues/. Since each line begins and
 * ends with a specifically separate phrase I chose to interpret
 * it as those opening and closing phrases forever being linked. 
 * Therefore, from the 11 remaining words between the opening and
 * closing phrases, one middle word is chosen at random. All together
 * a single line of the poem would follow the template:
 * 
 * Opening Phrase-----random middle word------Closing Phrase
 * 
 * 12 of these lines would be generated thereby completing the poem. 
 * 
 * I have interpreted Kuhlmann's algorithm in 3 different ways. 
 * Therefore, in this program a Poem can be constructed three different ways.
 * 
 * 1)      RANDOMIZED LINES
 * A Poem is first created with 12 completely randomly chosen lines.
 * There are 0-11 word banks to choose from. That selection is randomized
 * and the 12 lines are constructed from completely random word banks with
 * no specific line groupings at all. Each line is treated as separate entities. 
 * 
 * 2)      RANDOMIZED STANZAS
 * A Poem is constructed with 3 stanzas. In looking at Kuhlmann's Love-Kiss XLI,
 * I noticed certain spacing that seemed to separate the lines into 3 stanzas,
 * each with 4 word banks to construct the lines from. With the second form of Poem,
 * the second constructor is called and 3 stanzas are separated by word banks. Each stanza
 * will therefore only have access to the four specific word banks in the stanza written in
 * Love-Kiss XLI. Within each stanza, the 4 word banks' ordering are randomized,
 * thereby creating 4 randomly chosen lines, with randomly chosen middle words.
 * The last step for this Poem, is to randomize the order of the stanzas. 
 * Therefore, for this iteration there are 9 different combinations for the stanzas themselves,
 * however, each line within the stanza is still randomized allowing for exponentially greater
 * permutations.
 * 
 * 3)     NEVER CHANGING LINES
 * A Poem is constructed where the ordering of the lines is never randomized.
 * In this interpretation, perhaps Kuhlmann wanted every line of the poem to begin and
 * end with the same phrases in every iteration, only changing the middle words
 * in each line. The ordering for the lines follows the exact ordering laid out in
 * Kuhlmann's Love-Kiss XLI. 
 * 
 * 
 * */

public class LoveKissTester{
    
    public static void main(String[] args){
        
        Poem poem = new Poem(1);
        Poem stanzasRandomized = new Poem();
        Poem staticLines = new Poem("x");
        String newPoem = poem.getPoem();
        System.out.println("\n\n----------Here is your custom Poem "
                           + "with Randomized Lines------------\n" + newPoem);
        newPoem = stanzasRandomized.getPoem();
        System.out.println("\n\n----------Here is your custom Poem "
                           + "With Randomized Stanzas------------\n" + newPoem);
        newPoem = staticLines.getPoem();
        System.out.println("\n\n-----------Here is your custom Poem "
                           + "with Never Changing Lines---------\n" + newPoem);
        
        
    }//end main
}//end class
