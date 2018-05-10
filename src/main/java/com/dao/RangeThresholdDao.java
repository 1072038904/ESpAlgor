package com.dao;

import com.pojo.Hot;
import com.pojo.RangeThreshold;

import java.util.List;

public interface RangeThresholdDao {
    //判断该实体是否在在数据库中  return 0表示不存在  return 非0 表示存在
    public Integer isExisted(RangeThreshold rangeThreshold);

    // 根据rangeName查询所有的点
    public List<RangeThreshold> allPointByRangeName(String rangeName);

    //插入点
    public int insertNewPoint(RangeThreshold rangeThreshold);

    //更新点
    public int updatePoint(RangeThreshold rangeThreshold);

    //删除点
    public int deletePoint(RangeThreshold rangeThreshold);

    //查询出点
    public RangeThreshold queryRangeThreshold(RangeThreshold threshold);

    //用固定的12簇来划分所有的点
    public List<List<Hot>> divideHotsByRange(List<Hot> hots, int timeThreshold);
}
