package com.shantanu.javatest;

import java.util.Arrays;

/**
 *
 * @author shantanu
 */
public class WordReversal
{
    public static void main(String[] args)
    {
        String sentence = "How are you";
        
        WordReversal wordReversal = new WordReversal();
        String reversedSentence = wordReversal.reverseWords(sentence);
        
        System.out.println(reversedSentence.toString().trim());
    }
    
    public String reverseWords(String sentence)
    {
        StringBuilder reversedSentence = new StringBuilder();
        
        String [] words = sentence.split("\\s");
        for(String word : words) 
        {
            char[] characters = word.toCharArray();
            char[] reversed = new char[characters.length];
            int j=0;
            for(int i=characters.length-1; i>=0; i--)
            {
                reversed[j++] = characters[i];
            }
            reversedSentence.append(reversed).append(" ");
        }
        
        return reversedSentence.toString();
    }
}
