package com.allen.chordview.entity;

public class Label {
    /**
     * shopSiteId :
     * shopSiteName :
     * sourceShopId : Hn_P00012S00287
     * sourceShopName : 言几又
     * sourceShopFloorName : 3F
     * sourceShopFloorNum : 3
     * targetShopId : Hn_P00012S00285
     * targetShopName : 贝尔机器人
     * targetShopFloorName : 3F
     * targetShopFloorNum : 3
     * correlationDegree : 0.9999
     */

    private String shopSiteId;
    private String shopSiteName;
    private String sourceShopId;
    private String sourceShopName;
    private String sourceShopFloorName;
    private int sourceShopFloorNum;
    private String targetShopId;
    private String targetShopName;
    private String targetShopFloorName;
    private int targetShopFloorNum;
    private double correlationDegree;

    public String getShopSiteId() {
        return shopSiteId;
    }

    public void setShopSiteId(String shopSiteId) {
        this.shopSiteId = shopSiteId;
    }

    public String getShopSiteName() {
        return shopSiteName;
    }

    public void setShopSiteName(String shopSiteName) {
        this.shopSiteName = shopSiteName;
    }

    public String getSourceShopId() {
        return sourceShopId;
    }

    public void setSourceShopId(String sourceShopId) {
        this.sourceShopId = sourceShopId;
    }

    public String getSourceShopName() {
        return sourceShopName;
    }

    public void setSourceShopName(String sourceShopName) {
        this.sourceShopName = sourceShopName;
    }

    public String getSourceShopFloorName() {
        return sourceShopFloorName;
    }

    public void setSourceShopFloorName(String sourceShopFloorName) {
        this.sourceShopFloorName = sourceShopFloorName;
    }

    public int getSourceShopFloorNum() {
        return sourceShopFloorNum;
    }

    public void setSourceShopFloorNum(int sourceShopFloorNum) {
        this.sourceShopFloorNum = sourceShopFloorNum;
    }

    public String getTargetShopId() {
        return targetShopId;
    }

    public void setTargetShopId(String targetShopId) {
        this.targetShopId = targetShopId;
    }

    public String getTargetShopName() {
        return targetShopName;
    }

    public void setTargetShopName(String targetShopName) {
        this.targetShopName = targetShopName;
    }

    public String getTargetShopFloorName() {
        return targetShopFloorName;
    }

    public void setTargetShopFloorName(String targetShopFloorName) {
        this.targetShopFloorName = targetShopFloorName;
    }

    public int getTargetShopFloorNum() {
        return targetShopFloorNum;
    }

    public void setTargetShopFloorNum(int targetShopFloorNum) {
        this.targetShopFloorNum = targetShopFloorNum;
    }

    public double getCorrelationDegree() {
        return correlationDegree;
    }

    public void setCorrelationDegree(double correlationDegree) {
        this.correlationDegree = correlationDegree;
    }
}
