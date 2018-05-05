package com.dao;

import com.pojo.RangeThreshold;

import java.util.List;

public interface RangeThresholdDao {
    //判断该实体是否在在数据库中
    public RangeThreshold isHotExisted(RangeThreshold rangeThreshold);
    // 根据rangeName查询所有的点
    public List<RangeThreshold> allPointByRangeName(String rangeName);
}
