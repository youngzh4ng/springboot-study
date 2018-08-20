/*
 * This file is generated by jOOQ.
*/
package com.test.springboot.jooq.data.jooq.tables.pojos;


import java.io.Serializable;
import java.math.BigInteger;

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
public class CtmsCtFormService implements Serializable {

    private static final long serialVersionUID = -1465901012;

    private BigInteger id;
    private BigInteger ctFormId;
    private String     typeCode;
    private String     typeOthers;

    public CtmsCtFormService() {}

    public CtmsCtFormService(CtmsCtFormService value) {
        this.id = value.id;
        this.ctFormId = value.ctFormId;
        this.typeCode = value.typeCode;
        this.typeOthers = value.typeOthers;
    }

    public CtmsCtFormService(
        BigInteger id,
        BigInteger ctFormId,
        String     typeCode,
        String     typeOthers
    ) {
        this.id = id;
        this.ctFormId = ctFormId;
        this.typeCode = typeCode;
        this.typeOthers = typeOthers;
    }

    public BigInteger getId() {
        return this.id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getCtFormId() {
        return this.ctFormId;
    }

    public void setCtFormId(BigInteger ctFormId) {
        this.ctFormId = ctFormId;
    }

    public String getTypeCode() {
        return this.typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getTypeOthers() {
        return this.typeOthers;
    }

    public void setTypeOthers(String typeOthers) {
        this.typeOthers = typeOthers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CtmsCtFormService (");

        sb.append(id);
        sb.append(", ").append(ctFormId);
        sb.append(", ").append(typeCode);
        sb.append(", ").append(typeOthers);

        sb.append(")");
        return sb.toString();
    }
}
