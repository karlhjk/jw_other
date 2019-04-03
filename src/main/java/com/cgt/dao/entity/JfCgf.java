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
@TableName("jf_cgf")
public class JfCgf extends Model<JfCgf> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 开始时间
     */
    private String e1;
    /**
     * 结束时间
     */
    private String e2;
    /**
     * 批准文号
     */
    private String e3;
    /**
     * 出境目的地
     */
    private String e4;
    /**
     * 摘要
     */
    private String e5;
    /**
     * 人员名单
     */
    private String e6;
    /**
     * 人员组成
     */
    private String e7;
    /**
     * 厅级或以上
     */
    private String e71;
    /**
     * 处级
     */
    private String e72;
    /**
     * 科级或以下
     */
    private String e73;
    /**
     * 总人数
     */
    private String e74;
    /**
     * 报销凭证时间
     */
    private String e8;
    /**
     * 国外接待费
     */
    private String e9;
    /**
     * 交通费
     */
    private String e10;
    /**
     * 住宿费
     */
    private String e11;
    /**
     * 其他
     */
    private String e12;
    /**
     * 伙食费
     */
    private String e13;
    /**
     * 公杂费
     */
    private String e14;
    /**
     * 国际旅费
     */
    private String e15;
    /**
     * 培训费
     */
    private String e16;
    /**
     * 天数
     */
    private String e17;
    /**
     * 人数
     */
    private String e18;
    /**
     * 费用合计
     */
    private String e19;
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

    public String getE1() {
        return e1;
    }

    public void setE1(String e1) {
        this.e1 = e1;
    }

    public String getE2() {
        return e2;
    }

    public void setE2(String e2) {
        this.e2 = e2;
    }

    public String getE3() {
        return e3;
    }

    public void setE3(String e3) {
        this.e3 = e3;
    }

    public String getE4() {
        return e4;
    }

    public void setE4(String e4) {
        this.e4 = e4;
    }

    public String getE5() {
        return e5;
    }

    public void setE5(String e5) {
        this.e5 = e5;
    }

    public String getE6() {
        return e6;
    }

    public void setE6(String e6) {
        this.e6 = e6;
    }

    public String getE7() {
        return e7;
    }

    public void setE7(String e7) {
        this.e7 = e7;
    }

    public String getE71() {
        return e71;
    }

    public void setE71(String e71) {
        this.e71 = e71;
    }

    public String getE72() {
        return e72;
    }

    public void setE72(String e72) {
        this.e72 = e72;
    }

    public String getE73() {
        return e73;
    }

    public void setE73(String e73) {
        this.e73 = e73;
    }

    public String getE74() {
        return e74;
    }

    public void setE74(String e74) {
        this.e74 = e74;
    }

    public String getE8() {
        return e8;
    }

    public void setE8(String e8) {
        this.e8 = e8;
    }

    public String getE9() {
        return e9;
    }

    public void setE9(String e9) {
        this.e9 = e9;
    }

    public String getE10() {
        return e10;
    }

    public void setE10(String e10) {
        this.e10 = e10;
    }

    public String getE11() {
        return e11;
    }

    public void setE11(String e11) {
        this.e11 = e11;
    }

    public String getE12() {
        return e12;
    }

    public void setE12(String e12) {
        this.e12 = e12;
    }

    public String getE13() {
        return e13;
    }

    public void setE13(String e13) {
        this.e13 = e13;
    }

    public String getE14() {
        return e14;
    }

    public void setE14(String e14) {
        this.e14 = e14;
    }

    public String getE15() {
        return e15;
    }

    public void setE15(String e15) {
        this.e15 = e15;
    }

    public String getE16() {
        return e16;
    }

    public void setE16(String e16) {
        this.e16 = e16;
    }

    public String getE17() {
        return e17;
    }

    public void setE17(String e17) {
        this.e17 = e17;
    }

    public String getE18() {
        return e18;
    }

    public void setE18(String e18) {
        this.e18 = e18;
    }

    public String getE19() {
        return e19;
    }

    public void setE19(String e19) {
        this.e19 = e19;
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
        return "JfCgf{" +
        "id=" + id +
        ", e1=" + e1 +
        ", e2=" + e2 +
        ", e3=" + e3 +
        ", e4=" + e4 +
        ", e5=" + e5 +
        ", e6=" + e6 +
        ", e7=" + e7 +
        ", e71=" + e71 +
        ", e72=" + e72 +
        ", e73=" + e73 +
        ", e74=" + e74 +
        ", e8=" + e8 +
        ", e9=" + e9 +
        ", e10=" + e10 +
        ", e11=" + e11 +
        ", e12=" + e12 +
        ", e13=" + e13 +
        ", e14=" + e14 +
        ", e15=" + e15 +
        ", e16=" + e16 +
        ", e17=" + e17 +
        ", e18=" + e18 +
        ", e19=" + e19 +
        ", file=" + file +
        "}";
    }
}
