package client;

import app.controller.WomenDressController;
import app.domain.WomenDress;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Client {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext("app");

        WomenDressController controller = context.getBean(WomenDressController.class);

        WomenDress womenDress = controller.getById(1L);
        System.out.println(womenDress);
    }
}
