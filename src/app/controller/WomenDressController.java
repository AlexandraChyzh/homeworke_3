package app.controller;

import app.domain.WomenDress;
import app.service.WomenDressService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WomenDressController {

    private WomenDressService service;

    @Value("Dolce&Gabbana Shop")
    private String shopName;

    public WomenDressController(WomenDressService service) {
        this.service = service;
    }

    public WomenDress getById(Long id) {
        System.out.println("Название магазина:" + shopName);
        return service.getById(id);
    }
}
