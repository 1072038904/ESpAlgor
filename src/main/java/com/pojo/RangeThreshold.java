package com.pojo;

public class RangeThreshold {
    // 唯一标识ID
    private Integer rangeId;
    //  坐标x
    private int x;
    //  坐标y
    private int y;
    //范围名臣
    private String rangeName;

    public Integer getRangeId() {
        return rangeId;
    }

    public void setRangeId(Integer rangeId) {
        this.rangeId = rangeId;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getRangeName() {
        return rangeName;
    }

    public void setRangeName(String rangeName) {
        this.rangeName = rangeName;
    }
}
