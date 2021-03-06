/*
 * This file is generated by jOOQ.
*/
package com.test.springboot.jooq.data.jooq.tables;


import com.test.springboot.jooq.data.jooq.Public;
import com.test.springboot.jooq.data.jooq.tables.records.CityRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class City extends TableImpl<CityRecord> {

    private static final long serialVersionUID = 1892085091;

    /**
     * The reference instance of <code>PUBLIC.CITY</code>
     */
    public static final City CITY = new City();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CityRecord> getRecordType() {
        return CityRecord.class;
    }

    /**
     * The column <code>PUBLIC.CITY.CITY_CODE</code>.
     */
    public final TableField<CityRecord, String> CITY_CODE = createField("CITY_CODE", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>PUBLIC.CITY.NAME</code>.
     */
    public final TableField<CityRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * Create a <code>PUBLIC.CITY</code> table reference
     */
    public City() {
        this(DSL.name("CITY"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.CITY</code> table reference
     */
    public City(String alias) {
        this(DSL.name(alias), CITY);
    }

    /**
     * Create an aliased <code>PUBLIC.CITY</code> table reference
     */
    public City(Name alias) {
        this(alias, CITY);
    }

    private City(Name alias, Table<CityRecord> aliased) {
        this(alias, aliased, null);
    }

    private City(Name alias, Table<CityRecord> aliased, Field<?>[] parameters) {
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
    public City as(String alias) {
        return new City(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public City as(Name alias) {
        return new City(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public City rename(String name) {
        return new City(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public City rename(Name name) {
        return new City(name, null);
    }
}
