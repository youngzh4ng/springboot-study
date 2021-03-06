/*
 * This file is generated by jOOQ.
*/
package com.test.springboot.jooq.data.jooq.tables.pojos;


import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Date;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CtmsCompanyHolder implements Serializable {

    private static final long serialVersionUID = -1795917154;

    private BigInteger id;
    private BigInteger companyId;
    private BigInteger companyGrpId;
    private Date       startDate;
    private Date       endDate;

    public CtmsCompanyHolder() {}

    public CtmsCompanyHolder(CtmsCompanyHolder value) {
        this.id = value.id;
        this.companyId = value.companyId;
        this.companyGrpId = value.companyGrpId;
        this.startDate = value.startDate;
        this.endDate = value.endDate;
    }

    public CtmsCompanyHolder(
        BigInteger id,
        BigInteger companyId,
        BigInteger companyGrpId,
        Date       startDate,
        Date       endDate
    ) {
        this.id = id;
        this.companyId = companyId;
        this.companyGrpId = companyGrpId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public BigInteger getId() {
        return this.id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(BigInteger companyId) {
        this.companyId = companyId;
    }

    public BigInteger getCompanyGrpId() {
        return this.companyGrpId;
    }

    public void setCompanyGrpId(BigInteger companyGrpId) {
        this.companyGrpId = companyGrpId;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CtmsCompanyHolder (");

        sb.append(id);
        sb.append(", ").append(companyId);
        sb.append(", ").append(companyGrpId);
        sb.append(", ").append(startDate);
        sb.append(", ").append(endDate);

        sb.append(")");
        return sb.toString();
    }
}
