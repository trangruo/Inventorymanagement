package com.model;

public class Goods {
    private int id;
    private String name;
    private int number;
    private int w_id;

    public Goods() {
    }

    public Goods(int id, String name, int number, int w_id) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.w_id = w_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getW_id() {
        return w_id;
    }

    public void setW_id(int w_id) {
        this.w_id = w_id;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", w_id=" + w_id +
                '}';
    }
}
