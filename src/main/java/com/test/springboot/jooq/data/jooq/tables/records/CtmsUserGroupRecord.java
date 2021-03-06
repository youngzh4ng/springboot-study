/*
 * This file is generated by jOOQ.
*/
package com.test.springboot.jooq.data.jooq.tables.records;


import com.test.springboot.jooq.data.jooq.tables.CtmsUserGroup;

import java.math.BigInteger;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class CtmsUserGroupRecord extends UpdatableRecordImpl<CtmsUserGroupRecord> implements Record7<BigInteger, BigInteger, String, String, String, String, Timestamp> {

    private static final long serialVersionUID = 1825168497;

    /**
     * Setter for <code>PUBLIC.CTMS_USER_GROUP.ID</code>.
     */
    public void setId(BigInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.CTMS_USER_GROUP.ID</code>.
     */
    public BigInteger getId() {
        return (BigInteger) get(0);
    }

    /**
     * Setter for <code>PUBLIC.CTMS_USER_GROUP.USER_ID</code>.
     */
    public void setUserId(BigInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.CTMS_USER_GROUP.USER_ID</code>.
     */
    public BigInteger getUserId() {
        return (BigInteger) get(1);
    }

    /**
     * Setter for <code>PUBLIC.CTMS_USER_GROUP.GRP_LV1</code>.
     */
    public void setGrpLv1(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>PUBLIC.CTMS_USER_GROUP.GRP_LV1</code>.
     */
    public String getGrpLv1() {
        return (String) get(2);
    }

    /**
     * Setter for <code>PUBLIC.CTMS_USER_GROUP.GRP_LV2</code>.
     */
    public void setGrpLv2(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>PUBLIC.CTMS_USER_GROUP.GRP_LV2</code>.
     */
    public String getGrpLv2() {
        return (String) get(3);
    }

    /**
     * Setter for <code>PUBLIC.CTMS_USER_GROUP.GRP_LV3</code>.
     */
    public void setGrpLv3(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>PUBLIC.CTMS_USER_GROUP.GRP_LV3</code>.
     */
    public String getGrpLv3() {
        return (String) get(4);
    }

    /**
     * Setter for <code>PUBLIC.CTMS_USER_GROUP.UPDATED_BY</code>.
     */
    public void setUpdatedBy(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>PUBLIC.CTMS_USER_GROUP.UPDATED_BY</code>.
     */
    public String getUpdatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>PUBLIC.CTMS_USER_GROUP.UPDATED_AT</code>.
     */
    public void setUpdatedAt(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>PUBLIC.CTMS_USER_GROUP.UPDATED_AT</code>.
     */
    public Timestamp getUpdatedAt() {
        return (Timestamp) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<BigInteger, BigInteger, String, String, String, String, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<BigInteger, BigInteger, String, String, String, String, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field1() {
        return CtmsUserGroup.CTMS_USER_GROUP.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field2() {
        return CtmsUserGroup.CTMS_USER_GROUP.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return CtmsUserGroup.CTMS_USER_GROUP.GRP_LV1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return CtmsUserGroup.CTMS_USER_GROUP.GRP_LV2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return CtmsUserGroup.CTMS_USER_GROUP.GRP_LV3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return CtmsUserGroup.CTMS_USER_GROUP.UPDATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return CtmsUserGroup.CTMS_USER_GROUP.UPDATED_AT;
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
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getGrpLv1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getGrpLv2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getGrpLv3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getUpdatedAt();
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
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getGrpLv1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getGrpLv2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getGrpLv3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsUserGroupRecord value1(BigInteger value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsUserGroupRecord value2(BigInteger value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsUserGroupRecord value3(String value) {
        setGrpLv1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsUserGroupRecord value4(String value) {
        setGrpLv2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsUserGroupRecord value5(String value) {
        setGrpLv3(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsUserGroupRecord value6(String value) {
        setUpdatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsUserGroupRecord value7(Timestamp value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsUserGroupRecord values(BigInteger value1, BigInteger value2, String value3, String value4, String value5, String value6, Timestamp value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CtmsUserGroupRecord
     */
    public CtmsUserGroupRecord() {
        super(CtmsUserGroup.CTMS_USER_GROUP);
    }

    /**
     * Create a detached, initialised CtmsUserGroupRecord
     */
    public CtmsUserGroupRecord(BigInteger id, BigInteger userId, String grpLv1, String grpLv2, String grpLv3, String updatedBy, Timestamp updatedAt) {
        super(CtmsUserGroup.CTMS_USER_GROUP);

        set(0, id);
        set(1, userId);
        set(2, grpLv1);
        set(3, grpLv2);
        set(4, grpLv3);
        set(5, updatedBy);
        set(6, updatedAt);
    }
}
