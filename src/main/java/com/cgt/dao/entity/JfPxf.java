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
@TableName("jf_pxf")
public class JfPxf extends Model<JfPxf> {

    private static final long serialVersionUID = 1L;

    private Integer id;
    /**
     * 培训开始时间
     */
    private String d1;
    /**
     * 培训结束时间
     */
    private String d2;
    /**
     * 培训名称
     */
    private String d3;
    /**
     * (培训类别)":1(一类)/2(二类)/0(其他),
     */
    private String d4;
    /**
     * 培训类别-其他
     */
    private String d5;
    /**
     * 参加培训人数
     */
    private String d6;
    /**
     * 工作人员人数
     */
    private String d7;
    /**
     * 培训天数
     */
    private String d8;
    /**
     * 预算金额
     */
    private String d9;
    /**
     * 摘要
     */
    private String d10;
    /**
     * 报销凭证时间
     */
    private String d11;
    /**
     * (经费类别)":1(正常经费)/2(专项经费),
     */
    private String d12;
    /**
     * 专项经费
     */
    private String d13;
    /**
     * 住宿费
     */
    private String d14;
    /**
     * 场地费
     */
    private String d15;
    /**
     * 讲课费
     */
    private String d16;
    /**
     * 资料费
     */
    private String d17;
    /**
     * 交通费
     */
    private String d18;
    /**
     * 餐费
     */
    private String d19;
    /**
     * 其他费用
     */
    private String d20;
    /**
     * 费用合计
     */
    private String d21;
    /**
     * 转账支付
     */
    private String d22;
    /**
     * 直接支付
     */
    private String d23;
    /**
     * 其他方式支付
     */
    private String d24;
    /**
     * 支付合计
     */
    private String d25;
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

    public String getD1() {
        return d1;
    }

    public void setD1(String d1) {
        this.d1 = d1;
    }

    public String getD2() {
        return d2;
    }

    public void setD2(String d2) {
        this.d2 = d2;
    }

    public String getD3() {
        return d3;
    }

    public void setD3(String d3) {
        this.d3 = d3;
    }

    public String getD4() {
        return d4;
    }

    public void setD4(String d4) {
        this.d4 = d4;
    }

    public String getD5() {
        return d5;
    }

    public void setD5(String d5) {
        this.d5 = d5;
    }

    public String getD6() {
        return d6;
    }

    public void setD6(String d6) {
        this.d6 = d6;
    }

    public String getD7() {
        return d7;
    }

    public void setD7(String d7) {
        this.d7 = d7;
    }

    public String getD8() {
        return d8;
    }

    public void setD8(String d8) {
        this.d8 = d8;
    }

    public String getD9() {
        return d9;
    }

    public void setD9(String d9) {
        this.d9 = d9;
    }

    public String getD10() {
        return d10;
    }

    public void setD10(String d10) {
        this.d10 = d10;
    }

    public String getD11() {
        return d11;
    }

    public void setD11(String d11) {
        this.d11 = d11;
    }

    public String getD12() {
        return d12;
    }

    public void setD12(String d12) {
        this.d12 = d12;
    }

    public String getD13() {
        return d13;
    }

    public void setD13(String d13) {
        this.d13 = d13;
    }

    public String getD14() {
        return d14;
    }

    public void setD14(String d14) {
        this.d14 = d14;
    }

    public String getD15() {
        return d15;
    }

    public void setD15(String d15) {
        this.d15 = d15;
    }

    public String getD16() {
        return d16;
    }

    public void setD16(String d16) {
        this.d16 = d16;
    }

    public String getD17() {
        return d17;
    }

    public void setD17(String d17) {
        this.d17 = d17;
    }

    public String getD18() {
        return d18;
    }

    public void setD18(String d18) {
        this.d18 = d18;
    }

    public String getD19() {
        return d19;
    }

    public void setD19(String d19) {
        this.d19 = d19;
    }

    public String getD20() {
        return d20;
    }

    public void setD20(String d20) {
        this.d20 = d20;
    }

    public String getD21() {
        return d21;
    }

    public void setD21(String d21) {
        this.d21 = d21;
    }

    public String getD22() {
        return d22;
    }

    public void setD22(String d22) {
        this.d22 = d22;
    }

    public String getD23() {
        return d23;
    }

    public void setD23(String d23) {
        this.d23 = d23;
    }

    public String getD24() {
        return d24;
    }

    public void setD24(String d24) {
        this.d24 = d24;
    }

    public String getD25() {
        return d25;
    }

    public void setD25(String d25) {
        this.d25 = d25;
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
        return "JfPxf{" +
        "id=" + id +
        ", d1=" + d1 +
        ", d2=" + d2 +
        ", d3=" + d3 +
        ", d4=" + d4 +
        ", d5=" + d5 +
        ", d6=" + d6 +
        ", d7=" + d7 +
        ", d8=" + d8 +
        ", d9=" + d9 +
        ", d10=" + d10 +
        ", d11=" + d11 +
        ", d12=" + d12 +
        ", d13=" + d13 +
        ", d14=" + d14 +
        ", d15=" + d15 +
        ", d16=" + d16 +
        ", d17=" + d17 +
        ", d18=" + d18 +
        ", d19=" + d19 +
        ", d20=" + d20 +
        ", d21=" + d21 +
        ", d22=" + d22 +
        ", d23=" + d23 +
        ", d24=" + d24 +
        ", d25=" + d25 +
        ", file=" + file +
        "}";
    }
}
