package com.lxh.util;

import org.apache.http.HttpStatus;
import org.springframework.stereotype.Component;
import ytx.org.apache.http.util.EntityUtils;
import ytx.org.apache.http.client.entity.UrlEncodedFormEntity;
import ytx.org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;
import ytx.org.apache.http.HttpResponse;
import ytx.org.apache.http.client.HttpClient;
import ytx.org.apache.http.impl.client.DefaultHttpClient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@Component
public class MailUtil {

    public boolean sendEmail(String email, String emailCode) throws IOException {

        HttpClient httpClient = new DefaultHttpClient();
        HttpPost httpPost = new HttpPost("http://api.sendcloud.net/apiv2/mail/send");
        List params = new ArrayList();
        params.add(new BasicNameValuePair("apiUser","xc1111_test_JWGuOX"));
        params.add(new BasicNameValuePair("apiKey","ZJF8Fkg7Qchw8qv1"));
        params.add(new BasicNameValuePair("from", "test@hgJLLZ1cPQrO6oIDyYQMHDrmxzmRDLdj.sendcloud.org"));
        params.add(new BasicNameValuePair("fromName", ""));
        params.add(new BasicNameValuePair("to", email));
        params.add(new BasicNameValuePair("subject", "邮箱注册"));
        params.add(new BasicNameValuePair("html", emailCode));

        httpPost.setEntity(new UrlEncodedFormEntity(params,"UTF-8"));

        HttpResponse response = httpClient.execute(httpPost);

        if(response.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
            String result = EntityUtils.toString(response.getEntity());
            System.out.println(result);
            return true;
        }else {
            System.out.println("error");
            return false;
        }

    }
}
