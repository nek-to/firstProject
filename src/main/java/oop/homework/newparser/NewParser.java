package oop.homework.newparser;

import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class NewParser {
    public static void main(String[] args) throws IOException {
        String url = "https://freegeoip.app/json/";
        System.out.println( "----------------------");
        CloseableHttpClient httpClient = HttpClients.createDefault();

        HttpGet httpGet = new HttpGet(url);

        HttpResponse response = httpClient.execute(httpGet);
        System.out.println(response + "\n ----------------------");

        HttpEntity entity = response.getEntity();
        System.out.println(entity +  "\n ----------------------");

        String res = EntityUtils.toString(entity);
        Gson gson = new Gson();
        Root root = gson.fromJson(res, Root.class);
        System.out.println(root);
    }
}