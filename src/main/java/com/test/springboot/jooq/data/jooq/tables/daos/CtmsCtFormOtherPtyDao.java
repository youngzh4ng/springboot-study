/*
 * This file is generated by jOOQ.
*/
package com.test.springboot.jooq.data.jooq.tables.daos;


import com.test.springboot.jooq.data.jooq.tables.CtmsCtFormOtherPty;
import com.test.springboot.jooq.data.jooq.tables.records.CtmsCtFormOtherPtyRecord;

import java.math.BigInteger;
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
public class CtmsCtFormOtherPtyDao extends DAOImpl<CtmsCtFormOtherPtyRecord, com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCtFormOtherPty, BigInteger> {

    /**
     * Create a new CtmsCtFormOtherPtyDao without any configuration
     */
    public CtmsCtFormOtherPtyDao() {
        super(CtmsCtFormOtherPty.CTMS_CT_FORM_OTHER_PTY, com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCtFormOtherPty.class);
    }

    /**
     * Create a new CtmsCtFormOtherPtyDao with an attached configuration
     */
    public CtmsCtFormOtherPtyDao(Configuration configuration) {
        super(CtmsCtFormOtherPty.CTMS_CT_FORM_OTHER_PTY, com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCtFormOtherPty.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected BigInteger getId(com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCtFormOtherPty object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCtFormOtherPty> fetchById(BigInteger... values) {
        return fetch(CtmsCtFormOtherPty.CTMS_CT_FORM_OTHER_PTY.ID, values);
    }

    /**
     * Fetch a unique record that has <code>ID = value</code>
     */
    public com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCtFormOtherPty fetchOneById(BigInteger value) {
        return fetchOne(CtmsCtFormOtherPty.CTMS_CT_FORM_OTHER_PTY.ID, value);
    }

    /**
     * Fetch records that have <code>CT_FORM_ID IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCtFormOtherPty> fetchByCtFormId(BigInteger... values) {
        return fetch(CtmsCtFormOtherPty.CTMS_CT_FORM_OTHER_PTY.CT_FORM_ID, values);
    }

    /**
     * Fetch records that have <code>COMPANY_NAME IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCtFormOtherPty> fetchByCompanyName(String... values) {
        return fetch(CtmsCtFormOtherPty.CTMS_CT_FORM_OTHER_PTY.COMPANY_NAME, values);
    }
}
