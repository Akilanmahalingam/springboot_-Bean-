package org.example;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Student {

    private int rno; // default value is zero

    private Writer writer; // default value is null // Has to given new Pen()n, new Pencil , objects are ready , just need to link

    public Writer getWriter() {
        return writer;
    }
    @Autowired
    @Qualifier("pencil")
    public void setWriter(Writer writer) {
        System.out.println("Through setter method");
        this.writer = writer;
    }

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public Student()
    {
        System.out.println("Student Constructor");
    }


    public void write_exam()
    {
        writer.write();
    }
}
