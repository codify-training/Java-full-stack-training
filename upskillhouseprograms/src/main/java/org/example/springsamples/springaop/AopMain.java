package org.example.springsamples.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopMain {

    public static void main(String[] args) {
       // PaymentServiceOldWayWithoutAOP ps = new PaymentServiceOldWayWithoutAOP();
        //ps.makePayment(10, 2);

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AOPConfig.class);
        PaymentService paymentService = ctx.getBean(PaymentService.class);
        int i = paymentService.makePayment(12, 5);
        System.out.println("---------------------------------------------------------------");
        int i1 = paymentService.doTransfer(12, 5, 10);
    }

}
