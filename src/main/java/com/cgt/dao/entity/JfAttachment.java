package com.cgt.dao.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author cgt
 * @since 2019-04-02
 */
@TableName("jf_attachment")
public class JfAttachment extends Model<JfAttachment> {

    private static final long serialVersionUID = 1L;

    private String name;
    private Double size;
    @TableField("upload_time")
    private Date uploadTime;
    @TableId("upload_url")
    private String uploadUrl;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getUploadUrl() {
        return uploadUrl;
    }

    public void setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
    }

    @Override
    protected Serializable pkVal() {
        return this.uploadUrl;
    }

    @Override
    public String toString() {
        return "JfAttachment{" +
        "name=" + name +
        ", size=" + size +
        ", uploadTime=" + uploadTime +
        ", uploadUrl=" + uploadUrl +
        "}";
    }
}
