/*
 * This file is generated by jOOQ.
*/
package com.test.springboot.jooq.data.jooq.tables.records;


import com.test.springboot.jooq.data.jooq.tables.CtmsReportGrpHier;

import java.math.BigInteger;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class CtmsReportGrpHierRecord extends UpdatableRecordImpl<CtmsReportGrpHierRecord> implements Record5<BigInteger, String, String, BigInteger, Long> {

    private static final long serialVersionUID = -1886738925;

    /**
     * Setter for <code>PUBLIC.CTMS_REPORT_GRP_HIER.ID</code>.
     */
    public void setId(BigInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.CTMS_REPORT_GRP_HIER.ID</code>.
     */
    public BigInteger getId() {
        return (BigInteger) get(0);
    }

    /**
     * Setter for <code>PUBLIC.CTMS_REPORT_GRP_HIER.NAME</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.CTMS_REPORT_GRP_HIER.NAME</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>PUBLIC.CTMS_REPORT_GRP_HIER.CODE</code>.
     */
    public void setCode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>PUBLIC.CTMS_REPORT_GRP_HIER.CODE</code>.
     */
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>PUBLIC.CTMS_REPORT_GRP_HIER.PARENT_ID</code>.
     */
    public void setParentId(BigInteger value) {
        set(3, value);
    }

    /**
     * Getter for <code>PUBLIC.CTMS_REPORT_GRP_HIER.PARENT_ID</code>.
     */
    public BigInteger getParentId() {
        return (BigInteger) get(3);
    }

    /**
     * Setter for <code>PUBLIC.CTMS_REPORT_GRP_HIER.DISPLAY_SEQ</code>.
     */
    public void setDisplaySeq(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>PUBLIC.CTMS_REPORT_GRP_HIER.DISPLAY_SEQ</code>.
     */
    public Long getDisplaySeq() {
        return (Long) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<BigInteger, String, String, BigInteger, Long> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<BigInteger, String, String, BigInteger, Long> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field1() {
        return CtmsReportGrpHier.CTMS_REPORT_GRP_HIER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return CtmsReportGrpHier.CTMS_REPORT_GRP_HIER.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return CtmsReportGrpHier.CTMS_REPORT_GRP_HIER.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field4() {
        return CtmsReportGrpHier.CTMS_REPORT_GRP_HIER.PARENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return CtmsReportGrpHier.CTMS_REPORT_GRP_HIER.DISPLAY_SEQ;
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
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger component4() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getDisplaySeq();
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
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger value4() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getDisplaySeq();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsReportGrpHierRecord value1(BigInteger value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsReportGrpHierRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsReportGrpHierRecord value3(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsReportGrpHierRecord value4(BigInteger value) {
        setParentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsReportGrpHierRecord value5(Long value) {
        setDisplaySeq(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsReportGrpHierRecord values(BigInteger value1, String value2, String value3, BigInteger value4, Long value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CtmsReportGrpHierRecord
     */
    public CtmsReportGrpHierRecord() {
        super(CtmsReportGrpHier.CTMS_REPORT_GRP_HIER);
    }

    /**
     * Create a detached, initialised CtmsReportGrpHierRecord
     */
    public CtmsReportGrpHierRecord(BigInteger id, String name, String code, BigInteger parentId, Long displaySeq) {
        super(CtmsReportGrpHier.CTMS_REPORT_GRP_HIER);

        set(0, id);
        set(1, name);
        set(2, code);
        set(3, parentId);
        set(4, displaySeq);
    }
}