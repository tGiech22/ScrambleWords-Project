import java.util.*;
/**
 * Write a description of class ScrambleWords_CLIENT here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ScrambleWords_CLIENT
{
    public static void main()
    {
        String s = "University";
        String s2 = "English";
        
        String sentence = "Whats up my name is Tony.";
        
        String paragraph = "Whats up my name is Tony. How are you today? I'm great thanks!";
        
        
        ScrambleWords scramble = new ScrambleWords();
        
        System.out.println(scramble.scrambleWord(s2));
        System.out.println(scramble.scrambleSentence(sentence));
        System.out.println(scramble.scrambleParagraph(paragraph));
    }
}
