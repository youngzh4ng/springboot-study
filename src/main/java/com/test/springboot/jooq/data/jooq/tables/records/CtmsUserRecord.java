/*
 * This file is generated by jOOQ.
*/
package com.test.springboot.jooq.data.jooq.tables.records;


import com.test.springboot.jooq.data.jooq.tables.CtmsUser;

import java.math.BigInteger;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
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
public class CtmsUserRecord extends UpdatableRecordImpl<CtmsUserRecord> implements Record9<BigInteger, String, String, Byte, Byte, Byte, Byte, String, Timestamp> {

    private static final long serialVersionUID = -17373104;

    /**
     * Setter for <code>PUBLIC.CTMS_USER.ID</code>.
     */
    public void setId(BigInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.CTMS_USER.ID</code>.
     */
    public BigInteger getId() {
        return (BigInteger) get(0);
    }

    /**
     * Setter for <code>PUBLIC.CTMS_USER.LOGIN_ID</code>.
     */
    public void setLoginId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.CTMS_USER.LOGIN_ID</code>.
     */
    public String getLoginId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>PUBLIC.CTMS_USER.EMAIL</code>.
     */
    public void setEmail(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>PUBLIC.CTMS_USER.EMAIL</code>.
     */
    public String getEmail() {
        return (String) get(2);
    }

    /**
     * Setter for <code>PUBLIC.CTMS_USER.IS_SUBMITTER</code>.
     */
    public void setIsSubmitter(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>PUBLIC.CTMS_USER.IS_SUBMITTER</code>.
     */
    public Byte getIsSubmitter() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>PUBLIC.CTMS_USER.IS_CTO</code>.
     */
    public void setIsCto(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>PUBLIC.CTMS_USER.IS_CTO</code>.
     */
    public Byte getIsCto() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>PUBLIC.CTMS_USER.IS_LSD</code>.
     */
    public void setIsLsd(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>PUBLIC.CTMS_USER.IS_LSD</code>.
     */
    public Byte getIsLsd() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>PUBLIC.CTMS_USER.IS_ADMIN</code>.
     */
    public void setIsAdmin(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>PUBLIC.CTMS_USER.IS_ADMIN</code>.
     */
    public Byte getIsAdmin() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>PUBLIC.CTMS_USER.UPDATED_BY</code>.
     */
    public void setUpdatedBy(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>PUBLIC.CTMS_USER.UPDATED_BY</code>.
     */
    public String getUpdatedBy() {
        return (String) get(7);
    }

    /**
     * Setter for <code>PUBLIC.CTMS_USER.UPDATED_AT</code>.
     */
    public void setUpdatedAt(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>PUBLIC.CTMS_USER.UPDATED_AT</code>.
     */
    public Timestamp getUpdatedAt() {
        return (Timestamp) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<BigInteger, String, String, Byte, Byte, Byte, Byte, String, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<BigInteger, String, String, Byte, Byte, Byte, Byte, String, Timestamp> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field1() {
        return CtmsUser.CTMS_USER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return CtmsUser.CTMS_USER.LOGIN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return CtmsUser.CTMS_USER.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return CtmsUser.CTMS_USER.IS_SUBMITTER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return CtmsUser.CTMS_USER.IS_CTO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return CtmsUser.CTMS_USER.IS_LSD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field7() {
        return CtmsUser.CTMS_USER.IS_ADMIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return CtmsUser.CTMS_USER.UPDATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return CtmsUser.CTMS_USER.UPDATED_AT;
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
        return getLoginId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component4() {
        return getIsSubmitter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component5() {
        return getIsCto();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component6() {
        return getIsLsd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component7() {
        return getIsAdmin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
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
    public String value2() {
        return getLoginId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getIsSubmitter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getIsCto();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getIsLsd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value7() {
        return getIsAdmin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsUserRecord value1(BigInteger value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsUserRecord value2(String value) {
        setLoginId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsUserRecord value3(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsUserRecord value4(Byte value) {
        setIsSubmitter(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsUserRecord value5(Byte value) {
        setIsCto(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsUserRecord value6(Byte value) {
        setIsLsd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsUserRecord value7(Byte value) {
        setIsAdmin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsUserRecord value8(String value) {
        setUpdatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsUserRecord value9(Timestamp value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsUserRecord values(BigInteger value1, String value2, String value3, Byte value4, Byte value5, Byte value6, Byte value7, String value8, Timestamp value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CtmsUserRecord
     */
    public CtmsUserRecord() {
        super(CtmsUser.CTMS_USER);
    }

    /**
     * Create a detached, initialised CtmsUserRecord
     */
    public CtmsUserRecord(BigInteger id, String loginId, String email, Byte isSubmitter, Byte isCto, Byte isLsd, Byte isAdmin, String updatedBy, Timestamp updatedAt) {
        super(CtmsUser.CTMS_USER);

        set(0, id);
        set(1, loginId);
        set(2, email);
        set(3, isSubmitter);
        set(4, isCto);
        set(5, isLsd);
        set(6, isAdmin);
        set(7, updatedBy);
        set(8, updatedAt);
    }
}
