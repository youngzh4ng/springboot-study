/*
 * This file is generated by jOOQ.
*/
package com.test.springboot.jooq.data.jooq.tables.daos;


import com.test.springboot.jooq.data.jooq.tables.CtmsUserPreference;
import com.test.springboot.jooq.data.jooq.tables.records.CtmsUserPreferenceRecord;

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
public class CtmsUserPreferenceDao extends DAOImpl<CtmsUserPreferenceRecord, com.test.springboot.jooq.data.jooq.tables.pojos.CtmsUserPreference, BigInteger> {

    /**
     * Create a new CtmsUserPreferenceDao without any configuration
     */
    public CtmsUserPreferenceDao() {
        super(CtmsUserPreference.CTMS_USER_PREFERENCE, com.test.springboot.jooq.data.jooq.tables.pojos.CtmsUserPreference.class);
    }

    /**
     * Create a new CtmsUserPreferenceDao with an attached configuration
     */
    public CtmsUserPreferenceDao(Configuration configuration) {
        super(CtmsUserPreference.CTMS_USER_PREFERENCE, com.test.springboot.jooq.data.jooq.tables.pojos.CtmsUserPreference.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected BigInteger getId(com.test.springboot.jooq.data.jooq.tables.pojos.CtmsUserPreference object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsUserPreference> fetchById(BigInteger... values) {
        return fetch(CtmsUserPreference.CTMS_USER_PREFERENCE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>ID = value</code>
     */
    public com.test.springboot.jooq.data.jooq.tables.pojos.CtmsUserPreference fetchOneById(BigInteger value) {
        return fetchOne(CtmsUserPreference.CTMS_USER_PREFERENCE.ID, value);
    }

    /**
     * Fetch records that have <code>DEFAULT_RPT_USER_GRP_LV1 IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsUserPreference> fetchByDefaultRptUserGrpLv1(String... values) {
        return fetch(CtmsUserPreference.CTMS_USER_PREFERENCE.DEFAULT_RPT_USER_GRP_LV1, values);
    }

    /**
     * Fetch records that have <code>DEFAULT_RPT_USER_GRP_LV2 IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsUserPreference> fetchByDefaultRptUserGrpLv2(String... values) {
        return fetch(CtmsUserPreference.CTMS_USER_PREFERENCE.DEFAULT_RPT_USER_GRP_LV2, values);
    }

    /**
     * Fetch records that have <code>DEFAULT_RPT_USER_GRP_LV3 IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsUserPreference> fetchByDefaultRptUserGrpLv3(String... values) {
        return fetch(CtmsUserPreference.CTMS_USER_PREFERENCE.DEFAULT_RPT_USER_GRP_LV3, values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsUserPreference> fetchByUpdatedBy(String... values) {
        return fetch(CtmsUserPreference.CTMS_USER_PREFERENCE.UPDATED_BY, values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsUserPreference> fetchByUpdatedAt(Timestamp... values) {
        return fetch(CtmsUserPreference.CTMS_USER_PREFERENCE.UPDATED_AT, values);
    }
}
