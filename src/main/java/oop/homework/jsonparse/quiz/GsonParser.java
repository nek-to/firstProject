package oop.homework.jsonparse.quiz;

import com.google.gson.Gson;

import java.io.FileReader;

public class GsonParser {

    public Root parse(){
        Gson gson = new Gson();

        try (FileReader fileReader = new FileReader("quiz.json")){

            Root root = gson.fromJson(fileReader, Root.class);
            return root;

        } catch (Exception e) {
            System.out.println("Parse exception " + e);
        }
        return null;
    }
}
