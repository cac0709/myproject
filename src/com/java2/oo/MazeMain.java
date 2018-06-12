package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/*
 * 有一遊戲場地，長寬由執行時決定，場地中亂數產生陷阱 陷阱數也由當時才決定
 * 
 * 有一個玩家在這場地中，初始PH值為100，走一步消耗1HP， 撞到邊界扣5HP，掉到陷阱扣20HP
 * 
 * 有個檔案(maze.txt)資訊如下： 6,4,5,6,8,2,4,2,2,6,6,8,4,2,2,6
 */
///loading map
public class MazeMain {
	public MazeMain() {
		try {
			///loading map
			FileReader fr = new FileReader("maze.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			String tokens[] = line.split(",");
			int col = Integer.parseInt(tokens[0]);
			int row = Integer.parseInt(tokens[1]);

			// loadingtraps
			line = br.readLine();
			int trapCount = Integer.parseInt(line);
			Maze m = new Maze(row, col, trapCount);
			Random r = new Random();
			Set<String> set = new TreeSet<>();
			while (set.size() < 5) {
				String trap = String.valueOf(r.nextInt(24));
				set.add(trap);
			}

		}
	}
	
	


