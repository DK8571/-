package com.example.glx;

public class member extends person {
    private String name ="update";
    static {
        System.out.println("c");
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
}
