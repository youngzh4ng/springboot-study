/*
 * This file is generated by jOOQ.
*/
package com.test.springboot.jooq.data.jooq.tables.daos;


import com.test.springboot.jooq.data.jooq.tables.CtmsUser;
import com.test.springboot.jooq.data.jooq.tables.records.CtmsUserRecord;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class CtmsUserDao extends DAOImpl<CtmsUserRecord, com.test.springboot.jooq.data.jooq.tables.pojos.CtmsUser, BigInteger> {

    /**
     * Create a new CtmsUserDao without any configuration
     */
    public CtmsUserDao() {
        super(CtmsUser.CTMS_USER, com.test.springboot.jooq.data.jooq.tables.pojos.CtmsUser.class);
    }

    /**
     * Create a new CtmsUserDao with an attached configuration
     */
    public CtmsUserDao(Configuration configuration) {
        super(CtmsUser.CTMS_USER, com.test.springboot.jooq.data.jooq.tables.pojos.CtmsUser.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected BigInteger getId(com.test.springboot.jooq.data.jooq.tables.pojos.CtmsUser object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsUser> fetchById(BigInteger... values) {
        return fetch(CtmsUser.CTMS_USER.ID, values);
    }

    /**
     * Fetch a unique record that has <code>ID = value</code>
     */
    public com.test.springboot.jooq.data.jooq.tables.pojos.CtmsUser fetchOneById(BigInteger value) {
        return fetchOne(CtmsUser.CTMS_USER.ID, value);
    }

    /**
     * Fetch records that have <code>LOGIN_ID IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsUser> fetchByLoginId(String... values) {
        return fetch(CtmsUser.CTMS_USER.LOGIN_ID, values);
    }

    /**
     * Fetch a unique record that has <code>LOGIN_ID = value</code>
     */
    public com.test.springboot.jooq.data.jooq.tables.pojos.CtmsUser fetchOneByLoginId(String value) {
        return fetchOne(CtmsUser.CTMS_USER.LOGIN_ID, value);
    }

    /**
     * Fetch records that have <code>EMAIL IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsUser> fetchByEmail(String... values) {
        return fetch(CtmsUser.CTMS_USER.EMAIL, values);
    }

    /**
     * Fetch records that have <code>IS_SUBMITTER IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsUser> fetchByIsSubmitter(Byte... values) {
        return fetch(CtmsUser.CTMS_USER.IS_SUBMITTER, values);
    }

    /**
     * Fetch records that have <code>IS_CTO IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsUser> fetchByIsCto(Byte... values) {
        return fetch(CtmsUser.CTMS_USER.IS_CTO, values);
    }

    /**
     * Fetch records that have <code>IS_LSD IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsUser> fetchByIsLsd(Byte... values) {
        return fetch(CtmsUser.CTMS_USER.IS_LSD, values);
    }

    /**
     * Fetch records that have <code>IS_ADMIN IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsUser> fetchByIsAdmin(Byte... values) {
        return fetch(CtmsUser.CTMS_USER.IS_ADMIN, values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsUser> fetchByUpdatedBy(String... values) {
        return fetch(CtmsUser.CTMS_USER.UPDATED_BY, values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsUser> fetchByUpdatedAt(Timestamp... values) {
        return fetch(CtmsUser.CTMS_USER.UPDATED_AT, values);
    }
}
