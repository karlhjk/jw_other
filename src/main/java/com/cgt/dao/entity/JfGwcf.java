package com.cgt.dao.entity;

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
@TableName("jf_gwcf")
public class JfGwcf extends Model<JfGwcf> {

    private static final long serialVersionUID = 1L;

    private Integer id;
    /**
     * 1(公务用车运行维护费)/2(公务用车购置费),
     */
    private String f1;
    /**
     * 费用类别
     */
    private String f11;
    /**
     * 费用
     */
    private String f12;
    /**
     * 开支金额
     */
    private String f2;
    /**
     * 凭证时间
     */
    private String f3;
    /**
     * 摘要
     */
    private String f4;
    /**
     * 其他
     */
    private String f5;
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

    public String getF1() {
        return f1;
    }

    public void setF1(String f1) {
        this.f1 = f1;
    }

    public String getF11() {
        return f11;
    }

    public void setF11(String f11) {
        this.f11 = f11;
    }

    public String getF12() {
        return f12;
    }

    public void setF12(String f12) {
        this.f12 = f12;
    }

    public String getF2() {
        return f2;
    }

    public void setF2(String f2) {
        this.f2 = f2;
    }

    public String getF3() {
        return f3;
    }

    public void setF3(String f3) {
        this.f3 = f3;
    }

    public String getF4() {
        return f4;
    }

    public void setF4(String f4) {
        this.f4 = f4;
    }

    public String getF5() {
        return f5;
    }

    public void setF5(String f5) {
        this.f5 = f5;
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
        return "JfGwcf{" +
        "id=" + id +
        ", f1=" + f1 +
        ", f11=" + f11 +
        ", f12=" + f12 +
        ", f2=" + f2 +
        ", f3=" + f3 +
        ", f4=" + f4 +
        ", f5=" + f5 +
        ", file=" + file +
        "}";
    }
}
