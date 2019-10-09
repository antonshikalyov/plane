package com.company;

public class plane {
    private String name;
    String color;
    int maxheight;
    int minheight;



    @Override
    public String toString() {
        return "plane{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", maxheight=" + maxheight +
                ", minheight=" + minheight +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxheight() {
        return maxheight;
    }

    public void setMaxheight(int maxheight) {
        this.maxheight = maxheight;
    }

    public int getMinheight() {
        return minheight;
    }

    public void setMinheight(int minheight) {
        this.minheight = minheight;
    }

    public plane(String name, String color, int maxheight, int minheight) {
        this.name = name;
        this.color = color;
        this.maxheight = maxheight;
        this.minheight = minheight;


    }
}


