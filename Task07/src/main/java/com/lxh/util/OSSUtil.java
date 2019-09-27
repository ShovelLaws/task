package com.lxh.util;

import com.aliyun.oss.OSSClient;
import org.springframework.stereotype.Component;


import java.io.File;

@Component
public class OSSUtil {
    private String url;
    private String endPoint;
    private String bucket;
    private String apiAcessKeyId;
    private String apiAceesKeySecret;
    private String object;

    public void setUrl(String url) {
        this.url = url;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public void setApiAcessKeyId(String apiAcessKeyId) {
        this.apiAcessKeyId = apiAcessKeyId;
    }

    public void setApiAceesKeySecret(String apiAceesKeySecret) {
        this.apiAceesKeySecret = apiAceesKeySecret;
    }


    public boolean upLoadFile(String name, File file) throws Exception {
        OSSClient ossClient = new OSSClient(endPoint, apiAcessKeyId, apiAceesKeySecret);
//        InputStream inputStream = new FileInputStream(file);
        ossClient.putObject(bucket, name, file);
        ossClient.shutdown();
        return true;
    }
}
