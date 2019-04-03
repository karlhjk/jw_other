package com.cgt.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.cgt.dao.entity.JfAttachment;
import com.cgt.dao.entity.JfJiedai;
import com.cgt.service.DataHandleService;
import com.cgt.util.BeanMapUtils;
import com.cgt.util.RequestParamsToMap;
import com.cgt.vo.ResCode;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.*;

@RestController
@RequestMapping("/data")
public class DataHandleController extends BaseController {

    @Autowired
    public DataHandleService dataHandleService;

    @RequestMapping("/add")
    public Map add(HttpServletRequest request, int type) throws Exception {
        Map<String, Object> map = RequestParamsToMap.getParameterMap(request);
        dataHandleService.add(map,type);
        return getResultJson(ResCode.SUCCESS);
    }

    @RequestMapping("/list")
    public Map list(Page page,int type) {
        List list=dataHandleService.getPageList(page,type);
        return getResultJson(list);
    }

    @RequestMapping("/content")
    public Map content(int id,int type) {
        Object obj=dataHandleService.getContent(id,type);
        return getResultJson(obj);
    }

    /**
     * 实现文件上传
     */
    @RequestMapping("fileUpload")
    @ResponseBody
    public Map fileUpload(@RequestParam("file") MultipartFile[] files) {
        List list = new ArrayList();
        String filePath = "common";
        String basePath = request.getSession().getServletContext().getRealPath("/");
        for (MultipartFile file : files) {
            if (file.getSize() != 0) {
                String originalFileName = file.getOriginalFilename();
                int size = (int) file.getSize();
                String fileName = UUID.randomUUID() + originalFileName.substring(originalFileName.lastIndexOf("."));
                String filePath2 = "upload" + System.getProperty("file.separator") + filePath + System.getProperty("file.separator");
                String finalPath = basePath + filePath2;
                File ff = new File(finalPath);
                if (!ff.exists()) {
                    ff.mkdirs();
                }
                File fileAttach = new File(finalPath + fileName);
                try {
                    file.transferTo(fileAttach);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                JfAttachment jfAttachment=new JfAttachment();
                jfAttachment.setName(originalFileName);
                jfAttachment.setSize(Double.valueOf(size));
                jfAttachment.setUploadTime(new Date());
                jfAttachment.setUploadUrl(finalPath + fileName);
                jfAttachment.insert();
                list.add(jfAttachment);
            }

        }
        return getResultJson(list);
    }


}
