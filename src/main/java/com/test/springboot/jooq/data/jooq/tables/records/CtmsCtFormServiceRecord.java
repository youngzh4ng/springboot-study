/*
 * This file is generated by jOOQ.
*/
package com.test.springboot.jooq.data.jooq.tables.records;


import com.test.springboot.jooq.data.jooq.tables.CtmsCtFormService;

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
public class CtmsCtFormServiceRecord extends UpdatableRecordImpl<CtmsCtFormServiceRecord> implements Record4<BigInteger, BigInteger, String, String> {

    private static final long serialVersionUID = -862440133;

    /**
     * Setter for <code>PUBLIC.CTMS_CT_FORM_SERVICE.ID</code>.
     */
    public void setId(BigInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.CTMS_CT_FORM_SERVICE.ID</code>.
     */
    public BigInteger getId() {
        return (BigInteger) get(0);
    }

    /**
     * Setter for <code>PUBLIC.CTMS_CT_FORM_SERVICE.CT_FORM_ID</code>.
     */
    public void setCtFormId(BigInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.CTMS_CT_FORM_SERVICE.CT_FORM_ID</code>.
     */
    public BigInteger getCtFormId() {
        return (BigInteger) get(1);
    }

    /**
     * Setter for <code>PUBLIC.CTMS_CT_FORM_SERVICE.TYPE_CODE</code>.
     */
    public void setTypeCode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>PUBLIC.CTMS_CT_FORM_SERVICE.TYPE_CODE</code>.
     */
    public String getTypeCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>PUBLIC.CTMS_CT_FORM_SERVICE.TYPE_OTHERS</code>.
     */
    public void setTypeOthers(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>PUBLIC.CTMS_CT_FORM_SERVICE.TYPE_OTHERS</code>.
     */
    public String getTypeOthers() {
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
        return CtmsCtFormService.CTMS_CT_FORM_SERVICE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field2() {
        return CtmsCtFormService.CTMS_CT_FORM_SERVICE.CT_FORM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return CtmsCtFormService.CTMS_CT_FORM_SERVICE.TYPE_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return CtmsCtFormService.CTMS_CT_FORM_SERVICE.TYPE_OTHERS;
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
        return getCtFormId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getTypeCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getTypeOthers();
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
        return getCtFormId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTypeCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTypeOthers();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsCtFormServiceRecord value1(BigInteger value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsCtFormServiceRecord value2(BigInteger value) {
        setCtFormId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsCtFormServiceRecord value3(String value) {
        setTypeCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsCtFormServiceRecord value4(String value) {
        setTypeOthers(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsCtFormServiceRecord values(BigInteger value1, BigInteger value2, String value3, String value4) {
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
     * Create a detached CtmsCtFormServiceRecord
     */
    public CtmsCtFormServiceRecord() {
        super(CtmsCtFormService.CTMS_CT_FORM_SERVICE);
    }

    /**
     * Create a detached, initialised CtmsCtFormServiceRecord
     */
    public CtmsCtFormServiceRecord(BigInteger id, BigInteger ctFormId, String typeCode, String typeOthers) {
        super(CtmsCtFormService.CTMS_CT_FORM_SERVICE);

        set(0, id);
        set(1, ctFormId);
        set(2, typeCode);
        set(3, typeOthers);
    }
}