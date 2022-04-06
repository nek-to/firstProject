package oop.homework.httpclient;

import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

public class AnswerTest {
    public static void main(String[] args) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();

        ResponseHandler<String> responseHandler = new Answer();

        HttpGet httpGet = new HttpGet("http://www.tutorialspoint.com/");

        String httpResponse = httpClient.execute(httpGet, responseHandler);

        System.out.println(httpResponse);
    }
}
