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

public class Main {
	public Main(){
		try{
			FileReader fr = new FileReader("schedule.txt");
			BufferedReader br = new BufferedReader(fr);


	


