package com.java2.object;

public class ABgame {
	public static void main(String[] args) {
		
		String serect = "9873";
		String nums = "1356";
		int a = 0;
		int b = 0;
		int length = serect.length();
		for (int i = 0; i < nums.length(); i++) {
			char c = nums.charAt(i);
			for (int j = 0; j < length; j++) {
				if (c == serect.charAt(j)) {
					if (i == j) {
						a++;
					} else {
						b++;
					}
					break;
				}

			}
		}System.out.println(a+"A"+b+"B");
	}
	
}