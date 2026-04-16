package org.example.springsamples.setterDI;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Department {

    private Student student;

    //Field Injection
    @Autowired
    private Canteen canteen;


    //Setter injection
    @Autowired
    public void setStudent(Student student){
        this.student = student;
    }

    public void department(){
        System.out.println("CSE");
        student.getCollege();
        canteen.getSnacks();
    }

}
