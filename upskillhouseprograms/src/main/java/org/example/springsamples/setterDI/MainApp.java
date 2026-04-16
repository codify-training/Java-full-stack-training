package org.example.springsamples.setterDI;

import org.example.springsamples.constructorDI.CI.AppConfig;
import org.example.springsamples.constructorDI.CI.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SetterAppConfig.class);
        Department department = ctx.getBean(Department.class);
        department.department();

    }

}
