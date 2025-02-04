package org.example;


import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class Student {

    private int rno;

    private Writer writer; // assign new Pen() as well as new Pencil , both are correct

    public Student()
    {
        System.out.println("Student Constructor");
    }


    public void write_exam()
    {
        writer.write();
    }
}
