package oop.homework.httpclient;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.util.Scanner;

public class CloseConnection {
    public static void main(String[] args) throws IOException {
        //create httpClient obj
        CloseableHttpClient httpClient = HttpClients.createDefault();

        try {
            //create HttpGet obj
            HttpGet httpGet = new HttpGet("http://www.tutorialspoint.com/");

            //execute HttpGet request
            CloseableHttpResponse httpResponse = httpClient.execute(httpGet);
            try {
                Scanner scanner = new Scanner(httpResponse.getEntity().getContent());
                while (scanner.hasNext()) {
                    System.out.println(scanner.nextLine());
                }
            } finally {
                httpResponse.close();
            }
        } finally {
            httpClient.close();
        }
    }
}
