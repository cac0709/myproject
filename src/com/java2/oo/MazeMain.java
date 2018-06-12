package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
/*
 * 有一遊戲場地，長寬由執行時決定，場地中亂數產生陷阱 陷阱數也由當時才決定
 * 
 * 有一個玩家在這場地中，初始HP值為100，走一步消耗1HP， 撞到邊界扣5HP，掉到陷阱扣20HP
 * 
 * 有個檔案(maze.txt)資訊如下： 6,4,5,6,8,2,4,2,2,6,6,8,4,2,2,6
 */
//
///loading map
public class MazeMain {
	public MazeMain() {
		try {
			//MAP SIZE
			FileReader fr = new FileReader("maze.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			String tokens[] = line.split(",");
			int col = Integer.parseInt(tokens[0]);
			int row = Integer.parseInt(tokens[1]);

			// TRAPS
			line = br.readLine();
			int trapCount = Integer.parseInt(line);
			Maze m = new Maze(row, col, trapCount);
			Random r = new Random();
			Set<String> set = new TreeSet<>();
			//陷阱數量取決maze決定
			while (set.size() < trapCount ) {
				String trap = String.valueOf(r.nextInt(24));
				set.add(trap);
			}
        //讀出SET物件
			Iterator it = set.iterator();
			m.trapLocation = new int[set.size()];
		//印出陷阱位置	
		for (int a = 0; a < set.size(); a++) {
				int i = Integer.parseInt(String.valueOf(it.next()));
				m.trapLocation[a] = i;
				System.out.println(m.trapLocation[a]);
			}

			// 設定SWITCH CASE
			int judgment;
			line = br.readLine();
			String steps[] = line.split(",");
			Scanner scanner = new Scanner(System.in);
			for (int i = 0; i < steps.length; i++) {
				if (m.player.HP > 0) {
					judgment = 0;
					System.out.println("請輸入上(8)下(2)左(4)右(6)：");
					System.out.println(steps[i]);
					switch (steps[i]) {
					case "8":
						if (m.player.location / 6 == 0) {
							System.out.println("邊界!");
							m.player.HP -= 5;
						} else {
							m.player.location -= 6;
							for (int a = 0; a < set.size(); a++) {
								if (m.trapLocation[a] == m.player.location) {
									judgment = 1;
								}
							}
							if (judgment == 1) {
								m.player.HP -= 20;
							} else {
								m.player.HP -= 1;
							}
						}
						if (m.player.HP > 0) {
							System.out.println("目前位置：" + m.player.location);
							System.out.println("目前血量：" + m.player.HP);
							break;
						} else {
							System.out.println("YOU DEAD!");
							break;
						}
					case "4":
						if (m.player.location % 6 == 0) {
							System.out.println("邊界!");
							m.player.HP -= 5;
						} else {
							m.player.location -= 1;
							for (int a = 0; a < set.size(); a++) {
								if (m.trapLocation[a] == m.player.location) {
									judgment = 1;
								}
							}
							if (judgment == 1) {
								m.player.HP -= 20;
							} else {
								m.player.HP -= 1;
							}
						}
						if (m.player.HP > 0) {
							System.out.println("目前位置：" + m.player.location);
							System.out.println("目前血量：" + m.player.HP);
							break;
						} else {
							System.out.println("YOU DEAD!");
							break;
						}
					case "2":
						if (m.player.location / 6 == 3) {
							System.out.println("邊界!");
							m.player.HP -= 5;
						} else {
							m.player.location += 6;
							for (int a = 0; a < set.size(); a++) {
								if (m.trapLocation[a] == m.player.location) {
									judgment = 1;
								}
							}
							if (judgment == 1) {
								m.player.HP -= 20;
							} else {
								m.player.HP -= 1;
							}
						}
						if (m.player.HP > 0) {
							System.out.println("目前位置：" + m.player.location);
							System.out.println("目前血量：" + m.player.HP);
							break;
						} else {
							System.out.println("YOU DEAD!");
							break;
						}
					
					case "6":
						if (m.player.location % 6 == 5) {
							System.out.println("邊界!");
							m.player.HP -= 5;
						} else {
							m.player.location += 1;
							for (int a = 0; a < set.size(); a++) {
								if (m.trapLocation[a] == m.player.location) {
									judgment = 1;
								}
							}
							if (judgment == 1) {
								m.player.HP -= 20;
							} else {
								m.player.HP -= 1;
							}
						}
						if (m.player.HP > 0) {
							System.out.println("目前位置：" + m.player.location);
							System.out.println("目前血量：" + m.player.HP);
							break;
						} else {
							System.out.println("YOU DEAD!");
							break;
						}
					
					
					default:
						break;
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new MazeMain();
	}

	public class Maze {
		int row;
		int col;
		int trapCount;
		int[] trapLocation;
		Player player = new Player();

		public Maze(int row, int col, int trapCount) {
			this.row = row;
			this.col = col;
			this.trapCount = trapCount;
		}

		public void setRow(int row) {
			this.row = row;
		}

		public int getRow() {
			return row;
		}

		public int getCol() {
			return col;
		}

		public void setCol(int col) {
			this.col = col;
		}

		public int getTrapCount() {
			return trapCount;
		}

		public void setTrapCount(int trapCount) {
			this.trapCount = trapCount;
		}

		public int[] getTrapLocation() {
			return trapLocation;
		}

		public void setTrapLocation(int[] trapLocation) {
			this.trapLocation = trapLocation;
		}

		public Player getPlayer() {
			return player;
		}

		public void setPlayer(Player player) {
			this.player = player;
		}

	}

	public class Player {
		int HP = 100;
		int location = 0;
	}

}


	
	


