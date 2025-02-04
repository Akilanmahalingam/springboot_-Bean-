package org.example;

import org.springframework.stereotype.Component;


public class Pen implements Writer{
    public Pen()
    {
        System.out.println("Pen Constructor");
    }
    public void write()
    {
        System.out.println("using Pen");
    }
}
