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
public class CtmsCompanyGrp implements Serializable {

    private static final long serialVersionUID = -957996364;

    private BigInteger id;
    private String     code;
    private String     name;

    public CtmsCompanyGrp() {}

    public CtmsCompanyGrp(CtmsCompanyGrp value) {
        this.id = value.id;
        this.code = value.code;
        this.name = value.name;
    }

    public CtmsCompanyGrp(
        BigInteger id,
        String     code,
        String     name
    ) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public BigInteger getId() {
        return this.id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CtmsCompanyGrp (");

        sb.append(id);
        sb.append(", ").append(code);
        sb.append(", ").append(name);

        sb.append(")");
        return sb.toString();
    }
}
