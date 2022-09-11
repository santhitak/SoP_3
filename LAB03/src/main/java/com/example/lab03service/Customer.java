package com.example.lab03service;


public class Customer {

    private String ID;
    private String name;
    private boolean sex;
    private int age;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex.equalsIgnoreCase("male");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = Math.max(age, 0);
    }

    public Customer(){
        this("", null, "female",0);
    }

    public Customer(String ID, String n, String s, int a){
        setID(ID);
        setName(n);
        setAge(a);
        setSex(s);
    }

}
