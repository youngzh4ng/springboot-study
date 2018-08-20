/*
 * This file is generated by jOOQ.
*/
package com.test.springboot.jooq.data.jooq.tables;


import com.test.springboot.jooq.data.jooq.Indexes;
import com.test.springboot.jooq.data.jooq.Keys;
import com.test.springboot.jooq.data.jooq.Public;
import com.test.springboot.jooq.data.jooq.tables.records.CtmsCompanyCatRecord;

import java.math.BigInteger;
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
public class CtmsCompanyCat extends TableImpl<CtmsCompanyCatRecord> {

    private static final long serialVersionUID = 1220920353;

    /**
     * The reference instance of <code>PUBLIC.CTMS_COMPANY_CAT</code>
     */
    public static final CtmsCompanyCat CTMS_COMPANY_CAT = new CtmsCompanyCat();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CtmsCompanyCatRecord> getRecordType() {
        return CtmsCompanyCatRecord.class;
    }

    /**
     * The column <code>PUBLIC.CTMS_COMPANY_CAT.ID</code>.
     */
    public final TableField<CtmsCompanyCatRecord, BigInteger> ID = createField("ID", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(20).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.CTMS_COMPANY_CAT.CODE</code>.
     */
    public final TableField<CtmsCompanyCatRecord, String> CODE = createField("CODE", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>PUBLIC.CTMS_COMPANY_CAT.NAME</code>.
     */
    public final TableField<CtmsCompanyCatRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>PUBLIC.CTMS_COMPANY_CAT</code> table reference
     */
    public CtmsCompanyCat() {
        this(DSL.name("CTMS_COMPANY_CAT"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.CTMS_COMPANY_CAT</code> table reference
     */
    public CtmsCompanyCat(String alias) {
        this(DSL.name(alias), CTMS_COMPANY_CAT);
    }

    /**
     * Create an aliased <code>PUBLIC.CTMS_COMPANY_CAT</code> table reference
     */
    public CtmsCompanyCat(Name alias) {
        this(alias, CTMS_COMPANY_CAT);
    }

    private CtmsCompanyCat(Name alias, Table<CtmsCompanyCatRecord> aliased) {
        this(alias, aliased, null);
    }

    private CtmsCompanyCat(Name alias, Table<CtmsCompanyCatRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.CTMS_COMPANY_CAT_U01_INDEX_6, Indexes.PRIMARY_KEY_66);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CtmsCompanyCatRecord> getPrimaryKey() {
        return Keys.CTMS_COMPANY_CAT_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CtmsCompanyCatRecord>> getKeys() {
        return Arrays.<UniqueKey<CtmsCompanyCatRecord>>asList(Keys.CTMS_COMPANY_CAT_PK, Keys.CTMS_COMPANY_CAT_U01);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsCompanyCat as(String alias) {
        return new CtmsCompanyCat(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsCompanyCat as(Name alias) {
        return new CtmsCompanyCat(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CtmsCompanyCat rename(String name) {
        return new CtmsCompanyCat(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CtmsCompanyCat rename(Name name) {
        return new CtmsCompanyCat(name, null);
    }
}
