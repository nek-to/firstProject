package oop.homework.jsonparse.httpparse.dogimages;

public class DogApiTest {
    public static void main(String[] args) throws Exception {
        RandomDogApi randomDogApi = new RandomDogApi();
        NewRoot newRoot = randomDogApi.sendGet();
        System.out.println(newRoot);
    }
}
