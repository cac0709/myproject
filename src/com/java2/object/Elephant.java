package com.java2.object;

class Elephant extends Animal {
    private String name;
     
    public String getName() {
        return name;
    }
     
    public void setName(String n) {
        if (n == null || n.equals("")) {
            name = "�L�W��";
        }
        else {
            name = n;
        }
    }
     
    public void speak() {
        System.out.println("�ڪ��W�r�O" + getName() + "�w�g" + getAge() + "��");
    }
}

	

