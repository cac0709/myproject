package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class BingoMain {
			public BingoMain() {
			try {
				//FORM形成
					FileReader fr = new FileReader("bingo.txt");
					BufferedReader br = new BufferedReader(fr);
					String line = br.readLine();
					int number = Integer.parseInt(line);
					int table =  (int) Math.sqrt(number);
					//System.out.println(number);
					//System.out.println(table);
					Form form = new Form(table,number);
					form.print();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	

}
