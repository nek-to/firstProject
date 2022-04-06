package oop.homework.jsonparse.httpparse.dogimages;

import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class RandomDogApi {
    private final CloseableHttpClient httpClient = HttpClients.createDefault();

    public NewRoot sendGet() throws Exception {

        HttpGet request = new HttpGet("https://dog.ceo/api/breeds/image/random");

        try (CloseableHttpResponse response = httpClient.execute(request)) {
            HttpEntity entity = response.getEntity();
//            Header headers = entity.getContentType();
//            System.out.println(headers);

            if (entity != null) {
                // return it as a String
                String result = EntityUtils.toString(entity);
                Gson gson = new Gson();
                NewRoot newRoot = gson.fromJson(result, NewRoot.class);
                return newRoot;
            }
        }
        return null;
    }
}
