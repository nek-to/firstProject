package oop.homework.httpclient;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class New {
    public static New get() throws Exception {
        CloseableHttpClient httpclient = null;
        CloseableHttpResponse response = null;
        try {
            httpclient = HttpClients.createDefault();
            // Создать httpget.
            HttpGet httpget = new HttpGet("http://www.baidu.com/");
            // Выполнить запрос get.
            response = httpclient.execute(httpget);
            // Получить ответную сущность
            HttpEntity entity = response.getEntity();

            // печать статуса ответа
            System.out.println(response.getStatusLine().getStatusCode());
            if (entity != null) {
                // печать содержимого ответа
                System.out.println("Response content: " + EntityUtils.toString(entity));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            httpclient.close();
            response.close();
        }
        return null;
    }
}
