package com.java2.oo;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class BingoMain {
			public BingoMain() {
				try {
				// 建立表格
					FileReader fr = new FileReader("bingo.txt");
					BufferedReader br = new BufferedReader(fr);
					String line = br.readLine();
					int number = Integer.parseInt(line);
					int table = (int) Math.sqrt(number);
					line = br.readLine();
					String tokens[] = line.split(",");
					List<Integer> answers = new ArrayList<>();
					for (int i = 0; i <= tokens.length - 1; i++) {
						int answer = Integer.parseInt(tokens[i]);
						answers.add(answer);
					}
					Form form = new Form(table, number, answers);
					form.print();
					form.bingo();
					// System.out.println(answers);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			public static void main(String[] args) {
				new BingoMain();
			}

			public class Form {
				int table;
				int number;
				List<Integer> bingo;
				List<Integer> numbers = new ArrayList<>();

				public Form(int table, int number, List<Integer> answers) {
					this.table = table;
					this.number = number;
					this.bingo = answers;
				}

				
			
	}
	

}
