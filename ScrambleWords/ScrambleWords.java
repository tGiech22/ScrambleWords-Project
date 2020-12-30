import java.util.*;
/**
 * Write a description of class ScrambleParagraph here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ScrambleWords
{
    public String scrambleWord(String w)
    {
        char[] word = new char[w.length()];
        String result = "";
        
        for(int i = 0; i < w.length(); i++)
        {
            word[i] = w.charAt(i);
        }
        
        if(w.length() % 2 == 0)
        {
            for(int i = 1; i < word.length - 1; i += 2)
            {
                char temp = word[i];
                word[i] = word[i + 1];
                word[i + 1] = temp;
            }
        }
        else
        {
            for(int i = 1; i < word.length - 2; i += 2)
            {
                char temp = word[i];
                word[i] = word[i + 1];
                word[i + 1] = temp;
            }
        }
        
        for(int i = 0; i < word.length; i++)
        {
            result += word[i];
        }
        
        return result;
    }
    
    public String scrambleSentence(String s)
    {
        ArrayList<String> sentence = new ArrayList<String>();
        String result = "";
        
        //sentence.add(s.substring(0, s.indexOf(" ")));
        
        String holder = "";
        for(int i = 0; i < s.length(); i++)
        {    
            if(s.charAt(i) != ' ')
            {
                holder += s.charAt(i);
            }
            if(s.charAt(i) == ' ' || s.charAt(i) == '.' || s.charAt(i) == '?' || s.charAt(i) == '!' || s.charAt(i) == ';')
            {
                sentence.add(scrambleWord(holder));
                System.out.print(sentence);
                holder = "";
            }
        }
        
        for(int i = 0; i < sentence.size() - 1; i += 2)
        {
            String temp = sentence.get(i);
            sentence.set(i, sentence.get(i + 1));
            sentence.set(i + 1, temp);
        }
        
        for(int i = 0; i < sentence.size(); i++)
        {
            result += sentence.get(i) + " ";
        }   
        
        return result;
    }
    
    public String scrambleParagraph(String p)
    {
        ArrayList<String> paragraph = new ArrayList<String>();
        String result = "";
        
        String holder = "";        
        for(int i = 0; i < p.length(); i++)
        {    
            if(p.charAt(i) != '.' || p.charAt(i) != '?' || p.charAt(i) != '!' || p.charAt(i) != ';')
            {
                holder += p.charAt(i);
            }
            if(p.charAt(i) == '?' || p.charAt(i) == '.' || p.charAt(i) == '!' || p.charAt(i) == ';')
            {
                paragraph.add(scrambleSentence(holder));
                System.out.print(paragraph);
                holder = "";
            }
        }
        
        for(int i = 0; i < paragraph.size() - 1; i += 2)
        {
            String temp = paragraph.get(i);
            paragraph.set(i, paragraph.get(i + 1));
            paragraph.set(i + 1, temp);
        }
        
        for(int i = 0; i < paragraph.size(); i++)
        {
            result += paragraph.get(i) + " ";
        }   
        
        return result;
    }
}