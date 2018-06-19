package comjava2.schedule;
/* 有一文字檔儲存了課表資料(schedule.txt)
 * 請讀取資料後，設計程式可檢查是否有空檔?
 * 如:
 * 請輸入星期(1-7):2
 * 請輸入時(0-24):11
 * 【有空檔】
 * 請輸入星期(1-7):4
 * 請輸入時(0-24):14
 * 【有課: C004 English 到 16時 】
 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
	List<Course> courses = new ArrayList<>();
	public Main(){
		readCourse();
		
	}
	public void readCourse(){
		BufferedReader in = new BufferedReader(new FileReader("schedule.txt"));
		String line;
		try {
			line = in.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(line!=null){
			
		}
	}
	public static void main(String[] args) {
		new Main();
	}
}

		


	


