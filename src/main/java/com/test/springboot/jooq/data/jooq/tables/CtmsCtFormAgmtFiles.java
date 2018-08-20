/*
 * This file is generated by jOOQ.
*/
package com.test.springboot.jooq.data.jooq.tables;


import com.test.springboot.jooq.data.jooq.Indexes;
import com.test.springboot.jooq.data.jooq.Keys;
import com.test.springboot.jooq.data.jooq.Public;
import com.test.springboot.jooq.data.jooq.tables.records.CtmsCtFormAgmtFilesRecord;

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
public class CtmsCtFormAgmtFiles extends TableImpl<CtmsCtFormAgmtFilesRecord> {

    private static final long serialVersionUID = 225530131;

    /**
     * The reference instance of <code>PUBLIC.CTMS_CT_FORM_AGMT_FILES</code>
     */
    public static final CtmsCtFormAgmtFiles CTMS_CT_FORM_AGMT_FILES = new CtmsCtFormAgmtFiles();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CtmsCtFormAgmtFilesRecord> getRecordType() {
        return CtmsCtFormAgmtFilesRecord.class;
    }

    /**
     * The column <code>PUBLIC.CTMS_CT_FORM_AGMT_FILES.ID</code>.
     */
    public final TableField<CtmsCtFormAgmtFilesRecord, BigInteger> ID = createField("ID", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(20).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.CTMS_CT_FORM_AGMT_FILES.CT_FORM_ID</code>.
     */
    public final TableField<CtmsCtFormAgmtFilesRecord, BigInteger> CT_FORM_ID = createField("CT_FORM_ID", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(20).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.CTMS_CT_FORM_AGMT_FILES.NAME</code>.
     */
    public final TableField<CtmsCtFormAgmtFilesRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>PUBLIC.CTMS_CT_FORM_AGMT_FILES.CONTENT</code>.
     */
    public final TableField<CtmsCtFormAgmtFilesRecord, byte[]> CONTENT = createField("CONTENT", org.jooq.impl.SQLDataType.BLOB, this, "");

    /**
     * Create a <code>PUBLIC.CTMS_CT_FORM_AGMT_FILES</code> table reference
     */
    public CtmsCtFormAgmtFiles() {
        this(DSL.name("CTMS_CT_FORM_AGMT_FILES"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.CTMS_CT_FORM_AGMT_FILES</code> table reference
     */
    public CtmsCtFormAgmtFiles(String alias) {
        this(DSL.name(alias), CTMS_CT_FORM_AGMT_FILES);
    }

    /**
     * Create an aliased <code>PUBLIC.CTMS_CT_FORM_AGMT_FILES</code> table reference
     */
    public CtmsCtFormAgmtFiles(Name alias) {
        this(alias, CTMS_CT_FORM_AGMT_FILES);
    }

    private CtmsCtFormAgmtFiles(Name alias, Table<CtmsCtFormAgmtFilesRecord> aliased) {
        this(alias, aliased, null);
    }

    private CtmsCtFormAgmtFiles(Name alias, Table<CtmsCtFormAgmtFilesRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.PRIMARY_KEY_65);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CtmsCtFormAgmtFilesRecord> getPrimaryKey() {
        return Keys.CTMS_CT_FORM_AGMT_FILES_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CtmsCtFormAgmtFilesRecord>> getKeys() {
        return Arrays.<UniqueKey<CtmsCtFormAgmtFilesRecord>>asList(Keys.CTMS_CT_FORM_AGMT_FILES_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsCtFormAgmtFiles as(String alias) {
        return new CtmsCtFormAgmtFiles(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsCtFormAgmtFiles as(Name alias) {
        return new CtmsCtFormAgmtFiles(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CtmsCtFormAgmtFiles rename(String name) {
        return new CtmsCtFormAgmtFiles(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CtmsCtFormAgmtFiles rename(Name name) {
        return new CtmsCtFormAgmtFiles(name, null);
    }
}
