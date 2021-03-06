/*
 * This file is generated by jOOQ.
*/
package com.test.springboot.jooq.data.jooq.tables.pojos;


import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;

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
public class CtmsUserGroup implements Serializable {

    private static final long serialVersionUID = 1462920103;

    private BigInteger id;
    private BigInteger userId;
    private String     grpLv1;
    private String     grpLv2;
    private String     grpLv3;
    private String     updatedBy;
    private Timestamp  updatedAt;

    public CtmsUserGroup() {}

    public CtmsUserGroup(CtmsUserGroup value) {
        this.id = value.id;
        this.userId = value.userId;
        this.grpLv1 = value.grpLv1;
        this.grpLv2 = value.grpLv2;
        this.grpLv3 = value.grpLv3;
        this.updatedBy = value.updatedBy;
        this.updatedAt = value.updatedAt;
    }

    public CtmsUserGroup(
        BigInteger id,
        BigInteger userId,
        String     grpLv1,
        String     grpLv2,
        String     grpLv3,
        String     updatedBy,
        Timestamp  updatedAt
    ) {
        this.id = id;
        this.userId = userId;
        this.grpLv1 = grpLv1;
        this.grpLv2 = grpLv2;
        this.grpLv3 = grpLv3;
        this.updatedBy = updatedBy;
        this.updatedAt = updatedAt;
    }

    public BigInteger getId() {
        return this.id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getUserId() {
        return this.userId;
    }

    public void setUserId(BigInteger userId) {
        this.userId = userId;
    }

    public String getGrpLv1() {
        return this.grpLv1;
    }

    public void setGrpLv1(String grpLv1) {
        this.grpLv1 = grpLv1;
    }

    public String getGrpLv2() {
        return this.grpLv2;
    }

    public void setGrpLv2(String grpLv2) {
        this.grpLv2 = grpLv2;
    }

    public String getGrpLv3() {
        return this.grpLv3;
    }

    public void setGrpLv3(String grpLv3) {
        this.grpLv3 = grpLv3;
    }

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Timestamp getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CtmsUserGroup (");

        sb.append(id);
        sb.append(", ").append(userId);
        sb.append(", ").append(grpLv1);
        sb.append(", ").append(grpLv2);
        sb.append(", ").append(grpLv3);
        sb.append(", ").append(updatedBy);
        sb.append(", ").append(updatedAt);

        sb.append(")");
        return sb.toString();
    }
}
