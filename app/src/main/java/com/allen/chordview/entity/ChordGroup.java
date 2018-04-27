package com.allen.chordview.entity;

import java.util.List;

/**
 * 和弦数据组的实体类
 */
public class ChordGroup {
    private List<ChordEntity> chordGroup;
    private String groupName;
    private int weight;
    private float groupEndAngle;
    private int groupId = -1;

    public ChordGroup(List<ChordEntity> chordGroup, String groupName, int weight) {
        this.chordGroup = chordGroup;
        this.groupName = groupName;
        this.weight = weight;
    }

    public List<ChordEntity> getChordGroup() {
        return chordGroup;
    }

    public void setChordGroup(List<ChordEntity> chordGroup) {
        this.chordGroup = chordGroup;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getGroupEndAngle() {
        return groupEndAngle;
    }

    public void setGroupEndAngle(float groupEndAngle) {
        this.groupEndAngle = groupEndAngle;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }
}
