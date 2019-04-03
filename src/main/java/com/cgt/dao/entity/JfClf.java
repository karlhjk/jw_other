package com.cgt.dao.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
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
@TableName("jf_clf")
public class JfClf extends Model<JfClf> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 是否旺季 0否、1是
     */
    private Integer b1;
    /**
     * 开始时间
     */
    private String b2;
    /**
     * 结束时间
     */
    private String b3;
    /**
     * 天数
     */
    private String b4;
    /**
     * 出差事由
     */
    private String b5;
    /**
     * 摘要
     */
    private String b6;
    /**
     * 人员名单
     */
    private String b7;
    /**
     * 人员组成
     */
    private String b8;
    /**
     * 厅级及以上人数
     */
    private String b81;
    /**
     * 处级人数
     */
    private String b82;
    /**
     * 科级及以下人数
     */
    private String b83;
    /**
     * 总人数
     */
    private String b84;
    /**
     * 差旅费用细项
     */
    private String b9;
    /**
     * 差旅费合计
     */
    private String b10;
    /**
     * 附件
     */
    private String file;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getB1() {
        return b1;
    }

    public void setB1(Integer b1) {
        this.b1 = b1;
    }

    public String getB2() {
        return b2;
    }

    public void setB2(String b2) {
        this.b2 = b2;
    }

    public String getB3() {
        return b3;
    }

    public void setB3(String b3) {
        this.b3 = b3;
    }

    public String getB4() {
        return b4;
    }

    public void setB4(String b4) {
        this.b4 = b4;
    }

    public String getB5() {
        return b5;
    }

    public void setB5(String b5) {
        this.b5 = b5;
    }

    public String getB6() {
        return b6;
    }

    public void setB6(String b6) {
        this.b6 = b6;
    }

    public String getB7() {
        return b7;
    }

    public void setB7(String b7) {
        this.b7 = b7;
    }

    public String getB8() {
        return b8;
    }

    public void setB8(String b8) {
        this.b8 = b8;
    }

    public String getB81() {
        return b81;
    }

    public void setB81(String b81) {
        this.b81 = b81;
    }

    public String getB82() {
        return b82;
    }

    public void setB82(String b82) {
        this.b82 = b82;
    }

    public String getB83() {
        return b83;
    }

    public void setB83(String b83) {
        this.b83 = b83;
    }

    public String getB84() {
        return b84;
    }

    public void setB84(String b84) {
        this.b84 = b84;
    }

    public String getB9() {
        return b9;
    }

    public void setB9(String b9) {
        this.b9 = b9;
    }

    public String getB10() {
        return b10;
    }

    public void setB10(String b10) {
        this.b10 = b10;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "JfClf{" +
        "id=" + id +
        ", b1=" + b1 +
        ", b2=" + b2 +
        ", b3=" + b3 +
        ", b4=" + b4 +
        ", b5=" + b5 +
        ", b6=" + b6 +
        ", b7=" + b7 +
        ", b8=" + b8 +
        ", b81=" + b81 +
        ", b82=" + b82 +
        ", b83=" + b83 +
        ", b84=" + b84 +
        ", b9=" + b9 +
        ", b10=" + b10 +
        ", file=" + file +
        "}";
    }
}
