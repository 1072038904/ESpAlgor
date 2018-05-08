package com.service.impl;

import com.dao.RangeThresholdDao;
import com.pojo.Hot;
import com.pojo.RangeThreshold;
import com.service.RangeThresholdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

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
    public RangeThreshold queryRangeThreshold(RangeThreshold threshold) {
        return null;
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

    @Override
    public List<List<Hot>> divideHotsByRange(List<Hot> hots, int timeThreshold) {
        //初始化12个clusters
        for(Iterator<Hot> it = hots.iterator(); it.hasNext();){
            Hot hot = it.next();
            RangeThreshold rangeThreshold = new RangeThreshold();
            rangeThreshold.initializeRnageTHresholdByHot(hot);
            int judgeKey = isExisted(rangeThreshold);
            //Map to save the cluseters divided
            Map<String,Hot> hotMap = new HashMap<>();
            if(judgeKey==0){
                RangeThreshold threshold = queryRangeThreshold(rangeThreshold);
                hotMap.put(threshold.getRangeName(),hot);
            }
            else{

            }
        }
        return null;
    }
    public static void main(String args[]){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        for(Iterator<String> it = list.iterator();it.hasNext();){
          //  System.out.println(it.next());
           // System.out.println("而"+it.next());
        }
    }
}
