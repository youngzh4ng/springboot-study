/*
 * This file is generated by jOOQ.
*/
package com.test.springboot.jooq.data.jooq.tables.daos;


import com.test.springboot.jooq.data.jooq.tables.CtmsCompanyRequest;
import com.test.springboot.jooq.data.jooq.tables.records.CtmsCompanyRequestRecord;

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
public class CtmsCompanyRequestDao extends DAOImpl<CtmsCompanyRequestRecord, com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCompanyRequest, BigInteger> {

    /**
     * Create a new CtmsCompanyRequestDao without any configuration
     */
    public CtmsCompanyRequestDao() {
        super(CtmsCompanyRequest.CTMS_COMPANY_REQUEST, com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCompanyRequest.class);
    }

    /**
     * Create a new CtmsCompanyRequestDao with an attached configuration
     */
    public CtmsCompanyRequestDao(Configuration configuration) {
        super(CtmsCompanyRequest.CTMS_COMPANY_REQUEST, com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCompanyRequest.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected BigInteger getId(com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCompanyRequest object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCompanyRequest> fetchById(BigInteger... values) {
        return fetch(CtmsCompanyRequest.CTMS_COMPANY_REQUEST.ID, values);
    }

    /**
     * Fetch a unique record that has <code>ID = value</code>
     */
    public com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCompanyRequest fetchOneById(BigInteger value) {
        return fetchOne(CtmsCompanyRequest.CTMS_COMPANY_REQUEST.ID, value);
    }

    /**
     * Fetch records that have <code>RPT_USER_GRP_LV1 IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCompanyRequest> fetchByRptUserGrpLv1(String... values) {
        return fetch(CtmsCompanyRequest.CTMS_COMPANY_REQUEST.RPT_USER_GRP_LV1, values);
    }

    /**
     * Fetch records that have <code>RPT_USER_GRP_LV2 IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCompanyRequest> fetchByRptUserGrpLv2(String... values) {
        return fetch(CtmsCompanyRequest.CTMS_COMPANY_REQUEST.RPT_USER_GRP_LV2, values);
    }

    /**
     * Fetch records that have <code>RPT_USER_GRP_LV3 IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCompanyRequest> fetchByRptUserGrpLv3(String... values) {
        return fetch(CtmsCompanyRequest.CTMS_COMPANY_REQUEST.RPT_USER_GRP_LV3, values);
    }

    /**
     * Fetch records that have <code>CTO_ENDORSER_GRP IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCompanyRequest> fetchByCtoEndorserGrp(String... values) {
        return fetch(CtmsCompanyRequest.CTMS_COMPANY_REQUEST.CTO_ENDORSER_GRP, values);
    }

    /**
     * Fetch records that have <code>ENGLISH_NAME IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCompanyRequest> fetchByEnglishName(String... values) {
        return fetch(CtmsCompanyRequest.CTMS_COMPANY_REQUEST.ENGLISH_NAME, values);
    }

    /**
     * Fetch records that have <code>CHINESE_NAME IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCompanyRequest> fetchByChineseName(String... values) {
        return fetch(CtmsCompanyRequest.CTMS_COMPANY_REQUEST.CHINESE_NAME, values);
    }

    /**
     * Fetch records that have <code>COMPANY_GRP_ID IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCompanyRequest> fetchByCompanyGrpId(BigInteger... values) {
        return fetch(CtmsCompanyRequest.CTMS_COMPANY_REQUEST.COMPANY_GRP_ID, values);
    }

    /**
     * Fetch records that have <code>BR_NUMBER IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCompanyRequest> fetchByBrNumber(String... values) {
        return fetch(CtmsCompanyRequest.CTMS_COMPANY_REQUEST.BR_NUMBER, values);
    }

    /**
     * Fetch records that have <code>ADDRESS IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCompanyRequest> fetchByAddress(String... values) {
        return fetch(CtmsCompanyRequest.CTMS_COMPANY_REQUEST.ADDRESS, values);
    }

    /**
     * Fetch records that have <code>PHONE_NUMBER IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCompanyRequest> fetchByPhoneNumber(String... values) {
        return fetch(CtmsCompanyRequest.CTMS_COMPANY_REQUEST.PHONE_NUMBER, values);
    }

    /**
     * Fetch records that have <code>REMARKS IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCompanyRequest> fetchByRemarks(String... values) {
        return fetch(CtmsCompanyRequest.CTMS_COMPANY_REQUEST.REMARKS, values);
    }

    /**
     * Fetch records that have <code>STATUS IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCompanyRequest> fetchByStatus(String... values) {
        return fetch(CtmsCompanyRequest.CTMS_COMPANY_REQUEST.STATUS, values);
    }

    /**
     * Fetch records that have <code>IS_ARCHIVED IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCompanyRequest> fetchByIsArchived(Byte... values) {
        return fetch(CtmsCompanyRequest.CTMS_COMPANY_REQUEST.IS_ARCHIVED, values);
    }

    /**
     * Fetch records that have <code>REQUESTED_BY IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCompanyRequest> fetchByRequestedBy(String... values) {
        return fetch(CtmsCompanyRequest.CTMS_COMPANY_REQUEST.REQUESTED_BY, values);
    }

    /**
     * Fetch records that have <code>REQUESTED_AT IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCompanyRequest> fetchByRequestedAt(Timestamp... values) {
        return fetch(CtmsCompanyRequest.CTMS_COMPANY_REQUEST.REQUESTED_AT, values);
    }

    /**
     * Fetch records that have <code>CTO_REMARKS IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCompanyRequest> fetchByCtoRemarks(String... values) {
        return fetch(CtmsCompanyRequest.CTMS_COMPANY_REQUEST.CTO_REMARKS, values);
    }

    /**
     * Fetch records that have <code>CTO_REVIEWED_BY IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCompanyRequest> fetchByCtoReviewedBy(String... values) {
        return fetch(CtmsCompanyRequest.CTMS_COMPANY_REQUEST.CTO_REVIEWED_BY, values);
    }

    /**
     * Fetch records that have <code>CTO_REVIEWED_AT IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCompanyRequest> fetchByCtoReviewedAt(Timestamp... values) {
        return fetch(CtmsCompanyRequest.CTMS_COMPANY_REQUEST.CTO_REVIEWED_AT, values);
    }

    /**
     * Fetch records that have <code>LSD_REMARKS IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCompanyRequest> fetchByLsdRemarks(String... values) {
        return fetch(CtmsCompanyRequest.CTMS_COMPANY_REQUEST.LSD_REMARKS, values);
    }

    /**
     * Fetch records that have <code>LSD_REVIEWED_BY IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCompanyRequest> fetchByLsdReviewedBy(String... values) {
        return fetch(CtmsCompanyRequest.CTMS_COMPANY_REQUEST.LSD_REVIEWED_BY, values);
    }

    /**
     * Fetch records that have <code>LSD_REVIEWED_AT IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCompanyRequest> fetchByLsdReviewedAt(Timestamp... values) {
        return fetch(CtmsCompanyRequest.CTMS_COMPANY_REQUEST.LSD_REVIEWED_AT, values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCompanyRequest> fetchByCreatedAt(Timestamp... values) {
        return fetch(CtmsCompanyRequest.CTMS_COMPANY_REQUEST.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCompanyRequest> fetchByUpdatedBy(String... values) {
        return fetch(CtmsCompanyRequest.CTMS_COMPANY_REQUEST.UPDATED_BY, values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code>
     */
    public List<com.test.springboot.jooq.data.jooq.tables.pojos.CtmsCompanyRequest> fetchByUpdatedAt(Timestamp... values) {
        return fetch(CtmsCompanyRequest.CTMS_COMPANY_REQUEST.UPDATED_AT, values);
    }
}
