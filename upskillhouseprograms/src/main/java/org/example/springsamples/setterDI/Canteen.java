package org.example.springsamples.setterDI;


import org.springframework.stereotype.Component;

@Component
public class Canteen {
    public void getSnacks(){
        System.out.println("Get snacks");
    }

}
