package com.service.impl;

import com.dao.RangeThresholdDao;
import com.pojo.RangeThreshold;
import com.service.RangeThresholdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RangeThresholdServiceImpl implements RangeThresholdService {
    @Autowired
    private RangeThresholdDao rangeThresholdDao;

    @Override
    public List<RangeThreshold> allPointByRangeName(String rangeName) {
        return rangeThresholdDao.allPointByRangeName(rangeName);
    }

    @Override
    public int isExisted(RangeThreshold rangeThreshold) {
        // 不存在返回非0  存在返回0
        int res=rangeThresholdDao.isExisted(rangeThreshold);
        return res;
    }

    @Override
    public int insertPoint(RangeThreshold rangeThreshold) {
        int res=rangeThresholdDao.insertNewPoint(rangeThreshold);
        return res;
    }

    @Override
    public int deletePoint(RangeThreshold rangeThreshold) {
        int res=rangeThresholdDao.deletePoint(rangeThreshold);
        return res;
    }
}
