package oop.homework.jsonparse.fruit;

import com.google.gson.Gson;

import java.io.FileReader;

public class GsonParse {

    public Fruit parse() {
        Gson gson = new Gson();

        try (FileReader fileReader = new FileReader("fruit.json")) {

            Fruit fruit = gson.fromJson(fileReader, Fruit.class);
            return fruit;

        } catch (
                Exception e) {
            System.out.println("Parse exception " + e);
        }

        return null;
    }
}
