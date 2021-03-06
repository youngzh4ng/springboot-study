/*
 * This file is generated by jOOQ.
*/
package com.test.springboot.jooq.data.jooq.tables;


import com.test.springboot.jooq.data.jooq.Indexes;
import com.test.springboot.jooq.data.jooq.Keys;
import com.test.springboot.jooq.data.jooq.Public;
import com.test.springboot.jooq.data.jooq.tables.records.CtmsCompanyRecord;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class CtmsCompany extends TableImpl<CtmsCompanyRecord> {

    private static final long serialVersionUID = 328973180;

    /**
     * The reference instance of <code>PUBLIC.CTMS_COMPANY</code>
     */
    public static final CtmsCompany CTMS_COMPANY = new CtmsCompany();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CtmsCompanyRecord> getRecordType() {
        return CtmsCompanyRecord.class;
    }

    /**
     * The column <code>PUBLIC.CTMS_COMPANY.ID</code>.
     */
    public final TableField<CtmsCompanyRecord, BigInteger> ID = createField("ID", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(20).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.CTMS_COMPANY.CODE</code>.
     */
    public final TableField<CtmsCompanyRecord, String> CODE = createField("CODE", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>PUBLIC.CTMS_COMPANY.ENGLISH_NAME</code>.
     */
    public final TableField<CtmsCompanyRecord, String> ENGLISH_NAME = createField("ENGLISH_NAME", org.jooq.impl.SQLDataType.VARCHAR(1000), this, "");

    /**
     * The column <code>PUBLIC.CTMS_COMPANY.CHINESE_NAME</code>.
     */
    public final TableField<CtmsCompanyRecord, String> CHINESE_NAME = createField("CHINESE_NAME", org.jooq.impl.SQLDataType.VARCHAR(1000), this, "");

    /**
     * The column <code>PUBLIC.CTMS_COMPANY.COMPANY_CAT_ID</code>.
     */
    public final TableField<CtmsCompanyRecord, BigInteger> COMPANY_CAT_ID = createField("COMPANY_CAT_ID", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(20), this, "");

    /**
     * The column <code>PUBLIC.CTMS_COMPANY.BR_NUMBER</code>.
     */
    public final TableField<CtmsCompanyRecord, String> BR_NUMBER = createField("BR_NUMBER", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>PUBLIC.CTMS_COMPANY.ADDRESS</code>.
     */
    public final TableField<CtmsCompanyRecord, String> ADDRESS = createField("ADDRESS", org.jooq.impl.SQLDataType.VARCHAR(1000), this, "");

    /**
     * The column <code>PUBLIC.CTMS_COMPANY.PHONE_NUMBER</code>.
     */
    public final TableField<CtmsCompanyRecord, String> PHONE_NUMBER = createField("PHONE_NUMBER", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>PUBLIC.CTMS_COMPANY.STATUS</code>.
     */
    public final TableField<CtmsCompanyRecord, String> STATUS = createField("STATUS", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>PUBLIC.CTMS_COMPANY.COMPANY_GRP_ID</code>.
     */
    public final TableField<CtmsCompanyRecord, BigInteger> COMPANY_GRP_ID = createField("COMPANY_GRP_ID", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(20), this, "");

    /**
     * The column <code>PUBLIC.CTMS_COMPANY.REQUESTED_BY</code>.
     */
    public final TableField<CtmsCompanyRecord, String> REQUESTED_BY = createField("REQUESTED_BY", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>PUBLIC.CTMS_COMPANY.REQUESTED_AT</code>.
     */
    public final TableField<CtmsCompanyRecord, Timestamp> REQUESTED_AT = createField("REQUESTED_AT", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>PUBLIC.CTMS_COMPANY.REMARKS</code>.
     */
    public final TableField<CtmsCompanyRecord, String> REMARKS = createField("REMARKS", org.jooq.impl.SQLDataType.VARCHAR(1000), this, "");

    /**
     * The column <code>PUBLIC.CTMS_COMPANY.CTO_REMARKS</code>.
     */
    public final TableField<CtmsCompanyRecord, String> CTO_REMARKS = createField("CTO_REMARKS", org.jooq.impl.SQLDataType.VARCHAR(4000), this, "");

    /**
     * The column <code>PUBLIC.CTMS_COMPANY.CTO_REVIEWED_BY</code>.
     */
    public final TableField<CtmsCompanyRecord, String> CTO_REVIEWED_BY = createField("CTO_REVIEWED_BY", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>PUBLIC.CTMS_COMPANY.CTO_REVIEWED_AT</code>.
     */
    public final TableField<CtmsCompanyRecord, Timestamp> CTO_REVIEWED_AT = createField("CTO_REVIEWED_AT", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>PUBLIC.CTMS_COMPANY.LSD_REMARKS</code>.
     */
    public final TableField<CtmsCompanyRecord, String> LSD_REMARKS = createField("LSD_REMARKS", org.jooq.impl.SQLDataType.VARCHAR(4000), this, "");

    /**
     * The column <code>PUBLIC.CTMS_COMPANY.LSD_REVIEWED_BY</code>.
     */
    public final TableField<CtmsCompanyRecord, String> LSD_REVIEWED_BY = createField("LSD_REVIEWED_BY", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>PUBLIC.CTMS_COMPANY.LSD_REVIEWED_AT</code>.
     */
    public final TableField<CtmsCompanyRecord, Timestamp> LSD_REVIEWED_AT = createField("LSD_REVIEWED_AT", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>PUBLIC.CTMS_COMPANY.UPDATED_BY</code>.
     */
    public final TableField<CtmsCompanyRecord, String> UPDATED_BY = createField("UPDATED_BY", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>PUBLIC.CTMS_COMPANY.UPDATED_AT</code>.
     */
    public final TableField<CtmsCompanyRecord, Timestamp> UPDATED_AT = createField("UPDATED_AT", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>PUBLIC.CTMS_COMPANY.CREATED_BY</code>.
     */
    public final TableField<CtmsCompanyRecord, String> CREATED_BY = createField("CREATED_BY", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>PUBLIC.CTMS_COMPANY.CREATED_AT</code>.
     */
    public final TableField<CtmsCompanyRecord, Timestamp> CREATED_AT = createField("CREATED_AT", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>PUBLIC.CTMS_COMPANY</code> table reference
     */
    public CtmsCompany() {
        this(DSL.name("CTMS_COMPANY"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.CTMS_COMPANY</code> table reference
     */
    public CtmsCompany(String alias) {
        this(DSL.name(alias), CTMS_COMPANY);
    }

    /**
     * Create an aliased <code>PUBLIC.CTMS_COMPANY</code> table reference
     */
    public CtmsCompany(Name alias) {
        this(alias, CTMS_COMPANY);
    }

    private CtmsCompany(Name alias, Table<CtmsCompanyRecord> aliased) {
        this(alias, aliased, null);
    }

    private CtmsCompany(Name alias, Table<CtmsCompanyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CTMS_COMPANY_U01_INDEX_5, Indexes.PRIMARY_KEY_5);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CtmsCompanyRecord> getPrimaryKey() {
        return Keys.CTMS_COMPANY_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CtmsCompanyRecord>> getKeys() {
        return Arrays.<UniqueKey<CtmsCompanyRecord>>asList(Keys.CTMS_COMPANY_PK, Keys.CTMS_COMPANY_U01);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsCompany as(String alias) {
        return new CtmsCompany(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsCompany as(Name alias) {
        return new CtmsCompany(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CtmsCompany rename(String name) {
        return new CtmsCompany(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CtmsCompany rename(Name name) {
        return new CtmsCompany(name, null);
    }
}
