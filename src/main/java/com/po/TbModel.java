package com.po;

import java.util.Date;

public class TbModel {
    private Integer id;

    private String modelCode;

    private String modelName;

    private Integer seriesCode;

    private Date dateCreate;

    private Date dateUpdate;

    private Short year;

    private String shortName;

    private String leadPic;

    private Byte sellStatus;

    private Byte importType;

    private Boolean isImport;

    private Boolean isHidden;

    private Integer displayTag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModelCode() {
        return modelCode;
    }

    public void setModelCode(String modelCode) {
        this.modelCode = modelCode == null ? null : modelCode.trim();
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName == null ? null : modelName.trim();
    }

    public Integer getSeriesCode() {
        return seriesCode;
    }

    public void setSeriesCode(Integer seriesCode) {
        this.seriesCode = seriesCode;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Date getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public Short getYear() {
        return year;
    }

    public void setYear(Short year) {
        this.year = year;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    public String getLeadPic() {
        return leadPic;
    }

    public void setLeadPic(String leadPic) {
        this.leadPic = leadPic == null ? null : leadPic.trim();
    }

    public Byte getSellStatus() {
        return sellStatus;
    }

    public void setSellStatus(Byte sellStatus) {
        this.sellStatus = sellStatus;
    }

    public Byte getImportType() {
        return importType;
    }

    public void setImportType(Byte importType) {
        this.importType = importType;
    }

    public Boolean getIsImport() {
        return isImport;
    }

    public void setIsImport(Boolean isImport) {
        this.isImport = isImport;
    }

    public Boolean getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
    }

    public Integer getDisplayTag() {
        return displayTag;
    }

    public void setDisplayTag(Integer displayTag) {
        this.displayTag = displayTag;
    }
}