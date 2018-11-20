package org.tang.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
@Entity
@Table(name = "rel_debit_iou_info_test")
public class DebitIouInfoDTO implements Serializable{
    private static final long serialVersionUID = 9124666622290908348L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    /**
     * app平台类型
     */
    private String appType;

    /**
     * 借款金额
     */
    private BigDecimal baseAmt;

    /**
     * 还款方式 0全额 1分期
     */
    private Byte repayType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public BigDecimal getBaseAmt() {
        return baseAmt;
    }

    public void setBaseAmt(BigDecimal baseAmt) {
        this.baseAmt = baseAmt;
    }

    public Byte getRepayType() {
        return repayType;
    }

    public void setRepayType(Byte repayType) {
        this.repayType = repayType;
    }

}
