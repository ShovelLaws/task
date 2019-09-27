package com.lxh.util;

import com.cloopen.rest.sdk.CCPRestSmsSDK;
import org.springframework.stereotype.Component;


import java.util.HashMap;
import java.util.Random;
import java.util.Set;

@Component
public class SMSUtil {

    public boolean sendMessage(String phone,String verifyCode){
        HashMap<String,Object> result = null;
        CCPRestSmsSDK restAPI = new CCPRestSmsSDK();
        restAPI.init("app.cloopen.com","8883");
        restAPI.setAccount("8aaf07086cdb49dc016cefcd98d80a60","4ba5bfc26362466c8d016664119d46ff");
        restAPI.setAppId("8aaf07086cdb49dc016cefcd99280a66");
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
