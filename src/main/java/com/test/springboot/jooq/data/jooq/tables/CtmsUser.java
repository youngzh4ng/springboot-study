/*
 * This file is generated by jOOQ.
*/
package com.test.springboot.jooq.data.jooq.tables;


import com.test.springboot.jooq.data.jooq.Indexes;
import com.test.springboot.jooq.data.jooq.Keys;
import com.test.springboot.jooq.data.jooq.Public;
import com.test.springboot.jooq.data.jooq.tables.records.CtmsUserRecord;

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
public class CtmsUser extends TableImpl<CtmsUserRecord> {

    private static final long serialVersionUID = 2055783338;

    /**
     * The reference instance of <code>PUBLIC.CTMS_USER</code>
     */
    public static final CtmsUser CTMS_USER = new CtmsUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CtmsUserRecord> getRecordType() {
        return CtmsUserRecord.class;
    }

    /**
     * The column <code>PUBLIC.CTMS_USER.ID</code>.
     */
    public final TableField<CtmsUserRecord, BigInteger> ID = createField("ID", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(20).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.CTMS_USER.LOGIN_ID</code>.
     */
    public final TableField<CtmsUserRecord, String> LOGIN_ID = createField("LOGIN_ID", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>PUBLIC.CTMS_USER.EMAIL</code>.
     */
    public final TableField<CtmsUserRecord, String> EMAIL = createField("EMAIL", org.jooq.impl.SQLDataType.VARCHAR(300), this, "");

    /**
     * The column <code>PUBLIC.CTMS_USER.IS_SUBMITTER</code>.
     */
    public final TableField<CtmsUserRecord, Byte> IS_SUBMITTER = createField("IS_SUBMITTER", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>PUBLIC.CTMS_USER.IS_CTO</code>.
     */
    public final TableField<CtmsUserRecord, Byte> IS_CTO = createField("IS_CTO", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>PUBLIC.CTMS_USER.IS_LSD</code>.
     */
    public final TableField<CtmsUserRecord, Byte> IS_LSD = createField("IS_LSD", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>PUBLIC.CTMS_USER.IS_ADMIN</code>.
     */
    public final TableField<CtmsUserRecord, Byte> IS_ADMIN = createField("IS_ADMIN", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>PUBLIC.CTMS_USER.UPDATED_BY</code>.
     */
    public final TableField<CtmsUserRecord, String> UPDATED_BY = createField("UPDATED_BY", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>PUBLIC.CTMS_USER.UPDATED_AT</code>.
     */
    public final TableField<CtmsUserRecord, Timestamp> UPDATED_AT = createField("UPDATED_AT", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>PUBLIC.CTMS_USER</code> table reference
     */
    public CtmsUser() {
        this(DSL.name("CTMS_USER"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.CTMS_USER</code> table reference
     */
    public CtmsUser(String alias) {
        this(DSL.name(alias), CTMS_USER);
    }

    /**
     * Create an aliased <code>PUBLIC.CTMS_USER</code> table reference
     */
    public CtmsUser(Name alias) {
        this(alias, CTMS_USER);
    }

    private CtmsUser(Name alias, Table<CtmsUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private CtmsUser(Name alias, Table<CtmsUserRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.CTMS_USERS_U01_INDEX_6, Indexes.PRIMARY_KEY_60);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CtmsUserRecord> getPrimaryKey() {
        return Keys.CTMS_USERS_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CtmsUserRecord>> getKeys() {
        return Arrays.<UniqueKey<CtmsUserRecord>>asList(Keys.CTMS_USERS_PK, Keys.CTMS_USERS_U01);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsUser as(String alias) {
        return new CtmsUser(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtmsUser as(Name alias) {
        return new CtmsUser(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CtmsUser rename(String name) {
        return new CtmsUser(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CtmsUser rename(Name name) {
        return new CtmsUser(name, null);
    }
}
