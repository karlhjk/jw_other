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
@TableName("jf_hyf")
public class JfHyf extends Model<JfHyf> {

    private static final long serialVersionUID = 1L;

    private Integer id;
    /**
     * 会议名称
     */
    private String c1;
    /**
     * (会议类别)":1(一类)/2(二类)/3(三类),
     */
    private String c2;
    /**
     * (会议类型)":1(省级)/2(市级)/3(县区级),
     */
    private String c3;
    /**
     * 会议地点
     */
    private String c31;
    /**
     * 营利场所
     */
    private String c32;
    /**
     * 非营利场所
     */
    private String c33;
    /**
     * 开始时间
     */
    private String c4;
    /**
     * 结束时间
     */
    private String c5;
    /**
     * 参加会议人数
     */
    private String c6;
    /**
     * 工作人员人数
     */
    private String c7;
    /**
     * 会议天数
     */
    private String c8;
    /**
     * 预算金额
     */
    private String c9;
    /**
     * 摘要
     */
    private String c10;
    /**
     * 报销凭证
     */
    private String c11;
    /**
     * (经费类别)":1(正常经费)/2(专项经费),
     */
    private String c12;
    /**
     * 专项经费
     */
    private String c13;
    /**
     * 住宿费
     */
    private String c14;
    /**
     * 场地费
     */
    private String c15;
    /**
     * 讲课费
     */
    private String c16;
    /**
     * 资料费
     */
    private String c17;
    /**
     * 交通费
     */
    private String c18;
    /**
     * 其他费用
     */
    private String c19;
    /**
     * 餐费
     */
    private String c20;
    /**
     * 费用合计
     */
    private String c21;
    /**
     * 转账支付
     */
    private String c22;
    /**
     * 直接支付
     */
    private String c23;
    /**
     * 其他方式支付
     */
    private String c24;
    /**
     * 支付合计
     */
    private String c25;
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

    public String getC1() {
        return c1;
    }

    public void setC1(String c1) {
        this.c1 = c1;
    }

    public String getC2() {
        return c2;
    }

    public void setC2(String c2) {
        this.c2 = c2;
    }

    public String getC3() {
        return c3;
    }

    public void setC3(String c3) {
        this.c3 = c3;
    }

    public String getC31() {
        return c31;
    }

    public void setC31(String c31) {
        this.c31 = c31;
    }

    public String getC32() {
        return c32;
    }

    public void setC32(String c32) {
        this.c32 = c32;
    }

    public String getC33() {
        return c33;
    }

    public void setC33(String c33) {
        this.c33 = c33;
    }

    public String getC4() {
        return c4;
    }

    public void setC4(String c4) {
        this.c4 = c4;
    }

    public String getC5() {
        return c5;
    }

    public void setC5(String c5) {
        this.c5 = c5;
    }

    public String getC6() {
        return c6;
    }

    public void setC6(String c6) {
        this.c6 = c6;
    }

    public String getC7() {
        return c7;
    }

    public void setC7(String c7) {
        this.c7 = c7;
    }

    public String getC8() {
        return c8;
    }

    public void setC8(String c8) {
        this.c8 = c8;
    }

    public String getC9() {
        return c9;
    }

    public void setC9(String c9) {
        this.c9 = c9;
    }

    public String getC10() {
        return c10;
    }

    public void setC10(String c10) {
        this.c10 = c10;
    }

    public String getC11() {
        return c11;
    }

    public void setC11(String c11) {
        this.c11 = c11;
    }

    public String getC12() {
        return c12;
    }

    public void setC12(String c12) {
        this.c12 = c12;
    }

    public String getC13() {
        return c13;
    }

    public void setC13(String c13) {
        this.c13 = c13;
    }

    public String getC14() {
        return c14;
    }

    public void setC14(String c14) {
        this.c14 = c14;
    }

    public String getC15() {
        return c15;
    }

    public void setC15(String c15) {
        this.c15 = c15;
    }

    public String getC16() {
        return c16;
    }

    public void setC16(String c16) {
        this.c16 = c16;
    }

    public String getC17() {
        return c17;
    }

    public void setC17(String c17) {
        this.c17 = c17;
    }

    public String getC18() {
        return c18;
    }

    public void setC18(String c18) {
        this.c18 = c18;
    }

    public String getC19() {
        return c19;
    }

    public void setC19(String c19) {
        this.c19 = c19;
    }

    public String getC20() {
        return c20;
    }

    public void setC20(String c20) {
        this.c20 = c20;
    }

    public String getC21() {
        return c21;
    }

    public void setC21(String c21) {
        this.c21 = c21;
    }

    public String getC22() {
        return c22;
    }

    public void setC22(String c22) {
        this.c22 = c22;
    }

    public String getC23() {
        return c23;
    }

    public void setC23(String c23) {
        this.c23 = c23;
    }

    public String getC24() {
        return c24;
    }

    public void setC24(String c24) {
        this.c24 = c24;
    }

    public String getC25() {
        return c25;
    }

    public void setC25(String c25) {
        this.c25 = c25;
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
        return "JfHyf{" +
        "id=" + id +
        ", c1=" + c1 +
        ", c2=" + c2 +
        ", c3=" + c3 +
        ", c31=" + c31 +
        ", c32=" + c32 +
        ", c33=" + c33 +
        ", c4=" + c4 +
        ", c5=" + c5 +
        ", c6=" + c6 +
        ", c7=" + c7 +
        ", c8=" + c8 +
        ", c9=" + c9 +
        ", c10=" + c10 +
        ", c11=" + c11 +
        ", c12=" + c12 +
        ", c13=" + c13 +
        ", c14=" + c14 +
        ", c15=" + c15 +
        ", c16=" + c16 +
        ", c17=" + c17 +
        ", c18=" + c18 +
        ", c19=" + c19 +
        ", c20=" + c20 +
        ", c21=" + c21 +
        ", c22=" + c22 +
        ", c23=" + c23 +
        ", c24=" + c24 +
        ", c25=" + c25 +
        ", file=" + file +
        "}";
    }
}
