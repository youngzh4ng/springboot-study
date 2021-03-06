/*
 * This file is generated by jOOQ.
*/
package com.test.springboot.jooq.data.jooq.tables.daos;


import com.test.springboot.jooq.data.jooq.tables.CtmsCtFormAgmtFiles;
import com.test.springboot.jooq.data.jooq.tables.records.CtmsCtFormAgmtFilesRecord;

import java.math.BigInteger;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record2;
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
public class CtmsCtFormAgmtFilesDao extends DAOImpl<CtmsCtFormAgmtFilesRecord, com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCtFormAgmtFiles, Record2<BigInteger, BigInteger>> {

    /**
     * Create a new CtmsCtFormAgmtFilesDao without any configuration
     */
    public CtmsCtFormAgmtFilesDao() {
        super(CtmsCtFormAgmtFiles.CTMS_CT_FORM_AGMT_FILES, com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCtFormAgmtFiles.class);
    }

    /**
     * Create a new CtmsCtFormAgmtFilesDao with an attached configuration
     */
    public CtmsCtFormAgmtFilesDao(Configuration configuration) {
        super(CtmsCtFormAgmtFiles.CTMS_CT_FORM_AGMT_FILES, com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCtFormAgmtFiles.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Record2<BigInteger, BigInteger> getId(com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCtFormAgmtFiles object) {
        return compositeKeyRecord(object.getCtFormId(), object.getId());
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCtFormAgmtFiles> fetchById(BigInteger... values) {
        return fetch(CtmsCtFormAgmtFiles.CTMS_CT_FORM_AGMT_FILES.ID, values);
    }

    /**
     * Fetch records that have <code>CT_FORM_ID IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCtFormAgmtFiles> fetchByCtFormId(BigInteger... values) {
        return fetch(CtmsCtFormAgmtFiles.CTMS_CT_FORM_AGMT_FILES.CT_FORM_ID, values);
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCtFormAgmtFiles> fetchByName(String... values) {
        return fetch(CtmsCtFormAgmtFiles.CTMS_CT_FORM_AGMT_FILES.NAME, values);
    }

    /**
     * Fetch records that have <code>CONTENT IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCtFormAgmtFiles> fetchByContent(byte[]... values) {
        return fetch(CtmsCtFormAgmtFiles.CTMS_CT_FORM_AGMT_FILES.CONTENT, values);
    }
}
