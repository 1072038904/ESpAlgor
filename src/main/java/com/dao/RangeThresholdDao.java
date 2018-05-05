package com.dao;

import com.pojo.RangeThreshold;

public interface RangeThresholdDao {
    //判断该实体是否在在数据库中
    public int isHotExisted(RangeThreshold rangeThreshold);
}
