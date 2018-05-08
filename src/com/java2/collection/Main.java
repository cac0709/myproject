package com.java2.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer>list = new ArrayList<>();
		list.add(2);
		list.add(0);
		list.add(1);
		list.add(7);
		 System.out.println(list);
		 
		 
		 List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
		 for(String name:nameList){
		
		System.out.println(name);

	}

}
}
