/*
 * This file is generated by jOOQ.
*/
package com.test.springboot.jooq.data.jooq.tables.records;


import com.test.springboot.jooq.data.jooq.tables.CtmsCompanyName;

import java.math.BigInteger;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


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
public class CtmsCompanyNameRecord extends UpdatableRecordImpl<CtmsCompanyNameRecord> implements Record4<BigInteger, BigInteger, String, String> {

    private static final long serialVersionUID = -524076114;

    /**
     * Setter for <code>PUBLIC.CTMS_COMPANY_NAME.ID</code>.
     */
    public void setId(BigInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.CTMS_COMPANY_NAME.ID</code>.
     */
    public BigInteger getId() {
        return (BigInteger) get(0);
    }

    /**
     * Setter for <code>PUBLIC.CTMS_COMPANY_NAME.COMPANY_ID</code>.
     */
    public void setCompanyId(BigInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.CTMS_COMPANY_NAME.COMPANY_ID</code>.
     */
    public BigInteger getCompanyId() {
        return (BigInteger) get(1);
    }

    /**
     * Setter for <code>PUBLIC.CTMS_COMPANY_NAME.ENGLISH_NAME</code>.
     */
    public void setEnglishName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>PUBLIC.CTMS_COMPANY_NAME.ENGLISH_NAME</code>.
     */
    public String getEnglishName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>PUBLIC.CTMS_COMPANY_NAME.CHINESE_NAME</code>.
     */
    public void setChineseName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>PUBLIC.CTMS_COMPANY_NAME.CHINESE_NAME</code>.
     */
    public String getChineseName() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<BigInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<BigInteger, BigInteger, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<BigInteger, BigInteger, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field1() {
        return CtmsCompanyName.CTMS_COMPANY_NAME.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field2() {
        return CtmsCompanyName.CTMS_COMPANY_NAME.COMPANY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return CtmsCompanyName.CTMS_COMPANY_NAME.ENGLISH_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return CtmsCompanyName.CTMS_COMPANY_NAME.CHINESE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger component2() {
        return getCompanyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getEnglishName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getChineseName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger value2() {
        return getCompanyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getEnglishName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getChineseName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsCompanyNameRecord value1(BigInteger value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsCompanyNameRecord value2(BigInteger value) {
        setCompanyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsCompanyNameRecord value3(String value) {
        setEnglishName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsCompanyNameRecord value4(String value) {
        setChineseName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsCompanyNameRecord values(BigInteger value1, BigInteger value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CtmsCompanyNameRecord
     */
    public CtmsCompanyNameRecord() {
        super(CtmsCompanyName.CTMS_COMPANY_NAME);
    }

    /**
     * Create a detached, initialised CtmsCompanyNameRecord
     */
    public CtmsCompanyNameRecord(BigInteger id, BigInteger companyId, String englishName, String chineseName) {
        super(CtmsCompanyName.CTMS_COMPANY_NAME);

        set(0, id);
        set(1, companyId);
        set(2, englishName);
        set(3, chineseName);
    }
}
