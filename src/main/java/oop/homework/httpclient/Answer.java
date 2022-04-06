package oop.homework.httpclient;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class Answer implements ResponseHandler<String> {
    @Override
    public String handleResponse(HttpResponse httpResponse) throws ClientProtocolException, IOException {
        //Get status of the response
        int status = httpResponse.getStatusLine().getStatusCode();
        if (status >= 200 && status <= 300){
            HttpEntity httpEntity = httpResponse.getEntity();
            if (httpEntity == null){
                return "";
            } else return EntityUtils.toString(httpEntity);
        }else  return "" + status;
    }
}
