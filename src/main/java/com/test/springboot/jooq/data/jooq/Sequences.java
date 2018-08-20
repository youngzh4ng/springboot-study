/*
 * This file is generated by jOOQ.
*/
package com.test.springboot.jooq.data.jooq;


import javax.annotation.Generated;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;


/**
 * Convenience access to all sequences in PUBLIC
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>PUBLIC.CTMS_AUDIT_CHECKLIST_ID_SEQ</code>
     */
    public static final Sequence<Long> CTMS_AUDIT_CHECKLIST_ID_SEQ = new SequenceImpl<Long>("CTMS_AUDIT_CHECKLIST_ID_SEQ", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT);

    /**
     * The sequence <code>PUBLIC.CTMS_COMPANY_CAT_ID_SEQ</code>
     */
    public static final Sequence<Long> CTMS_COMPANY_CAT_ID_SEQ = new SequenceImpl<Long>("CTMS_COMPANY_CAT_ID_SEQ", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT);

    /**
     * The sequence <code>PUBLIC.CTMS_COMPANY_GRP_ID_SEQ</code>
     */
    public static final Sequence<Long> CTMS_COMPANY_GRP_ID_SEQ = new SequenceImpl<Long>("CTMS_COMPANY_GRP_ID_SEQ", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT);

    /**
     * The sequence <code>PUBLIC.CTMS_COMPANY_HOLDER_ID_SEQ</code>
     */
    public static final Sequence<Long> CTMS_COMPANY_HOLDER_ID_SEQ = new SequenceImpl<Long>("CTMS_COMPANY_HOLDER_ID_SEQ", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT);

    /**
     * The sequence <code>PUBLIC.CTMS_COMPANY_ID_SEQ</code>
     */
    public static final Sequence<Long> CTMS_COMPANY_ID_SEQ = new SequenceImpl<Long>("CTMS_COMPANY_ID_SEQ", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT);

    /**
     * The sequence <code>PUBLIC.CTMS_COMPANY_NAME_ID_SEQ</code>
     */
    public static final Sequence<Long> CTMS_COMPANY_NAME_ID_SEQ = new SequenceImpl<Long>("CTMS_COMPANY_NAME_ID_SEQ", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT);

    /**
     * The sequence <code>PUBLIC.CTMS_COMPANY_REQUEST_ID_SEQ</code>
     */
    public static final Sequence<Long> CTMS_COMPANY_REQUEST_ID_SEQ = new SequenceImpl<Long>("CTMS_COMPANY_REQUEST_ID_SEQ", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT);

    /**
     * The sequence <code>PUBLIC.CTMS_CT_FORM_AGMT_FILES_ID_SEQ</code>
     */
    public static final Sequence<Long> CTMS_CT_FORM_AGMT_FILES_ID_SEQ = new SequenceImpl<Long>("CTMS_CT_FORM_AGMT_FILES_ID_SEQ", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT);

    /**
     * The sequence <code>PUBLIC.CTMS_CT_FORM_ID_SEQ</code>
     */
    public static final Sequence<Long> CTMS_CT_FORM_ID_SEQ = new SequenceImpl<Long>("CTMS_CT_FORM_ID_SEQ", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT);

    /**
     * The sequence <code>PUBLIC.CTMS_CT_FORM_OTHER_PTY_ID_SEQ</code>
     */
    public static final Sequence<Long> CTMS_CT_FORM_OTHER_PTY_ID_SEQ = new SequenceImpl<Long>("CTMS_CT_FORM_OTHER_PTY_ID_SEQ", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT);

    /**
     * The sequence <code>PUBLIC.CTMS_CT_FORM_PTY_ID_SEQ</code>
     */
    public static final Sequence<Long> CTMS_CT_FORM_PTY_ID_SEQ = new SequenceImpl<Long>("CTMS_CT_FORM_PTY_ID_SEQ", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT);

    /**
     * The sequence <code>PUBLIC.CTMS_CT_FORM_SERVICE_ID_SEQ</code>
     */
    public static final Sequence<Long> CTMS_CT_FORM_SERVICE_ID_SEQ = new SequenceImpl<Long>("CTMS_CT_FORM_SERVICE_ID_SEQ", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT);

    /**
     * The sequence <code>PUBLIC.CTMS_USER_GROUP_ID_SEQ</code>
     */
    public static final Sequence<Long> CTMS_USER_GROUP_ID_SEQ = new SequenceImpl<Long>("CTMS_USER_GROUP_ID_SEQ", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT);

    /**
     * The sequence <code>PUBLIC.CTMS_USER_ID_SEQ</code>
     */
    public static final Sequence<Long> CTMS_USER_ID_SEQ = new SequenceImpl<Long>("CTMS_USER_ID_SEQ", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT);

    /**
     * The sequence <code>PUBLIC.HIBERNATE_SEQUENCE</code>
     */
    public static final Sequence<Long> HIBERNATE_SEQUENCE = new SequenceImpl<Long>("HIBERNATE_SEQUENCE", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT);
}
