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
@TableName("jf_jiedai")
public class JfJiedai extends Model<JfJiedai> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 接待类型 1(国内接待)/2(外宾接待)/3(招商接待)
     */
    private Integer a1;
    /**
     * 国内接待-住宿费
     */
    private String aa11;
    /**
     * 国内接待-接待用餐费
     */
    private String aa12;
    /**
     * 国内接待-接待出行费
     */
    private String aa13;
    /**
     * 外宾接待-住宿费
     */
    private String aa21;
    /**
     * 外宾接待-伙食费
     */
    private String aa22;
    /**
     * 外宾接待-宴请费
     */
    private String aa23;
    /**
     * 外宾接待-交通费
     */
    private String aa24;
    /**
     * 外宾接待-赠礼
     */
    private String aa25;
    /**
     * 摘要
     */
    private String a2;
    /**
     * 接待场所
     */
    private String a3;
    /**
     * 被接待单位
     */
    private String a4;
    /**
     * 接待时间
     */
    private String a5;
    /**
     * 主陪同人员
     */
    private String a6;
    /**
     * 来访人名单
     */
    private String a7;
    /**
     * 来访目的
     */
    private String a8;
    /**
     * 报销凭证时间
     */
    private String a9;
    /**
     * 餐费标准(元/人)
     */
    private String a10;
    /**
     * 开支金额(元)
     */
    private String a11;
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

    public Integer getA1() {
        return a1;
    }

    public void setA1(Integer a1) {
        this.a1 = a1;
    }

    public String getAa11() {
        return aa11;
    }

    public void setAa11(String aa11) {
        this.aa11 = aa11;
    }

    public String getAa12() {
        return aa12;
    }

    public void setAa12(String aa12) {
        this.aa12 = aa12;
    }

    public String getAa13() {
        return aa13;
    }

    public void setAa13(String aa13) {
        this.aa13 = aa13;
    }

    public String getAa21() {
        return aa21;
    }

    public void setAa21(String aa21) {
        this.aa21 = aa21;
    }

    public String getAa22() {
        return aa22;
    }

    public void setAa22(String aa22) {
        this.aa22 = aa22;
    }

    public String getAa23() {
        return aa23;
    }

    public void setAa23(String aa23) {
        this.aa23 = aa23;
    }

    public String getAa24() {
        return aa24;
    }

    public void setAa24(String aa24) {
        this.aa24 = aa24;
    }

    public String getAa25() {
        return aa25;
    }

    public void setAa25(String aa25) {
        this.aa25 = aa25;
    }

    public String getA2() {
        return a2;
    }

    public void setA2(String a2) {
        this.a2 = a2;
    }

    public String getA3() {
        return a3;
    }

    public void setA3(String a3) {
        this.a3 = a3;
    }

    public String getA4() {
        return a4;
    }

    public void setA4(String a4) {
        this.a4 = a4;
    }

    public String getA5() {
        return a5;
    }

    public void setA5(String a5) {
        this.a5 = a5;
    }

    public String getA6() {
        return a6;
    }

    public void setA6(String a6) {
        this.a6 = a6;
    }

    public String getA7() {
        return a7;
    }

    public void setA7(String a7) {
        this.a7 = a7;
    }

    public String getA8() {
        return a8;
    }

    public void setA8(String a8) {
        this.a8 = a8;
    }

    public String getA9() {
        return a9;
    }

    public void setA9(String a9) {
        this.a9 = a9;
    }

    public String getA10() {
        return a10;
    }

    public void setA10(String a10) {
        this.a10 = a10;
    }

    public String getA11() {
        return a11;
    }

    public void setA11(String a11) {
        this.a11 = a11;
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
        return "JfJiedai{" +
        "id=" + id +
        ", a1=" + a1 +
        ", aa11=" + aa11 +
        ", aa12=" + aa12 +
        ", aa13=" + aa13 +
        ", aa21=" + aa21 +
        ", aa22=" + aa22 +
        ", aa23=" + aa23 +
        ", aa24=" + aa24 +
        ", aa25=" + aa25 +
        ", a2=" + a2 +
        ", a3=" + a3 +
        ", a4=" + a4 +
        ", a5=" + a5 +
        ", a6=" + a6 +
        ", a7=" + a7 +
        ", a8=" + a8 +
        ", a9=" + a9 +
        ", a10=" + a10 +
        ", a11=" + a11 +
        ", file=" + file +
        "}";
    }
}
