package app.repository;

import app.domain.WomenDress;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Repository
public class WomenDressRepositoryImpl implements WomenDressRepository{

    private Map<Long, WomenDress> database = new HashMap<>();


    public WomenDressRepositoryImpl(){
        initData();
    }

    @Override
    public WomenDress getById(Long id) {
        return database.get(id);
    }

    private void initData() {
        database.put(1L, new WomenDress(1L,"Вечернее платье", "Dolce & Gabbana", new BigDecimal(800)));
        database.put(2L, new WomenDress(2L,"Коктейльное платье", "Dolce & Gabbana", new BigDecimal(900)));
        database.put(3L, new WomenDress(3L,"Свадебное платье", "Dolce & Gabbana", new BigDecimal(15000)));
    }


}
