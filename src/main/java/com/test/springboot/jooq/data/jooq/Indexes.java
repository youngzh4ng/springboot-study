/*
 * This file is generated by jOOQ.
*/
package com.test.springboot.jooq.data.jooq;


import com.test.springboot.jooq.data.jooq.tables.CtmsAuditChecklist;
import com.test.springboot.jooq.data.jooq.tables.CtmsCompany;
import com.test.springboot.jooq.data.jooq.tables.CtmsCompanyCat;
import com.test.springboot.jooq.data.jooq.tables.CtmsCompanyGrp;
import com.test.springboot.jooq.data.jooq.tables.CtmsCompanyHolder;
import com.test.springboot.jooq.data.jooq.tables.CtmsCompanyName;
import com.test.springboot.jooq.data.jooq.tables.CtmsCompanyRequest;
import com.test.springboot.jooq.data.jooq.tables.CtmsCtForm;
import com.test.springboot.jooq.data.jooq.tables.CtmsCtFormAgmtFiles;
import com.test.springboot.jooq.data.jooq.tables.CtmsCtFormOtherPty;
import com.test.springboot.jooq.data.jooq.tables.CtmsCtFormPty;
import com.test.springboot.jooq.data.jooq.tables.CtmsCtFormService;
import com.test.springboot.jooq.data.jooq.tables.CtmsReportGrpHier;
import com.test.springboot.jooq.data.jooq.tables.CtmsUser;
import com.test.springboot.jooq.data.jooq.tables.CtmsUserGroup;
import com.test.springboot.jooq.data.jooq.tables.CtmsUserPreference;
import com.test.springboot.jooq.data.jooq.tables.TestUser;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>PUBLIC</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index PRIMARY_KEY_B = Indexes0.PRIMARY_KEY_B;
    public static final Index CTMS_COMPANY_U01_INDEX_5 = Indexes0.CTMS_COMPANY_U01_INDEX_5;
    public static final Index PRIMARY_KEY_5 = Indexes0.PRIMARY_KEY_5;
    public static final Index CTMS_COMPANY_CAT_U01_INDEX_6 = Indexes0.CTMS_COMPANY_CAT_U01_INDEX_6;
    public static final Index PRIMARY_KEY_66 = Indexes0.PRIMARY_KEY_66;
    public static final Index CTMS_COMPANY_GRP_U01_INDEX_6 = Indexes0.CTMS_COMPANY_GRP_U01_INDEX_6;
    public static final Index PRIMARY_KEY_6 = Indexes0.PRIMARY_KEY_6;
    public static final Index PRIMARY_KEY_1 = Indexes0.PRIMARY_KEY_1;
    public static final Index PRIMARY_KEY_C = Indexes0.PRIMARY_KEY_C;
    public static final Index PRIMARY_KEY_3 = Indexes0.PRIMARY_KEY_3;
    public static final Index PRIMARY_KEY_64 = Indexes0.PRIMARY_KEY_64;
    public static final Index PRIMARY_KEY_65 = Indexes0.PRIMARY_KEY_65;
    public static final Index CTMS_CT_FORM_OTHER_PTY_U01_INDEX_9 = Indexes0.CTMS_CT_FORM_OTHER_PTY_U01_INDEX_9;
    public static final Index PRIMARY_KEY_9 = Indexes0.PRIMARY_KEY_9;
    public static final Index CTMS_CT_FORM_PTY_U01_INDEX_1 = Indexes0.CTMS_CT_FORM_PTY_U01_INDEX_1;
    public static final Index PRIMARY_KEY_14 = Indexes0.PRIMARY_KEY_14;
    public static final Index CTMS_CT_FORM_SERVICE_U01_INDEX_4 = Indexes0.CTMS_CT_FORM_SERVICE_U01_INDEX_4;
    public static final Index PRIMARY_KEY_4 = Indexes0.PRIMARY_KEY_4;
    public static final Index CTMS_REPORT_GRP_HIER_U01_INDEX_D = Indexes0.CTMS_REPORT_GRP_HIER_U01_INDEX_D;
    public static final Index PRIMARY_KEY_D = Indexes0.PRIMARY_KEY_D;
    public static final Index CTMS_USERS_U01_INDEX_6 = Indexes0.CTMS_USERS_U01_INDEX_6;
    public static final Index PRIMARY_KEY_60 = Indexes0.PRIMARY_KEY_60;
    public static final Index PRIMARY_KEY_E = Indexes0.PRIMARY_KEY_E;
    public static final Index PRIMARY_KEY_EF = Indexes0.PRIMARY_KEY_EF;
    public static final Index PRIMARY_KEY_61 = Indexes0.PRIMARY_KEY_61;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index PRIMARY_KEY_B = Internal.createIndex("PRIMARY_KEY_B", CtmsAuditChecklist.CTMS_AUDIT_CHECKLIST, new OrderField[] { CtmsAuditChecklist.CTMS_AUDIT_CHECKLIST.ID }, true);
        public static Index CTMS_COMPANY_U01_INDEX_5 = Internal.createIndex("CTMS_COMPANY_U01_INDEX_5", CtmsCompany.CTMS_COMPANY, new OrderField[] { CtmsCompany.CTMS_COMPANY.CODE }, true);
        public static Index PRIMARY_KEY_5 = Internal.createIndex("PRIMARY_KEY_5", CtmsCompany.CTMS_COMPANY, new OrderField[] { CtmsCompany.CTMS_COMPANY.ID }, true);
        public static Index CTMS_COMPANY_CAT_U01_INDEX_6 = Internal.createIndex("CTMS_COMPANY_CAT_U01_INDEX_6", CtmsCompanyCat.CTMS_COMPANY_CAT, new OrderField[] { CtmsCompanyCat.CTMS_COMPANY_CAT.CODE }, true);
        public static Index PRIMARY_KEY_66 = Internal.createIndex("PRIMARY_KEY_66", CtmsCompanyCat.CTMS_COMPANY_CAT, new OrderField[] { CtmsCompanyCat.CTMS_COMPANY_CAT.ID }, true);
        public static Index CTMS_COMPANY_GRP_U01_INDEX_6 = Internal.createIndex("CTMS_COMPANY_GRP_U01_INDEX_6", CtmsCompanyGrp.CTMS_COMPANY_GRP, new OrderField[] { CtmsCompanyGrp.CTMS_COMPANY_GRP.CODE }, true);
        public static Index PRIMARY_KEY_6 = Internal.createIndex("PRIMARY_KEY_6", CtmsCompanyGrp.CTMS_COMPANY_GRP, new OrderField[] { CtmsCompanyGrp.CTMS_COMPANY_GRP.ID }, true);
        public static Index PRIMARY_KEY_1 = Internal.createIndex("PRIMARY_KEY_1", CtmsCompanyHolder.CTMS_COMPANY_HOLDER, new OrderField[] { CtmsCompanyHolder.CTMS_COMPANY_HOLDER.ID }, true);
        public static Index PRIMARY_KEY_C = Internal.createIndex("PRIMARY_KEY_C", CtmsCompanyName.CTMS_COMPANY_NAME, new OrderField[] { CtmsCompanyName.CTMS_COMPANY_NAME.ID }, true);
        public static Index PRIMARY_KEY_3 = Internal.createIndex("PRIMARY_KEY_3", CtmsCompanyRequest.CTMS_COMPANY_REQUEST, new OrderField[] { CtmsCompanyRequest.CTMS_COMPANY_REQUEST.ID }, true);
        public static Index PRIMARY_KEY_64 = Internal.createIndex("PRIMARY_KEY_64", CtmsCtForm.CTMS_CT_FORM, new OrderField[] { CtmsCtForm.CTMS_CT_FORM.ID }, true);
        public static Index PRIMARY_KEY_65 = Internal.createIndex("PRIMARY_KEY_65", CtmsCtFormAgmtFiles.CTMS_CT_FORM_AGMT_FILES, new OrderField[] { CtmsCtFormAgmtFiles.CTMS_CT_FORM_AGMT_FILES.CT_FORM_ID, CtmsCtFormAgmtFiles.CTMS_CT_FORM_AGMT_FILES.ID }, true);
        public static Index CTMS_CT_FORM_OTHER_PTY_U01_INDEX_9 = Internal.createIndex("CTMS_CT_FORM_OTHER_PTY_U01_INDEX_9", CtmsCtFormOtherPty.CTMS_CT_FORM_OTHER_PTY, new OrderField[] { CtmsCtFormOtherPty.CTMS_CT_FORM_OTHER_PTY.CT_FORM_ID, CtmsCtFormOtherPty.CTMS_CT_FORM_OTHER_PTY.COMPANY_NAME }, true);
        public static Index PRIMARY_KEY_9 = Internal.createIndex("PRIMARY_KEY_9", CtmsCtFormOtherPty.CTMS_CT_FORM_OTHER_PTY, new OrderField[] { CtmsCtFormOtherPty.CTMS_CT_FORM_OTHER_PTY.ID }, true);
        public static Index CTMS_CT_FORM_PTY_U01_INDEX_1 = Internal.createIndex("CTMS_CT_FORM_PTY_U01_INDEX_1", CtmsCtFormPty.CTMS_CT_FORM_PTY, new OrderField[] { CtmsCtFormPty.CTMS_CT_FORM_PTY.CT_FORM_ID, CtmsCtFormPty.CTMS_CT_FORM_PTY.COMPANY_ID }, true);
        public static Index PRIMARY_KEY_14 = Internal.createIndex("PRIMARY_KEY_14", CtmsCtFormPty.CTMS_CT_FORM_PTY, new OrderField[] { CtmsCtFormPty.CTMS_CT_FORM_PTY.ID }, true);
        public static Index CTMS_CT_FORM_SERVICE_U01_INDEX_4 = Internal.createIndex("CTMS_CT_FORM_SERVICE_U01_INDEX_4", CtmsCtFormService.CTMS_CT_FORM_SERVICE, new OrderField[] { CtmsCtFormService.CTMS_CT_FORM_SERVICE.CT_FORM_ID, CtmsCtFormService.CTMS_CT_FORM_SERVICE.TYPE_CODE }, true);
        public static Index PRIMARY_KEY_4 = Internal.createIndex("PRIMARY_KEY_4", CtmsCtFormService.CTMS_CT_FORM_SERVICE, new OrderField[] { CtmsCtFormService.CTMS_CT_FORM_SERVICE.ID }, true);
        public static Index CTMS_REPORT_GRP_HIER_U01_INDEX_D = Internal.createIndex("CTMS_REPORT_GRP_HIER_U01_INDEX_D", CtmsReportGrpHier.CTMS_REPORT_GRP_HIER, new OrderField[] { CtmsReportGrpHier.CTMS_REPORT_GRP_HIER.CODE }, true);
        public static Index PRIMARY_KEY_D = Internal.createIndex("PRIMARY_KEY_D", CtmsReportGrpHier.CTMS_REPORT_GRP_HIER, new OrderField[] { CtmsReportGrpHier.CTMS_REPORT_GRP_HIER.ID }, true);
        public static Index CTMS_USERS_U01_INDEX_6 = Internal.createIndex("CTMS_USERS_U01_INDEX_6", CtmsUser.CTMS_USER, new OrderField[] { CtmsUser.CTMS_USER.LOGIN_ID }, true);
        public static Index PRIMARY_KEY_60 = Internal.createIndex("PRIMARY_KEY_60", CtmsUser.CTMS_USER, new OrderField[] { CtmsUser.CTMS_USER.ID }, true);
        public static Index PRIMARY_KEY_E = Internal.createIndex("PRIMARY_KEY_E", CtmsUserGroup.CTMS_USER_GROUP, new OrderField[] { CtmsUserGroup.CTMS_USER_GROUP.ID }, true);
        public static Index PRIMARY_KEY_EF = Internal.createIndex("PRIMARY_KEY_EF", CtmsUserPreference.CTMS_USER_PREFERENCE, new OrderField[] { CtmsUserPreference.CTMS_USER_PREFERENCE.ID }, true);
        public static Index PRIMARY_KEY_61 = Internal.createIndex("PRIMARY_KEY_61", TestUser.TEST_USER, new OrderField[] { TestUser.TEST_USER.ID }, true);
    }
}