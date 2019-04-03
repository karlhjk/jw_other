package com.cgt.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.cgt.dao.entity.*;
import com.cgt.util.BeanMapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class DataHandleService {

    @Autowired
    public IJfJiedaiService jfJiedaiService;
    @Autowired
    public IJfCgfService jfCgfService;
    @Autowired
    public IJfClfService jfClfService;
    @Autowired
    public IJfGwcfService jfGwcfService;
    @Autowired
    public IJfHyfService jfHyfService;
    @Autowired
    public IJfPxfService jfPxfService;

    public boolean add(Map map, int type) throws Exception {
        boolean flag = false;
        if (type == 1) {
            JfJiedai jfJiedai = (JfJiedai) BeanMapUtils.map2JavaBean(JfJiedai.class, map);
            flag= jfJiedai.insert();
        }else if(type == 2){
            JfClf jfClf = (JfClf) BeanMapUtils.map2JavaBean(JfClf.class, map);
            flag= jfClf.insert();
        }else if(type == 3){
            JfHyf jfHyf = (JfHyf) BeanMapUtils.map2JavaBean(JfHyf.class, map);
            flag= jfHyf.insert();
        }else if(type == 4){
            JfPxf jfPxf = (JfPxf) BeanMapUtils.map2JavaBean(JfPxf.class, map);
            flag= jfPxf.insert();
        }else if(type == 5){
            JfCgf jfCgf = (JfCgf) BeanMapUtils.map2JavaBean(JfCgf.class, map);
            flag= jfCgf.insert();
        }else if(type == 6){
            JfGwcf jfGwcf = (JfGwcf) BeanMapUtils.map2JavaBean(JfGwcf.class, map);
            flag= jfGwcf.insert();
        }
        return flag;
    }

    public List getPageList(Page page, int type) {
        if (type == 1) {
            page = jfJiedaiService.selectPage(page);
        }else if(type==2){
            page = jfClfService.selectPage(page);
        }else if(type==3){
            page = jfHyfService.selectPage(page);
        }else if(type==4){
            page = jfPxfService.selectPage(page);
        }else if(type==5){
            page = jfCgfService.selectPage(page);
        }else if(type==6){
            page = jfGwcfService.selectPage(page);
        }
        return page.getRecords();
    }

    public Object getContent(int id, int type) {
        if (type == 1) {
            return jfJiedaiService.selectById(id);
        }else if(type==2){
            return jfClfService.selectById(id);
        }else if(type==3){
            return jfHyfService.selectById(id);
        }else if(type==4){
            return jfPxfService.selectById(id);
        }else if(type==5){
            return jfCgfService.selectById(id);
        }else if(type==6){
            return jfGwcfService.selectById(id);
        }
        return null;
    }
}
