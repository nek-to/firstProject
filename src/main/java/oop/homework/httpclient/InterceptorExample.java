package oop.homework.httpclient;

import org.apache.http.*;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.HttpContext;

import java.io.IOException;

public class InterceptorExample {
    public static void main(String[] args) throws IOException {

        HttpRequestInterceptor requestInterceptor = new HttpRequestInterceptor() {
            @Override
            public void process(HttpRequest httpRequest, HttpContext httpContext) throws HttpException, IOException {
                if (httpRequest.containsHeader("simple-header")) {
                    System.out.println("Contains header sample-header, removing it..");
                    httpRequest.removeHeaders("simple-header");
                }
                //printing remains list of headers
                Header[] headers = httpRequest.getAllHeaders();
                for (int i = 0; i < headers.length; i++) {
                    System.out.println(headers[i].getName());
                }
            }
        };

        CloseableHttpClient httpClient = HttpClients.custom().addInterceptorFirst(requestInterceptor).build();

        HttpGet httpGet = new HttpGet("https://www.tutorialspoint.com/");

        httpGet.setHeader(new BasicHeader("simple-header", "My first header"));
        httpGet.setHeader(new BasicHeader("demo-header", "My second header"));
        httpGet.setHeader(new BasicHeader("test-header", "My third header"));

        HttpResponse httpResponse = httpClient.execute(httpGet);

        System.out.println(httpResponse.getStatusLine());
    }
}