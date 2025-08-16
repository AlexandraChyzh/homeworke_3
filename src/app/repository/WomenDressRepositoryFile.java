package app.repository;
import app.domain.WomenDress;
import org.springframework.stereotype.Repository;

import java.io.*;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Repository
public class WomenDressRepositoryFile implements WomenDressRepository {


        private static final String FILE_NAME = "dresses.dat";
        private Map<Long, WomenDress> database = new HashMap<>();

        public WomenDressRepositoryFile() {
            // при запуске пробуем загрузить из файла
            loadFromFile();
            // если файла нет – инициализируем начальными данными
            if (database.isEmpty()) {
                initData();
                saveToFile();
            }
        }

        @Override
        public WomenDress getById(Long id) {
            return database.get(id);
        }

        // 🔹 сохранить новый объект
        public void save(WomenDress dress) {
            database.put(dress.getId(), dress);
            saveToFile();
        }



        // 🔹 сохраняем Map в файл
        private void saveToFile() {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
                oos.writeObject(database);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // 🔹 читаем Map из файла
        @SuppressWarnings("unchecked")
        private void loadFromFile() {
            File file = new File(FILE_NAME);
            if (!file.exists()) return;

            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
                database = (Map<Long, WomenDress>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        // 🔹 инициализация начальными данными
        private void initData() {
            database.put(1L, new WomenDress(1L,"Вечернее платье", "Dolce & Gabbana", new BigDecimal(800)));
            database.put(2L, new WomenDress(2L,"Коктейльное платье", "Dolce & Gabbana", new BigDecimal(900)));
            database.put(3L, new WomenDress(3L,"Свадебное платье", "Dolce & Gabbana", new BigDecimal(15000)));
        }

        // создаем новый объект
        WomenDress newDress = new WomenDress(4L, "Летнее платье", "Gucci", new BigDecimal(1200));






}


