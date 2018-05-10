package com.service.impl;

import com.dao.RangeThresholdDao;
import com.pojo.Hot;
import com.pojo.RangeThreshold;
import com.service.RangeThresholdService;
import org.apache.commons.collections.map.HashedMap;
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
    public Map<String ,List<Hot>> divideHotsByRange(List<Hot> hots, int timeThreshold) {
        //初始化12个clusters
        Map<String,List<Hot>> hotMap = new HashMap<>();
        for(Iterator<Hot> it = hots.iterator(); it.hasNext();){
            Hot hot = it.next();
            RangeThreshold rangeThreshold = new RangeThreshold();
            rangeThreshold.initializeRnageTHresholdByHot(hot);
            int judgeKey = isExisted(rangeThreshold);
            //Map to save the cluseters divided
            if(judgeKey==0){
                RangeThreshold threshold = queryRangeThreshold(rangeThreshold);

               // hotMap.put(threshold.getRangeName(),hot);
            }
        }
        return hotMap;
    }
    public static void main(String args[]){
    Map<String,List<String>> mapList = new HashMap<>();
    List<String> list= new ArrayList<>();
    mapList.put("acm",list);
    String a = "1";
    String b = "2";
    String c = "3";
    mapList.get("acm").add(a);
    mapList.get("acm").add(b);
    mapList.get("acm").add(c);
    System.out.println(mapList.get("acm"));
   // mapList.add(map);
   // map.
    //System.out.println(mapList.);

    //System.out.println(intmap.get("1"));
    }
}
