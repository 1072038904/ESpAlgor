package com.service;

import com.pojo.Hot;
import com.pojo.RangeThreshold;

import java.util.List;

public interface RangeThresholdService {
    // 判断是否存在记录
    public int isExisted(RangeThreshold rangeThreshold);
    //查询出点
    public RangeThreshold queryRangeThreshold(RangeThreshold threshold);
    // 根据rangeName返回对应的所有的点
    public List<RangeThreshold> allPointByRangeName(String rangeName);
    // 插入点
    public int insertPoint(RangeThreshold rangeThreshold);
    // 删除点
    public int deletePoint(RangeThreshold rangeThreshold);
    //用固定的12簇来划分所有的点
    public List<List<Hot>> divideHotsByRange(List<Hot> hots, int timeThreshold);
}
