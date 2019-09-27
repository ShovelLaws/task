package com.lxh.util;

import com.cloopen.rest.sdk.CCPRestSmsSDK;
import org.springframework.stereotype.Component;


import java.util.HashMap;
import java.util.Random;
import java.util.Set;

public class SMSUtil {
    private String url;
    private String port;
    private String accountSid;
    private String accountToken;
    private String appId;

    public void setUrl(String url) {
        this.url = url;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public void setAccountSid(String accountSid) {
        this.accountSid = accountSid;
    }

    public void setAccountToken(String accountToken) {
        this.accountToken = accountToken;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public boolean sendMessage(String phone, String verifyCode){
        HashMap<String,Object> result = null;
        CCPRestSmsSDK restAPI = new CCPRestSmsSDK();
        restAPI.init(url,port);
        restAPI.setAccount(accountSid,accountToken);
        restAPI.setAppId(appId);
        verifyCode = String.valueOf(new Random().nextInt(8999999)+100000);
//        Jedis jedis = new Jedis("127.0.0.1",6379);
//        jedis.setex(verifyCode,120,verifyCode);
//        jedis.get(verifyCode);
        result = restAPI.sendTemplateSMS(phone,"1",new String[]{verifyCode,"2"});
        System.out.println("SDKTestGetSubAccounts result=" + result);
        if("000000".equals(result.get("statusCode"))){
            HashMap<String,Object> data = (HashMap<String, Object>) result.get("data");
            Set<String> keySet = data.keySet();
            for(String key:keySet){
                Object object = data.get(key);
                System.out.println(key +" = "+object);
            }
        }else{
            System.out.println("错误码=" + result.get("statusCode") +" 错误信息= "+result.get("statusMsg"));
        }
        return true;
    }
}
