package org.example;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Data
@Component
public class Student {

    private int rno; // default value is zero

    @Autowired
    @Qualifier("pen")
    private Writer writer; // default value is null // Has to given new Pen()n, new Pencil , objects are ready , just need to link

    public Student()
    {
        System.out.println("Student Constructor");
    }


    public void write_exam()
    {
        writer.write();
    }
}
