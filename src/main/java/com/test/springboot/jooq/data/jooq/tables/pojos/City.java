/*
 * This file is generated by jOOQ.
*/
package com.test.springboot.jooq.data.jooq.tables.pojos;


import java.io.Serializable;

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
public class City implements Serializable {

    private static final long serialVersionUID = -997065406;

    private String cityCode;
    private String name;

    public City() {}

    public City(City value) {
        this.cityCode = value.cityCode;
        this.name = value.name;
    }

    public City(
        String cityCode,
        String name
    ) {
        this.cityCode = cityCode;
        this.name = name;
    }

    public String getCityCode() {
        return this.cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("City (");

        sb.append(cityCode);
        sb.append(", ").append(name);

        sb.append(")");
        return sb.toString();
    }
}
