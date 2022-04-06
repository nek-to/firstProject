package oop.homework.httpclient;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.util.Scanner;

public class Post {
    public static void main(String[] args) throws Exception {
        //create httpClient obj
        CloseableHttpClient httpClient = HttpClients.createDefault();

        //create httpPost obj
        HttpPost httpPost = new HttpPost("http://www.tutorialspoint.com/");
        System.out.println(httpPost.getMethod());

        //execute from httpPost
        HttpResponse httpResponse = httpClient.execute(httpPost);

        Scanner scanner = new Scanner(httpResponse.getEntity().getContent());

        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
     }
}
