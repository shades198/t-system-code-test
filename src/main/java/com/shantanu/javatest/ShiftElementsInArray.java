/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shantanu.javatest;

import java.util.Arrays;

/**
 *
 * @author shantanu
 */
public class ShiftElementsInArray
{
    public static void main(String[] args)
    {
        int [] source = {10,77,92,1,30,81,1,4,1,20,17,1,16,33};
        int [] output = new int[source.length];
        
        int x = 1;
        int z = 10;
        
        int currXIdx = output.length-1;
        int outputIdx = 0;
        
        for(int i=0; i<source.length; i++)
        {
            if(source[i]%z == 0) {
                System.out.println("index "+i+" and value "+source[i]);
                output[outputIdx++] = source[i];
            } else if(source[i] == x) {
                output[currXIdx--] = source[i];
            } else {
                output[outputIdx++] = source[i];
            }   
        }
        System.out.println("Output: "+Arrays.toString(output));        
    }
}
