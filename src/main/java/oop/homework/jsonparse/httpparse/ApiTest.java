package oop.homework.jsonparse.httpparse;

public class ApiTest {
    public static void main(String[] args) throws Exception {
        SynonymAPI synonymAPI = new SynonymAPI();
        System.out.println(synonymAPI.sendGet());
    }
}
