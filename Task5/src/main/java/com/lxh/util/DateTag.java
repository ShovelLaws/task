package com.lxh.util;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;


/**
 * 用于页面 jstl时间格式化
 *
 * @Title: JSTLDateUtils.java
 * @Description: TODO(用一句话描述该文件做什么)
 */
public class DateTag extends TagSupport {
    private static final long serialVersionUID = 6464168398214506236L;
    private String value;
    @Override
    public int doStartTag() throws JspException{
        String vv = " " +value;
        long time = Long.valueOf(vv);
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(time);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = dateFormat.format(c.getTime());
        try{
            pageContext.getOut().write(s);
        }catch (IOException e){
            e.printStackTrace();
        }
        return super .doStartTag();
    }
    public void setValue(String value){
        this.value = value;
    }
}
