package oop.homework.jsonparse.httpparse;

import com.google.gson.Gson;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class SynonymAPI {
    private final CloseableHttpClient httpClient = HttpClients.createDefault();

    public Root sendGet() throws Exception {

        HttpGet request = new HttpGet("https://api.apitore.com/api/9/word2vec-neologd-jawiki/distance");

        try (CloseableHttpResponse response = httpClient.execute(request)) {
            HttpEntity entity = response.getEntity();
            Header headers = entity.getContentType();
            System.out.println(headers);

            if (entity != null) {
                // return it as a String
                String result = EntityUtils.toString(entity);
                Gson gson = new Gson();
                Root root = gson.fromJson(result, Root.class);
                return root;
            }
        }
        return null;
    }
}
