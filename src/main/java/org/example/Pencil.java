package org.example;

import org.springframework.stereotype.Component;


public class Pencil implements Writer{
    public Pencil()
    {
        System.out.println("Pencil Constructor");
    }
    public void write()
    {
        System.out.println("using pencil");
    }
}
