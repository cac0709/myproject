package com.java2.object;

public class Animal {
	private int age;
    private int weight;
     
    public int getAge() {
        return age;
    }
 
    public void setAge(int n) {
        if (n < 0) {
            age = 1;
        }
        else {
            age = n;
        }
    }
     
    public int getWeight() {
        return weight;
    }
     
    public void setWeight(int n) {
        if (n < 0) {
            weight = 10;
        }
        else {
            weight = n;
        }
  
    }

	public void speak() {
		System.out.println("我已經" + getAge() + "歲，有" + getWeight() + "公斤重");
		
		
	}
}