/*
 * This file is generated by jOOQ.
*/
package com.test.springboot.jooq.data.jooq.tables;


import com.test.springboot.jooq.data.jooq.Indexes;
import com.test.springboot.jooq.data.jooq.Keys;
import com.test.springboot.jooq.data.jooq.Public;
import com.test.springboot.jooq.data.jooq.tables.records.CtmsCtFormOtherPtyRecord;

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
public class CtmsCtFormOtherPty extends TableImpl<CtmsCtFormOtherPtyRecord> {

    private static final long serialVersionUID = 978810397;

    /**
     * The reference instance of <code>PUBLIC.CTMS_CT_FORM_OTHER_PTY</code>
     */
    public static final CtmsCtFormOtherPty CTMS_CT_FORM_OTHER_PTY = new CtmsCtFormOtherPty();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CtmsCtFormOtherPtyRecord> getRecordType() {
        return CtmsCtFormOtherPtyRecord.class;
    }

    /**
     * The column <code>PUBLIC.CTMS_CT_FORM_OTHER_PTY.ID</code>.
     */
    public final TableField<CtmsCtFormOtherPtyRecord, BigInteger> ID = createField("ID", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(20).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.CTMS_CT_FORM_OTHER_PTY.CT_FORM_ID</code>.
     */
    public final TableField<CtmsCtFormOtherPtyRecord, BigInteger> CT_FORM_ID = createField("CT_FORM_ID", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(20), this, "");

    /**
     * The column <code>PUBLIC.CTMS_CT_FORM_OTHER_PTY.COMPANY_NAME</code>.
     */
    public final TableField<CtmsCtFormOtherPtyRecord, String> COMPANY_NAME = createField("COMPANY_NAME", org.jooq.impl.SQLDataType.VARCHAR(1000), this, "");

    /**
     * Create a <code>PUBLIC.CTMS_CT_FORM_OTHER_PTY</code> table reference
     */
    public CtmsCtFormOtherPty() {
        this(DSL.name("CTMS_CT_FORM_OTHER_PTY"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.CTMS_CT_FORM_OTHER_PTY</code> table reference
     */
    public CtmsCtFormOtherPty(String alias) {
        this(DSL.name(alias), CTMS_CT_FORM_OTHER_PTY);
    }

    /**
     * Create an aliased <code>PUBLIC.CTMS_CT_FORM_OTHER_PTY</code> table reference
     */
    public CtmsCtFormOtherPty(Name alias) {
        this(alias, CTMS_CT_FORM_OTHER_PTY);
    }

    private CtmsCtFormOtherPty(Name alias, Table<CtmsCtFormOtherPtyRecord> aliased) {
        this(alias, aliased, null);
    }

    private CtmsCtFormOtherPty(Name alias, Table<CtmsCtFormOtherPtyRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.CTMS_CT_FORM_OTHER_PTY_U01_INDEX_9, Indexes.PRIMARY_KEY_9);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CtmsCtFormOtherPtyRecord> getPrimaryKey() {
        return Keys.CTMS_CT_FORM_OTHER_PTY_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CtmsCtFormOtherPtyRecord>> getKeys() {
        return Arrays.<UniqueKey<CtmsCtFormOtherPtyRecord>>asList(Keys.CTMS_CT_FORM_OTHER_PTY_PK, Keys.CTMS_CT_FORM_OTHER_PTY_U01);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsCtFormOtherPty as(String alias) {
        return new CtmsCtFormOtherPty(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsCtFormOtherPty as(Name alias) {
        return new CtmsCtFormOtherPty(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CtmsCtFormOtherPty rename(String name) {
        return new CtmsCtFormOtherPty(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CtmsCtFormOtherPty rename(Name name) {
        return new CtmsCtFormOtherPty(name, null);
    }
}
