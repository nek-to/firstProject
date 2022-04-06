package oop.homework.httpclient;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.util.Scanner;

public class Get {
    public static void main(String[] args) throws Exception {
        //create httpClient obj
        CloseableHttpClient httpClient = HttpClients.createDefault();

        //create httpGet obj
        HttpGet httpGet = new HttpGet("http://www.tutorialspoint.com/");

        //printing the method used
        System.out.println("Request type " + httpGet.getMethod());

        //executing the Get request
        HttpResponse httpResponse = httpClient.execute(httpGet);

        Scanner scanner = new Scanner(httpResponse.getEntity().getContent());

        //printing the status line
        System.out.println(httpResponse.getStatusLine());
        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }

    }
}