package com.java2.object;

class Elephant extends Animal {
    private String name;
     
    public String getName() {
        return name;
    }
     
    public void setName(String n) {
        if (n == null || n.equals("")) {
            name = "無名氏";
        }
        else {
            name = n;
        }
    }
     
    public void speak() {
        System.out.println("我的名字是" + getName() + "已經" + getAge() + "歲");
    }
}

	

