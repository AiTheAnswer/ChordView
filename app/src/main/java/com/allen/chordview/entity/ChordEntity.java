package com.allen.chordview.entity;


import android.graphics.Path;

/**
 * 和弦图数据实体类
 *
 * @author Renjy
 */
public class ChordEntity {
    private String legendName;
    //起始角度
    private float startAngle;
    //终止角度
    private float endAngle;
    //旋转角度
    private float sweepAngle;
    //比例
    private int weight;
    private int type;//0: 个体 1 ：组
    //该个体数据的在组中的起始角度
    private float groupStartAngle;
    //该个体数据的在组中的终止角度
    private float groupEndAngle;
    //该个体数据的在组中的终止角度
    private float groupSweepAngle;
    //组id
    private int groupId = -1;
    //如果是个体有连接线路径
    private Path linkLinePath;
    //圆环路径
    private Path ringPath;

    public ChordEntity(String legendName, int weight) {
        this.legendName = legendName;
        this.weight = weight;

    }

    public boolean contains(int rotation) {
        if (startAngle <= rotation && endAngle >= rotation) {
            return true;
        }
        return false;
    }
    public void setParams(float startAngle, float sweepAngle, int type) {
        this.startAngle = startAngle;
        this.sweepAngle = sweepAngle;
        this.endAngle = startAngle + sweepAngle;
        this.type = type;
    }
    public void setParams(float startAngle, float sweepAngle, int type,int groupId) {
        this.startAngle = startAngle;
        this.sweepAngle = sweepAngle;
        this.endAngle = startAngle + sweepAngle;
        this.type = type;
        this.groupId = groupId;
    }

    public float getStartAngle() {
        return startAngle;
    }


    public void setStartAngle(float startAngle) {
        this.startAngle = startAngle;
    }

    public float getEndAngle() {
        return endAngle;
    }

    public void setEndAngle(float endAngle) {
        this.endAngle = endAngle;
    }

    public float getSweepAngle() {
        return sweepAngle;
    }

    public void setSweepAngle(float sweepAngle) {
        this.sweepAngle = sweepAngle;
    }

    public String getLegendName() {
        return legendName;
    }

    public void setLegendName(String legendName) {
        this.legendName = legendName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    /**
     * 设置该个体数据在组中位置信息
     *
     * @param groupEndAngle 组中起始角度
     */
    public void setGroupParams(float groupEndAngle) {
        this.groupEndAngle = groupEndAngle;
        this.groupStartAngle = groupEndAngle - sweepAngle;
        this.groupSweepAngle = sweepAngle;
    }

    public float getGroupStartAngle() {
        return groupStartAngle;
    }

    public void setGroupStartAngle(float groupStartAngle) {
        this.groupStartAngle = groupStartAngle;
    }

    public float getGroupEndAngle() {
        return groupEndAngle;
    }

    public void setGroupEndAngle(float groupEndAngle) {
        this.groupEndAngle = groupEndAngle;
    }

    public float getGroupSweepAngle() {
        return groupSweepAngle;
    }

    public void setGroupSweepAngle(float groupSweepAngle) {
        this.groupSweepAngle = groupSweepAngle;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public Path getLinkLinePath() {
        return linkLinePath;
    }

    public void setLinkLinePath(Path linkLinePath) {
        this.linkLinePath = linkLinePath;
    }

    public Path getRingPath() {
        return ringPath;
    }

    public void setRingPath(Path ringPath) {
        this.ringPath = ringPath;
    }
}
