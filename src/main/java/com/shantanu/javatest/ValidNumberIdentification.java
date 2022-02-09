package com.shantanu.javatest;

/**
 *
 * @author shantanu
 */
public class ValidNumberIdentification
{
    public static void main(String[] args)
    {
        String [] sample = new String[]{"123.1","test","0","0.0","0.0.","data","hi","287653.999999","ok","*","&","2.22.2"};
        ValidNumberIdentification identifier = new ValidNumberIdentification();
        identifier.findAndPrintValidNumbers(sample);
    }
    
    public void findAndPrintValidNumbers(String [] sample)
    {
        for(int i=sample.length-1; i>=0; i--)
        {
            try {
                Float parsedNo = Float.parseFloat(sample[i]);
                System.out.println("index="+i+" and number="+parsedNo);
            } catch (Exception e) { }
        }
    }
    
}
