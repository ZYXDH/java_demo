package com.example.demo.bean;

public class Table {
    private int id;
    private String desc;

    @Override
    public String toString() {
        return "Table{" +
                "id=" + id +
                ", desc='" + desc + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Table(int id, String desc) {
        this.id = id;
        this.desc = desc;
    }
    public Table() {
    }
}
