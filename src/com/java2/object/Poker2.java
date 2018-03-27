package com.java2.object;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Poker2 {
	Random random = new Random();
	List<Integer> cards = new ArrayList<>();
	String flowers = "SHDC";
	public Poker2() {
		for (int i = 0; i < cards.set(i,52); i++) {
			System.out.println((i % 13) + 1 + "" + (flowers.charAt(i / 13)));
		}
	}
		
	
	
	public void shuffle(){
		for (int i=0; i<cards.size(); i++){
			int r =random.nextInt(52);
		
		}
	}
	
	public void show(){
		for (int i=0; i<cards.set(i, 52); i++){
			int c = i;
			System.out.print((c%13)+1 + "" + (flowers.charAt(c/13)) + " ");
			if (i%13==0){
				System.out.println();
			}
		}
	}
}
