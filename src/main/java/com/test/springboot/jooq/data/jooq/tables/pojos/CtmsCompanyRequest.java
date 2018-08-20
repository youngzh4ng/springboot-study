/*
 * This file is generated by jOOQ.
*/
package com.test.springboot.jooq.data.jooq.tables.pojos;


import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;

import javax.annotation.Generated;


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
public class CtmsCompanyRequest implements Serializable {

    private static final long serialVersionUID = 1432476606;

    private BigInteger id;
    private String     rptUserGrpLv1;
    private String     rptUserGrpLv2;
    private String     rptUserGrpLv3;
    private String     ctoEndorserGrp;
    private String     englishName;
    private String     chineseName;
    private BigInteger companyGrpId;
    private String     brNumber;
    private String     address;
    private String     phoneNumber;
    private String     remarks;
    private String     status;
    private Byte       isArchived;
    private String     requestedBy;
    private Timestamp  requestedAt;
    private String     ctoRemarks;
    private String     ctoReviewedBy;
    private Timestamp  ctoReviewedAt;
    private String     lsdRemarks;
    private String     lsdReviewedBy;
    private Timestamp  lsdReviewedAt;
    private Timestamp  createdAt;
    private String     updatedBy;
    private Timestamp  updatedAt;

    public CtmsCompanyRequest() {}

    public CtmsCompanyRequest(CtmsCompanyRequest value) {
        this.id = value.id;
        this.rptUserGrpLv1 = value.rptUserGrpLv1;
        this.rptUserGrpLv2 = value.rptUserGrpLv2;
        this.rptUserGrpLv3 = value.rptUserGrpLv3;
        this.ctoEndorserGrp = value.ctoEndorserGrp;
        this.englishName = value.englishName;
        this.chineseName = value.chineseName;
        this.companyGrpId = value.companyGrpId;
        this.brNumber = value.brNumber;
        this.address = value.address;
        this.phoneNumber = value.phoneNumber;
        this.remarks = value.remarks;
        this.status = value.status;
        this.isArchived = value.isArchived;
        this.requestedBy = value.requestedBy;
        this.requestedAt = value.requestedAt;
        this.ctoRemarks = value.ctoRemarks;
        this.ctoReviewedBy = value.ctoReviewedBy;
        this.ctoReviewedAt = value.ctoReviewedAt;
        this.lsdRemarks = value.lsdRemarks;
        this.lsdReviewedBy = value.lsdReviewedBy;
        this.lsdReviewedAt = value.lsdReviewedAt;
        this.createdAt = value.createdAt;
        this.updatedBy = value.updatedBy;
        this.updatedAt = value.updatedAt;
    }

    public CtmsCompanyRequest(
        BigInteger id,
        String     rptUserGrpLv1,
        String     rptUserGrpLv2,
        String     rptUserGrpLv3,
        String     ctoEndorserGrp,
        String     englishName,
        String     chineseName,
        BigInteger companyGrpId,
        String     brNumber,
        String     address,
        String     phoneNumber,
        String     remarks,
        String     status,
        Byte       isArchived,
        String     requestedBy,
        Timestamp  requestedAt,
        String     ctoRemarks,
        String     ctoReviewedBy,
        Timestamp  ctoReviewedAt,
        String     lsdRemarks,
        String     lsdReviewedBy,
        Timestamp  lsdReviewedAt,
        Timestamp  createdAt,
        String     updatedBy,
        Timestamp  updatedAt
    ) {
        this.id = id;
        this.rptUserGrpLv1 = rptUserGrpLv1;
        this.rptUserGrpLv2 = rptUserGrpLv2;
        this.rptUserGrpLv3 = rptUserGrpLv3;
        this.ctoEndorserGrp = ctoEndorserGrp;
        this.englishName = englishName;
        this.chineseName = chineseName;
        this.companyGrpId = companyGrpId;
        this.brNumber = brNumber;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.remarks = remarks;
        this.status = status;
        this.isArchived = isArchived;
        this.requestedBy = requestedBy;
        this.requestedAt = requestedAt;
        this.ctoRemarks = ctoRemarks;
        this.ctoReviewedBy = ctoReviewedBy;
        this.ctoReviewedAt = ctoReviewedAt;
        this.lsdRemarks = lsdRemarks;
        this.lsdReviewedBy = lsdReviewedBy;
        this.lsdReviewedAt = lsdReviewedAt;
        this.createdAt = createdAt;
        this.updatedBy = updatedBy;
        this.updatedAt = updatedAt;
    }

    public BigInteger getId() {
        return this.id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getRptUserGrpLv1() {
        return this.rptUserGrpLv1;
    }

    public void setRptUserGrpLv1(String rptUserGrpLv1) {
        this.rptUserGrpLv1 = rptUserGrpLv1;
    }

    public String getRptUserGrpLv2() {
        return this.rptUserGrpLv2;
    }

    public void setRptUserGrpLv2(String rptUserGrpLv2) {
        this.rptUserGrpLv2 = rptUserGrpLv2;
    }

    public String getRptUserGrpLv3() {
        return this.rptUserGrpLv3;
    }

    public void setRptUserGrpLv3(String rptUserGrpLv3) {
        this.rptUserGrpLv3 = rptUserGrpLv3;
    }

    public String getCtoEndorserGrp() {
        return this.ctoEndorserGrp;
    }

    public void setCtoEndorserGrp(String ctoEndorserGrp) {
        this.ctoEndorserGrp = ctoEndorserGrp;
    }

    public String getEnglishName() {
        return this.englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getChineseName() {
        return this.chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    public BigInteger getCompanyGrpId() {
        return this.companyGrpId;
    }

    public void setCompanyGrpId(BigInteger companyGrpId) {
        this.companyGrpId = companyGrpId;
    }

    public String getBrNumber() {
        return this.brNumber;
    }

    public void setBrNumber(String brNumber) {
        this.brNumber = brNumber;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Byte getIsArchived() {
        return this.isArchived;
    }

    public void setIsArchived(Byte isArchived) {
        this.isArchived = isArchived;
    }

    public String getRequestedBy() {
        return this.requestedBy;
    }

    public void setRequestedBy(String requestedBy) {
        this.requestedBy = requestedBy;
    }

    public Timestamp getRequestedAt() {
        return this.requestedAt;
    }

    public void setRequestedAt(Timestamp requestedAt) {
        this.requestedAt = requestedAt;
    }

    public String getCtoRemarks() {
        return this.ctoRemarks;
    }

    public void setCtoRemarks(String ctoRemarks) {
        this.ctoRemarks = ctoRemarks;
    }

    public String getCtoReviewedBy() {
        return this.ctoReviewedBy;
    }

    public void setCtoReviewedBy(String ctoReviewedBy) {
        this.ctoReviewedBy = ctoReviewedBy;
    }

    public Timestamp getCtoReviewedAt() {
        return this.ctoReviewedAt;
    }

    public void setCtoReviewedAt(Timestamp ctoReviewedAt) {
        this.ctoReviewedAt = ctoReviewedAt;
    }

    public String getLsdRemarks() {
        return this.lsdRemarks;
    }

    public void setLsdRemarks(String lsdRemarks) {
        this.lsdRemarks = lsdRemarks;
    }

    public String getLsdReviewedBy() {
        return this.lsdReviewedBy;
    }

    public void setLsdReviewedBy(String lsdReviewedBy) {
        this.lsdReviewedBy = lsdReviewedBy;
    }

    public Timestamp getLsdReviewedAt() {
        return this.lsdReviewedAt;
    }

    public void setLsdReviewedAt(Timestamp lsdReviewedAt) {
        this.lsdReviewedAt = lsdReviewedAt;
    }

    public Timestamp getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Timestamp getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CtmsCompanyRequest (");

        sb.append(id);
        sb.append(", ").append(rptUserGrpLv1);
        sb.append(", ").append(rptUserGrpLv2);
        sb.append(", ").append(rptUserGrpLv3);
        sb.append(", ").append(ctoEndorserGrp);
        sb.append(", ").append(englishName);
        sb.append(", ").append(chineseName);
        sb.append(", ").append(companyGrpId);
        sb.append(", ").append(brNumber);
        sb.append(", ").append(address);
        sb.append(", ").append(phoneNumber);
        sb.append(", ").append(remarks);
        sb.append(", ").append(status);
        sb.append(", ").append(isArchived);
        sb.append(", ").append(requestedBy);
        sb.append(", ").append(requestedAt);
        sb.append(", ").append(ctoRemarks);
        sb.append(", ").append(ctoReviewedBy);
        sb.append(", ").append(ctoReviewedAt);
        sb.append(", ").append(lsdRemarks);
        sb.append(", ").append(lsdReviewedBy);
        sb.append(", ").append(lsdReviewedAt);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(updatedBy);
        sb.append(", ").append(updatedAt);

        sb.append(")");
        return sb.toString();
    }
}
