package com.cgt.controller;



import com.baomidou.mybatisplus.plugins.Page;
import com.cgt.vo.ResCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BaseController {

    @Autowired
    protected HttpServletRequest request;


    public Map<String, Object> getResultJson(Page page) {
        return getResultJson(page.getRecords(), ResCode.SUCCESS, page.getTotal());
    }

    public Map<String, Object> getResultJson(List list) {
        return getResultJson( list, ResCode.SUCCESS, (long) list.size());
    }

    public Map<String, Object> getResultJson(Map data) {
        return getResultJson(ResCode.SUCCESS,data);
    }

    public Map<String, Object> getResultJsonNologin(Map data) {
        return getResultJson(ResCode.NOLOGIN,data);
    }

    public Map<String, Object> getResultJson(List list, ResCode resCode, Long count) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("data", list);
        map.put("code", resCode.code());
        map.put("msg", resCode.msg());
        map.put("count", count);
        map.put("result", ResCode.SUCCESS.equals(resCode));
        String errMsg= resCode.msg();
        if (ResCode.SUCCESS != resCode) {
            if (errMsg == null || errMsg.equals("") || errMsg.trim().startsWith("{") || errMsg.trim().startsWith("|")|| errMsg.trim().startsWith("#") || errMsg.trim().indexOf("error")>-1) {
                map.put("msg", "系统错误，请联系管理员");
            }
        }
        return map;
    }

    public Map<String, Object> getResultJson(ResCode resCode, Map data) {
        Map<String, Object> map = getResultJson(null, resCode, null);
        map.put("data", data);
        return map;
    }

    public Map<String, Object> getResultJson(Object obj) {
        Map<String, Object> map = getResultJson(null, ResCode.SUCCESS, null);
        map.put("data", obj);
        return map;
    }

    public Map<String, Object> getResultJson(ResCode resCode) {
        return getResultJson(null, resCode, null);
    }

    public Map<String, Object> err(String errMsg) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("data", null);
        map.put("code", ResCode.ERR.code());
        map.put("msg", errMsg);
        map.put("count", null);
        map.put("result", false);
        if (errMsg == null || errMsg.equals("") || errMsg.trim().startsWith("{") || errMsg.trim().startsWith("|")|| errMsg.trim().startsWith("#") || errMsg.trim().indexOf("error")>-1) {
            map.put("msg", "系统错误，请联系管理员");
        }
        return map;
    }


}
