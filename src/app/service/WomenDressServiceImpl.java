package app.service;

import app.domain.WomenDress;
import app.repository.WomenDressRepository;
import org.springframework.stereotype.Service;

@Service
public class WomenDressServiceImpl implements WomenDressService{

    private WomenDressRepository repository;

    public WomenDressServiceImpl(WomenDressRepository repository) {
        this.repository = repository;
    }

    @Override
    public WomenDress getById(Long id) {
        return repository.getById(id);
    }

}
