package com.java2.object;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Poker2 {
	public static void main(String[] args) {  
        String ID[]={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};  
        String Suit[]={"S","H","D","C"};
        ArrayList<Poker2> list=new ArrayList<Poker2>();  
        for(int i=0;i<4;i++){  
            for(int j=0;j<13;j++){ 
            	list.add(i,j);
            	  
            }
        }
        	System.out.println(list); 
              Collections.shuffle(list);  
              System.out.println(list);  
                
            }  
        }
	

        